package edu.eci.arep.form.repository;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.eci.arep.form.model.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
