/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematicohenryreyes;

import dao.DEmpleadoOficina;
import dao.DEmpleadoProduccion;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Noel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       DEmpleadoOficina listaO = new DEmpleadoOficina();
       DEmpleadoProduccion listaP = new DEmpleadoProduccion();
      
        
        EmpleadoOficina noel = new EmpleadoOficina(1, "Noel", "Reyes", 1500, 10);
        EmpleadoOficina josue = new EmpleadoOficina(2, "Josue", "Gonzalez", 1300, 4);
        EmpleadoOficina ali = new EmpleadoOficina(1, "Ali", "Palacios", 3000, 1);
        
        listaO.agregarRegistro(noel);
        listaO.agregarRegistro(josue);
        listaO.agregarRegistro(ali);
        
        listaO.mostrarRegistro();
        
        EmpleadoProduccion pedro = new EmpleadoProduccion(1, "Pedro", "Mesa", 1500, 7, 100);
        EmpleadoProduccion juan = new EmpleadoProduccion(1, "Juan", "Tijerino", 2800, 7, 600);
        EmpleadoProduccion maria = new EmpleadoProduccion(1, "Maria", "Henriquez", 2500, 2, 300);
        
        listaP.agregarRegistro(pedro);
        listaP.agregarRegistro(juan);
        listaP.agregarRegistro(maria);
        
        listaP.mostrarRegistro();
        
        
        
        
    }
    
}
