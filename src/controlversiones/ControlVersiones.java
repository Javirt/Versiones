/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlversiones;

import java.util.Scanner;

/**
 *
 * @author javir
 */
public class ControlVersiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);        
        System.out.println("Ejercicio de Clase: restar numeros");    
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        for(int i=num; i>=0; i--){
            System.out.println(num+"-"+i+"="+(num-i));
        }
        System.out.println("Buen trabajo!!");
    }
    
}
