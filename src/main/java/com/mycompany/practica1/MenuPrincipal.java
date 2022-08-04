/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;
import java.util.Scanner;
/**
 *
 * @author marma
 */
public class MenuPrincipal {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int op = 0;
    do{
        System.out.println("---------- Menu Principal ----------");
        System.out.println("1. Artimetica");
        System.out.println("2. Estadistica");
        System.out.println("3. Matrices");
        System.out.println("4. Ecuaciones");
        System.out.println("5. Avanzadas");
        System.out.println("\033[31m6. Salir");
        op = leer.nextInt();
        switch (op){
            case 1:
                System.out.println(" ");
                Aritmetica ari = new Aritmetica();
                ari.MenuAri();
                break;
            case 2:
                Estadistica estas = new Estadistica();
                estas.MenuEsta();
                break;
            case 3:
                Ejercicio ejer = new Ejercicio();
                ejer.MenuMatri();
                break;
            case 4:
                Ecuaciones ecua = new Ecuaciones();
                ecua.MenuEcua();
                break;
            case 5:
            Avanzadas avan = new Avanzadas();
            avan.MenuAva();
                break;
            case 6:
                System.out.println("Adios");
                break;
            default:
               System.out.println("Opción incorrecta");
               
        }
    }while (op !=6);
    }
}
