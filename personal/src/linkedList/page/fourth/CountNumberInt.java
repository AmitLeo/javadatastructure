package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/write-a-function-that-counts-the-number-of-times
 * -a-given-int-occurs-in-a-linked-list/
 * 
 * Write a function that counts the number of times a given int occurs in a
 * Linked List
 * @author amishash
 *
 */
public class CountNumberInt {

	public int solution(SingleLinkedList sll, int argInt) {
		int counter = 0;
		Node node = sll.getRootNode();
		while (node != null) {
			if (node.getData() == argInt)
				counter++;
			node = node.getNextNode();
		}
		return counter;
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNode(new Node(10));
		linkedList.addNode(new Node(20));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(60));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(80));
		linkedList.addNode(new Node(30));
		CountNumberInt countNumberInt=new CountNumberInt();
		System.out.println(countNumberInt.solution(linkedList, 30));
	}

}
