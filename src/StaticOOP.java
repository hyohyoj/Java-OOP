class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);	//ok
//		System.out.println(instanceVar);	//error : Cannot make a static reference to the non-static field instanceVar
	}
	
	public void instanceMethod() {
		System.out.println(classVar);	//ok
		System.out.println(instanceVar);	//ok
	}
}


public class StaticOOP {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);	//ok
//		System.out.println(Foo.instanceVar);	//error
		
		Foo.classMethod();	//ok
//		Foo.instanceMethod();	//error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);	//I class var
		System.out.println(f1.instanceVar);	//I instance var
		f1.classMethod();	//ok
		f1.instanceMethod();	//ok
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);	//changed by f1
		System.out.println(f2.classVar);	//changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);	//changed by f1
		System.out.println(f2.instanceVar);	//I instance var
		
		

	}

}
