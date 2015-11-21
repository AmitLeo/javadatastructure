package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-
 * list/
 * 
 * Move last element to front of a given Linked List Write a C function that
 * moves last element to front in a given Singly Linked List. For example, if
 * the given Linked List is 1->2->3->4->5, then the function should change the
 * list to 5->1->2->3->4.
 * 
 * @author amishash
 *
 */

public class MoveLastElementFront {

	private SingleLinkedList solution(SingleLinkedList sll) {
		Node tempNode = sll.getRootNode();
		Node secondLast = tempNode;
		while (tempNode.getNextNode() != null) {
			secondLast = tempNode;
			tempNode = tempNode.getNextNode();
		}
		tempNode.setNextNode(sll.getRootNode());
		sll.setRootNode(tempNode);
		secondLast.setNextNode(null);
		return sll;
	}

	public static void main(String[] args) {
		MoveLastElementFront moveLastElementFront = new MoveLastElementFront();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll1.addNode(node2, true);
		sll1.addNode(node1, true);
		sll1.addNode(node7, true);
		sll1.addNode(node3, true);
		sll1.addNode(node8, true);
		sll1.addNode(node4, true);
		sll1.addNode(node5, true);
		sll1.addNode(node6, true);
		sll1.displayLinkedListNodes();
		moveLastElementFront.solution(sll1);
		sll1.displayLinkedListNodes();

	}

}
