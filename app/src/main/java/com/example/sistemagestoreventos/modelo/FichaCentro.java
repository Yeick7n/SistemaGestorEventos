package com.example.sistemagestoreventos.modelo;

import com.example.sistemagestoreventos.modelo.ficha.FichaJornadaModel;
import com.example.sistemagestoreventos.modelo.instructor.InstructorInstructorModel;
import com.example.sistemagestoreventos.modelo.programas.ProgramasProgramaModel;

import java.util.List;

public class FichaCentro {
    private String _id;
    private String codigo;
    private AmbienteFichaCentro ambiente;
    private ProgramasProgramaModel progama;
    private InstructorInstructorModel instructor;
    private List <FichaJornadaModel> jornadas; ///REVISAR
    private String sede;

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

    public AmbienteFichaCentro getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(AmbienteFichaCentro ambiente) {
        this.ambiente = ambiente;
    }

    public ProgramasProgramaModel getProgama() {
        return progama;
    }

    public void setProgama(ProgramasProgramaModel progama) {
        this.progama = progama;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public class AmbienteFichaCentro{
        private String _id;
        private String codigo;
        private String tipo;
        private String sede;
        private int __v;
        private BloqueFichaCentro bloque;

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

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getSede() {
            return sede;
        }

        public void setSede(String sede) {
            this.sede = sede;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public BloqueFichaCentro getBloque() {
            return bloque;
        }

        public void setBloque(BloqueFichaCentro bloque) {
            this.bloque = bloque;
        }
    }

    public class BloqueFichaCentro{
        private String _id;
        private String nombre;
        private String nomenclatura;
        private int __v;
        private SedeFichaCentro sede;

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

        public String getNomenclatura() {
            return nomenclatura;
        }

        public void setNomenclatura(String nomenclatura) {
            this.nomenclatura = nomenclatura;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }

        public SedeFichaCentro getSede() {
            return sede;
        }

        public void setSede(SedeFichaCentro sede) {
            this.sede = sede;
        }
    }

    public class SedeFichaCentro{
        private String _id;
        private String nombre;
        private String lugar_funcionamiento;
        private String departamento;
        private String municipio;
        private int __v;
        private CentroFichaCentro centro;

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

        public String getLugar_funcionamiento() {
            return lugar_funcionamiento;
        }

        public void setLugar_funcionamiento(String lugar_funcionamiento) {
            this.lugar_funcionamiento = lugar_funcionamiento;
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

        public CentroFichaCentro getCentro() {
            return centro;
        }

        public void setCentro(CentroFichaCentro centro) {
            this.centro = centro;
        }
    }

    public class CentroFichaCentro{
        private String _id;
        private String codigo;
        private String nombre;
        private String municipio;
        private int __v;
        private RegionalFichaCentro regional;

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

        public RegionalFichaCentro getRegional() {
            return regional;
        }

        public void setRegional(RegionalFichaCentro regional) {
            this.regional = regional;
        }
    }

    public class RegionalFichaCentro{
        private String _id;
        private String codigo;
        private String nombre;
        private String municipio;
        private String departamento;
        private int __V;

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

        public String getMunicipio() {
            return municipio;
        }

        public void setMunicipio(String municipio) {
            this.municipio = municipio;
        }

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public int get__V() {
            return __V;
        }

        public void set__V(int __V) {
            this.__V = __V;
        }
    }
}
