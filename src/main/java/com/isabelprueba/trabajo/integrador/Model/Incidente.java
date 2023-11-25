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
import java.util.Date;

@Entity
@Data
public class Incidente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String tipo;
    private String estado;
    private String consideraciones; // Consideraciones del técnico al resolver el incidente
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaResolucionEstimada;
    private Date fechaResolucionReal;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    // Otros atributos y métodos según tus necesidades

    // Constructor, getters y setters

    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
