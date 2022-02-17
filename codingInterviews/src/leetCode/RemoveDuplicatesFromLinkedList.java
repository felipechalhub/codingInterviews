package leetCode;

import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode();
		head.val = 1;
		head.val = 1;
		head.val = 2;
		System.out.println(head.toString());
//		System.out.println(deleteDuplicates(head));
		
	}
    public ListNode deleteDuplicates(ListNode head) {
    	ListNode current_node = head;
    	while(current_node != null && current_node.next != null) {
    		
    		if(current_node.next.val == current_node.val) {
    			current_node.next = current_node.next.next;
    		}
    		else {
    			current_node = current_node.next;
    		}
    		
    	}
    	return head;
    }
}
