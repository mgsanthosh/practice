package Queue;

import java.util.regex.Pattern;

public class Queue {
    int[] queue = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data) {
        if(!isFull()) {
            queue[rear] = data;
        /*
        This % 5 will make the array circular
        so 0 % 5 = 0;
        1 % 5 = 1
         2 % 5 = 2
          3 % 5 = 3
           4 % 5 = 4

            5 % 5 = 0 this is what we want
            so rear will point to 0 after it reaches 5 which is the end of array
         */
            rear = (rear + 1)%5;
            size = size + 1;
        } else {
            System.out.println("The Queue is full");
        }

    }

    public int deQueue() {
        if(!isEmpty()) {
            int val = queue[front];
            front = (front + 1)%5;
            size = size - 1;
            return val;
        } else {
            System.out.println("The Queue is Empty");
            return -1;
        }

    }

    public void show() {
        System.out.print("Elements: ");
        for(int i = 0; i< size; i++) {
            System.out.print(queue[(front + i)%5] + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == 5;
    }
}
