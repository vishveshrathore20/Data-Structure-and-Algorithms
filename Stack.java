

public class Stack {
    int []stack = new int[5];
    public static int Top=-1;

    void push(int n){
        Top++;
        stack[Top]=n;
    }
    void pop(){
        int temp = stack[Top];
        Top--;
    }
    void traverse()
    {
        for (int i = 0; i<=Top ; i++) {
            System.out.print(stack[i]+ " ");
        }
    }

    void isfull()
    {
        if (Top>4){
            System.out.println("Stack is full" + "Overflow");
        }
    }
    public static void main(String[] args) {

        Stack s1 = new Stack();
                s1.push(5);
                s1.push(2);
                s1.push(3);
                s1.push(4);

               s1.push(8);
               s1.traverse();
               s1.isfull();
    }
}
