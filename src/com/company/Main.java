package com.company;

import java.util.Scanner;

public class Main {

/*1-CREAR UN PROGRAMA QUE PIDA UN NUMERO POR TECLADO Y QUE IMPRIMA POR PANTALLA
LOS NUMEROS DESDE EL NUMERO QUE SE INTRODUJO POR TECLADO HASTA 100*/

    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Apartir de que numero se realizara el recorrido");
        numero = entrada.nextInt();

        for (int i = numero; i <= 100; i++) {
            System.out.println("Valor: " + i);

        }
    }
}
