/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelos.EmpleadoOficina;
import modelos.IOperaciones;

/**
 *
 * @author Noel
 */
public class DEmpleadoOficina implements IOperaciones {
    private ArrayList<EmpleadoOficina>listaE= new ArrayList();

    @Override
    public void agregarRegistro(Object o) {
        listaE.add((EmpleadoOficina)o);
        
    }
    
    public void agregarRegistro(int id, String nombre, String apellidos, double salarioBase, double horasExtras){
        listaE.add(new EmpleadoOficina(id,nombre,apellidos,salarioBase,horasExtras));
    }

    @Override
    public void mostrarRegistro() {
        try{
            for(EmpleadoOficina i: listaE){
                System.out.println(i.toString());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
}
