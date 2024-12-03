/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.dsm.pictwin.model;

import io.ebean.annotation.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

// The pic
@Getter
@ToString
@AllArgsConstructor
@Builder
@Entity
public class Pic extends BaseModel {

    // The latitude
    @NotNull private Double latitude;

    // The longitude
    @NotNull private Double longitude;

    // The number of reports
    @Builder.Default @NotNull private Integer reportss = 0;

    // The date
    @NotNull private Instant date;

    // The photo
    @NotNull @Lob private byte[] photo;

    // The bloqued
    @Builder.Default @NotNull private Boolean bloqued = Boolean.FALSE;

    // The number of views
    @Builder.Default @NotNull private Integer views = 0;

    // The persona relationship
    @ManyToOne(optional = false)
    private Persona persona;
}

