/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class main {
    public static String desEncriptar(String texto){     
        char[] arregloinfo =texto.toCharArray();
        for(int i=0;i<arregloinfo.length;i++){
            int ascii = arregloinfo[i];
            int valor = ascii-65;
            int asignacion= (valor-3)%26;
            if(asignacion<0){
                asignacion=asignacion+26;
            }
            char desEncriptado=(char)(asignacion+65);
            arregloinfo[i]=desEncriptado;
        }
        String solucion = String.valueOf(arregloinfo);
        return solucion;
    }
    public static Student datosEstudiante(String[] informacion){
        String nombre;
        String apellido;
        String status;
        String salario;
        nombre=desEncriptar(informacion[1]);
        apellido=desEncriptar( informacion[2]);
        status = desEncriptar(informacion[3]);
        salario=(informacion[4]);
        return new Student(nombre,apellido,salario,status);
    }
    public static Faculty datosFacultad(String[] informacion){
        String rango;
        String oficina;
        String fecha;
        String nombre;
        String apellido;
        String salario;
        rango=desEncriptar(informacion[1]);
        oficina=(informacion[2]);
        fecha =(informacion[3]);
        nombre=desEncriptar(informacion[4]);
        apellido=desEncriptar(informacion[5]);
        salario=(informacion[6]);
        return new Faculty(nombre,apellido,salario,oficina,fecha,rango);
    }
    public static Staff datosStaff(String[] informacion){
        String titulo;
        String oficina;
        String fecha;
        String nombre;
        String apellido;
        String salario;
        titulo =desEncriptar(informacion[1]);
        oficina=(informacion[2]);
        fecha=(informacion[3]);
        nombre= desEncriptar(informacion[4]);
        apellido= desEncriptar(informacion[5]);
        salario=(informacion[6]);
        return new Staff(nombre,apellido,salario,oficina,fecha,titulo);
    }
    public static void listarInfo(ArrayList<Student> Estudiantes, ArrayList<Faculty> Facultades, ArrayList<Staff> Trabajadores){
        for(int i=0;i<Estudiantes.size();i++){
            Estudiantes.get(i).showInfo();
        }
        for(int i=0;i<Facultades.size();i++){
            Facultades.get(i).showInfo();
        }
        for(int i=0;i<Trabajadores.size();i++){
            Trabajadores.get(i).showInfo();
        }
    }
    public static int salarioStaff(ArrayList<Staff> trabajadores){
        int cuenta=0;
        for(int i=0;i<trabajadores.size();i++){
            cuenta = cuenta+Integer.parseInt(trabajadores.get(i).salario);
        }
        return cuenta;
    }
    public static int salarioEmpleados(ArrayList<Staff> trabajadores,ArrayList<Faculty> facultades){
        int cuenta =salarioStaff(trabajadores);
        for(int i=0;i<facultades.size();i++){
            cuenta = cuenta+Integer.parseInt(facultades.get(i).salario);
        }
        return cuenta;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = null;
        try{
            br=new BufferedReader( new FileReader("datos.txt"));
            
            String linea=br.readLine();
            ArrayList<Student> Estudiantes = new ArrayList<Student>();
            ArrayList<Faculty> Facultades = new ArrayList<Faculty>();
            ArrayList<Staff> Trabajadores = new ArrayList<Staff>();
            while(linea!=null){
                String[] info = linea.split(",");
                if(info[0].equals("STUDENT")){
                    
                    Estudiantes.add(datosEstudiante(info));
                }
                if(info[0].equals("FACULTY")){
                    Facultades.add(datosFacultad(info));
                }
                if(info[0].equals("STAFF")){
                    Trabajadores.add(datosStaff(info));
                }
                linea=br.readLine();
            }
            listarInfo(Estudiantes,Facultades,Trabajadores);//Primer Punto
            System.out.println("El salario de todos los Staff es: " +salarioStaff(Trabajadores));//Segundo Punto
            System.out.println("El saliaro de todos los empleado es : "+salarioEmpleados(Trabajadores,Facultades));//Ultimo Punto            
        }
        catch (Exception e){
            System.out.println("Salio mal");
        }finally{
            if(br!=null){
                br.close();
            }
        }
        
    }
}
