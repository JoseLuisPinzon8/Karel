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
public class ejercicio4 {
    
        public int cont=0;
	private City A;
	private Robot robot;
	private Thing pelota;
        
        public ejercicio4() {
        this.A = new City();
        this.robot = new Robot(A,0,1,Direction.SOUTH,0);
	this.pelota = new Thing (A,50,50);
        }
        
    public void jugar(){
        robot.move();
        robot.turnLeft();
        this.histo();  
    }
    
    private void histo(){
        for(int k=0; k<4; k++){
      
        while(robot.canPickThing()==true){
            robot.pickThing();
            cont++;

        }
        for(int i=1; i<cont; i++){
            robot.putThing();
            robot.move();
        }
        
        this.giroIzquierda(2);
        this.soloAvance(cont-1);
        robot.turnLeft();
        robot.move();
        robot.turnLeft();

        cont=0;
        }
    }

    public City getA() {
        return A;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Thing getPelota() {
        return pelota;
    }

    public void setPelota(Thing pelota) {
        this.pelota = pelota;
    }

    private void giroIzquierda(int num){
    for (int i = 0; i <num; i++) {
    this.advanceLeft();
    }
} 
    public void advanceLeft(){		
    this.robot.turnLeft();
    }
    
    private void soloAvance(int num){
    for (int i = 0; i < num; i++) {
        this.robot.move();
	}
    }
}
   
    
    
    
    
    
    
    
    
    
    
    
    

