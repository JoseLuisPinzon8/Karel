package Ejercicio7;

import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

public class main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio10Pasos camilo = new Ejercicio10Pasos();
		Thing pelota1=new Thing(camilo.getCiudad(),1,1);
		Thing pelota2=new Thing(camilo.getCiudad(),1,2);
		Thing pelota3=new Thing(camilo.getCiudad(),1,3);
		Thing pelota4=new Thing(camilo.getCiudad(),1,4);
		Thing pelota5=new Thing(camilo.getCiudad(),2,1);
		Thing pelota6=new Thing(camilo.getCiudad(),2,2);
		Thing pelota7=new Thing(camilo.getCiudad(),2,3);
		Thing pelota8=new Thing(camilo.getCiudad(),2,4);
		Thing pelota9=new Thing(camilo.getCiudad(),3,1);
		Thing pelota10=new Thing(camilo.getCiudad(),3,2);
		Thing pelota11=new Thing(camilo.getCiudad(),3,3);
		Thing pelota12=new Thing(camilo.getCiudad(),3,4);
		Thing pelota13=new Thing(camilo.getCiudad(),4,1);
		Thing pelota14=new Thing(camilo.getCiudad(),4,2);
		Thing pelota15=new Thing(camilo.getCiudad(),4,3);
		Thing pelota16=new Thing(camilo.getCiudad(),4,4);
		
		Thing pelota17=new Thing(camilo.getCiudad(),1,6);
		Thing pelota18=new Thing(camilo.getCiudad(),1,7);
		Thing pelota19=new Thing(camilo.getCiudad(),1,8);
		Thing pelota20=new Thing(camilo.getCiudad(),1,9);
		Thing pelota39=new Thing(camilo.getCiudad(),2,6);
		Thing pelota21=new Thing(camilo.getCiudad(),2,7);
		Thing pelota22=new Thing(camilo.getCiudad(),2,8);
		Thing pelota23=new Thing(camilo.getCiudad(),2,9);
		Thing pelota24=new Thing(camilo.getCiudad(),3,6);
		Thing pelota25=new Thing(camilo.getCiudad(),3,7);
		Thing pelota26=new Thing(camilo.getCiudad(),3,8);
		Thing pelota27=new Thing(camilo.getCiudad(),3,9);
		Thing pelota28=new Thing(camilo.getCiudad(),4,6);
		Thing pelota29=new Thing(camilo.getCiudad(),4,7);
		Thing pelota30=new Thing(camilo.getCiudad(),4,8);
		Thing pelota31=new Thing(camilo.getCiudad(),4,9);
		
		Thing pelota32=new Thing(camilo.getCiudad(),6,1);
		Thing pelota38=new Thing(camilo.getCiudad(),6,2);
		Thing pelota33=new Thing(camilo.getCiudad(),6,3);
		Thing pelota34=new Thing(camilo.getCiudad(),6,4);
		Thing pelota35=new Thing(camilo.getCiudad(),7,1);
		Thing pelota36=new Thing(camilo.getCiudad(),7,2);
		Thing pelota37=new Thing(camilo.getCiudad(),7,3);
		Thing pelota41=new Thing(camilo.getCiudad(),7,4);
		Thing pelota40=new Thing(camilo.getCiudad(),8,1);
		Thing pelota42=new Thing(camilo.getCiudad(),8,2);
		Thing pelota43=new Thing(camilo.getCiudad(),8,3);
		Thing pelota44=new Thing(camilo.getCiudad(),9,1);
		Thing pelota45=new Thing(camilo.getCiudad(),9,2);
		Thing pelota46=new Thing(camilo.getCiudad(),9,3);
		Thing pelota47=new Thing(camilo.getCiudad(),9,4);
		
		Thing pelota48=new Thing(camilo.getCiudad(),6,6);
		Thing pelota49=new Thing(camilo.getCiudad(),6,7);
		Thing pelota50=new Thing(camilo.getCiudad(),6,8);
		Thing pelota51=new Thing(camilo.getCiudad(),6,9);
		Thing pelota52=new Thing(camilo.getCiudad(),7,6);
		Thing pelota53=new Thing(camilo.getCiudad(),7,7);
		Thing pelota54=new Thing(camilo.getCiudad(),7,8);
		Thing pelota55=new Thing(camilo.getCiudad(),7,9);
		Thing pelota56=new Thing(camilo.getCiudad(),8,6);
		Thing pelota57=new Thing(camilo.getCiudad(),8,7);
		Thing pelota58=new Thing(camilo.getCiudad(),8,8);
		Thing pelota59=new Thing(camilo.getCiudad(),9,6);
		Thing pelota60=new Thing(camilo.getCiudad(),9,7);
		
		Wall paredv1=new Wall (camilo.getCiudad(),1,5,Direction.WEST);
		Wall paredv2=new Wall (camilo.getCiudad(),2,5,Direction.WEST);
		Wall paredv3=new Wall (camilo.getCiudad(),3,5,Direction.WEST);
		Wall paredv4=new Wall (camilo.getCiudad(),4,5,Direction.WEST);
		Wall paredv5=new Wall (camilo.getCiudad(),4,1,Direction.SOUTH);
		Wall paredv6=new Wall (camilo.getCiudad(),4,2,Direction.SOUTH);
		Wall paredv7=new Wall (camilo.getCiudad(),4,3,Direction.SOUTH);
		Wall paredv8=new Wall (camilo.getCiudad(),4,4,Direction.SOUTH);
		
		
		Wall paredv13=new Wall (camilo.getCiudad(),6,5,Direction.WEST);
		Wall paredv14=new Wall (camilo.getCiudad(),7,5,Direction.WEST);
		Wall paredv15=new Wall (camilo.getCiudad(),7,4,Direction.SOUTH);
		Wall paredv16=new Wall (camilo.getCiudad(),9,5,Direction.WEST);
		Wall paredv9=new Wall (camilo.getCiudad(),5,1,Direction.SOUTH);
		Wall paredv10=new Wall (camilo.getCiudad(),5,2,Direction.SOUTH);
		Wall paredv11=new Wall (camilo.getCiudad(),5,3,Direction.SOUTH);
		Wall paredv12=new Wall (camilo.getCiudad(),5,4,Direction.SOUTH);
		Wall paredv17=new Wall (camilo.getCiudad(),8,4,Direction.WEST);
		Wall paredv18=new Wall (camilo.getCiudad(),8,4,Direction.SOUTH);
		
		Wall paredv19=new Wall (camilo.getCiudad(),1,6,Direction.WEST);
		Wall paredv20=new Wall (camilo.getCiudad(),2,6,Direction.WEST);
		Wall paredv21=new Wall (camilo.getCiudad(),3,6,Direction.WEST);
		Wall paredv22=new Wall (camilo.getCiudad(),4,6,Direction.WEST);
		Wall paredv23=new Wall (camilo.getCiudad(),4,6,Direction.SOUTH);
		Wall paredv24=new Wall (camilo.getCiudad(),4,7,Direction.SOUTH);
		Wall paredv25=new Wall (camilo.getCiudad(),4,8,Direction.SOUTH);
		Wall paredv26=new Wall (camilo.getCiudad(),4,9,Direction.SOUTH);
		
		Wall paredv27=new Wall (camilo.getCiudad(),6,6,Direction.WEST);
		Wall paredv28=new Wall (camilo.getCiudad(),7,6,Direction.WEST);
		Wall paredv29=new Wall (camilo.getCiudad(),8,6,Direction.WEST);
		Wall paredv30=new Wall (camilo.getCiudad(),9,6,Direction.WEST);
		Wall paredv31=new Wall (camilo.getCiudad(),5,6,Direction.SOUTH);
		Wall paredv32=new Wall (camilo.getCiudad(),5,7,Direction.SOUTH);
		Wall paredv33=new Wall (camilo.getCiudad(),5,8,Direction.SOUTH);
		Wall paredv34=new Wall (camilo.getCiudad(),5,9,Direction.SOUTH);
		camilo.jugar();
	}

}
