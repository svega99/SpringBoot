/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.form.controllers;

import edu.eci.arep.form.services.Services;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2128408
 */


@RestController

 
public class Controller {
    
    @Autowired
    @Qualifier("services")
    Services s;
    
    @RequestMapping(value = "/test",method = RequestMethod.GET)
	public ResponseEntity<?> getUsers() {
        try{
            return new ResponseEntity<>(s.getAllUsers(), HttpStatus.ACCEPTED);
        }
        catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
        }  
     }
        
      @RequestMapping(value = "/formulario",method = RequestMethod.GET)
	public ResponseEntity<?> formulario() {
        try{
            return new ResponseEntity<>("<form action='formulario' method='POST'><input type='number' name='id' placeholder='ID a buscar'/><input type='submit'/></form>", HttpStatus.ACCEPTED);
        }
        catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
        }  
     }   
        
     @RequestMapping(value = "/formulario",method = RequestMethod.POST)
	public ResponseEntity<?> formularioPost(@RequestBody String id) {
        try{
            int idf = Integer.parseInt(id.split("=")[1]) ;
            return new ResponseEntity<>(s.getUserbyID(idf), HttpStatus.ACCEPTED);
        }
        catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
        }  
     } 

   
    
    
}
