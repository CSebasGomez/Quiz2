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
public class Staff extends Employee {
    private String titulo;

    public Staff(String nombre, String apellido, String salario, String oficina, String fechaContratacion, String titulo) {
        super(nombre, apellido, salario, oficina, fechaContratacion);
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public void showInfo() {
        System.out.println("Staff: "+" nombre: "+ nombre +" apellido: "+apellido+" salario: "+salario+" status: "+oficina+" fechaC: "+fechaContratacion+" titulo: "+titulo);
    }
    
}
