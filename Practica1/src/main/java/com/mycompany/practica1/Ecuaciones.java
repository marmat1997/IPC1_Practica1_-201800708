
package com.mycompany.practica1;
import java.util.Scanner;
public class Ecuaciones {
    int m2;
    int m3;
    int a1;
    Scanner leer = new Scanner(System.in);
public void MenuEcua (){
        System.out.println(" ");        
        System.out.println("------------- Ecuaciones -------------");
        do{
                System.out.println("1. Resolver Ecuaciones");
                System.out.println("2. Atras");
               // System.out.println("3. Atras");
                m2 = leer.nextInt();
                switch (m2){
                  case 1:
                  System.out.println(" ");
                  sistema();
                  break;
            case 2:
                  System.out.println(" ");
                  break;
        }
    }while (m2 !=2);
    }
public void sistema(){
    //float x1;
    float d;
    float t1;
    float t2;
    float x;
    float y;       
    System.out.println("---- Resolución de ecuaciones 2x2 ----");
    System.out.println("Ingrese Ecuación 1");
        System.out.println("");
    System.out.println("x1: "); float x1 = leer.nextFloat();
    System.out.println("y1: ");float y1 = leer.nextFloat();
    System.out.println("r1: ");float r1 = leer.nextFloat();
    System.out.println("Ingrese Ecuación 2");
    System.out.println("");
    System.out.println("x2: ");float x2 = leer.nextFloat();
    System.out.println("y2: ");float y2 = leer.nextFloat();
    System.out.println("r2: ");float r2 = leer.nextFloat();
    d = (x1*y2)-(y1*x2);
    if(d != 0){
    t1 = (r1*y2)-(r2*y1);
    t2 = (x1*r2)-(x2*r1);
    x = t1/d;
    y = t2/d;
        System.out.println("X: "+x);
        System.out.println("Y: "+y);
    }
    else{
        System.out.println("El sistema no tiene solución, la determinante es cero");
    }
}
}
