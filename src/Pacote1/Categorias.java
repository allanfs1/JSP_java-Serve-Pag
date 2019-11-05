/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Allan
 */

@Entity
public class Categorias {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String senha;
    private float salario;    
    private String tel;
    private String cpf;   
    private  String dt_data;
    private  String email;
    private  String rg;
    private  String sit;
    
    
    
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public float getSalario() {
		return salario;
	}
	
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public String getTel() {
		return tel;
	}
	
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getDt_data() {
		return dt_data;
	}
	
	
	public void setDt_data(String dt_data) {
		this.dt_data = dt_data;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getRg() {
		return rg;
	}
	
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public String getSit() {
		return sit;
	}
	
	
	public void setSit(String sit) {
		this.sit = sit;
	}
    
}
    
    /**
     * @return the id
     */
   