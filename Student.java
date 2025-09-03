//Student.java
package Package1;
public class Student
{
	public String name;
	public int rollNo;
	public void display()
	{
		System.out.println("name :"+name);
		System.out.println("rollNo :"+rollNo);
	}
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.name = "Keerthi";
		st1.rollNo = 501;
		st1.display();
	}
}