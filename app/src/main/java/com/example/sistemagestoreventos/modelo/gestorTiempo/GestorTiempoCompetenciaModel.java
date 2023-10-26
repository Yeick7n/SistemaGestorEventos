package com.example.sistemagestoreventos.modelo.gestorTiempo;

import java.util.List;

public class GestorTiempoCompetenciaModel {
    private String codigo;
    private String nombre;
    private int duracion;
    private List<GestorTiempoResultadosModel> resultados;

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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<GestorTiempoResultadosModel> getResultados() {
        return resultados;
    }

    public void setResultados(List<GestorTiempoResultadosModel> resultados) {
        this.resultados = resultados;
    }
}
