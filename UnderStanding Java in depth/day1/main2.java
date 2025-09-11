import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class main2 {
    public static void printLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void middleElementByStack(ListNode head){
        Stack<ListNode>st=new Stack<>();
    }
    public static int middleElementApproach2(ListNode head){
        //tortoise or hair approach we will setup and traverse untill we get null and move slow 1 step and fast 2 step then if fast reach null then it return slow get point to middle at that time
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
        return slow.data;
    }
    public static int middleElement(ListNode head){

        //approach is simple first convert all the LL to list and then find the mid and then access that element and return that
        List<Integer>ll=new ArrayList<>();
        while(head!=null){
            ll.add(head.data);
            head=head.next;
        }

        int midIdx=ll.size()/2;      
        return ll.get(midIdx);
    }
    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        printLL(head);
        int data=middleElement(head);
        System.out.print(data);
        middleElementApproach2(head);

    }
}
