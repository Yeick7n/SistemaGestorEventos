package com.example.sistemagestoreventos.modelo.gestorAmbiente;

import java.util.List;

public class GestorAmbienteAmbientesModel {
    private String id;
    private String nombre;
    private List <GestorAmbienteCalendarioModel> calendario;
    private int __V;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<GestorAmbienteCalendarioModel> getCalendario() {
        return calendario;
    }

    public void setCalendario(List<GestorAmbienteCalendarioModel> calendario) {
        this.calendario = calendario;
    }

    public int get__V() {
        return __V;
    }

    public void set__V(int __V) {
        this.__V = __V;
    }
}
