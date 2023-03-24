import java.util.*;

public class Linear_Search_Multidimensional_array
{
    public static void main(String[] args) {
        int row, column ;
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();
        int [][] arr = new int[row][column];

        System.out.println("Enter the Elements of array ");

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
            arr[i][j] = sc.nextInt();
            }
        }

//        for (int i=0;i<row;i++)
//        {
//            for (int j=0;j<column;j++)
//            {
//                System.out.print(Arrays.toString(arr));
//            }
//        }


    }
}
