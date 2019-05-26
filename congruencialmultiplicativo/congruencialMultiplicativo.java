/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencialmultiplicativo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author cluster
 */
public class congruencialMultiplicativo {
     public static boolean primo(int num){
        int temp;
        boolean primo=true;
       
        for (int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if (temp==0)
            {
                primo=false;
                break;
            }
        }
        if(primo)
            return true;
        else 
            return false;
    
}
    
    public static void main(String[] arg) {
        double a ;
        int xn=0,X0, m, p,t;
        DecimalFormat formato1 = new DecimalFormat("0.00");
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese 't' cualquier entero");
        t = num.nextInt();
        System.out.println("Ingrese semilla 'X0'");
        X0 = num.nextInt();
        System.out.println("Ingrese modulo 'm'");
        m = num.nextInt();
        System.out.println("Ingrese uno de los siguiente valores"+
                           "[ 3,11,13,19,21,27,29,37,53,59,61, 67,69,77,83,91 ]" );
        p = num.nextInt();
        boolean esPrimo=congruencialMultiplicativo.primo(X0);  
            if(p==3 |p==11 |p==13 |p==19 |p==21 |p==27 |p==29 |p==37 |p==53
                    |p==59 |p==61 |p==67|p==69 |p==77 |p==83 |p==91){
                 a=(200*t)+p;
                 System.out.println(a);
                if(X0%2!=0 | X0%5!=0){
                    if(esPrimo){
                        System.out.println("_________");
                        System.out.println("n "+" " +" Xn");
                        System.out.println("_________");
                        for(int i=0; i<21; i++){

                             xn= (int)(a*X0)%m;
                             System.out.println(i+"   "+ X0 );
                             X0=xn;
                        }
                        System.out.println("_________");

                    }else{
                        System.out.println(  "La semilla no es primo");
                    }
            }else{
                System.out.println(  "La semilla debe ser un numero impar que no sea divible 2 o 5 ");
            }
            }else{
                System.out.println("no ingreso el numero correcto");
            }
            
 
        
        }
        
    }    

