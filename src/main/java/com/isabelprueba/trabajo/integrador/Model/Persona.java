/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isabelprueba.trabajo.integrador.Model;

/**
 *
 * @author mforn
 */

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Persona {
   @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_id_seq")
    @SequenceGenerator(name = "persona_id_seq", sequenceName = "persona_id_seq", allocationSize = 1)
     long id;

    private String nombre;
    private String direccion;
    private String telefono;

    private static class generator {

        public generator() {
        }
    }

     public class Cliente extends Persona {

        public void setNombre(String nombreCliente) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    // Puedes agregar atributos específicos de cliente si es necesario
}
     public class Tecnico extends Persona {
    // Puedes agregar atributos específicos de técnico si es necesario
}
     public class Operador extends Persona {
    // Puedes agregar atributos específicos de operador si es necesario
}
    // Otros atributos y métodos según tus necesidades

    // Constructor, getters y setters
}