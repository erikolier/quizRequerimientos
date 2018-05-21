/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sergioArboleda.facade;

import com.mycompany.jpa.Comentario;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.dao.ServiceImpl;
import edu.sergioArboleda.dao.SingletonConnection;
import java.util.List;
import javax.persistence.EntityManager;

public class comentarioFacade extends ServiceImpl<Comentario> {
    public comentarioFacade() throws ConexionException{
        super(Comentario.class);
    try{
            EntityManager em=SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
            throw new ConexionException("fallo en conexion con db");
        }
    }
    @Override
    public List<Comentario> findAll(){
        return super.findAll();
    }
    @Override
    public void save(Comentario com){
        
    }
}
