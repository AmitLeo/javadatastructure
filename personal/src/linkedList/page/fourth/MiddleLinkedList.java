package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-
 * linked-list/
 * 
 * function to print the middle of a given linked list
 * 
 * @author amishash
 *
 */
public class MiddleLinkedList {

	public Node solution(SingleLinkedList singleLinkedList) {
		Node firstNode = singleLinkedList.getRootNode();
		Node secondNode = firstNode.getNextNode();
		while (secondNode != null) {
			secondNode = secondNode.getNextNode().getNextNode();
			firstNode = firstNode.getNextNode();
		}
		return firstNode;
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNode(new Node(10));
		linkedList.addNode(new Node(20));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(40));
		linkedList.addNode(new Node(50));
		linkedList.addNode(new Node(60));
		linkedList.addNode(new Node(70));
		linkedList.addNode(new Node(80));
		linkedList.addNode(new Node(90));
		MiddleLinkedList middleLinkedList = new MiddleLinkedList();
		System.out.println(middleLinkedList.solution(linkedList).getData());

	}

}
