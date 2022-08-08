package com.mycompany.practica1;


import java.util.Scanner;

public class Matriz {

    float[][] matriz1;
    float[][] matriz2;
    float[][] resultado;
    Scanner entrada = new Scanner(System.in);

    public Matriz() {
        matriz1 = new float[3][3];
        matriz2 = new float[3][3];
        resultado = new float[3][3];
    }

    public void insertar() {
        matrizInicio();
        System.out.println(" Ingrese Datos Matriz 1 ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Matriz ["+ i +j+"]: ");
                matriz1[i][j] = entrada.nextFloat();
            }
        }
        System.out.println(" Ingrese Datos Matriz 2 ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Matriz ["+ i +j+"]: ");
                matriz2[i][j] = entrada.nextFloat();
            }
        }
    }
    
    public void matrizInicio (){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = 0;
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = 0;
            }
        }
    }

    public void imprimir(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    public void sumarmatrices(){
            for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }
                    for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < resultado.length; j++) {
                System.out.print("[ " + resultado[i][j] + " ]");
            }

            System.out.println("");
        }
    }
public void restamatrices(){
            for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  -   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < resultado.length; j++) {
                System.out.print("[ " + resultado[i][j] + " ]");
            }

            System.out.println("");
        }
    }
public void multimatrices(){
resultado[0][0] = matriz1[0][0]*matriz2[0][0] + matriz1[0][1]*matriz2[1][0] + matriz1[0][2]*matriz2[2][0];
resultado[0][1] = matriz1[0][0]*matriz2[0][1] + matriz1[0][1]*matriz2[1][1] + matriz1[0][2]*matriz2[2][1];
resultado[0][2] = matriz1[0][0]*matriz2[0][2] + matriz1[0][1]*matriz2[1][2] + matriz1[0][2]*matriz2[2][2];

resultado[1][0] = matriz1[1][0]*matriz2[0][0] + matriz1[1][1]*matriz2[1][0] + matriz1[1][2]*matriz2[2][0];
resultado[1][1] = matriz1[1][0]*matriz2[0][1] + matriz1[1][1]*matriz2[1][1] + matriz1[1][2]*matriz2[2][1];
resultado[1][2] = matriz1[1][0]*matriz2[0][2] + matriz1[1][1]*matriz2[1][2] + matriz1[1][2]*matriz2[2][2];

resultado[2][0] = matriz1[2][0]*matriz2[0][0] + matriz1[2][1]*matriz2[1][0] + matriz1[2][2]*matriz2[2][0];
resultado[2][1] = matriz1[2][0]*matriz2[0][1] + matriz1[2][1]*matriz2[1][1] + matriz1[2][2]*matriz2[2][1];
resultado[2][2] = matriz1[2][0]*matriz2[0][2] + matriz1[2][1]*matriz2[1][2] + matriz1[2][2]*matriz2[2][2];

for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  *   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[ " + matriz2[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < resultado.length; j++) {
                System.out.print("[ " + resultado[i][j] + " ]");
            }

            System.out.println("");
        }
}

}
