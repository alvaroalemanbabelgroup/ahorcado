package com.example.ahorcado.infra.console;

import com.example.ahorcado.repository.AhorcadoRepository;
import com.example.ahorcado.service.AhorcadoService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Component
public class ConsoleReader {
    private AhorcadoService ahorcadoService;
    private AhorcadoRepository ahorcadoRepository;

    public ConsoleReader(AhorcadoService ahorcadoService) {
        this.ahorcadoService = ahorcadoService;
    }

    @PostConstruct
    public void init() {
        Scanner sc = new Scanner(System.in);
        int option = 1;
        String entradaConsola;
        while (option != 2) {
            System.out.println("Menú:");
            System.out.println("1 - Jugar");
            System.out.println("2 - Salir");
            System.out.println("Seleccione qué quiere hacer: ");
            entradaConsola = sc.next();
            try {
                option = Integer.parseInt(entradaConsola);
            } catch (Exception e) {
                System.out.println("Opción no válida, seleccione una opción válida");
            }

        }
        switch (option){
            case 2:
                System.out.println("Cerrando el juego...");
                break;
            case 1:
                int intentos = 8;
                String palabra = ahorcadoRepository.seleccionaPalabra();
                System.out.println("Introduce una letra: ");
                ahorcadoService.compruebaLetra(sc.next().charAt(0),palabra);

        }
    }
}
