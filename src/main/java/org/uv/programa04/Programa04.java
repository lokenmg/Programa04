/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo Mencías
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado daoEmpleado=new DAOEmpleado();
        Empleado empleado = new Empleado();
//        Empleado empleadoa = new Empleado();
//        
//        empleadoa.setClave(4);
//        empleadoa.setNombre("paco");
//        empleadoa.setDireccion("mexico");
//        empleadoa.setTelefono("1254789");
//        
//        daoEmpleado.update(empleadoa, empleadoa.getClave());
//        empleado.setClave(20);
//        empleado.setNombre("wwwww");
//        empleado.setDireccion("ssssss");
//        empleado.setTelefono("1111111");
//        
//        daoEmpleado.create(empleado);
//        daoEmpleado.delete(Long.parseLong("20"));

//        empleado = daoEmpleado.findById(Long.parseLong("2"));
//        System.out.println("Clave: " + empleado.getClave() + "\nNombre: " + empleado.getNombre()
//            + "\n dirección: " + empleado.getDireccion()+ "\n telefono: " + empleado.getTelefono());
        
        List<Empleado> listaEmpleado = new ArrayList<>();
        listaEmpleado= daoEmpleado.findAll();
        
        for(int i=0; i<listaEmpleado.size(); i++){
            empleado=(Empleado)listaEmpleado.get(i);
            System.out.println("Clave: " + empleado.getClave() + "\nNombre: " + empleado.getNombre()
            + "\n dirección: " + empleado.getDireccion()+ "\n telefono: " + empleado.getTelefono() + "\n");
        }
    }
}   
