/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nick")
    private String nick;
    @Column(name="contra")
    private String contra;

    public Usuario() {
    }
    
    
    @OneToMany(mappedBy="id",cascade=CascadeType.ALL)
    private ArrayList<Comentario> coment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Comentario> getComent() {
        return coment;
    }

    public void setComent(ArrayList<Comentario> coment) {
        this.coment = coment;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nick=" + nick + ", contra=" + contra + ", coment=" + coment + '}';
    }
    
    
}
