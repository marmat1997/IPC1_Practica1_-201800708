package com.mycompany.practica1;


import java.util.Scanner;

public class Ejercicio {

    public void MenuMatri() {
        Scanner entrada = new Scanner(System.in);
        int bandera = -1;
        Matriz m1 = new Matriz();
        m1.matrizInicio();
        while (bandera != 6) {
            System.out.println(" ");
            System.out.println("----------- Matrices -----------");
            System.out.println("1. Ingresar Matrices ");
            System.out.println("2. Mostrar matrices ");
            System.out.println("3. Sumar matrices");
            System.out.println("4. Restar matrices");
            System.out.println("5. Multiplicar matrices");
            System.out.println("6. Atras");
            bandera = entrada.nextInt();
            switch(bandera){
                case 1:
                    m1.insertar();
                    break;
                case 2:
                    m1.imprimir(m1.matriz1);
                    System.out.println("");
                    m1.imprimir(m1.matriz2);
                    break;
                case 3:
                    System.out.println(" ");
                    m1.sumarmatrices();
                    break;
                case 4:
                    System.out.println(" ");
                    m1.restamatrices();
                    break;
                case 5:
                    System.out.println(" ");
                    m1.multimatrices();
                    break;
                case 6:
                    System.out.println(" ");
                    break; 
            }
        }
    }

}
