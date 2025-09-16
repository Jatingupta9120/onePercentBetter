class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}

public class main {

    // public boolean hasCycle(ListNode head) {
    //     ListNode slow = head;
    //     ListNode fast = head;

    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;          // 1 step
    //         fast = fast.next.next;     // 2 steps

    //         if (slow == fast) {
    //             return true; // Cycle found!
    //         }
    //     }

    //     return false; // No cycle
    // }
    
    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                int len=1;
                fast=fast.next;
                while(fast!=slow){
                    fast=fast.next;
                    len++;
                }
                return len;
                return true;

            }
        }
        return false;
    }

    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // ← cycle here

        main detector = new main();
        boolean result = detector.hasCycle(a);

        System.out.println("Has Cycle? " + result);
    }
}
