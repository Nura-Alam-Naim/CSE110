public class Problem1 {
        public static void main(String[] args) {
            //Scanner inp= new Scanner(System.in);
            int[][] arr=new int[4][4];
            int row=0,col=0;
            int frow=0,fcol=0;
            for(int i=0;i<4;i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = (int) (Math.random() * 2);
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            for(int i=0;i<4;i++)
            {
                int fr = 0;
                for(int j = 0; j < 4; j++)
                    if(arr[i][j]==1) fr++;
                if(fr>row)
                {
                    frow=i;
                    row=fr;
                }
            }
          for(int j=0;j<4;j++)
          {
              int fc=0;
              for(int i=0;i<4;i++)
              {
                  if(arr[i][j]==1) fc++;

              }
              if(fc>col)
              {
                  col=fc;
                  fcol=j;
              }

          }

            System.out.println("The largest row index: "+frow);
            System.out.println("The largest column index: "+fcol);

        }
}
