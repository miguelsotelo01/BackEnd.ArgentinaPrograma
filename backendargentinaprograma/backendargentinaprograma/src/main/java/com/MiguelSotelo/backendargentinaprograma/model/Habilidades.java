package com.MiguelSotelo.backendargentinaprograma.model;

import javax.persistence.*;

@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable =false)
    private Long id;
    private String Nombre;
    private String Numero;
    private String Img;

    public Habilidades() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String img) {
        Img = img;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Numero='" + Numero + '\'' +
                ", Img='" + Img + '\'' +
                '}';
    }
}
