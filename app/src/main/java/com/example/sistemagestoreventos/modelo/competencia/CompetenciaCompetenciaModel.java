package com.example.sistemagestoreventos.modelo.competencia;

public class CompetenciaCompetenciaModel {
    private String _id;
    private String programa;
    private CompetenciaCompetenciasModel competencias;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public CompetenciaCompetenciasModel getCompetencias() {
        return competencias;
    }

    public void setCompetencias(CompetenciaCompetenciasModel competencias) {
        this.competencias = competencias;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
