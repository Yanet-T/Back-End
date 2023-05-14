
package com.portfolio.yt.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "institucion")
    private String institucion;

    @Column(name = "estado")
    private String estado;

    
    
    
    public Educacion(int id, String nombre, String institucion, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.institucion = institucion;
        this.estado = estado;
    }

    
    public Educacion(){}
    
    
    // Getter y Setter para la propiedad 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para la propiedad 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para la propiedad 'institucion'
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    // Getter y Setter para la propiedad 'estado'
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


