/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;

/**
 *
 * @author Rodrigo Mencías
 */
public class TransaccioGuardarEmpleado extends TransaccionDB<Empleado>{

    public TransaccioGuardarEmpleado(Empleado e){
        super(e);
    }
    @Override
    public boolean execute(Connection con) {
        return false;
    }
    
}
