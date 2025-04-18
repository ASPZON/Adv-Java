public class Stack {

    private int []arr;
    private int top;
    // Constructor
    
    public Stack() {
        arr = new int[5];
        top = 0;
    }
    public Stack(int size) {
        arr = new int[size];
        top = 0;
    }
    public void push(int ele) throws Exception {
        if(isfull()){
            throw new Exception("Stack is full");
        } 
        arr[top] = ele;
        top++;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        top--;
        return arr[top];
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[top - 1];
    }
    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isfull() {
        return top == arr.length;
    }
    public int size() {
        return top;
    }
    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
