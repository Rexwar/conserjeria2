/*
 * Copyright (c) 2023. Arquitectura de Sistemas, DISC, UCN.
 */

package cl.ucn.disc.as.model;

import io.ebean.annotation.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * The Persona class.
 *
 * @author Diego Urrutia-Astorga.
 */
@ToString(callSuper = true)
@AllArgsConstructor
@Builder
@Entity
public class Persona extends BaseModel {

    /**
     * The RUT.
     */
    @NotNull
    private Integer rut;

    /**
     * The Nombre.
     */
    @NotNull
    private String nombre;

    /**
     * The Apellidos.
     */
    @NotNull
    private String apellidos;

    /**
     * The Email.
     */
    @NotNull
    private String email;

    /**
     * The Telefono.
     */
    @NotNull
    private String telefono;



}


public static class personaBuilder{
    /**
     * @return the persona
     */
    public Persona build(){

        //validate the rut 
        if (!ValidationUtils.isRutValid(this.rut)) {
            throw new illegalDomainException(
                "Rut no valido: " + this.rut
            );

        //validate the email 
        if (!ValidationUtils.isEmailValid(this.email)) {
            throw new illegalDomainException(
                "Email no valido: " + this.email
            );
        }
    }
}