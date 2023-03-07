package com.example.ahorcado.repository.impl;

import com.example.ahorcado.domain.Ahorcado;
import com.example.ahorcado.repository.AhorcadoRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AhorcadoRepositoryMemory implements AhorcadoRepository {

    private Random random = new Random();
    private List<String> palabras = new ArrayList<>(
            Arrays.asList("AGUACATE","ALMENDRO","PERA","MANZANA","ARBOLEDA",
            "BABEL","AHORCADO","JUGADOR","ESTERNOCLEIDOMASTOIDEO", "ORDENADOR")
            );

    public AhorcadoRepositoryMemory() {

    }

    public String seleccionaPalabra(){
        int aleatorio = random.nextInt(palabras.size());
        String palabraSeleccionada = palabras.get(aleatorio);
        return palabraSeleccionada;
    }

    @Override
    public void compruebaPalabra() {

    }

    @Override
    public void palabraCorrecta() {

    }

    @Override
    public String muestraProgreso() {
        return null;
    }
}
