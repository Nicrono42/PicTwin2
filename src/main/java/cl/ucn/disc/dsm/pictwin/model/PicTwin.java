/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.dsm.pictwin.model;

import io.ebean.annotation.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

// The pictwin
@Getter
@ToString
@AllArgsConstructor
@Builder
@Entity
public class PicTwin extends BaseModel {

    // The expiration
    @NotNull private Instant expiration;

    // The expired
    @Builder.Default @NotNull private Boolean expired = Boolean.FALSE;

    // The reported
    @Builder.Default @NotNull private Boolean reported = Boolean.FALSE;

    // The persona relationship
    @ManyToOne(optional = false)
    private Persona persona;

    // The pic relationship
    @ToString.Exclude
    @ManyToOne(optional = false)
    private Pic pic;

    // The twin relationship
    @ToString.Exclude
    @ManyToOne(optional = false)
    private Pic twin;
}
