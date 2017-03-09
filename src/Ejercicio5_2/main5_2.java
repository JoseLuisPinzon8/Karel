package Ejercicio5_2;

import becker.robots.*;

public class main5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio5_2 camilo = new ejercicio5_2();
		Wall paredv1=new Wall (camilo.getCiudad(),9,1,Direction.WEST);
		Wall paredv2=new Wall (camilo.getCiudad(),8,1,Direction.WEST);
		Wall paredv3=new Wall (camilo.getCiudad(),7,1,Direction.WEST);
		Wall paredv4=new Wall (camilo.getCiudad(),6,1,Direction.WEST);
		Wall paredv5=new Wall (camilo.getCiudad(),5,1,Direction.SOUTH);
		Wall paredv6=new Wall (camilo.getCiudad(),10,1,Direction.WEST);
		Wall paredv7=new Wall (camilo.getCiudad(),10,2,Direction.SOUTH);
		Wall paredv8=new Wall (camilo.getCiudad(),10,3,Direction.SOUTH);
		
		
		Wall paredv13=new Wall (camilo.getCiudad(),10,4,Direction.SOUTH);
		Wall paredv14=new Wall (camilo.getCiudad(),10,6,Direction.WEST);
		Wall paredv15=new Wall (camilo.getCiudad(),8,6,Direction.WEST);
		Wall paredv16=new Wall (camilo.getCiudad(),7,6,Direction.WEST);
		Wall paredv9=new Wall (camilo.getCiudad(),9,6,Direction.WEST);
		Wall paredv10=new Wall (camilo.getCiudad(),5,2,Direction.SOUTH);
		Wall paredv11=new Wall (camilo.getCiudad(),5,3,Direction.SOUTH);
		Wall paredv12=new Wall (camilo.getCiudad(),5,4,Direction.SOUTH);
		Wall paredv35=new Wall (camilo.getCiudad(),5,5,Direction.SOUTH);
		Wall paredv17=new Wall (camilo.getCiudad(),6,6,Direction.WEST);
		Wall paredv18=new Wall (camilo.getCiudad(),5,7,Direction.WEST);
		
		Wall paredv19=new Wall (camilo.getCiudad(),3,12,Direction.WEST);
		Wall paredv20=new Wall (camilo.getCiudad(),4,12,Direction.WEST);
		Wall paredv21=new Wall (camilo.getCiudad(),3,7,Direction.WEST);
		Wall paredv22=new Wall (camilo.getCiudad(),4,7,Direction.WEST);
		Wall paredv23=new Wall (camilo.getCiudad(),2,10,Direction.SOUTH);
		Wall paredv38=new Wall (camilo.getCiudad(),2,11,Direction.SOUTH);
		Wall paredv24=new Wall (camilo.getCiudad(),2,7,Direction.SOUTH);
		Wall paredv25=new Wall (camilo.getCiudad(),2,8,Direction.SOUTH);
		Wall paredv26=new Wall (camilo.getCiudad(),2,9,Direction.SOUTH);
		
		Wall paredv27=new Wall (camilo.getCiudad(),6,7,Direction.WEST);
		Wall paredv28=new Wall (camilo.getCiudad(),7,7,Direction.WEST);
		Wall paredv29=new Wall (camilo.getCiudad(),5,12,Direction.WEST);
		Wall paredv30=new Wall (camilo.getCiudad(),6,12,Direction.WEST);
		Wall paredv31=new Wall (camilo.getCiudad(),7,12,Direction.WEST);
		Wall paredv32=new Wall (camilo.getCiudad(),7,11,Direction.SOUTH);
		Wall paredv33=new Wall (camilo.getCiudad(),7,8,Direction.SOUTH);
		Wall paredv34=new Wall (camilo.getCiudad(),7,9,Direction.SOUTH);
		Wall paredv36=new Wall (camilo.getCiudad(),10,5,Direction.SOUTH);
		Wall paredv39=new Wall (camilo.getCiudad(),7,10,Direction.SOUTH);
		Wall paredv40=new Wall (camilo.getCiudad(),8,3,Direction.SOUTH);
		Wall paredv41=new Wall (camilo.getCiudad(),7,3,Direction.SOUTH);
		Wall paredv42=new Wall (camilo.getCiudad(),8,3,Direction.WEST);
		Wall paredv43=new Wall (camilo.getCiudad(),8,4,Direction.WEST);
		Wall paredv44=new Wall (camilo.getCiudad(),5,9,Direction.SOUTH);
		Wall paredv45=new Wall (camilo.getCiudad(),4,9,Direction.SOUTH);
		Wall paredv46=new Wall (camilo.getCiudad(),5,9,Direction.WEST);
		Wall paredv47=new Wall (camilo.getCiudad(),5,10,Direction.WEST);
		
		Thing pelota1=new Thing(camilo.getCiudad(),10,3);
		Thing pelota2=new Thing(camilo.getCiudad(),10,4);
		Thing pelota3=new Thing(camilo.getCiudad(),9,1);
		Thing pelota4=new Thing(camilo.getCiudad(),9,5);
		Thing pelota5=new Thing(camilo.getCiudad(),7,1);
		Thing pelota6=new Thing(camilo.getCiudad(),6,2);
		Thing pelota7=new Thing(camilo.getCiudad(),6,4);
		Thing pelota8=new Thing(camilo.getCiudad(),7,5);	
		camilo.jugar();
	}

}
