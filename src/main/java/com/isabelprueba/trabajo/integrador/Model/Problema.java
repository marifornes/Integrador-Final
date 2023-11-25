/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isabelprueba.trabajo.integrador.Model;

/**
 *
 * @author mforn
 */
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Problema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String tipo;

    @ManyToMany(mappedBy = "problemas")
    private List<Servicio> servicios;

    // Otros atributos y métodos según tus necesidades

    // Constructor, getters y setters
}
