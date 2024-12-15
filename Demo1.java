import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner one=new Scanner(System.in);
        int row,col;
        row=one.nextInt();
        System.out.println("Enter the row=");
        
        col=one.nextInt();
        System.out.println("Enter the col=");
        int[][] mat=new int[row][col];
        System.out.println("enter the matrix =");
        for (int n = 0; n < row; n++) {
            for (int m = 0; m < col; m++) {
                mat[n][m]=one.nextInt();
            }
        }
        System.out.println("Matrix");
        
         for (int n = 0; n < row; n++) {
            for (int m = 0; m < col; m++) {
                System.out.println(mat[n][m]);
            }
            System.out.print();
            
        }
    }
}
