/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioArboleda.facade;

import com.mycompany.jpa.Perro;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.dao.ServiceImpl;
import edu.sergioArboleda.dao.SingletonConnection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

/**
 *
 * @author white
 */
public class perroFacade extends ServiceImpl<Perro> {
    private EntityManagerFactory ENTITY_MANAGER_FACTORY; 
    public perroFacade() throws ConexionException {
        super(Perro.class);
        try{
            EntityManager em=SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
            throw new ConexionException("fallo en conexion con db");
        }
    }
    
    
    
    
    @Override
    public List<Perro> findAll(){
        return super.findAll();
    }
    public List<Perro> findByProperty(String prop,Perro perro){
        return super.findByProperty(prop, perro);
    }
    
   
}
