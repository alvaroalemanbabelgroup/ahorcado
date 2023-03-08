package com.example.ahorcado.repository;

import com.example.ahorcado.domain.Ahorcado;

public interface AhorcadoRepository {
    void compruebaLetra(char letra, Ahorcado ahorcado);
    void palabraCorrecta(String palabra);
    String muestraProgreso();
    String seleccionaPalabra();

    void disminuyeIntentos(int intentos);
}
