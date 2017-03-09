package Ejercicio5_2;
import becker.robots.*;
public class ejercicio5_2 {
	public int[] calle =new int[9];
	public int[] avenida =new int[9];
	public int cont=0;
	private City ciudad;
	private Robot robot;
	private Thing pelota;
	
	public ejercicio5_2() {
		super();
		this.ciudad = new City();
		this.robot = new Robot(ciudad,11,1,Direction.NORTH);
		this.pelota = new Thing (ciudad,20,8);
	}
public void jugar(){
	this.primer_paso();
	cont=0;
	for (int i = 0; i < avenida.length; i++) {
		System.out.println(avenida[i]+" "+calle[i]);
		
	}
	this.segundo_paso();
	
}
private void derecha2paso(){
	this.turnRight();
	this.robot.move();
	if(avenida[cont]==robot.getAvenue() && calle[cont]== robot.getStreet()){
		this.robot.putThing();
		//avenida[cont]=robot.getAvenue();
		//calle[cont]=robot.getStreet();
		cont++;
	}
	this.turnRight();
}
private void derecha(){
	this.turnRight();
	this.robot.move();
	if(this.robot.canPickThing()==true){
		this.robot.pickThing();
		avenida[cont]=robot.getAvenue()+6;
		calle[cont]=robot.getStreet()-3;
		cont++;
	}
	this.turnRight();
}
private void izquierda2paso(){
	this.robot.turnLeft();
	this.robot.move();
	if(avenida[cont]==robot.getAvenue() && calle[cont]== robot.getStreet()){
		this.robot.putThing();
		//avenida[cont]=robot.getAvenue();
		//calle[cont]=robot.getStreet();
		cont++;
	}
	this.robot.turnLeft();
}
private void izquierda(){
	this.robot.turnLeft();
	this.robot.move();
	if(this.robot.canPickThing()==true){
		this.robot.pickThing();
		avenida[cont]=robot.getAvenue()+6;
		calle[cont]=robot.getStreet()-3;
		cont++;
	}
	this.robot.turnLeft();
}

private void primer_paso(){
	for (int i = 0,j=0; i < 19; i++,j++) {
		this.robot.move();
		if(this.robot.canPickThing()==true){
			this.robot.pickThing();
			avenida[cont]=robot.getAvenue()+6;
			calle[cont]=robot.getStreet()-3;
			cont++;
		}
		if(j==4){
			this.derecha();
		}
		if(j==8){
			this.izquierda();			 
		}
		if(j==9){
			this.robot.turnLeft();
			this.robot.move();
			this.turnRight();
			this.soloAvance(2);
			this.turnRight();
			this.robot.move();
			this.robot.turnLeft();
			
		}
		if(j==10){
			this.derecha();
		}
		if(j==14){
			this.izquierda();
		}
		
	}
	this.salir();
	this.soloAvance(6);
	this.robot.turnLeft();
	this.soloAvance(3);
}

private void segundo_paso(){
	for (int i = 0,j=0; i < 19; i++,j++) {
		this.robot.move();
		if(avenida[cont]==robot.getAvenue() && calle[cont]== robot.getStreet()){
			this.robot.putThing();
			//avenida[cont]=robot.getAvenue();
			//calle[cont]=robot.getStreet();
			cont++;
		}
		if(j==4){
			this.derecha2paso();
		}
		if(j==8){
			this.izquierda2paso();			 
		}
		if(j==9){
			this.robot.turnLeft();
			this.robot.move();
			this.turnRight();
			this.soloAvance(2);
			this.turnRight();
			this.robot.move();
			this.robot.turnLeft();
			
		}
		if(j==10){
			this.derecha2paso();
		}
		if(j==14){
			this.izquierda2paso();
		}
		
	}
	
	this.salir();
	this.soloAvance(1);

}


private void salir(){
	this.robot.turnLeft();
	this.soloAvance(4);
	this.robot.turnLeft();
	this.soloAvance(5);
	this.robot.turnLeft();
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



