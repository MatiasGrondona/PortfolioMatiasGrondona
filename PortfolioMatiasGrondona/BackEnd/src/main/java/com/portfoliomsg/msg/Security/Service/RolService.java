/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliomsg.msg.Security.Service;

import com.portfoliomsg.msg.Security.Entity.Rol;
import com.portfoliomsg.msg.Security.Enums.RolNombre;
import com.portfoliomsg.msg.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matia
 */
@Service
@Transactional
public class RolService {
    @Autowired 
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void saveRol(Rol rol){
        irolRepository.save(rol);
    }
}
