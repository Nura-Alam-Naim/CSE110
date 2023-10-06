//|ADMIRAL_AUDITORE\//

import java.util.ArrayList;

public class One_To_Many_by_Naim {
	public static void main(String[] args) {
		/*THESE LINES FOR TAKING INPUT FROM CONSOLE*/
//		Scanner inp=new Scanner(System.in);
//		System.out.print("Faculty name: ");
//		String name=inp.nextLine();
//		System.out.print("Department: ");
//		String depart=inp.nextLine();
//		System.out.print("Course: ");
//		String course=inp.nextLine();
//
//		faculty f= new faculty(name,depart,course);
//		System.out.println("How Many Students: ");
//		int n=inp.nextInt();
//		inp.nextLine();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("Students ID: ");
//			int id=inp.nextInt();
//			inp.nextLine();
//			System.out.print("Name: ");
//			String names=inp.nextLine();
//			System.out.println("Mark: ");
//			int mark=inp.nextInt();
//
//			student s=new student(id,names,mark);
//			f.setStd(s);
//		}

		/*CREATING A NEW OBJECT OF FACULTY AND PASSING THE OTHER INFO VIA CONSTRUCTOR*/
		faculty f=new faculty("John","CSE","CSE110");

		/* CREATING NEW OBJETS TO PASS THE WHOLE OBJECT'S INFO TO FACULTY*/
		student s1=new student(123,"Captain",65);
		student s2=new student(124,"CR",64);
		student s3=new student(125,"Tony",67);

		/*PASSING THE STUDENTS OBJECTS TO FACULTY*/
		f.setStd(s1);
		f.setStd(s2);
		f.setStd(s3);

		/*TO HAVE THE ALL INFO OF THE FACULTY AND STUDENT*/
		f.getAll();

		/* TO HAVE THE INFO OF A SPECIFIC STUDENT, BUT IT CAN ONLY BE DONE BY THE
			INDEX OF THE STUDENT'S INFO IN THIS CODE
		 */
		f.getInfo(1);

		/* TO MODIFY SOME INFO, WE MUST GO THROUGH FACULTY AND HAVE TO KNOW THE INDEX
			OF THE STUDENT'S INFO.
			HERE, f IS THE FACULTY CLASS, student IS THE ARRAYLIST IN THE FACULTY CLASS
			WHERE THE INFO OF THE STUDENTS ARE STORED. THE get(index) IS THE FUNCTION TO
			ACCESS AN INDEX OF ARRAYLIST. THE setName() IS A METHOD INSIDE THE STUDENT
			CLASS. TO MODIFY THE NAME. THERE ARE OTHER METHODS TO CHANGE THE ID AND
			MARKS.
		 */
		f.Student.get(1).setName("Access");

		/*THE MODIFIED NAME CAN BE SEEN*/
		f.getInfo(1);
	}
}
class faculty{
	private String name;
	private String depart;
	private String course;


	faculty(){}
	faculty(String name, String depart, String course)
	{
		this.name=name;
		this.depart=depart;
		this.course=course;
	}
	/*CREATING AN ArrayList OF STUDENT CLASS TO STORE VARIOUS INFORMATION OF SOME
		STUDENTS.
	 */
	ArrayList<student> Student =new ArrayList<student>();

	/*METHOD TO ADD STUDENT CLASS TO THE ArrayList*/
	void setStd(student s)
	{
		Student.add(s);
	}
	public void getAll()
	{
		System.out.println("Faculty name: "+name);
		System.out.println("Department: "+depart);
		System.out.println("Course: "+course);
		System.out.println("Students INFO: \n");
		for (student student : Student) student.display();
	}
	public void getInfo(int info)
	{
		Student.get(info).display();
	}

	//	public String getName(){return name;}
//	public String getDepart(){return course;}
//	public String getCourse(){return course;}
}
class student{
	private int id;
	private String name;
	private int mark;

	private static int count=0;
	/* TO KNOW HOW MANY STUDENTS ARE ADDED TO THE ARRAYLIST.
		AS A STATIC TYPE, IT STORES VALUES EVERY TIME IT IS MODIFIED.
	 */
	private final int index=count;
	/* TO CREATE A SPECIFIC INDEX OF THE EVERY OBJECT OF THE STUDENT TYPE.THE INDEX
	IS ALSO THE INDEX OF THE ARRAYLIST*/
	student(){}
	student(int id,String name,int mark)
	{
		this.id=id;
		this.name=name;
		this.mark=mark;
		count++;
	}
	public void setID(int id){ this.id=id;}
	public void setName(String name){ this.name=name;}
	public void setMark(int mark){ this.mark=mark;}
//	public int getId(){return id;}
//	public String getName(){return name;}
//	public int getMark(){return mark;}
	public void display()
	{

		System.out.println("\tIndex: "+index);
		System.out.println("\tID: "+id);
		System.out.println("\tName: "+name);
		System.out.println("\tmark: "+mark);
		System.out.println();
	}
}
