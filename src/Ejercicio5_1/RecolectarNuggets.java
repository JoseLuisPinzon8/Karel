/*==
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_1;

/**
 *
 * @author JoseLuis
 */
import becker.robots.*;

public class RecolectarNuggets {
    
    public static void main(String[] args) {
    
    City A= new City();
    Thing B= new Thing(A,6,10);
    Thing C= new Thing(A,7,8);
    Thing D= new Thing(A,9,7);
    
    Robot N= new Robot(A,10,10, Direction.NORTH);
    
    
                Wall pared1=new Wall (A,10,10,Direction.SOUTH);
                Wall pared2=new Wall (A,10,10,Direction.EAST);
                Wall pared3=new Wall (A,10,10,Direction.WEST);
                Wall pared4=new Wall (A,10,11,Direction.NORTH);
                Wall pared6=new Wall (A,9,10,Direction.WEST);
                Wall pared7=new Wall (A,9,10,Direction.NORTH);
                Wall pared8=new Wall (A,9,11,Direction.EAST);
                Wall pared9=new Wall (A,8,11,Direction.EAST);
                Wall pared10=new Wall (A,7,11,Direction.EAST);
                Wall pared11=new Wall (A,7,11,Direction.NORTH);
                Wall pared12=new Wall (A,6,10,Direction.NORTH);
                Wall pared13=new Wall (A,6,10,Direction.EAST);
                Wall pared14=new Wall (A,5,9,Direction.NORTH);
                Wall pared15=new Wall (A,5,9,Direction.EAST);
                Wall pared16=new Wall (A,5,8,Direction.NORTH);
                Wall pared1600=new Wall (A,5,8,Direction.SOUTH);
                Wall pared17=new Wall (A,5,7,Direction.NORTH);
                Wall pared1700=new Wall (A,5,7,Direction.SOUTH);                
                Wall pared18=new Wall (A,5,6,Direction.WEST);
                Wall pared19=new Wall (A,5,6,Direction.NORTH);
                Wall pared20=new Wall (A,6,6,Direction.EAST);
                Wall pared21=new Wall (A,6,6,Direction.WEST);
                Wall pared22=new Wall (A,7,6,Direction.SOUTH);
                Wall pared23=new Wall (A,7,6,Direction.EAST);
                Wall pared24=new Wall (A,7,5,Direction.NORTH);
                Wall pared25 =new Wall (A,7,5,Direction.WEST);
                Wall pared26=new Wall (A,8,5,Direction.SOUTH);
                Wall pared27=new Wall (A,8,5,Direction.EAST);
                Wall pared28=new Wall (A,8,4,Direction.NORTH);
                Wall pared29=new Wall (A,8,4,Direction.WEST);
                Wall pared30=new Wall (A,9,4,Direction.WEST);
                Wall pared31=new Wall (A,9,4,Direction.SOUTH);
                Wall pared32=new Wall (A,9,5,Direction.EAST);
                Wall pared33=new Wall (A,10,5,Direction.SOUTH);
                Wall pared34=new Wall (A,10,5,Direction.WEST);
                Wall pared35=new Wall (A,10,6,Direction.SOUTH);
                Wall pared36=new Wall (A,10,6,Direction.EAST);
                Wall pared37=new Wall (A,9,6,Direction.EAST);
                Wall pared38=new Wall (A,8,7,Direction.SOUTH);
                Wall pared39=new Wall (A,8,7,Direction.EAST);
                Wall pared40=new Wall (A,7,7,Direction.EAST);
                Wall pared45=new Wall (A,8,9,Direction.SOUTH);
                Wall pared46=new Wall (A,7,8,Direction.SOUTH);
                Wall pared47=new Wall (A,9,8,Direction.SOUTH);
                Wall pared48=new Wall (A,9,8,Direction.EAST);
                Wall pared49=new Wall (A,7,10,Direction.SOUTH);
                Wall pared50=new Wall (A,10,7,Direction.EAST);
                Wall pared51=new Wall (A,7,5,Direction.NORTH);                
                Wall pared52=new Wall (A,6,9,Direction.WEST);
                Wall pared53=new Wall (A,6,9,Direction.SOUTH);
                Wall pared54=new Wall (A,7,10,Direction.WEST); 
                Wall pared56=new Wall (A,10,7,Direction.EAST);
                Wall pared57=new Wall (A,7,5,Direction.NORTH);                 
            

N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.move();
N.move();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.pickThing();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.move();
N.pickThing();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.turnLeft();
N.move();
N.turnLeft();
N.turnLeft();
N.turnLeft();
N.move();
N.pickThing();
N.turnLeft();
N.move();
N.move();







}
}


