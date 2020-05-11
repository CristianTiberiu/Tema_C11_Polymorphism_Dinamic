package polymorphism_static_dinamic;

public class Child extends MemberOfFamily {
	
	@Override
	public void saySomething() {
		System.out.println("I just want to have some fun!");
	}
	@Override
	public void jobToDo() {
		System.out.println("I have to finish my homeworks and after that I can play on the computer");
	}
}
