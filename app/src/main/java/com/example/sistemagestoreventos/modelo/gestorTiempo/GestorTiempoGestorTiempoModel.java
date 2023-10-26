package com.example.sistemagestoreventos.modelo.gestorTiempo;

import java.util.List;

public class GestorTiempoGestorTiempoModel {
    private String _id;
    private String ficha;
    private int duracion;
    private int acumulado;
    private List<GestorTiempoCompetenciaModel> competencias;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(int acumulado) {
        this.acumulado = acumulado;
    }

    public List<GestorTiempoCompetenciaModel> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<GestorTiempoCompetenciaModel> competencias) {
        this.competencias = competencias;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}

