package Sem4_Tasks;

public class MyStack {
    /*
    Реализовать стэк с помощью массива.
    Нужно реализовать методы:
    size(), empty(), push(), peek(), pop().
     */
    private Integer[] arr = new Integer[10];
    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int num){
        if (size == arr.length){
            Integer[] arr2 = new Integer[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }

    int peek(){
//        if (!empty()){
            return arr[size - 1];
//        } else {
//            throw new IndexOutOfBoundsException();
//        }
    }

    int pop(){
        return arr[--size];
    }
}
