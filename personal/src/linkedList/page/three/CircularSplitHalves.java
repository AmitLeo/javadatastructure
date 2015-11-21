package linkedList.page.three;

import linkedList.CircularLinkedList;
import linkedList.Node;

/**
 * 
 * http://www.geeksforgeeks.org/split-a-circular-linked-list-into-two-halves/
 * Split a Circular Linked List into two halves
 * 
 * @author amishash
 *
 */
public class CircularSplitHalves {

	private void solution(CircularLinkedList argCircularLinkedList) {
		Node slowref = argCircularLinkedList.getRootNode();
		Node fastref = slowref.getNextNode();

		while (fastref.getNextNode() != argCircularLinkedList.getRootNode()) {
			fastref = fastref.getNextNode().getNextNode();
			slowref = slowref.getNextNode();
		}
		Node secondroot = slowref.getNextNode();
		fastref.setNextNode(secondroot);
		slowref.setNextNode(argCircularLinkedList.getRootNode());

		CircularLinkedList secondhalve = new CircularLinkedList();
		secondhalve.setRootNode(secondroot);

		System.out.println("First Half");
		argCircularLinkedList.print();
		System.out.println("Second Half");
		secondhalve.print();
	}

	public static void main(String[] args) {

		CircularLinkedList circularLinkedList = new CircularLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		circularLinkedList.addNode(node1);
		circularLinkedList.addNode(node2);
		circularLinkedList.addNode(node3);
		circularLinkedList.addNode(node4);
		circularLinkedList.print();

		CircularSplitHalves circularSplitHalves = new CircularSplitHalves();
		circularSplitHalves.solution(circularLinkedList);
	}

}
