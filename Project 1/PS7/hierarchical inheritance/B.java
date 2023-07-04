package inheritance;

public class B extends First{
	
	public void hirar() {
		System.out.println("this child class inherit class First");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.first1();
		b.hirar();
	}

}
