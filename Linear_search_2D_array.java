import java.util.Scanner;

public class Linear_search_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println("Enter the Elements of the array ");
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the key element "); 
        int key = sc.nextInt();
        int flag =0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               if(arr[i][j]==key)
               {
                   System.out.println("Element found at index " + i +","+ j);
                   flag++;
               }
            }
        }

        if(flag==0)
        {
            System.out.println("Element is not present in the array ");
        }



    }
}
