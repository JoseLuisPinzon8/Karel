package Ejercicio2;
import becker.robots.*;
public class Ejercicio_2 {
	public int[] dir =new int[39];
	//public int[] dir2 =new int[13];
	public int k=0,num=0,z,w;
	private City ciudad;
	private Robot robot;
	private Thing balon;
	
	public Ejercicio_2() {
		
		this.ciudad =new City ();
		this.robot =new Robot(ciudad,6,2,Direction.NORTH);
		this.balon = new Thing (ciudad,10,8);
	}
	public void jugar(){
		
		this.ejercicio2();
		this.advanceLeft();
		this.soloAvance(3);
		this.advanceLeft();
		z=k;
		this.ejercicio2();
		this.advanceLeft();
		this.soloAvance(3);
		this.advanceLeft();
		w=k;
		this.ejercicio2();
		
		this.casilla1();
		this.casilla2();
		this.casilla3();
	}
	public void ejercicio2(){
		
		this.robot.move();
		this.obtener();
		this.advanceLeft();
		this.robot.move();
		this.obtener();
		this.turnRight();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.turnRight();
		this.robot.move();
		this.obtener();
		this.turnRight();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.advanceLeft();
		this.robot.move();
		this.obtener();
		this.advanceLeft();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.robot.move();
		this.obtener();
		this.advanceLeft();
		this.robot.move();
		this.advanceLeft();
		this.soloAvance(5);
		
		}
	
	public void casilla1(){
		if(dir[0]==52 && dir[1]==51 && dir[2]==41 && dir[3]==31 && dir[4]==21 && dir[5]==11 &&
			dir[6]==12 && dir[7]== 53 && dir[8]==43 && dir[9]==33 && dir[10]==23 && dir[11]==13 ){
			System.out.print("0");
		}
		else if(dir[0]==53 && dir[1]==43 && dir[2]==33 && dir[3]==23 && dir[4]==13){
			System.out.print("1");
		}
		else if(dir[0]==52 && dir[1]==51 && dir[2]==41 && dir[3]==31 && dir[4]==11 && dir[5]==12 &&
				dir[6]==32 && dir[7]== 53 && dir[8]==33 && dir[9]==23 && dir[10]==13){
			System.out.print("2");
		}
		else if(dir[0]==52 && dir[1]==51 && dir[2]==31 && dir[3]==11 && dir[4]==12 && dir[5]==32 &&
				dir[6]==53 && dir[7]== 43 && dir[8]==33 && dir[9]==23 && dir[10]==13){
			System.out.print("3");
		}
		else if(dir[0]==31 && dir[1]==21 && dir[2]==11 && dir[3]==32 && dir[4]==53 && dir[5]==43 &&
				dir[6]==33 && dir[7]== 23 && dir[8]==13 ){
			System.out.print("4");
		}
		else if(dir[0]==52 && dir[1]==51 && dir[2]==31 && dir[3]==21 && dir[4]==11 && dir[5]==12 &&
				dir[6]==32 && dir[7]== 53 && dir[8]==43 && dir[9]== 33 && dir[10]==13 ){
			System.out.print("5");
		}
		else if(dir[0]==52 && dir[1]==51 && dir[2]==41 && dir[3]==31 && dir[4]==21 && dir[5]==11 &&
				dir[6]==12 && dir[7]==32 && dir[8]==53 && dir[9]== 43 && dir[10]==33 && dir[11]==13){
			System.out.print("6");
		}
		else if(dir[0]==11 && dir[1]==12 && dir[2]==53 && dir[3]==43 && dir[4]==33 && dir[5]==23 &&
				dir[6]==13){
			System.out.print("7");
		}
		else if(dir[0]==52 && dir[1]==51 && dir[2]==41 && dir[3]==31 && dir[4]==21 && dir[5]==11 &&
				dir[6]==12 && dir[7]==32 && dir[8]==53 && dir[9]== 43 && dir[10]==33 && dir[11]==23 
				&& dir[12]==13){
			System.out.print("8");
		}
		else if(dir[0]==52 && dir[1]==51  && dir[2]==31 && dir[3]==21 && dir[4]==11 &&
				dir[5]==12 && dir[6]==32 && dir[7]==53 && dir[8]== 43 && dir[9]==33 && dir[10]==23 
				&& dir[11]==13){
			System.out.print("9");
		}
	}
	
	//casilla 2 
	public void casilla2(){
	
		if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==44 && dir[z+3]==34 && dir[z+4]==24 && dir[z+5]==14 &&
			dir[z+6]==15  && dir[z+7]==56 && dir[z+8]==46 && dir[z+9]==36 && dir[z+10]==26 && dir[z+11]==16 ){
			System.out.print("0");
		}
		else if(dir[z]==56 && dir[z+1]==46 && dir[z+2]==36 && dir[z+3]==26 && dir[z+4]==16){
			System.out.print("1");
		}
		else if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==44 && dir[z+3]==34 && dir[z+4]==14 && dir[z+5]==15 &&
				dir[z+6]==35 && dir[z+7]== 56 && dir[z+8]==36 && dir[z+9]==26 && dir[z+10]==16){
			System.out.print("2");
		}
		else if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==34 && dir[z+3]==14 && dir[z+4]==15 && dir[z+5]==35 &&
				dir[z+6]==56 && dir[z+7]== 46 && dir[z+8]==36 && dir[z+9]==26 && dir[z+10]==16){
			System.out.print("3");
		}
		else if(dir[z]==34 && dir[z+1]==24 && dir[z+2]==14 && dir[z+3]==35 && dir[z+4]==56 && dir[z+5]==46 &&
				dir[z+6]==36 && dir[z+7]== 26 && dir[z+8]==16 ){
			System.out.print("4");
		}
		else if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==34 && dir[z+3]==24 && dir[z+4]==14 && dir[z+5]==15 &&
				dir[z+6]==35 && dir[z+7]== 56 && dir[z+8]==46 && dir[z+9]== 36 && dir[z+10]==16 ){
			System.out.print("5");
		}
		else if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==44 && dir[z+3]==34 && dir[z+4]==24 && dir[z+5]==14 &&
				dir[z+6]==15 && dir[z+7]==35 && dir[z+8]==56 && dir[z+9]== 46 && dir[z+10]==36 && dir[z+11]==16){
			System.out.print("6");
		}
		else if(dir[z]==14 && dir[z+1]==15 && dir[z+2]==56 && dir[z+3]==46 && dir[z+4]==36 && dir[z+5]==26 &&
				dir[z+6]==16){
			System.out.print("7");
		}
		else if(dir[z]==55 && dir[z+1]==54 && dir[z+2]==44 && dir[z+3]==34 && dir[z+4]==24 && dir[z+5]==14 &&
				dir[z+6]==15 && dir[z+7]==35 && dir[z+8]==56 && dir[z+9]== 46 && dir[z+10]==36 && dir[z+11]==26 
				&& dir[z+12]==16){
			System.out.print("8");
		}
		else if(dir[z]==55 && dir[z+1]==54  && dir[z+2]==34 && dir[z+3]==24 && dir[z+4]==14 &&
				dir[z+5]==15 && dir[z+6]==35 && dir[z+7]==56 && dir[z+8]== 46 && dir[z+9]==36 && dir[z+10]==26 
				&& dir[z+11]==16){
			System.out.print("9");
		}
	}
	//casilla3
	public void casilla3(){
		
		if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==47 && dir[w+3]==37 && dir[w+4]==27 && dir[w+5]==17 &&
			dir[w+6]==18  && dir[w+7]==59 && dir[w+8]==49 && dir[w+9]==39 && dir[w+10]==29 && dir[w+11]==19 ){
			System.out.print("0");
		}
		else if(dir[w]==59 && dir[w+1]==49 && dir[w+2]==39 && dir[w+3]==29 && dir[w+4]==19){
			System.out.print("1");
		}
		else if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==47 && dir[w+3]==37 && dir[w+4]==17 && dir[w+5]==18 &&
				dir[w+6]==38 && dir[w+7]== 59 && dir[w+8]==39 && dir[w+9]==29 && dir[w+10]==19){
			System.out.print("2");
		}
		else if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==37 && dir[w+3]==17 && dir[w+4]==18 && dir[w+5]==38 &&
				dir[w+6]==59 && dir[w+7]== 49 && dir[w+8]==39 && dir[w+9]==29 && dir[w+10]==19){
			System.out.print("3");
		}
		else if(dir[w]==37 && dir[w+1]==27 && dir[w+2]==17 && dir[w+3]==38 && dir[w+4]==59 && dir[w+5]==49 &&
				dir[w+6]==39 && dir[w+7]== 29 && dir[w+8]==19 ){
			System.out.print("4");
		}
		else if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==37 && dir[w+3]==27 && dir[w+4]==17 && dir[w+5]==18 &&
				dir[w+6]==38 && dir[w+7]== 59 && dir[w+8]==49 && dir[w+9]== 39 && dir[w+10]==19 ){
			System.out.print("5");
		}
		else if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==47 && dir[w+3]==37 && dir[w+4]==27 && dir[w+5]==17 &&
				dir[w+6]==18 && dir[w+7]==38 && dir[w+8]==59 && dir[w+9]== 49 && dir[w+10]==39 && dir[w+11]==19){
			System.out.print("6");
		}
		else if(dir[w]==17 && dir[w+1]==18 && dir[w+2]==59 && dir[w+3]==49 && dir[w+4]==39 && dir[w+5]==29 &&
				dir[w+6]==19){
			System.out.print("7");
		}
		else if(dir[w]==58 && dir[w+1]==57 && dir[w+2]==47 && dir[w+3]==37 && dir[w+4]==27 && dir[w+5]==17 &&
				dir[w+6]==18 && dir[w+7]==38 && dir[w+8]==59 && dir[w+9]== 49 && dir[w+10]==39 && dir[w+11]==29 
				&& dir[w+12]==19){
			System.out.print("8");
		}
		else if(dir[w+0]==58 && dir[w+1]==57  && dir[w+2]==37 && dir[w+3]==27 && dir[w+4]==17 &&
				dir[w+5]==18 && dir[w+6]==38 && dir[w+7]==59 && dir[w+8]== 49 && dir[w+9]==39 && dir[w+10]==29 
				&& dir[w+11]==19){
			System.out.print("9");
		}
	}
	public  void  obtener(){
		int avenida,calle;
		
		if(this.robot.canPickThing()== true){
			calle= robot.getStreet();
			avenida= robot.getAvenue();
			this.robot.pickThing();
			num=calle*10+avenida;
			//System.out.println(num);
			dir[k]=num;
			
			k++;
					
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
		public void setCiudad(City ciudad) {
			this.ciudad = ciudad;
		}
}
