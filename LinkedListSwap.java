public class LinkedListSwap {
    Node head; // head of list
  
    // Node class
    static class Node {
        int data;
        Node next;
  
        Node(int d) {
            data = d;
            next = null;
        }
    }
  
    // function to swap two elements
    public void swapElements(int x, int y) {
        // if both elements are same, no need to swap
        if (x == y)
            return;
  
        // search for x and y in the list
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
  
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
  
        // if either x or y is not present in the list, return
        if (currX == null || currY == null)
            return;
  
        // if x is not the head of the list
        if (prevX != null)
            prevX.next = currY;
        else // make y the new head
            head = currY;
  
        // if y is not the head of the list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;
  
        // swap the next pointers of x and y
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
  
    // function to print the list
    public void printList() {
        Node currNode = head;
  
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
  
    // main method
    public static void main(String[] args) {
        LinkedListSwap list = new LinkedListSwap();
  
        list.head = new Node(10);
        Node second = new Node(15);
        Node third = new Node(12);
        Node fourth = new Node(13);
  
        list.head.next = second;
        second.next = third;
        third.next = fourth;
  
        System.out.println("Original list:");
        list.printList();
  
        list.swapElements(10, 12);
  
        System.out.println("\nList after swapping 10 and 12:");
        list.printList();
    }

}

