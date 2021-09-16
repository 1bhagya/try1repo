package casestudy;
import java.util.Scanner;
public class Student 
{
	private int id;
	private String name;
	private String dateofbirth;
	private static String collegename="St Francis Institue of Technology";
	String[] Phone=new String[2];
	
	public Student(int id, String name, String dateofbirth, String collegename, String Phone[]) 
	{
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.collegename = collegename;
		this.Phone = Phone;
	}
	
	public Student() 
	{
		super();
	}
	
	public String[] getPhone() {
		return Phone;
	}

	public void setPhone(String[] phone) {
		Phone = phone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public static String getCollegename() {
		return collegename;
	}
	public static void setCollegename(String collegename) {
		Student.collegename = collegename;
	}
	
	
}
