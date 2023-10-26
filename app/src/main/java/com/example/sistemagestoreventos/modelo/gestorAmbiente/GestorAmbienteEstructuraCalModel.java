package com.example.sistemagestoreventos.modelo.gestorAmbiente;

import com.example.sistemagestoreventos.modelo.evento.EventoCompetenciaModel;

public class GestorAmbienteEstructuraCalModel {
    private String instructor;
    private String ficha;
    private String programa;
    private String nivel;
    private EventoCompetenciaModel competencia;
    private String resultado;

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public EventoCompetenciaModel getCompetencia() {
        return competencia;
    }

    public void setCompetencia(EventoCompetenciaModel competencia) {
        this.competencia = competencia;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
