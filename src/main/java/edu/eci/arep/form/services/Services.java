/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.form.services;


import edu.eci.arep.form.model.Usuario;

import java.util.List;

/**
 *
 * @author Santiago
 */
public interface Services {
    
    public List<Usuario> getAllUsers();
    
    public Usuario getUserbyID(int id);

    
    
}
