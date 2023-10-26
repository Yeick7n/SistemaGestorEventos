package com.example.sistemagestoreventos.modelo;

import com.example.sistemagestoreventos.modelo.instructor.InstructorInstructorModel;

import java.util.List;

public class FichaSede {
    private String _id;
    private String codigo;
    private String fechaInicio;
    private String fechaFin;
    private SedeFichaSede sede;
    private AmbienteFichaSede ambiente;
    private ProgramaFichaSede programa;
    private InstructorInstructorModel instructor;
    private List <JornadasFichaSede> jornadas;
    private int __v;

    public class SedeFichaSede{
        private String _id;
        private String nombre;
        private String centro;
        private String lugar_funcionamiento;
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

        public String getCentro() {
            return centro;
        }

        public void setCentro(String centro) {
            this.centro = centro;
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
    }
    public class AmbienteFichaSede{
        private String _id;
        private String codigo;
        private String bloque;
        private String tipo;
        private String sede;
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

        public String getBloque() {
            return bloque;
        }

        public void setBloque(String bloque) {
            this.bloque = bloque;
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
    }
    public class  ProgramaFichaSede{
        private String _id;
        private String codigo;
        private String nombre;
        private String nivel;
        private String version;
        private int duracion;
        private int intensidad_horaria;
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

        public String getNivel() {
            return nivel;
        }

        public void setNivel(String nivel) {
            this.nivel = nivel;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getIntensidad_horaria() {
            return intensidad_horaria;
        }

        public void setIntensidad_horaria(int intensidad_horaria) {
            this.intensidad_horaria = intensidad_horaria;
        }

        public int get__v() {
            return __v;
        }

        public void set__v(int __v) {
            this.__v = __v;
        }
    }
    public class JornadasFichaSede{
        private String dia;
        private String jornada;
        private String horaInicio;
        private String horaFin;

        public String getDia() {
            return dia;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getJornada() {
            return jornada;
        }

        public void setJornada(String jornada) {
            this.jornada = jornada;
        }

        public String getHoraInicio() {
            return horaInicio;
        }

        public void setHoraInicio(String horaInicio) {
            this.horaInicio = horaInicio;
        }

        public String getHoraFin() {
            return horaFin;
        }

        public void setHoraFin(String horaFin) {
            this.horaFin = horaFin;
        }
    }
}
