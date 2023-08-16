package inheritance;

public class MainClass {

	
	public static void main(String [] args) {
		
		
		//normal call static members
		System.out.println(ClassA.a);
		ClassA.test();
		
		
		//normal call non static
		ClassA x= new ClassA();
		System.out.println(x.b);
		x.demo();
		
		//single inheritance to call static members
		System.out.println(ClassB.a);
		ClassB.test();
		ClassB.write();
				
		//single inheritance to call non static
		ClassB y= new ClassB();
		System.out.println(y.b);
		y.demo();
		
		//multi level inheritance to call static members
		System.out.println(ClassC.a);
		ClassC.test();
		ClassC.write();
						
		//multi level inheritance to call non static
		ClassC z= new ClassC();
		System.out.println(z.b);
		z.demo();
		
		//hierarchical inheritance to call static members
		System.out.println(ClassD.a);
		ClassD.test();
		
		//hierarchical inheritance to call non static members
		ClassD q= new ClassD();
		System.out.println(q.b);
		q.demo();
		
		 
		
	} 

}

