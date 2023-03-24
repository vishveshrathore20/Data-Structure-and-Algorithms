import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        int n = 5;
        int [] arr = new int[n] ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements in an array ");
        for (int i=0 ; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the element which is to be searched ");
        int key = sc.nextInt();
        int flag = 0 ;
        for (int i=0 ; i<5; i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Element is found at index " + i);
                flag =1;
            }
        }
        if (flag==0)
        {
            System.out.println("Element not found in given array ");
        }
        

    }
}
