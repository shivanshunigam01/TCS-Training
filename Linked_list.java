public class Linked_list{
    // Node class
    static class Node{
        int val;
        Node next;

          Node(int val){
            this.val = val;
        }
    }

    // Function to print the list
    static void printList(Node head){
        // Iterating while head is not null.
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
    static Node findMiddle(Node head){
         if (head == null)
            return head;
        
             Node slow = head, fast = head;
        
         while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

           return slow;
    }

    // Function to merge two already sorted lists.
    static Node mergeSorted(Node left, Node right){
        // Base cases to check if either of
        // the list provided is empty.
        if (left == null)
            return right;
        if (right == null)
            return left;

        // Declaring the variable 'res' to hold
        // the result.
        Node res = null;

        if (left.val <= right.val){
              res = left;
    res.next = mergeSorted(left.next, right);
            
        }

          else {
             res = right;

             res.next = mergeSorted(left, right.next);
            
        }

        // Returning the result.
        return res;
    }
    // Function to sort the list.
    static Node mergeSort(Node head){
       
        if (head == null || head.next == null){
            return head;
        }

          Node mid = findMiddle(head);

         Node nextToMid = mid.next;

        mid.next = null;
    Node left = mergeSort(head);
        Node right = mergeSort(nextToMid);

         Node res = mergeSorted(left, right);

     
        return res;
    }
    public static void main(String args[]){
        // Constructing the following linked list.
        // 4 --> 3 --> 2 --> 5 --> 1 --> null
        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        System.out.println("List before sorting - ");
        printList(head);

          head = mergeSort(head);

        System.out.println("List after sorting -");
        printList(head);
    }
}