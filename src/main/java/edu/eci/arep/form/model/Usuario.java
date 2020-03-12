package edu.eci.arep.form.model;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="usuario")
@Table(name="usuario")
public class Usuario implements Serializable{

        private static final long serialVersionUID = 1L;
        
        
        @Id
        @Column(name="id")
        int id;
	
        
        @Column(name="nombre")
	String nombre;
        
      
	public Usuario() {
           
	}

	public int getID(){
		return id;
	}

	public void setID(int id){
		this.id=id;
	}

	 public String getNombre(){
		 return nombre;
	 }

	 public void setNombre(String nombre){
		 this.nombre = nombre;
	 }
	
	
}

