//Esta clase sera el pojo
//Es el mapeo de la tabla de la base de datos

/*
DTO:
    ES UNA PEQUEÑA VISTA MODIFICADA DE LO QUE PUEDE SER EL POJO
    El DTO puede hacer el trabajo de un pojo pero no necesariamente es un pojo
    El DTO recibe datos especificos que se desean recibir,
    el POJO recibe todo los datos de la tabla
*/
package org.uv.programa04;


public class Empleado {
    private long clave;
    private String nombre;
    private String direccion;
    private String telefono;

    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
