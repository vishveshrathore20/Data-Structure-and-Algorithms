import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        int n=5;
        int [] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array ");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        for (int i=0;i<5;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
