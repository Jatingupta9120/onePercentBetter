    /* Problem states need to remove nth node from the back of the LL */

    // we will take a count and maintain and traverse whole LL and get a count and we have a target to delete node we will again traverse unitll that node before that and move pointer to node to next node it mean the node we want to delete is free garbage collector come and remove from memory
    import java.util.*;
    class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        public ListNode(int data,ListNode next){
            this.data=data;
            this.next=next;
        }
    }
    public class main{
        public static ListNode deleteNodeFromIdx(ListNode head,int target){{
            int length=0;
            ListNode dummy=head;
            while(dummy!=null){
                length++;
                dummy=dummy.next;
            }
            if(target==length){
                return head.next;
            }

            dummy=head;

            int ct=1;
            while(ct<length-target){
                dummy=dummy.next;
                ct++;
            }

            dummy.next=dummy.next.next;
            return head;
        }}
        public static void printLL(ListNode head){
            while(head!=null){
                System.out.print(head.data+"=>");
                head=head.next;
            }
            System.out.println("null");
        }
        public static void main(String args[]){
            ListNode head=new ListNode(10);
            head.next=new ListNode(20);
            head.next.next=new ListNode(30);
            head.next.next.next=new ListNode(40);
            printLL(head);
            int target=2;
            ListNode result=deleteNodeFromIdx(head,target);
            printLL(result);
        }
    }