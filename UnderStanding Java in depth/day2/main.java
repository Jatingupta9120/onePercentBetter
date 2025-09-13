class ListNode{
    int data;
    ListNode next;
    public ListNode(){
        this.data=data;
    }
    public ListNode(int data){
        this.data=data;
        this.next=next;
    }
}
public class main{
    public static void printLL(ListNode head){
        while(head!=null){
            System.out.print(head.data+"=>");
            head=head.next;
        }
        System.out.println("null");
    }
    public static ListNode deleteNodeFromHead(ListNode head){
        if(head==null||head.next==null)return null;
        return head.next;
    }
    public static ListNode deleteNodeFromTail(ListNode head){
        if(head==null||head.next==null)return null;
        ListNode curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static ListNode deleteNodeFromValue(ListNode head,int target){
        if(head==null)return null;
        if(head.data==target){
            return head.next;
        }

        ListNode curr=head;
        while(curr.next!=null){
            if(curr.next.data==target){
                curr.next=curr.next.next;
                return head;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String args[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);     
        printLL(head);
        head=deleteNodeFromValue(head,2);   
        printLL(head);
    }
}