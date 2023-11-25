/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isabelprueba.trabajo.integrador;

/**
 *
 * @author mforn
 */

import com.isabelprueba.trabajo.integrador.Model.Cliente;
import com.isabelprueba.trabajo.integrador.Model.Incidente;
import com.isabelprueba.trabajo.integrador.Repository.IncidenteRepository;
import com.isabelprueba.trabajo.integrador.Repository.PersonaRepository;
import com.isabelprueba.trabajo.integrador.Model.Cliente;
import com.isabelprueba.trabajo.integrador.Model.Incidente;

public class IncidenteController {

    private IncidenteRepository ir;

    public IncidenteRepository getIr() {
        return ir;
    }

    public IncidenteController() {
        this.ir = new IncidenteRepository();
    }

    public void setIr(IncidenteRepository ir) {
        this.ir = ir;
    }

    public void agregarIncidente(Cliente cliente) {
        if(cliente!=null) {
            Incidente inc = new Incidente();
            inc.setCliente(cliente);

            ir.getEm().getTransaction().begin();
            ir.insertar(inc);
            ir.getEm().getTransaction().commit();
        }else{
            System.out.println("No puedo registrar el incidente");
        }
    }

    public class incidente {

        public static Object getIr() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public incidente() {
        }
    }
}
