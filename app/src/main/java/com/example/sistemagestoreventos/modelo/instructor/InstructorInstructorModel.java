package com.example.sistemagestoreventos.modelo.instructor;

import com.example.sistemagestoreventos.modelo.ficha.FichaContratoModel;

import java.util.List;

public class InstructorInstructorModel {
    private String _id;
    private String documento;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private FichaContratoModel contrato;
    private List <String> programas;
    private String centro;
    private List <String> roles;
    private int __v;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public FichaContratoModel getContrato() {
        return contrato;
    }

    public void setContrato(FichaContratoModel contrato) {
        this.contrato = contrato;
    }

    public List<String> getProgramas() {
        return programas;
    }

    public void setProgramas(List<String> programas) {
        this.programas = programas;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
