package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-
 * palindrome/ Function to check if a singly linked list is palindrome Given a
 * singly linked list of characters, write a function that returns true if the
 * given list is palindrome, else false.
 * 
 * @author amishash
 *
 */
public class PallindromLinkedList {

	boolean flag = true;
	Node _rootNode;

	private boolean solution(SingleLinkedList sll) {
		_rootNode = sll.getRootNode();
		recursiveSolution(sll.getRootNode());
		return flag;
	}

	private Node recursiveSolution(Node argRootNode) {
		if (argRootNode == null) {
			return _rootNode;
		} else {

			Node tempNode = recursiveSolution(argRootNode.getNextNode());
			if (tempNode.getData() != argRootNode.getData())
				flag = false;
			return tempNode.getNextNode();
		}
	}

	public static void main(String[] args) {
		PallindromLinkedList pallindromLinkedList = new PallindromLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(30);
		Node node5 = new Node(20);
		Node node6 = new Node(10);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		System.out.println(pallindromLinkedList.solution(sll1));

		Node node7 = new Node(10);
		sll1.addNode(node7);
		System.out.println(pallindromLinkedList.solution(sll1));
	}

}
