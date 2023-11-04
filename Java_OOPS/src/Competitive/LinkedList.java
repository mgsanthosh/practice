package Competitive;

public class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        /*
        The below line will print the last node, it won't print in the while loop
        because the node.next will be null for the last value
         */
        System.out.println(node.data);
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        show();
    }

    public int size() {
        Node node = head;
        int size = 0;
        while(node.next != null) {
            size++;
            node = node.next;
        }
        return ++size;
    }

    public void insertAtIndex(int index, int data) {
        Node node = head;
        int currentIndex = 0;
        Node prev = node;
        Node next = null;
        while (currentIndex <= index) {

            prev= node;
            node = node.next;
            next = node.next;
            if(currentIndex == index) {

               Node newNode = new Node();
               newNode.data = data;
               newNode.next = next;
                if (index == 0) {
                    newNode.next = prev;
                    head = newNode;
                }
               prev.next = newNode;
            }
            currentIndex++;
        }
        show();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(30);
        list.insert(21);

        list.show();
        System.out.println("SIZE " +  list.size());

//        System.out.println("REVERSED");
//        list.reverse();
        System.out.println("INSERT AT INDEX");
        list.insertAtIndex(0, 101);


    }

}
