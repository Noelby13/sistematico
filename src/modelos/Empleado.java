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
public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private double salarioBase;
    private double horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidos, double salarioBase, double horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "-----Empleado----- " 
                + "\nid= " + id 
                + "\nNombre= " + nombre 
                + "\nApellidos= " + apellidos 
                + "\nSalario Base= " + salarioBase 
                + "\nHoras Extras= " + horasExtras
                +"\nSalario Bruto= " + this.calcularSalarioBruto()
                +"\nSeguro Social = " + this. calcularSeguro()
                +"\nSalario Neto= " + this.calcularSalarioNeto();
                
    }
    
    
    
    public double calcularSalarioBruto(){
        
        return this.salarioBase+this.horasExtras;
    }
    
    public float calcularSalarioNeto(){
       return (float) (this.calcularSalarioBruto()-this.calcularSeguro());
    }
    
    public double calcularSeguro(){
        return (0.07)*this.calcularSalarioBruto();
    }
    
    
    
}
