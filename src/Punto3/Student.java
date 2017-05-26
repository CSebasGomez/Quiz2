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
public  class Student extends Person {
    private String status;

    public Student(String nombre, String apellido, String salario,String status) {
        super(nombre, apellido, salario);
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public void showInfo() {
        System.out.println("Student: "+" nombre: "+ nombre +" apellido: "+apellido+" salario: "+salario+" status: "+status);
    }

    
    
    
    
}
