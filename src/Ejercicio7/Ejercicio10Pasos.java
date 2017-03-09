package Ejercicio7;
import becker.robots.*;
public class Ejercicio10Pasos {
	public int num=0;
	private City ciudad;
	private Robot robot;
	private Thing pelota;
	
	public Ejercicio10Pasos() {
		super();
		this.ciudad = new City();
		this.robot = new Robot(ciudad,9,5,Direction.NORTH);
		this.pelota = new Thing (ciudad,20,8);
	}
	public void jugar(){
		this.giroIzquierda(2);
		this.robot.move();
		this.giroIzquierda(1);
		this.robot.move();
		this.giroIzquierda(1);
		this.robot.move();
		this.cuadro1();
		num=0;
		this.giroIzquierda(1);
		this.robot.move();
		this.giroIzquierda(1);
		this.soloAvance(4);
		this.giroIzquierda(1);
		this.robot.move();
		this.cuadro2y3(16);
		num=0;
		this.pasar_cuadro();
		this.cuadro2y3(16);
		this.pasar_cuadro();
		num=0;
		this.cuadro2y3(14);
		this.giroIzquierda(2);
		this.soloAvance(4);
		this.robot.pickThing();
		
		
	}
	private void pasar_cuadro(){
		this.giroIzquierda(1);
		this.robot.move();
		this.giroIzquierda(1);
		this.soloAvance(6);
		this.giroIzquierda(1);
		this.soloAvance(1);
	}
	private void cuadro1(){
		for (int i = 0; i <13; ) {
			while(this.robot.canPickThing()==true){
				this.robot.pickThing();
				i++;
			//}
				if(this.robot.frontIsClear()==false){
					this.turnRight();
					this.robot.move();
					num++;
					this.turnRight();
				
				}
				if(num==7){
					this.robot.turnLeft();
					this.robot.move();
					this.robot.turnLeft();
				}
			}
			this.robot.move();
			num++;
			
		}
	}
	private void cuadro2y3(int numero){
		for (int i = 0; i <numero; ) {
			while(this.robot.canPickThing()==true){
				this.robot.pickThing();
				i++;
			//}
				if(this.robot.frontIsClear()==false){
					this.turnRight();
					this.robot.move();
					num++;
					this.turnRight();
				
				}
				if(num==7){
					this.robot.turnLeft();
					this.robot.move();
					this.robot.turnLeft();
					this.robot.pickThing();
					i++;
				}
			}
			this.robot.move();
			num++;
			
		}
	}
	public void ejercicio10(){
		for (int i = 0; i < 60;) {
			this.turnRight();
			if(this.robot.frontIsClear()==true){
				this.robot.move();
				this.robot.move();
				while(this.robot.canPickThing()==true){
					
						this.robot.pickThing();
						i++;
						System.out.println(i);
						if(this.robot.frontIsClear()== false){
							this.robot.turnLeft();
							this.robot.move();
							this.robot.turnLeft();
							if(this.robot.canPickThing()==true){
								this.robot.pickThing();
							}
						}
						
						
						this.robot.move();
						if(num==9){
							this.turnRight();
							this.robot.move();
							this.turnRight();
							if(this.robot.canPickThing()==true){
								this.robot.pickThing();					
							}
							else{
								this.robot.move();
								//this.robot.move();
							}
						}
						
				}
			}
			
			else{
				this.robot.turnLeft();
				this.robot.move();
				
			}
			
			
		}
	}
	
	public void advanceLeft(){
		
		this.robot.turnLeft();
	}
	
	private void giroIzquierda(int num){
		for (int i = 0; i <num; i++) {
			this.advanceLeft();
		}
	}
	
	private void turnRight(){
		for (int i = 0; i < 3; i++) {
			this.robot.turnLeft();
			
		}
	}
	
	private void soloAvance(int num){
		for (int i = 0; i < num; i++) {
			this.robot.move();
		}
	}
	
	private void avanzar(int num){
		for (int i = 0; i < num; i++) {
			this.robot.move();
			this.robot.pickThing();
		}
	}
	
	public City getCiudad() {
		return ciudad;
	}
	
	
	public void setciudad(City ciudad) {
		this.ciudad = ciudad;
	}
}
