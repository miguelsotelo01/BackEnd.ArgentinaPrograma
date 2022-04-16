package com.MiguelSotelo.backendargentinaprograma.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable =false)
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate tiempo;

    public Educacion() {
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

    public LocalDate getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalDate tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
