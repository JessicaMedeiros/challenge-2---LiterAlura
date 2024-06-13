package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAutor (
        String name,
        int birth_year,
        int death_year){}