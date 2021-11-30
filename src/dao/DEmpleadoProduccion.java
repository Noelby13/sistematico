/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpleadoProduccion;
import modelos.IOperaciones;

/**
 *
 * @author Noel
 */
public class DEmpleadoProduccion implements IOperaciones {
    private ArrayList<EmpleadoProduccion>listaE= new ArrayList();

    @Override
    public void agregarRegistro(Object o) {
        listaE.add((EmpleadoProduccion)o);
        
    }
    
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras,double bono){
        listaE.add(new EmpleadoProduccion(id, nombre, apellidos, salarioBase, horasExtras, bono));
    }

    @Override
    public void mostrarRegistro() {
        try{
            for(EmpleadoProduccion i: listaE){
                System.out.println(i.toString());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
}
