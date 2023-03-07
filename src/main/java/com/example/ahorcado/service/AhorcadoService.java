package com.example.ahorcado.service;

import org.springframework.stereotype.Service;

@Service
public interface AhorcadoService {
    public void compruebaPalabra();
    public void palabraCorrecta();

    public String muestraProgreso();
}
