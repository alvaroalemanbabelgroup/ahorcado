package com.example.ahorcado.service.impl;

import com.example.ahorcado.domain.Ahorcado;
import com.example.ahorcado.repository.AhorcadoRepository;
import com.example.ahorcado.service.AhorcadoService;

public class AhorcadoServiceImpl implements AhorcadoService {
    AhorcadoRepository ahorcadoRepository;

    public AhorcadoServiceImpl(AhorcadoRepository ahorcadoRepository) {
        this.ahorcadoRepository = ahorcadoRepository;
    }

    @Override
    public void compruebaLetra(char letra, Ahorcado ahorcado) {
        ahorcadoRepository.compruebaLetra(letra, ahorcado);
    }

    @Override
    public void palabraCorrecta(String palabra) {
        ahorcadoRepository.palabraCorrecta(palabra);
    }

    @Override
    public String muestraProgreso() {
        return null;
    }

    @Override
    public void disminuyeIntentos(int intentos) {
        ahorcadoRepository.disminuyeIntentos(intentos);
    }
}
