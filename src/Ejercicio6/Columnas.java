/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import becker.robots.*;


/**
 *
 * @author JoseLuis
 */
public class Columnas {
    
    public static void main(String[] args) {
        // Set up the initial situation
        City prague = new City();
        Thing parcel = new Thing(prague,0, 10);
        
        Robot karel = new Robot(prague, 0, 0, Direction.EAST, 55);
        
        /*for(int i=0; i<=20; i++){
            Thing Karel= new Thing (prague,0,0);
            karel.pickThing();
            
        }
*/
        
        int x = 2;
        
       

        for (int j = 1; j <= 10; j++) {
           
            
            for (int i = 1; i < x; i++) {
                
                karel.move();
                
                karel.putThing();
                

            }

            

            karel.turnLeft();
            karel.turnLeft();

            for (int i = 1; i < x; i++) {
                karel.move();
            }

            karel.turnLeft();
            karel.move();
            karel.turnLeft();

            x++;

        }
    }
    
    
    
}
