/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import becker.robots.*;

/**
 *
 * @author JoseLuis
 */
public class Histograma {


    public static void main(String[] args) {
        // Set up the initial situation
        
        ejercicio4 karel= new ejercicio4();
        
        Thing pos1[]= new Thing[10];
        Thing pos2[]= new Thing[100];
        Thing pos3[]= new Thing[100];
        Thing pos4[]= new Thing[100];
        
        for(int i=0; i<5; i++){    
        pos1[i] = new Thing(karel.getA(), 1, 1);
        }
        for(int i=0; i<4; i++){    
        pos2[i] = new Thing(karel.getA(), 2, 1);
        }
        for(int i=0; i<2; i++){    
        pos3[i] = new Thing(karel.getA(), 3, 1);
        }
        for(int i=0; i<5; i++){    
        pos4[i] = new Thing(karel.getA(), 4, 1);
        }
        karel.jugar();

        
        
                

    }
}
