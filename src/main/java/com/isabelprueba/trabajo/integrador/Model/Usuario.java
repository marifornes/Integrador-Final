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

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private String contraseña;
    private String rol; // Puede ser "Operador", "Técnico", etc.

    // Otros atributos y métodos según tus necesidades

    // Constructor, getters y setters
}
