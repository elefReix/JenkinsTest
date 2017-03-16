/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author elef
 */
public class Test {

    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    }
    public static double producto(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        if (a > 0) {
            return a/b;
        }
        return -123.43231;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los numeros : \n");
        double ele1 = sc.nextDouble();
        double ele2 =sc.nextDouble();
        
        System.out.println("El resultado de la suma es : \n"+ suma(ele1, ele2));
        System.out.println("El resultado de la resta es : \n"+ resta(ele1, ele2));
        System.out.println("El resultado del productos es : \n"+ producto(ele1, ele2));
        
    }
    
}
