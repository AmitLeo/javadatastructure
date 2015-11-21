package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/detect-and-remove-loop-in-a-linked-list/
 * 
 * Detect and Remove Loop in a Linked List Write a function
 * detectAndRemoveLoop() that checks whether a given Linked List contains loop
 * and if loop is present then removes the loop and returns true. And if the
 * list doesn’t contain loop then returns false. Below diagram shows a linked
 * list with a loop. detectAndRemoveLoop() must change the below list to
 * 1->2->3->4->5->NULL.
 * 
 * @author amishash
 *
 */
public class DetectCyleRemoval {

	private SingleLinkedList detectAndRemoveLoop(SingleLinkedList sll) {

		Node tortoise = sll.getRootNode();
		Node hare = tortoise.getNextNode();
		Node prev = null;
		while (hare != null) {
			if (tortoise.getData() == hare.getData()) {
				prev.setNextNode(null);
				return sll;
			}
			tortoise = tortoise.getNextNode();
			hare = hare.getNextNode();
			prev = hare;
			if (hare != null)
				hare = hare.getNextNode();
		}
		return sll;
	}

	public static void main(String[] args) {
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(12);
		Node node2 = new Node(15);
		Node node3 = new Node(10);
		Node node4 = new Node(11);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(2);
		Node node8 = new Node(3);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		node8.setNextNode(node6);
		sll1.displayLinkedListNodes();
		DetectCyleRemoval detectCyleRemoval = new DetectCyleRemoval();
		detectCyleRemoval.detectAndRemoveLoop(sll1).displayLinkedListNodes();
		;

	}

}
