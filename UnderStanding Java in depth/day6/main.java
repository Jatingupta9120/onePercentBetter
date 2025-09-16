class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}

public class main{
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        //calculate mid
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(fast!=null){
            fast=fast.next;
        }

        slow=reverseLL(slow);
        fast=head;

        //st comparing one by one
        while(slow!=null){
            if(slow.val!=fast.val)return false;

            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
    public static void main(String args[]){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = null;

        main detector = new main();
        boolean result = detector.isPalindrome(a);

        System.out.println("Has Palindrome? " + result);
    }
}