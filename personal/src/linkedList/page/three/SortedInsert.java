package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/
 * Given a linked list which is sorted, how will you insert in sorted way
 * Let input linked list is sorted in increasing order.
 * 
 * @author amishash
 *
 */
public class SortedInsert {

	public static void main(String[] args) {
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll1.addNode(node6, true);
		sll1.addNode(node2, true);
		sll1.addNode(node1, true);
		sll1.addNode(node7, true);
		sll1.addNode(node3, true);
		sll1.addNode(node8, true);
		sll1.addNode(node4, true);
		sll1.addNode(node5, true);
		sll1.displayLinkedListNodes();
		
	}

}
