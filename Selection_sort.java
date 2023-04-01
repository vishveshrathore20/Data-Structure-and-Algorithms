public class Selection_sort {

     static void Selection(int []arr){
         int min , temp ;
        for (int i = 0; i < arr.length-1; i++) {
             min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min])
                {
                    min=j;
                }

            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

   static void print(int []arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr ={5,6,4,8,3,1,2};
//        Selection_sort s = new Selection_sort();
//        s.Selection(arr);
        Selection(arr);
        print(arr);
     }
}
