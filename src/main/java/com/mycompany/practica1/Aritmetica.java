/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;
import java.util.Scanner;
public class Aritmetica {
    Scanner leer = new Scanner(System.in);
    float a;
    float b;
    float c;
    int m2;
    public void MenuAri (){
        System.out.println("Bienvenido a aritmetica");
            do{
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Potencia");
                System.out.println("\033[31m6. Atras");
        m2 = leer.nextInt();
        switch (m2){
            case 1:
                System.out.println(" ");
                System.out.println("------------Suma------------");
               suma();
                break;
            case 2:
               System.out.println(" ");
                System.out.println("------------Resta------------");
                resta();
                break;
            case 3:
                System.out.println(" ");
                System.out.println("------------Multiplicación------------");
                multi();
            case 4:
                System.out.println(" ");
                System.out.println("------------División------------");
                divi();
            case 5:
                System.out.println(" ");
                System.out.println("------------Potencia------------");
                pot();
            case 6:
                System.out.println(" ");
                break;
            default:
               System.out.println("Opción incorrecta");
               
        }
    }while (m2 !=6);
    }
    public void suma(){
        System.out.println("Ingrese el primer número");
        a = leer.nextFloat();
        System.out.println("Ingrese el segundo número");
        b = leer.nextFloat();
        c = tsuma(a,b);//a+b;
        System.out.println("\033[32mSu resultado es "+c);
        System.out.println(" ");
}
    public float tsuma(float t1, float t2){
    
        return t1+t2;
    
    }
        public void resta(){
        System.out.println("Ingrese el primer número");
        a = leer.nextFloat();
        System.out.println("Ingrese el segundo número");
        b = leer.nextFloat();
        c = tresta(a,b);//a-b;
        System.out.println("\033[32mSu resultado es "+c);
        System.out.println(" ");
}
            public float tresta(float t1, float t2){
    
        return t1-t2;
    
    }
            public void multi(){
        System.out.println("Ingrese el primer número");
        a = leer.nextFloat();
        System.out.println("Ingrese el segundo número");
        b = leer.nextFloat();
        c = tmulti(a,b);//a*b;
        System.out.println("\033[32mSu resultado es "+c);
        System.out.println(" ");
}
            public float tmulti(float t1, float t2){
            return t1*t2;
            }
                public void divi(){
        System.out.println("Ingrese el primer número");
        a = leer.nextFloat();
        System.out.println("Ingrese el segundo número");
        b = leer.nextFloat();
        if(b!=0){
        c = a/b;
        System.out.println("\033[32mSu resultado es "+c);
        System.out.println(" ");
        }
        else{
            System.out.println("Su división tiende a infinito");
        }
}
       public float tdivi(float t1, float t2){
            return t1/t2;
            }
    /*public static void main(String[] args) {
        System.out.println("Hola, bienvenido a aritmetica");
    }*/
        public void pot(){
        System.out.println("Ingrese la base");
        a = leer.nextFloat();
        System.out.println("Ingrese la potencia");
        b = leer.nextFloat();
        c = 0;
        //double poti = 1;
       /*for(int i=1; i<=b; i++){
       //c = a+c;
       poti = poti*a;
       } */
       //c = a^b;
       float poti = tpot(a,b);
        System.out.println("\033[32mSu resultado es "+poti);
        System.out.println(" ");
}
     public float tpot(float a, float b){
     float poti = 1;
            for(int i=1; i<=b; i++){
       //c = a+c;
       poti = poti*a;
       }
            return poti;
     }
}
