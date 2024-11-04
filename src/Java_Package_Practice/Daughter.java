package Java_Package_Practice;

class grand_father{
	public void showG()
	{
		System.out.println("He is GrandFather");
	}
}

class father extends grand_father{
	public void showF()
	{
		System.out.println("He is Father");
	}
}

class son extends father{
	public void showS()
	{
		System.out.println("He is Son");
	}
}
public class Daughter extends father{
	public void showD()
	{
		System.out.println("She is Daughter");
	}
	
	public static void main(String[] args) {
		Daughter obj = new Daughter();
		obj.showF();
		obj.showG();
		obj.showD();
		
		son bj = new son();
		bj.showS();
		bj.showF();
		bj.showG();
	}

}
