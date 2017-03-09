//Hola profe, si quiere evaluar el codigo con disitintos numeros, dirijase a las lineas 32, 48 y  64.

package Ejercicio2;

import becker.robots.*;

public class main_ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio_2 camilo= new Ejercicio_2();
		Wall norte[]= new Wall[9];
		for (int i = 0,j=1; i < norte.length; i++,j++) {
			norte[i]=new Wall(camilo.getCiudad(),1,j,Direction.NORTH);
		}
		Wall west[]= new Wall[20];
		for (int i = 0,j=1,a=1; i < west.length; i++,a++) {
			if(a==6){
				a=1;
				j+=3;
				}
			west[i]=new Wall(camilo.getCiudad(),a,j,Direction.WEST);
		}
		
		Wall paredv1=new Wall (camilo.getCiudad(),5,1,Direction.SOUTH);
		Wall paredv2=new Wall (camilo.getCiudad(),5,3,Direction.SOUTH);
		Wall paredv3=new Wall (camilo.getCiudad(),5,4,Direction.SOUTH);
		Wall paredv4=new Wall (camilo.getCiudad(),5,6,Direction.SOUTH);
		Wall paredv5=new Wall (camilo.getCiudad(),5,7,Direction.SOUTH);
		Wall paredv6=new Wall (camilo.getCiudad(),5,9,Direction.SOUTH);

                //Esta es el primer dijito
                
		Thing pelota1=new Thing(camilo.getCiudad(),1,2);
		Thing pelota2=new Thing(camilo.getCiudad(),1,1);
		//Thing pelota3=new Thing(camilo.getCiudad(),4,3);
		Thing pelota4=new Thing(camilo.getCiudad(),3,3);
		Thing pelota5=new Thing(camilo.getCiudad(),2,3);
		Thing pelota6=new Thing(camilo.getCiudad(),1,3);
		Thing pelota7=new Thing(camilo.getCiudad(),5,3);
		Thing pelota8=new Thing(camilo.getCiudad(),3,2);
		Thing pelota9=new Thing(camilo.getCiudad(),5,1);
		Thing pelota10=new Thing(camilo.getCiudad(),3,1);
		Thing pelota11=new Thing(camilo.getCiudad(),4,1);
		Thing pelota12=new Thing(camilo.getCiudad(),5,2);
		Thing pelota13=new Thing(camilo.getCiudad(),2,6);
                
                //Este es el segundo dijito
		
		Thing pelota14=new Thing(camilo.getCiudad(),5,5);
		Thing pelota15=new Thing(camilo.getCiudad(),5,4);
		Thing pelota16=new Thing(camilo.getCiudad(),4,4);
		Thing pelota17=new Thing(camilo.getCiudad(),3,4);
		Thing pelota18=new Thing(camilo.getCiudad(),2,4);
		Thing pelota19=new Thing(camilo.getCiudad(),1,4);
		Thing pelota20=new Thing(camilo.getCiudad(),1,5);
		Thing pelota39=new Thing(camilo.getCiudad(),3,5);
		Thing pelota21=new Thing(camilo.getCiudad(),1,6);
		Thing pelota22=new Thing(camilo.getCiudad(),5,6);
		Thing pelota23=new Thing(camilo.getCiudad(),4,6);
		Thing pelota24=new Thing(camilo.getCiudad(),3,6);
		//Thing pelota25=new Thing(camilo.getCiudad(),2,6);
		
                //Este es el tercer dijito
                
		Thing pelota26=new Thing(camilo.getCiudad(),5,8);
		Thing pelota27=new Thing(camilo.getCiudad(),5,7);
		//Thing pelota28=new Thing(camilo.getCiudad(),4,7);
		Thing pelota29=new Thing(camilo.getCiudad(),3,7);
		Thing pelota30=new Thing(camilo.getCiudad(),2,7);
		Thing pelota31=new Thing(camilo.getCiudad(),1,7);
		Thing pelota32=new Thing(camilo.getCiudad(),1,8);
		Thing pelota38=new Thing(camilo.getCiudad(),3,8);
		Thing pelota33=new Thing(camilo.getCiudad(),5,9);
		Thing pelota34=new Thing(camilo.getCiudad(),3,9);
		Thing pelota35=new Thing(camilo.getCiudad(),4,9);
		Thing pelota36=new Thing(camilo.getCiudad(),1,9);
		Thing pelota37=new Thing(camilo.getCiudad(),2,9);
		
		camilo.jugar();
		
	}

}
