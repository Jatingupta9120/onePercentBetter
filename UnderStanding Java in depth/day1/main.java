/*This is Day 1 of Learning LL Reversal Technique */

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class main {

    public static ListNode arrayToLinkedList(int[] arr) {
    if (arr.length == 0) return null;

    ListNode head = new ListNode(arr[0]);
    ListNode current = head;

    for (int i = 1; i < arr.length; i++) {
        current.next = new ListNode(arr[i]);
        current = current.next;
    }

    return head;
    }

    public static int[] linkedListToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Iterative Approach
    public static ListNode reverseLLIterative(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tempNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNode;
        }
        return prev;
    }

    // Recursive Approach
    public static ListNode reverseLLRecursive(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Stack Approach
    public static ListNode reverseLLStack(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        while (head != null) {
            st.push(head);
            head = head.next;
        }

        if (st.isEmpty()) return null;

        ListNode newHead = st.pop();
        ListNode curr = newHead;

        while (!st.isEmpty()) {
            curr.next = st.pop();
            curr = curr.next;
        }

        curr.next = null;
        return newHead;
    }

    // Helper: Clone the list so we can reuse it
    public static ListNode cloneList(ListNode head) {
        if (head == null) return null;

        ListNode newHead = new ListNode(head.val);
        ListNode currOld = head.next;
        ListNode currNew = newHead;

        while (currOld != null) {
            currNew.next = new ListNode(currOld.val);
            currOld = currOld.next;
            currNew = currNew.next;
        }

        return newHead;
    }

    // Helper: Print list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " => ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]) {
        // Create original list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printList(head);

        // Iterative reverse
        ListNode iterative = reverseLLIterative(cloneList(head));
        System.out.print("Reversed (Iterative): ");
        printList(iterative);

        // Recursive reverse
        ListNode recursive = reverseLLRecursive(cloneList(head));
        System.out.print("Reversed (Recursive): ");
        printList(recursive);

        // Stack reverse
        ListNode stack = reverseLLStack(cloneList(head));
        System.out.print("Reversed (Stack): ");
        printList(stack);

        int arr[]=linkedListToArray(cloneList(head));
        reverseArray(arr);
        ListNode newReverse=arrayToLinkedList(arr);
        System.out.print("Reversed (Array and LL): ");
        printList(newReverse);

    }
}
