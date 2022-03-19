package leetCode;

public class MiddleOfLinkedList {
	public static void main(String[] args) {

		ListNode head = new ListNode(0);
//		middleNode(head );
	}

	public ListNode middleNode(ListNode head) {

		ListNode a_pointer = head;
		ListNode b_pointer = head;

		while (b_pointer != null || b_pointer.next != null) {
			a_pointer = a_pointer.next;
			b_pointer = b_pointer.next.next;
		}
		return a_pointer;
	}
}
