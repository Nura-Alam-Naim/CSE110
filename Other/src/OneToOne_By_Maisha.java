package one.to.one;
class Person{
    public String name;
    public int age;
    NID pnid;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void addNID(NID n){
        pnid=n;
    }
    public void display(){
        System.out.print("Name: "+name+";  Age: "+age+"; NID: ");
        pnid.display();
    }
}
class NID{
    public int pt1,pt2;
    public NID(int pt1,int pt2){
        this.pt1=pt1;
        this.pt2=pt2;
    }
    public void display(){
        System.out.println(pt1+" "+pt2);
    }
}
public class OneToOne_By_Maisha {

    public static void main(String[] args) {
        Person p1=new Person("Danielle",19);
        Person p2=new Person("Jake",42);
        NID n1=new NID(1234,5678);
        NID n2=new NID(4321,8765);
        p1.addNID(n1);
        p2.addNID(n2);
        p1.display();
        p2.display();
    }
    
}
