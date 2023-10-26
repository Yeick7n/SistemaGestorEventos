package com.example.sistemagestoreventos.modelo.evento;

import java.util.List;

public class EventoEventoModel {
    private String _id;
    private int mes;
    private int year;
    private String instructor;
    private List <EventoEventosModel> eventos;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public List<EventoEventosModel> getEventos() {
        return eventos;
    }

    public void setEventos(List<EventoEventosModel> eventos) {
        this.eventos = eventos;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
