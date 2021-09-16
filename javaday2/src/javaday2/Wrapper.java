package javaday2;

public class Wrapper 
{
	public static void main(String args[])
	{
		char ch='7';
		Character cha = new Character(ch);
		String res1 = Character.toString(ch);
		int res = Integer.parseInt(res1);
		System.out.println(res1);
	}
}
