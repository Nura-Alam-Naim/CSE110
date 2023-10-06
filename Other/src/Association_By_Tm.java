import java.util.ArrayList;

class course
{
	public String cname, ctitle;
	public double cr;
	course()
	{

	}
	public void display()
	{
		System.out.println( cname+" "+ctitle+" "+cr);
	}
}
class Student
{
	public int id;
	public String name;
	public course c = new course();
	// public course c1 ;
	public ArrayList<course>c2= new ArrayList<course>();
	public int coursecount=0;
	Student()
	{

	}
	Student(int i, String n)
	{
		id=i;
		name=n;
	}
	void addcourse(String cname, String cti, double cr)
	{
		c.cname = cname;
		c.ctitle = cti;
		c.cr = cr;
	}

	public void addcourseinarray(course c)
	{
		c2.add(c);
		coursecount++;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	void displaywithcourse()
	{
		System.out.println(id+" "+name);
		for(int i=0;i<c2.size();i++){
			c2.get(i).display();
		}

	}

}
public class Association {
	public static void main(String[] args) {

		ArrayList<course>clist= new ArrayList<course>();
		ArrayList<Student>slist= new ArrayList<Student>();

		while(true) {
			System.out.println("1. Add:");
			System.out.println("2. Delete:");
			System.out.println("3. Update:");
			System.out.println("6. exit:");
			int input =1 ;//take input here
			if(input==1)
			{
				System.out.println("11. Add a student:");
				System.out.println("12. Add a course");
				System.out.println("13. Add a Faculty");
				int inp =11;
				if(inp==11)
				{
					Student s1 = new Student(1,"TM");
					slist.add(s1);
				}
				else if(inp==12)
				{

				}
				else
				{

				}

			}
		}


       /*Student s1= new Student();
       s1.id=11;
       s1.name ="TM";
       s1.addcourse("OOP", "CSE110", 4.5);
       s1.display();
       s1.displaywithcourse();
       course c1= new course();
       c1.ctitle="math101";
       c1.cname="math";
       c1.cr=3;
       c1.display();
       s1.addcoursebyobject(c1);
       s1.displaywithcourse();
       s1.addcourseinarray(c1);*/

	}

}