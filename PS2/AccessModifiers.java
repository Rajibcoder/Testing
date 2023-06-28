package first;

public class AccessModifiers {

	public void public1()
	{
		System.out.println("This is using Public");
	}
	
	private void private1()
	{
		System.out.println("This is using Private");
	}
	
	protected void protected1()
	{
		System.out.println("This is using Protected");
	}
	
	void default1()
	{
		System.out.println("This is Default");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.public1();
		obj.private1();
		obj.protected1();
		obj.default1();
	}
}


//the class where methods are create
