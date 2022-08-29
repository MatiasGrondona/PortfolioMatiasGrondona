/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliomsg.msg.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author matia
 */
public class UsuarioPrincipal implements UserDetails {
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String passsword;
    private Collection<? extends GrantedAuthority> authorities;
    
    //constructores

    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String passsword, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.passsword = passsword;
        this.authorities = authorities;
    }
    
    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getPassword(), authorities);
    }
    
    
}
