/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Noel
 */
public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }


    public EmpleadoProduccion(int id, String nombre, String apellidos, double salarioBase, double horasExtras,double bono) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public float calcularSalarioNeto(){
        float salario = (float) (super.calcularSalarioBruto()-super.calcularSeguro());
        salario+=bono;
        return salario;
    }

    @Override
    public String toString() {
        return "-----Empleado----- " 
                + "\nid= " +super.getId()
                + "\nNombre= " + super.getNombre()
                + "\nApellidos= " + super.getApellidos()
                + "\nSalario Base= " + super.getSalarioBase()
                + "\nHoras Extras= " + super.getHorasExtras()
                +"\nBonos = "+bono
                +"\nSalario Bruto sin bono = " + super.calcularSalarioBruto()
                +"\nSeguro Social = " + super.calcularSeguro()
                +"\nSalario Neto= " + this.calcularSalarioNeto();
                
    }
    
    
    
    
}
