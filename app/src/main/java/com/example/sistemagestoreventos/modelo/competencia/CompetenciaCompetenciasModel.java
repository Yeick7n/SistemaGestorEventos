package com.example.sistemagestoreventos.modelo.competencia;

import java.util.List;

public class CompetenciaCompetenciasModel {
    private String codigo;
    private String nombre;
    private int duración;
    private List <CompetenciaResultadosModel> resultados;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public List<CompetenciaResultadosModel> getResultados() {
        return resultados;
    }

    public void setResultados(List<CompetenciaResultadosModel> resultados) {
        this.resultados = resultados;
    }
}
