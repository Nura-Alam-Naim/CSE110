
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
	public course c1 ;
	public course[]c2= new course[3];
	public int coursecount=0;
	Student()
	{

	}
	void addcourse(String cname, String cti, double cr)
	{
		c.cname = cname;
		c.ctitle = cti;
		c.cr = cr;
	}
	void addcoursebyobject(course c)
	{
		c1=c;
	}
	public void addcourseinarray(course c)
	{
		c2[coursecount]=c;
		coursecount++;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	void displaywithcourse()
	{
		System.out.println(id+" "+name);
		c1.display();
	}

}
public class Association_TM {
	public static void main(String[] args) {
		Student s1= new Student();
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
		s1.addcourseinarray(c1);

	}

}