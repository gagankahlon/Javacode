package Inheritance;

public class TestCar {

	public static void main(String[] args) {
	
		Car c1=new Car();
		
	       c1.start();
	        c1.stop();
        c1.hybrid();
        c1.electric();
        c1.airBags();
        c1.engine();
System.out.println("-----------");

	Audi a=new Audi();
	a.autoParking();
a.start();
a.stop();
a.refuel();
a.electric();
a.hybrid();


	System.out.println("-------");

	Physics ph=new Physics();
	ph.start();
	ph.airBags();
	ph.engine();	
	Vehile v=new Vehile();
	v.safety();
	
		
		Science s=new Science();
		s.friction();
		
}}
	
	
	

