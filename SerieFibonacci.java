/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;
/**
 *
 * @author Leonel García
 */
public class SerieFibonacci {

    public static void main(String[] args) {

        int  cero=0, uno=1, fibonacci;
        System.out.println("Fibonacci");

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingresa los numeros que quiera ver");
        int numero = lectura.nextInt();
        lectura.close();
        System.out.println("La serie esta conformada por " + lectura + " numeros ");
        for (int i = 1; i < numero; i++) {
            System.out.println("- "+cero);

            fibonacci= cero +uno;
            cero=uno;
            uno=fibonacci;
        }
// TODO code application logic here
    }

}
