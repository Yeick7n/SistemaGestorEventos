package com.example.sistemagestoreventos.modelo.evento;

import java.util.List;

public class EventoEventosModel {
    private EventoFichaModel ficha;
    private EventoProgramaModel programa;
    private String nivel;
    private String municipio;
    private EventoAmbienteModel ambiente;
    private String dia;
    private String horario;
    private int horas;
    private List <Integer> diastrabajados;
    private EventoCompetenciaModel competencia;
    private EventoResultadoModel resultado;
    private boolean conflict;

    public EventoFichaModel getFicha() {
        return ficha;
    }

    public void setFicha(EventoFichaModel ficha) {
        this.ficha = ficha;
    }

    public EventoProgramaModel getPrograma() {
        return programa;
    }

    public void setPrograma(EventoProgramaModel programa) {
        this.programa = programa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public EventoAmbienteModel getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(EventoAmbienteModel ambiente) {
        this.ambiente = ambiente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public List<Integer> getDiastrabajados() {
        return diastrabajados;
    }

    public void setDiastrabajados(List<Integer> diastrabajados) {
        this.diastrabajados = diastrabajados;
    }

    public EventoCompetenciaModel getCompetencia() {
        return competencia;
    }

    public void setCompetencia(EventoCompetenciaModel competencia) {
        this.competencia = competencia;
    }

    public EventoResultadoModel getResultado() {
        return resultado;
    }

    public void setResultado(EventoResultadoModel resultado) {
        this.resultado = resultado;
    }

    public boolean isConflict() {
        return conflict;
    }

    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }
}
