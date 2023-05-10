package com.portfolio.mar.dto;

import javax.validation.constraints.NotBlank;

public class ProyectoDto {
    @NotBlank
    private String tituloPr;
    @NotBlank
    private String descripcionPr;
    @NotBlank
    private String imgPr;
    @NotBlank
    private String repositorio;

    public ProyectoDto() {
    }

    public ProyectoDto(String tituloPr, String descripcionPr, String imgPr, String repositorio) {
        this.tituloPr = tituloPr;
        this.descripcionPr = descripcionPr;
        this.imgPr = imgPr;
        this.repositorio = repositorio;
    }

    public String getTituloPr() {
        return tituloPr;
    }

    public void setTituloPr(String tituloPr) {
        this.tituloPr = tituloPr;
    }

    public String getDescripcionPr() {
        return descripcionPr;
    }

    public void setDescripcionPr(String descripcionPr) {
        this.descripcionPr = descripcionPr;
    }

    public String getImgPr() {
        return imgPr;
    }

    public void setImgPr(String imgPr) {
        this.imgPr = imgPr;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }
}