/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;
import java.util.Random;
public class Estadistica {
    int m2;
    int m3;
    float esta[];
    Scanner leer = new Scanner(System.in);
    public void MenuEsta (){        System.out.println("Estadistica");
            do{
                System.out.println("1. Generar Resumen");
                System.out.println("2. Atras");
        m2 = leer.nextInt();
        switch (m2){
            case 1:
                System.out.println(" ");
               MenuIngre();
                break;
            case 2:
                System.out.println(" ");
                break;  
        }
    }while (m2 !=2);
    }
    public void MenuIngre(){
                do{
                System.out.println("1. Manual");
                System.out.println("2. Aleatorio");
                System.out.println("3. Salir");
        m3 = leer.nextInt();
        switch (m3){
            case 1:
                System.out.println(" ");
                Ingresar();
                break;
            case 2:
                System.out.println(" ");
                Aleatorio();
                break;  
            case 3:
                break;
        }
    }while (m3 !=3);
    }
    public void Ingresar(){
        System.out.println("Digite cuantos elementos desea");
    int n = leer.nextInt();
    if(n<26){
    float [] esta = new float[n];
        System.out.println("Digite los elementos");
    for(int i=0; i<n; i++){
          int t=i+1;
        System.out.println("Numéro "+t);
        esta[i]= leer.nextInt();
    }
        System.out.println("Su serie es");
    for(int i=0; i<n; i++){
        System.out.println(esta[i]);
    }
        System.out.println("--------Resumen Estadistico-------");
        float [] res = new float[1];
        res [0] = 0;
        //System.out.println(res[0]);
        for(int i=0; i<n; i++){
        res [0] = esta[i]+ res[0];
    }
        float media = res[0]/n;
        System.out.println("La media es "+media);
        float mayor, menor;
        mayor = menor = esta[0];
        for (int i = 0; i <esta.length; i++) {
           if(esta[i]>mayor){
           mayor = esta[i];
           }
           if(esta[i]<mayor){
           menor = esta[i];
           }
        }
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
                System.out.println(" ");
}   else{
        System.out.println("El número debe ser menor a 26");
        System.out.println(" ");
    }
    }
        public void Aleatorio(){
        
        System.out.println("Digite cuantos elementos desea");
    int n = leer.nextInt();
    if(n<26){
        Random r = new Random();
        
    float [] esta = new float[n];
        System.out.println("Digite los elementos");
    for(int i=0; i<n; i++){
          int t=i+1;
        esta[i]= r.nextInt(100)+1;
    }
        System.out.println("Su serie es");
    for(int i=0; i<n; i++){
        System.out.println(esta[i]);
    }
        System.out.println("--------Resumen Estadistico-------");
        float [] res = new float[1];
        res [0] = 0;
        //System.out.println(res[0]);
        for(int i=0; i<n; i++){
        res [0] = esta[i]+ res[0];
    }
        float media = res[0]/n;
        System.out.println("La media es "+media);
        
        float may, men;
        may = men = esta[0];
                for (int i = 0; i <esta.length; i++) {
           if(esta[i]>may){
           may = esta[i];
           }
           if(esta[i]<men){
           men = esta[i];
           }
        }
        System.out.println("El mayor es "+may);
        System.out.println("El menor es "+men);
        System.out.println(" ");
}
    else{
     System.out.println("El número debe ser menor a 26");
     System.out.println(" ");
    }
        }
}
