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
public class Avanzadas {
    int m2;
    float m3;
    float a1;
    Scanner leer = new Scanner(System.in);
    public void MenuAva (){
        System.out.println(" ");        
        System.out.println("------------- Avanzadas -------------");
        do{
                System.out.println("1. Factorial");
                System.out.println("2. Valor Absoluto");
                System.out.println("3. Atras");
                m2 = leer.nextInt();
                switch (m2){
                  case 1:
                  System.out.println(" ");
                  factorial();
                  break;
            case 2:
                  System.out.println(" ");
                  ValorAbsoluto();
                  break;
            case 3:
                  System.out.println(" ");
                 break;
        }
    }while (m2 !=3);
    }
    public void factorial(){
        System.out.println("-------- Factorial --------");
        System.out.println("Ingrese Número");
        a1 = leer.nextInt();
        float a2=a1;
            /*float factorial = 1;
            while (a1 != 0) {
                factorial = (int) (factorial * a1);
                a1--;
            }*/
            float factorial = TFact(a1);
            System.out.println("El factorial del número "+a2 +" es "+ factorial);
            System.out.println(" ");    
    }
    public float TFact(float a1){
    float factorial = 1;
    while (a1 != 0) {
                factorial = (int) (factorial * a1);
                a1--;
            }
    return factorial;
    }
    public void ValorAbsoluto(){
   float n;
   float r;
        System.out.println("Ingrese el valor");
   n = leer.nextFloat();
   r = TAbs(n);
   if(r != 0){
       //r = n*-1;
       System.out.println("El valor absoluto es "+r);
   }
   /*else if(n == 0){
        System.out.println("El 0 es el número neutro");
           }*/
   else{
       System.out.println("El 0 es el número neutro"+n +" es "+n);
   }
   System.out.println(" ");    
    }
    public float TAbs(float n){
    if(n < 0){
       n = n*-1;
       //System.out.println("El valor absoluto es "+r);
   }
   else if(n == 0){
       n = n;
        //System.out.println("El 0 es el número neutro");
           }
   else{
       n=n;
       //System.out.println("El valor absoluto de "+n +" es "+n);
   }
    return n;
    }
    
}
