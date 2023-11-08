import java.lang.reflect.Array;

public class Main{
    public static void main(String[] args) throws isvalid {
        v a=new v(13);
        a.valid();
        int ab=0;
        System.out.println(ab);
    }
}
class v{
    int age;
    v(int age){this.age=age;}
    public void valid() throws isvalid {
        try{
            if(age<18) throw new isvalid("not valid");
            else System.out.println("valid");
        }catch (isvalid e)
        {
            System.out.println(e);
        }
    }
}
class isvalid extends Exception{
    public isvalid(String str) {super(str);}
}
