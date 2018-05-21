/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamuntorest;

import com.mycompany.jpa.Perro;
import edu.sergioArboleda.exception.ConexionException;
import edu.sergioArboleda.facade.perroFacade;
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
import org.o7planning.restfulcrud.model.perroDTO;

@Path("/perro")
public class perroService {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<perroDTO> getPerro_JSON() throws ConexionException {
        List<perroDTO> perrosDTO = new ArrayList<perroDTO>();
        perroFacade facade = null;

        facade = new perroFacade();
        List<Perro> perros = facade.findAll();
        for (Perro perro : perros) {
            perroDTO dto = new perroDTO();
            dto.setId(perro.getId());
            dto.setRaza(perro.getRaza());
            dto.setPersonalidad(perro.getPersonalidad());
            dto.setGrupo(perro.getGrupo());
            dto.setEnergia(perro.getEnergia());
            dto.setDescripcion(perro.getDescripcion());
            perrosDTO.add(dto);
        }

        return perrosDTO;
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public perroDTO getPerro(@PathParam("id") String id) throws ConexionException{
        perroFacade facade=null;
        perroDTO dto=null;
        
        facade=new perroFacade();
        Perro perro=facade.get(Integer.parseInt(id));
        dto= new perroDTO();
        dto.setId(perro.getId());
        dto.setRaza(perro.getRaza());
        dto.setPersonalidad(perro.getPersonalidad());
        dto.setGrupo(perro.getGrupo());
        dto.setEnergia(perro.getEnergia());
        dto.setDescripcion(perro.getDescripcion());
        
        return dto;
    }
}
