package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/intersection-of-two-sorted-linked-lists/
 * 
 * Intersection of two Sorted Linked Lists Given two lists sorted in increasing
 * order, create and return a new list representing the intersection of the two
 * lists. The new list should be made with its own memory — the original lists
 * should not be changed.
 * 
 * For example, let the first linked list be 1->2->3->4->6 and second linked
 * list be 2->4->6->8, then your function should create and return a third list
 * as 2->4->6.
 * 
 * @author amishash
 *
 */
public class IntersectionLinkedList {

	private SingleLinkedList solution3(SingleLinkedList sll1,
			SingleLinkedList sll2) {
		return recursiveSol(sll1.getRootNode(), sll2.getRootNode(),
				new SingleLinkedList());
	}

	private SingleLinkedList recursiveSol(Node argNode, Node argNode2,
			SingleLinkedList sll) {
		if (argNode == null || argNode2 == null)
			return sll;
		if (argNode.getData() == argNode2.getData()) {
			sll.addNode(new Node(argNode.getData()));
			return recursiveSol(argNode.getNextNode(), argNode2.getNextNode(),
					sll);
		} else if (argNode.getData() <= argNode2.getData())
			return recursiveSol(argNode.getNextNode(), argNode2, sll);
		else
			return recursiveSol(argNode, argNode2.getNextNode(), sll);
	}

	private SingleLinkedList solution2(SingleLinkedList sll1,
			SingleLinkedList sll2) {
		SingleLinkedList sll = new SingleLinkedList();
		Node currNode = sll1.getRootNode();
		Node currNode2 = sll2.getRootNode();

		while (currNode != null && currNode2 != null) {

			if (currNode.getData() == currNode2.getData()) {
				sll.addNode(new Node(currNode.getData()));
				currNode = currNode.getNextNode();
				currNode2 = currNode2.getNextNode();
			} else if (currNode.getData() < currNode2.getData())
				currNode = currNode.getNextNode();
			else
				currNode2 = currNode2.getNextNode();
		}
		return sll;
	}

	private SingleLinkedList solution(SingleLinkedList sll1,
			SingleLinkedList sll2) {
		SingleLinkedList sll = new SingleLinkedList();
		Node currNode = sll1.getRootNode();
		Node currNode2 = sll2.getRootNode();
		while (currNode != null && currNode2 != null) {
			if (currNode.getData() == currNode2.getData()) {
				sll.addNode(new Node(currNode.getData()));
				currNode = currNode.getNextNode();
				currNode2 = currNode2.getNextNode();
			} else if (currNode.getData() < currNode2.getData()) {
				Node nextNode = getNextNode(currNode, currNode2.getData());
				if (nextNode.getData() == currNode2.getData()) {
					sll.addNode(new Node(nextNode.getData()));
					currNode = nextNode.getNextNode();
					currNode2 = currNode2.getNextNode();
				} else
					currNode = nextNode;
			} else {
				Node nextNode = getNextNode(currNode2, currNode.getData());
				if (nextNode.getData() == currNode.getData()) {
					sll.addNode(currNode);
					currNode = currNode.getNextNode();
					currNode2 = nextNode.getNextNode();
				} else
					currNode2 = nextNode;
			}
		}
		return sll;
	}

	private Node getNextNode(Node node, double argNumber) {
		while (node != null && node.getData() < argNumber)
			node = node.getNextNode();
		return node;
	}

	public static void main(String[] args) {
		IntersectionLinkedList intersectionLinkedList = new IntersectionLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);

		Node node11 = new Node(10);
		Node node14 = new Node(40);
		Node node15 = new Node(50);
		Node node16 = new Node(60);
		SingleLinkedList sll2 = new SingleLinkedList();

		sll2.addNode(node11);
		sll2.addNode(node14);
		sll2.addNode(node15);
		sll2.addNode(node16);
		intersectionLinkedList.solution(sll1, sll2).displayLinkedListNodes();
		intersectionLinkedList.solution2(sll1, sll2).displayLinkedListNodes();
		intersectionLinkedList.solution3(sll1, sll2).displayLinkedListNodes();
	}
}
