package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/compare-two-strings-represented-as-linked-lists/
 * Compare two strings represented as linked lists Given two linked lists,
 * represented as linked lists (every character is a node in linked list). Write
 * a function compare() that works similar to strcmp(), i.e., it returns 0 if
 * both strings are same, 1 if first linked list is lexicographically greater,
 * and -1 if second string is lexicographically greater.
 * 
 * @author amishash
 *
 */

public class LexicographicalStringLinkedList {

	private int solution(SingleLinkedList sll1, SingleLinkedList sll2) {
		return check(sll1.getRootNode(), sll2.getRootNode());
	}

	private int check(Node argRootNod1, Node argRootNod2) {

		if (argRootNod1 != null && argRootNod2 != null) {
			if (!argRootNod1.toString().equalsIgnoreCase(
					argRootNod2.getStringData()))
				return 1;
			else
				check(argRootNod1.getNextNode(), argRootNod2.getNextNode());
		} else if (argRootNod1 != null && argRootNod2 == null
				|| argRootNod1 == null && argRootNod2 != null) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		LexicographicalStringLinkedList lexicographicalStringLinkedList = new LexicographicalStringLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node("g");
		Node node2 = new Node("e");
		Node node3 = new Node("e");
		Node node4 = new Node("e");
		Node node5 = new Node("k");
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		SingleLinkedList sll2 = new SingleLinkedList();
		Node node21 = new Node("g");
		Node node22 = new Node("e");
		Node node23 = new Node("e");
		Node node24 = new Node("e");
		Node node25 = new Node("k");
		sll1.addNode(node21);
		sll1.addNode(node22);
		sll1.addNode(node23);
		sll1.addNode(node24);
		sll1.addNode(node25);

		System.out
				.println(lexicographicalStringLinkedList.solution(sll1, sll2));

		SingleLinkedList sll3 = new SingleLinkedList();
		Node node31 = new Node("g");
		Node node32 = new Node("e");
		Node node33 = new Node("e");
		Node node34 = new Node("d");
		Node node35 = new Node("k");
		sll3.addNode(node31);
		sll3.addNode(node32);
		sll3.addNode(node33);
		sll3.addNode(node34);
		sll3.addNode(node35);

		System.out
				.println(lexicographicalStringLinkedList.solution(sll1, sll3));

	}

}
