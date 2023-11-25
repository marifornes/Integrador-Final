
package com.isabelprueba.trabajo.integrador;

/**
 *
 * @author mforn
 */

import com.isabelprueba.trabajo.integrador.Model.Especialidad;
import com.isabelprueba.trabajo.integrador.Model.Incidente;
import com.isabelprueba.trabajo.integrador.Repository.EspecialidadRepository;
import com.isabelprueba.trabajo.integrador.Repository.IncidenteRepository;

public class EspecialidadController {

    private EspecialidadRepository ir;

    public EspecialidadRepository getIr() {
        return ir;
    }

    public void setIr(EspecialidadRepository ir) {
        this.ir = ir;
    }

    public EspecialidadController() {
        this.ir = new EspecialidadRepository();
    }

    public void agregarEspecialidad() {

            Especialidad incidente = new Especialidad("Especialidad 1");


            ir.getEm().getTransaction().begin();
            ir.insertar(inc);
            ir.getEm().getTransaction().commit();

    }
}
