/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isabelprueba.trabajo.integrador.Model;

/**
 *
 * @author mforn
 */
import java.io.Serializable;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="persona")
public class Tecnico extends Persona{
    

    @ManyToMany(targetEntity = Especialidad.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List <Especialidad> especialidades;

    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
