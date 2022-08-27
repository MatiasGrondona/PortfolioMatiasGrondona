/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliomsg.msg.Interface;

import com.portfoliomsg.msg.Entity.Persona;
import java.util.List;

/**
 *
 * @author matia
 */
public interface IPersonaService {
    //Traer una Lista de Personas
    public List <Persona> getPersona();
    
    //Guardar un Objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un Usuario
    public void deletePersona(Long id);
    
    //Buscar Persona
    public Persona findPersona(Long id);
}
