/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "comentario")
@XmlAccessorType(XmlAccessType.FIELD)
public class comentarioDTO {
    private Integer id;
    
    private String comentario;
    
    private String fecha;
    
    private Integer id_usuarioc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId_usuarioc() {
        return id_usuarioc;
    }

    public void setId_usuarioc(Integer id_usuarioc) {
        this.id_usuarioc = id_usuarioc;
    }
    
    
}
