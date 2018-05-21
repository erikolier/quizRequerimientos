
package com.mycompany.jpa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "comentario")
public class Comentario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="comentario")
    private String comentario;
    @Column(name="fecha")
    private String fecha;
    @Column(name="id_usuarioc")
    private Integer id_usuarioc;

    public Comentario() {
    }
    
    @ManyToOne
    @JoinColumn(name="id_usuarioc")
    private Usuario user;

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

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comentario{" + "id=" + id + ", comentario=" + comentario + ", fecha=" + fecha + ", id_usuarioc=" + id_usuarioc + ", user=" + user + '}';
    }
    
}
