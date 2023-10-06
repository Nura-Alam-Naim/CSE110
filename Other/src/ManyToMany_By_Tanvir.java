import java.util.ArrayList;

// Student class to represent a student and their courses
class Student{
    public int id;
    public String name;
    public ArrayList<Course> std_courses; // ArrayList to store the courses of a student

    // Constructor to initialize student's name, ID, and an empty list of courses
    public Student(String name, int id)
    {
        this.name=name;
        this.id=id;
        std_courses=new ArrayList<Course>();
    }

    // Display student's information (name and ID)
    public void display()
    {
        System.out.println("\nName: "+name+"\nID  : "+id);
    }

    // Method to add a course to the student's list of courses
    public void addCourse(Course course)
    {
        std_courses.add(course);
    }

    // Method to get the list of courses taken by the student
    public ArrayList<Course> getCourse()
    {
        return std_courses;
    }

}

// Course class to represent a course and its students
class Course{
    public String crsCode, crsTitle;
    public double crsCredit;
    public ArrayList<Student> crs_students; // ArrayList to store the students of a course

    // Constructor to initialize course's title, code, credits, and an empty list of students
    public Course(String crsTitle, String crsCode, double crsCredit)
    {
        this.crsTitle=crsTitle;
        this.crsCode=crsCode;
        this.crsCredit=crsCredit;
        crs_students=new ArrayList<Student>();
    }

    // Display course information (title, code, and credits)
    public void display()
    {
        System.out.println("\nTitle : "+crsTitle+"\nCode  : "+crsCode+"\nCredit: "+crsCredit);
    }

    // Method to add a student to the course's list of students
    public void addStudent(Student student)
    {
        crs_students.add(student);
    }

    // Method to get the list of students taking the course
    public ArrayList<Student> getStudent()
    {
        return crs_students;
    }

}

public class ManyToMany_By_Tanvir {
    public static void main(String[] args) {
        // Create students
        ArrayList<Student> stdList=new ArrayList<Student>();
        Student s1 = new Student("Alice", 12345);
        Student s2 = new Student("Bob", 54321);
        Student s3 = new Student("Charlie", 67890);

        stdList.add(s1);
        stdList.add(s2);
        stdList.add(s3);

        // Create courses
        ArrayList<Course> crsList=new ArrayList<Course>();
        Course c1 = new Course("Mathematics", "MATH101", 3.5);
        Course c2 = new Course("Physics", "PHYS201", 4.0);
        Course c3 = new Course("Chemistry", "CHEM301", 3.0);

        crsList.add(c1);
        crsList.add(c2);
        crsList.add(c3);

        // Add courses to students
        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);
        s3.addCourse(c1);
        s3.addCourse(c3);

        // Display students and their courses
        System.out.println("\nStudent Information:");
        s1.display();
        System.out.println("\nCourses:");
        for (Course course : s1.getCourse()) {
            course.display();
        }

        // (Repeat above two blocks for other students)

        // Add students to courses
        c1.addStudent(s1);
        c2.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c3.addStudent(s3);

        // Display courses and their students
        System.out.println("\nCourse Information:");
        c1.display();
        System.out.println("\nStudents:");
        for (Student student : c1.getStudent()) {
            student.display();
        }

        // (Repeat above two blocks for other courses)
    }
}
