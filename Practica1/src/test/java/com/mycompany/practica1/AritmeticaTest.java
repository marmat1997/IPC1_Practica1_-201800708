/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.practica1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marma
 */
public class AritmeticaTest {
    
    public AritmeticaTest() {
    }

    @Test
    public void testMenuAri() {
    }

    @Test
    public void testSuma() {
        float t1 = 1;
        float t2 = 1;
        Aritmetica instance = new Aritmetica();
        float ResTest = 2;
        float res = instance.tsuma(t1, t2);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);
    }

    @Test
    public void testResta() {
        float t1 = 8;
        float t2 = 4;
        Aritmetica instance = new Aritmetica();
        float ResTest = 4;
        float res = instance.tresta(t1, t2);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);
    }

    @Test
    public void testMulti() {
        float t1 = 8;
        float t2 = 8;
        Aritmetica instance = new Aritmetica();
        float ResTest = 64;
        float res = instance.tmulti(t1, t2);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);
    }

    @Test
    public void testDivi() {
        float t1 = 8;
        float t2 = 8;
        Aritmetica instance = new Aritmetica();
        float ResTest = 1;
        float res = instance.tdivi(t1, t2);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);
    }

    @Test
    public void testPot() {
   float t1 = 2;
        float t2 = 2;
        Aritmetica instance = new Aritmetica();
        float ResTest = 4;
        float res = instance.tpot(t1, t2);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);     
    }
    @Test
   public void testFact(){
   float t1 = 5;
        float t2 = 2;
        Avanzadas instance = new Avanzadas();
        float ResTest = 120;
        float res = instance.TFact(t1);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);     
   }
   @Test
      public void testAbs(){
        float t1 = -5;
        float t2 = 2;
        Avanzadas instance = new Avanzadas();
        float ResTest = 5;
        float res = instance.TAbs(t1);
        //assertArrayEquals(expecteds, actuals, res);
        //Assert.assertTrue(ResTest == res);
        assertTrue(ResTest == res);     
   }
}
