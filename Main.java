package polymorphism_static_dinamic;

public class Main {
	public static void main(String[] args) {
		
		//Static
		Device Tibi = new Device();
		
		Tibi.printInfo("Samsung");
		Tibi.printINfo("Iphone", 2);
		Tibi.printInfo(12);
		
		Student Maria = new Student();
		
		Maria.details("maria01@yahoo.com");
		Maria.details(6, 4);
		Maria.details("Copos", "Politehnic");
	
		//Dinamic
		
		Mother Alma = new Mother();
		Alma.saySomething();
		Alma.jobToDo();
		
		Child Teo = new Child();
		Teo.saySomething();
		Teo.jobToDo();
	}
}
