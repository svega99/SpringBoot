package edu.eci.arep.form.services.impl;


import edu.eci.arep.form.model.Usuario;
import edu.eci.arep.form.repository.UsuarioRepository;

import edu.eci.arep.form.services.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2128408
 */


@Service("services")
public class ServicesImpl implements Services{
    
    @Autowired
    private UsuarioRepository userRepo;
  

    @Override
    public List<Usuario> getAllUsers() {
        return userRepo.findAll(); 
    }
    
    @Override
    public Usuario getUserbyID(int id){
        return userRepo.findById(id).get();
    }
    

    
    
}
