package com.example.sistemagestoreventos.modelo.ambiente;

import com.example.sistemagestoreventos.modelo.bloque.BloqueBloqueModel;
import com.example.sistemagestoreventos.modelo.tipoAmbiente.TipoAmbienteTipoAmbModel;
import com.example.sistemagestoreventos.modelo.sedes.SedesSedesModel;

public class AmbienteAmbienteModel {
    private String _id;
    private String codigo;
    private BloqueBloqueModel bloque;
    private TipoAmbienteTipoAmbModel tipo_ambiente;
    private SedesSedesModel sedes;
    private AmbienteAmbienteModel ambiente;

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

    public BloqueBloqueModel getBloque() {
        return bloque;
    }

    public void setBloque(BloqueBloqueModel bloque) {
        this.bloque = bloque;
    }

    public TipoAmbienteTipoAmbModel getTipo_ambiente() {
        return tipo_ambiente;
    }

    public void setTipo_ambiente(TipoAmbienteTipoAmbModel tipo_ambiente) {
        this.tipo_ambiente = tipo_ambiente;
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
}
