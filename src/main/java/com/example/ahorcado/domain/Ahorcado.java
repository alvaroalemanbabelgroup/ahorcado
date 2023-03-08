package com.example.ahorcado.domain;

public class Ahorcado {
    private int intentos;
    private String palabra;

    public Ahorcado(int intentos, String palabra) {
        this.intentos = intentos;
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
