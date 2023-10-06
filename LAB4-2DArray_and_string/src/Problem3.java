
import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] works = new int[8][7];
        int temp;
        System.out.print("Total employee: ");
        temp=inp.nextInt();
        for (int i = 0; i < temp; i++)
        {
            for (int j = 0; j < 7; j++) {
                works[i][j] = (int) (Math.random() * 14);
                System.out.print(works[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] total= new int[temp];

        for(int i=0;i<temp;i++)
        {
            total[i]=0;
            for(int j=0;j<7;j++)
            {
                total[i]+=works[i][j];
            }
//            System.out.println(i+" worked "+total[i]);
        }
        int[] emp= new int[temp];
        for(int i=0;i<temp;i++)
        {
            emp[i]=i;
        }
        for(int i=0;i<temp-1;i++)
        {
            for(int j=i+1;j<temp;j++)
            {
                if(total[i]>total[j])
                {
                    int swap=total[i];
                    total[i]=total[j];
                    total[j]=swap;

                    int emp_swap=emp[i];
                    emp[i]=emp[j];
                    emp[j]=emp_swap;
                }
            }
        }
        for(int i=temp-1;i>=0;i--)
            System.out.println(emp[i]+" has worked "+total[i]+" hours");

        inp.close();
    }
}