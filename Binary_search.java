import java.util.*;
public class Binary_search {

        static int binary_search(int []arr ,int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + high / 2;

            if (arr[mid] == key) {
               return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr [] = {1,2,35,57,57,68,78,88,98};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element which ypu want to Search ");
        int key = sc.nextInt();
        int a = binary_search(arr,key);
        System.out.println("index is " + a);



    }
}
