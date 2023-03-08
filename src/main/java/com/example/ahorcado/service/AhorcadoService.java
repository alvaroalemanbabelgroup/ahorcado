package com.example.ahorcado.service;

import com.example.ahorcado.domain.Ahorcado;
import org.springframework.stereotype.Service;

@Service
public interface AhorcadoService {

    public void compruebaLetra(char letra, Ahorcado ahorcado);

    public void palabraCorrecta(String palabra);

    public String muestraProgreso();
    public void disminuyeIntentos(int intentos);
}
