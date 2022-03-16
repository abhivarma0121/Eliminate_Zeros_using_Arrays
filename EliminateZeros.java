import java.util.Scanner;


// import java.util.ArrayList;
// import java.util.Arrays;
public class EliminateZeros {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int count=0;
    System.out.println("enter number of rows and columns : ");
    int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("enter the values");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==0){
                    for(int k=0;k<a.length;k++){
                        a[i][k]=9;
                        a[k][i]=9;
                    }
                }
                
            }
        }
        System.out.println("the result is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
                if(a[i][j]==1)
                count++;
            }System.out.println();
        }
        System.out.println("the number of 1's are : "+count);
    }
    
}
// ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();
// x.add(0,new ArrayList<>(Arrays.asList(0 , 1 , 0 , 1 , 0)));
// x.add(1,new ArrayList<>(Arrays.asList(0 , 1 , 1 , 0 , 1)));
// x.add(2,new ArrayList<>(Arrays.asList(0, 1  ,1 , 0,  1)));
// x.add(3,new ArrayList<>(Arrays.asList(0  ,1  ,0  ,0  ,1)));
// x.add(4,new ArrayList<>(Arrays.asList(1 , 1  ,1  ,1 , 1)));
// System.out.println(x);
// 0  1  0  1  0
// 1  0  1  1  1
// 0  1  1  0  1
// 0  1  0  0  1
// 1  1  1  1  1