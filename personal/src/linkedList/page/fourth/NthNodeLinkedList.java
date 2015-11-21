package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/write-a-function-to-get-nth-node-in-a-linked-
 * list/
 * 
 * Write a function to get Nth node in a Linked List Write a GetNth() function
 * that takes a linked list and an integer index and returns the data value
 * stored in the node at that index position.
 * 
 * @author amishash
 *
 */
public class NthNodeLinkedList {

	private Node solution(SingleLinkedList argSingleList, int argIndex) {
		Node tempNode = argSingleList.getRootNode();
		int counter = 1;
		while (counter < argIndex) {
			tempNode = tempNode.getNextNode();
			counter++;
		}
		return tempNode;
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
		NthNodeLinkedList nthNodeLinkedList = new NthNodeLinkedList();
		System.out.println(nthNodeLinkedList.solution(linkedList, 5).getData());

	}

}
