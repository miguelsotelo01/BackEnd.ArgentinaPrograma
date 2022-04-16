package com.MiguelSotelo.backendargentinaprograma.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable =false)
    private Long id;
    private String nombre;
    private String descripcion;
    private String Img;

    public Proyectos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", Img='" + Img + '\'' +
                '}';
    }
}
