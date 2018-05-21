/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamuntorest;

/**
 *
 * @author Erik
 */
import com.mycompany.jpa.Comentario;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.facade.comentarioFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.model.comentarioDTO;

@Path("/comentario")
public class comentarioService {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<comentarioDTO> getComentario_JSON() throws ConexionException{
        List<comentarioDTO> comentarioDTO= new ArrayList<comentarioDTO>();
        comentarioFacade facade=null;
        facade=new comentarioFacade();
        List<Comentario> comentarios= facade.findAll();
        for(Comentario comentario: comentarios){
            comentarioDTO dto= new comentarioDTO();
            dto.setId(comentario.getId());
            dto.setFecha(comentario.getFecha());
            dto.setComentario(comentario.getComentario());
            dto.setId_usuarioc(comentario.getId_usuarioc());
            comentarioDTO.add(dto);
        }
        return comentarioDTO;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public comentarioDTO addComentario(comentarioDTO comentario) throws ConexionException{
        comentarioFacade facade= null;
        comentarioDTO dto=null;
        
        facade= new comentarioFacade();
        Comentario comentarioJPA=new Comentario();
        comentarioJPA.setId(comentario.getId());
        comentarioJPA.setFecha(comentario.getFecha());
        comentarioJPA.setComentario(comentario.getComentario());
        comentarioJPA.setId_usuarioc(comentario.getId_usuarioc());
        facade.save(comentarioJPA);
        return dto;
        }
}
