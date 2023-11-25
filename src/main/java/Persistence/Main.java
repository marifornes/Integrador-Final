
/**
 *
 * @author mforn
 */

package Persistence;


import com.isabelprueba.trabajo.integrador.EspecialidadController;
import com.isabelprueba.trabajo.integrador.IncidenteController;
import com.isabelprueba.trabajo.integrador.PersonaController;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }



    public static void main(String[] args) {
        EntityManager em = getEntityManager();

        PersonaController pc = new PersonaController();
        pc.Persona.getIr().setEm(em);

        IncidenteController pc;
        pc = new IncidenteController();
        pc.incidente.getIr().setEm(em);

        EspecialidadController especialidad = new EspecialidadController();
        especialidad.getIr().setEm(em);

        Scanner scanner = new Scanner(System.in);

        
        int opcion;
        do{
           System.out.println("Menu Principal");
           System.out.println("1. Registrar Cliente");
           System.out.println("2. Registrar Tecnico");
           System.out.println("3. Registrar Incidente");
           System.out.println("4. Registrar Especialidad");
           System.out.println("5. Registrar Persona");
           System.out.println("6. Registrar Usuario");
           System.out.println("7. Registrar Problema");
           System.out.println("8. Mostrar Cliente");
           System.out.println("9. Mostrar Tecnico");
           System.out.println("10. Mostrar Incidente");
           System.out.println("11. Mostrar Especialidad");
           System.out.println("12. Mostrar Persona");
           System.out.println("13. Mostrar Usuario");
           System.out.println("14. Mostrar Problema");
           System.out.println("0. Salir");
           System.out.println("Ingrese su opcion");
           
           opcion = scanner.nextInt();
           
           switch (opcion){
               
           case 1 -> pc.agregarCliente(scanner);
            case 2 -> pc.agregarTecnico(scanner);
            case 3 -> pc.agregarIncidente(scanner);
            case 4 -> pc.agregarEspecialidad(scanner);
            case 5 -> pc.agregarPersona(scanner);
            case 6 -> pc.agregarUsuario(scanner);
            case 7 -> pc.agregarProblema(scanner);
            case 8 -> pc.mostrarCliente();
            case 9 -> pc.mostrarTecnico();
            case 10 -> pc.mostrarIncidente();
            case 11 -> pc.mostrarEspecialidad();
            case 12 -> pc.mostrarPersona();
            case 13 -> pc.mostrarUsuario();
            case 14 -> pc.mostrarProblema();
            case 0 -> pc.salir();
           }
           
          } while (opcion != 0);
    }

}   