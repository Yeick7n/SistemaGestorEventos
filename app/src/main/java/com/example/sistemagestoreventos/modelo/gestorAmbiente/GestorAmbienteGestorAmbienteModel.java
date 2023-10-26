package com.example.sistemagestoreventos.modelo.gestorAmbiente;

import java.util.List;

public class GestorAmbienteGestorAmbienteModel {
    private String _id;
    private String sede;
    private String centro;
    private List  <GestorAmbienteAmbientesModel> ambiente;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public List<GestorAmbienteAmbientesModel> getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(List<GestorAmbienteAmbientesModel> ambiente) {
        this.ambiente = ambiente;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
