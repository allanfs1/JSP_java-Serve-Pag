/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.Connection;
import Pacote1.Categorias;
import javax.persistence.EntityManager;
import java.util.List;
/**
 *
 * @author Allan
 */
public class Dao {
    
    public Categorias save(Categorias categori){
        
       EntityManager em = new Connection().getEntityManager();
       
      try{
           em.getTransaction().begin();
           if(categori.getId() == 0){///Condição para update
             em.persist(categori);
           }
           else{
             em.merge(categori);
           }
          em.getTransaction().commit();///Finalisar trasação
          
      }catch(Exception e){
           em.getTransaction().rollback();
          
      }finally{
           em.close();
           
       
          
    }
      
          return  categori;
       
    }
    
    
                       /*Select*/
      public Categorias find (int id){
               
         EntityManager em = new Connection().getEntityManager();
         Categorias categori  = null;
         
         try{
            categori =  em.find(Categorias.class,id);
             
         }catch(Exception e){
           System.err.println(e);  
           
         }finally{
           em.close();
         }
         
         return categori;
      }
    
      
      
                   /*Select All*/
      public List<Categorias> findAll (){
          EntityManager em = new Connection().getEntityManager();
          List<Categorias> categorias = null;
          
          try{
               categorias = em.createQuery("from Categorias c").getResultList();
          }catch(Exception e){
               System.err.println(e);  
          }
          finally{
               em.close(); 
          }
          
          return  categorias;
       }
      
      
      
      
                  //Remove//
         public Categorias remove(int id){
               
         EntityManager em = new Connection().getEntityManager();
         Categorias categori  = null;
         
         try{
            em.getTransaction().begin();
            categori =  em.find(Categorias.class,id);
            em.remove(categori);
            em.getTransaction().commit();
            
         }catch(Exception e){
           System.err.println(e);  
           em.getTransaction().rollback();
           
         }finally{
           em.close();
         }
         
         return categori;
      }
      
      
    
}
