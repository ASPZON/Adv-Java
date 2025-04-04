public class Queue {
    
    private int[] arr;
    private int front;
    private int size;

    public Queue(){
        arr = new int[5];
        front = 0;
        size = 0;
    }
    public Queue(int size){
        arr = new int[size];
        front = 0;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int ele) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = ele;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int ele = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return ele;
    }
    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return arr[front];
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}
