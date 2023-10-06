import java.io.*;
import java.util.ArrayList;

class List implements Serializable {
    int Index;
    int MaxSize;
    ArrayList<Integer>Data=new ArrayList<Integer>();
    public List()
    {
        MaxSize=10;
        Index=-1;
    }
    public List(int MazSize)
    {
        this.MaxSize=MaxSize;
        Index=-1;
    }
    public void push(int data)
    {
        Data.add(data);
        Index++;
    }
    public void pop()
    {
        Data.remove(Index);
        Index--;
    }
    public int top()
    {
        return Data.get(Index);
    }
    public void display(){
        for(int i=0;i<Index+1;i++)
            System.out.print(Data.get(i)+" ");
    }
}
public class Problem4 {
    public static void main(String[] args) {
        List l1=new List();
        List l2=new List();
        List l3=new List();
        List l4=new List();
        List l5=new List();

        l1.push(1);
        l1.push(2);
        l2.push(3);
        l2.push(4);
        l3.push(5);
        l3.push(6);
        l4.push(7);
        l4.push(8);
        l5.push(9);
        l5.push(10);
        try(ObjectOutputStream input= new ObjectOutputStream(new FileOutputStream(new File("Lab08_04.dat"),true)))
        {
            input.writeObject(l1);
            input.writeObject(l2);
            input.writeObject(l3);
            input.writeObject(l4);
            input.writeObject(l5);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try(ObjectInputStream output=new ObjectInputStream(new FileInputStream("Lab08_04.dat")))
        {
            while(true){
                List ll = (List)output.readObject();
                if(ll != null){
                    ll.display();
                    System.out.println();
                }else
                    break;

            }
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }
}
