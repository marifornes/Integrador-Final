/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isabelprueba.trabajo.integrador;

import java.util.Scanner;

/**
 *
 * @author mforn
 */



import com.isabelprueba.trabajo.integrador.Model.Cliente;
import com.isabelprueba.trabajo.integrador.Model.Persona.Cliente;
import com.isabelprueba.trabajo.integrador.Model.Tecnico;
import com.isabelprueba.trabajo.integrador.Repository.PersonaRepository;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class PersonaController {
    private PersonaRepository persona;

    public PersonaRepository getPersona() {
        return persona;
    }

    public void setPersona(PersonaRepository persona) {
        this.persona = persona;
    }

    public PersonaController() {
        this.persona = new PersonaRepository();
    }

    public void agregarCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombreCliente);

        persona.getEm().getTransaction().begin();
        persona.insertar(cliente);
        persona.getEm().getTransaction().commit();

        System.out.println("Cliente agregado con éxito.\n");
    }

    public void agregarTecnico(Scanner scanner) {
        System.out.print("Ingrese el nombre del tecnico: ");
        String nombre = scanner.next();

        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(nombre);

        persona.getEm().getTransaction().begin();
        persona.insertar(tecnico);
        persona.getEm().getTransaction().commit();

        System.out.println("Tecnico agregado con éxito.\n");
    }

    public void mostrarClientes() {
        System.out.println("Clientes:");
        pr.buscarClientes().forEach(
                cliente -> System.out.println(cliente));
        System.out.println();
    }

    public Cliente buscarClienteId(long nroCliente) {
        Cliente cliente = pr.buscarUno(nroCliente);
        if(cliente!=null) {
            System.out.println(cliente);
        }else{
            System.out.println("El cliente no existe");
        }
        return cliente;
    }

    void agregarIncidente(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarEspecialidad(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarPersona(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarUsuario(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarProblema(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarTecnico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarIncidente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarEspecialidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarProblema() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class incidente {

        public incidente() {
        }
    }

    public class Persona {

        public static Object getIr() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Persona() {
        }
    }

    public class incidente {

        public incidente() {
        }
    }
}