package casestudy;
import java.util.Scanner;
public class App {

	void scenario1()
	{
		String[] Phone = new String[2];
		Phone[0]="9874563221";
		Phone[1]="9874563211";
		Student s1 = new Student(1, "Bhagya", "05-05-1999","SFIT",Phone);
		Info i1 = new Info();
		i1.display(s1);
		Student s2 = new Student(2, "Jack", "01-05-1999", "SNHS",Phone);
		Info i2 = new Info();
		i2.display(s2);

	}
	void scenario2()
	{
		
	}
	void scenario3()
	{
		
	}
	public static void main(String[] args) 
	{
		App a=new App();
		a.scenario1();
		a.scenario2();
		a.scenario3();
	}
}
