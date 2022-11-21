package ThucHanhTrienKhaiStackSuDungMang;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }



    public int size() {
        return index;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

}
