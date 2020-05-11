package polymorphism_static_dinamic;

public class Mother extends MemberOfFamily {
	
	@Override
	public void saySomething() {
		System.out.println("The dinner is ready!");	
	}
	
	public void jobToDo() {
		System.out.println("I have to prepare kids for school and cook something");
	}
}
