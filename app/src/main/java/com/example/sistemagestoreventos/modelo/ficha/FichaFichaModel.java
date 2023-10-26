package com.example.sistemagestoreventos.modelo.ficha;

import com.example.sistemagestoreventos.modelo.instructor.InstructorInstructorModel;
import com.example.sistemagestoreventos.modelo.ambiente.AmbienteAmbienteModel;
import com.example.sistemagestoreventos.modelo.programas.ProgramasProgramaModel;
import com.example.sistemagestoreventos.modelo.sedes.SedesSedesModel;

import java.util.List;

public class FichaFichaModel {
    private String _id;
    private String codigo;
    private String fechaInicio;
    private String fechaFin;
    private SedesSedesModel sedes;
    private AmbienteAmbienteModel ambiente;
    private ProgramasProgramaModel programa;
    private InstructorInstructorModel instructor;
    private List <FichaJornadaModel> jornadas;
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public SedesSedesModel getSedes() {
        return sedes;
    }

    public void setSedes(SedesSedesModel sedes) {
        this.sedes = sedes;
    }

    public AmbienteAmbienteModel getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(AmbienteAmbienteModel ambiente) {
        this.ambiente = ambiente;
    }

    public ProgramasProgramaModel getPrograma() {
        return programa;
    }

    public void setPrograma(ProgramasProgramaModel programa) {
        this.programa = programa;
    }

    public InstructorInstructorModel getInstructor() {
        return instructor;
    }

    public void setInstructor(InstructorInstructorModel instructor) {
        this.instructor = instructor;
    }

    public List<FichaJornadaModel> getJornadas() {
        return jornadas;
    }

    public void setJornadas(List<FichaJornadaModel> jornadas) {
        this.jornadas = jornadas;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
