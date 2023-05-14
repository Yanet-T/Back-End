/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.yt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter

/**
 * Buenas!
 * @author yanet
 */

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @NotNull
    @Size (min = 1, max = 60, message = "Es necesario que lo ingresado tenga entre 1 y 60 caracteles")
    private String nombre;
    
    @NotNull
    @Size (min = 1, max = 60, message = "Es necesario que lo ingresado tenga entre 1 y 60 caracteles")
    private String apellido;
    
    @Size (min = 1, max = 160, message = "Es necesario que lo ingresado tenga entre 1 y 160 caracteles")
    private String img;
}
