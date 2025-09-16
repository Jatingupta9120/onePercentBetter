//need to add two number in LL 235+468=703
class ListNode{
    int data;
    ListNode next;

    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{


    public static void checkLLNodeMemory(ListNode head1,ListNode head2){
        ListNode b1=ListNode(4);
        ListNode b2=ListNode(4);
        if(b1.hashcode()!=b2.hashcode()){
            System.out.print("yyyy");
        }
    }
    // public static ListNode deleteNodeFromLLwithoutHead(ListNode node){
    //     node.val=node.next.val//copy val of next to curr and delete next
    //     node.next=node.next.next;
    // }
    // public static ListNode addLL(ListNode head1,ListNode head2){
        // 2->3->5
        // 4->6->8
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(head1!=null||head2!=null||carry!=null){
            int sum=0;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            sum+=carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
        }
        return dummy.next;
        }
    public static void main(String args[]){
        ListNode head1=new ListNode(2);
        head.next=new ListNode(3);
        head.next.next=new ListNode(5);

        ListNode head2=new ListNode(4);
        head.next=new ListNode(6);
        head.next=new ListNode(8);

        // addLL(head1,head2);
        checkLLNodeMemory(head1,head2);
    }
}