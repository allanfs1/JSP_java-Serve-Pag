/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import Connection.Connection;
import Dao.Dao;
import Pacote1.Categorias;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Allan
 */
public class CategorisTeste {
    
    //EntityManagerFactory emf = Persistence.createEntityManagerFactory("pc");
      //EntityManager em = emf.createEntityManager()
    
  public static void main(String[] args){
      
	  Dao da = new Dao();///Categoria dao(camada de persistencia)
      Categorias c = new Categorias();   
    
      
      //c.setId(1);///Mudar Para Execultar o Update
     
      
      try {
    	  
    	  c.setNome("Allan");
    	  c.setEmail("allanfdsz@gmail.com");
    	  c.setSenha("zirdof989");
    
    	  da.save(c);//Inserir Dados no banco de dados
    	  
      }catch(Exception e) {
    	  
      }
      
       
       /*Select*/
       //Categorias c = da.find(4);//Select Individual
      
               /*Select All*//*
      for(Categorias s:da.findAll()){
       System.out.println(s.getId());
       System.out.println(s.getNome());
       System.out.println(s.getDescricao());
     
      }
      */
        /*Remove*/     
      //da.remove(2);
     
      
      
    
     System.out.println("Opereações Efetuadas com Sucesso!");
   
  
      
  }
    
}
