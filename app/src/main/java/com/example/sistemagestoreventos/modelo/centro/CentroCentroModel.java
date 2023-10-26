package com.example.sistemagestoreventos.modelo.centro;

import com.example.sistemagestoreventos.modelo.regional.RegionalRegionalModel;

public class CentroCentroModel {
    private String _id;
    private String codigo;
    private String nombre;
    private RegionalRegionalModel regional;
    private String municipio;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

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

    public RegionalRegionalModel getRegional() {
        return regional;
    }

    public void setRegional(RegionalRegionalModel regional) {
        this.regional = regional;
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
