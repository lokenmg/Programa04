/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.programa04;

import java.util.List;

/**
 *
 * @author Rodrigo Mencías
 */
//T: podjo
//ID: tipo de dato del ID

public interface IDAOGeneral<T,ID>{
    //retorna un pojo de tipo T
    //Recibe de parametro un pojo de tipo t
    public T create(T p);
    
    // retorna un booleano para confirmar si hubo respuesta o no
    public boolean delete(ID id);
    
    //Recibe de parametros un pojo y un ID
    //Retorna el pojo
    public T update(T p, ID id);
    
    public List<T> findAll();
    public T findById(ID id);
                
}
