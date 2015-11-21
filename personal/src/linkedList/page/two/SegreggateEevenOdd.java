package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/segregate-even-and-odd-elements-in-a-linked-list
 * / Segregate even and odd nodes in a Linked List Given a Linked List of
 * integers, write a function to modify the linked list such that all even
 * numbers appear before all the odd numbers in the modified linked list. Also,
 * keep the order of even and odd numbers same.
 * 
 * @author amishash
 *
 */
public class SegreggateEevenOdd {

	private SingleLinkedList solution(SingleLinkedList sll) {
		SingleLinkedList evenLinkedList = new SingleLinkedList();
		SingleLinkedList oddLinkedList = new SingleLinkedList();
		Node rootNode = sll.getRootNode();
		while (rootNode != null) {
			if (rootNode.getData() % 2 == 0)
				evenLinkedList.addNode(new Node(rootNode.getData()));
			else
				oddLinkedList.addNode(new Node(rootNode.getData()));
			rootNode = rootNode.getNextNode();
		}
		evenLinkedList.addNode(oddLinkedList.getRootNode());

		return evenLinkedList;
	}

	public static void main(String[] args) {
		SegreggateEevenOdd segreggateEevenOdd = new SegreggateEevenOdd();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(3);
		Node node3 = new Node(12);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(9);
		Node node7 = new Node(13);
		Node node8 = new Node(40);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		segreggateEevenOdd.solution(sll1).displayLinkedListNodes();
	}

}
