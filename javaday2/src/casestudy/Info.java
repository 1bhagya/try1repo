package casestudy;

public class Info 
{
	public void display(Student student) 
	{
		System.out.println("Student ID:"+student.getId());
		System.out.println("Student Name:"+student.getName());
		System.out.println("Student Date of Birth:"+student.getDateofbirth());
		System.out.println("Student College Name:"+student.getCollegename());
		String[] Phone = student.getPhone();
		for(int x=0;x<Phone.length;x++)
		{
			System.out.println(Phone[x]);
		}
	}
}
