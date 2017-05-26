/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

/**
 *
 * @author Sebastian
 */
public class Faculty extends Employee {
    private String rango;

    public Faculty(String nombre, String apellido, String salario, String oficina, String fechaContratacion, String rango) {
        super(nombre, apellido, salario, oficina, fechaContratacion);
        this.rango=rango;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Faculty: "+" nombre: "+ nombre +" apellido: "+apellido+" salario: "+salario+" oficina: "+oficina+" fechaC: "+fechaContratacion+" rango: "+rango);
    }
    
}
