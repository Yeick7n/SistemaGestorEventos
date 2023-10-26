package com.example.sistemagestoreventos.modelo.ficha;

public class FichaContratoModel {
    private String numero;
    private String fechaInicio;
    private String fechaTerminación;
    private String tipoVinculacion;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaTerminación() {
        return fechaTerminación;
    }

    public void setFechaTerminación(String fechaTerminación) {
        this.fechaTerminación = fechaTerminación;
    }

    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }
}
