package com.example.sistemagestoreventos.modelo.sedes;

import com.example.sistemagestoreventos.modelo.centro.CentroCentroModel;

public class SedesSedesModel {
    private String _id;
    private String nombre;
    private CentroCentroModel centro;
    private String lugar_funcioamiento;
    private String departamento;
    private String municipio;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroCentroModel getCentro() {
        return centro;
    }

    public void setCentro(CentroCentroModel centro) {
        this.centro = centro;
    }

    public String getLugar_funcioamiento() {
        return lugar_funcioamiento;
    }

    public void setLugar_funcioamiento(String lugar_funcioamiento) {
        this.lugar_funcioamiento = lugar_funcioamiento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
