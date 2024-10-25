package com.protofnc.cuponesFNC.modelo;

import javax.persistence.*;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.openxava.annotations.*;
import lombok.*;

@Entity  // Esto marca la clase Cliente como una entidad
@Getter @Setter // Esto hace los campos a continuaci�n p�blicamente accesibles
public class Cliente
{

    @Id  // La propiedad numero es la clave.  Las claves son obligatorias (required) por defecto
    @Column(length=6)  // La longitud de columna se usa a nivel UI y a nivel DB
    int numero;
    //prueba
    @Column(length=50) // La longitud de columna se usa a nivel UI y a nivel DB
    @Required  // Se mostrar� un error de validaci�n si la propiedad nombre se deja en blanco
    String nombre;

}