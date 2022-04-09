package com.MiguelSotelo.backendargentinaprograma.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable =false)
    private Long id;
    private String nombre;
    private String ocupacion;
    private String email;
    private String lugar;
    private String telefono;
    private LocalDate cumpleaños;
    private String backImg;
    private String profileImg;

    public Persona() {
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(LocalDate cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", email='" + email + '\'' +
                ", lugar='" + lugar + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cumpleaños=" + cumpleaños +
                ", backImg='" + backImg + '\'' +
                ", profileImg='" + profileImg + '\'' +
                '}';
    }
}
