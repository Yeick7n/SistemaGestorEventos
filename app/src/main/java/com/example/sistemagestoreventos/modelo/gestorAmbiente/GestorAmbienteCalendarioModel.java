package com.example.sistemagestoreventos.modelo.gestorAmbiente;

public class GestorAmbienteCalendarioModel {
    private GestorAmbienteEstructuraCalModel morning;
    private GestorAmbienteEstructuraCalModel afternoon;
    private GestorAmbienteEstructuraCalModel night;

    public GestorAmbienteEstructuraCalModel getMorning() {
        return morning;
    }

    public void setMorning(GestorAmbienteEstructuraCalModel morning) {
        this.morning = morning;
    }

    public GestorAmbienteEstructuraCalModel getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(GestorAmbienteEstructuraCalModel afternoon) {
        this.afternoon = afternoon;
    }

    public GestorAmbienteEstructuraCalModel getNight() {
        return night;
    }

    public void setNight(GestorAmbienteEstructuraCalModel night) {
        this.night = night;
    }
}
