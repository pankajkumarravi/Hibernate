package demo;

public class Recursion
{
	int i=5;

	public void m1()
	{
		System.out.println("iam m1();");
		if (i<=5) 
		{


			m2();
			i--;
		}


	}
	public void m2()
	{


		if (i<=5) {


			m1();

			System.out.println("iam m2();");
		}
	}
	public static void main(String[] args) {
		Recursion recursion= new Recursion();
		recursion.m2();
	}

}
