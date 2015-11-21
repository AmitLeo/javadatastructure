package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-
 * linked-list/ Write a function to reverse a linked list
 * 
 * @author amishash
 *
 */
public class ReverseLinkedList {

	public void solution(SingleLinkedList sll) {
		sll.setRootNode(recursiveSol(sll.getRootNode()));
	}

	public Node recursiveSol(Node argNode) {
		if (argNode.getNextNode() == null)
			return argNode;
		else {
			Node currentNode = recursiveSol(argNode.getNextNode());
			Node tempNode = currentNode;
			while (tempNode.getNextNode() != null) {
				tempNode = tempNode.getNextNode();
			}
			tempNode.setNextNode(argNode);
			argNode.setNextNode(null);
			return currentNode;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNode(new Node(10));
		linkedList.addNode(new Node(20));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(40));
		linkedList.addNode(new Node(50));
		/*
		 * linkedList.addNode(new Node(60)); linkedList.addNode(new Node(70));
		 * linkedList.addNode(new Node(80)); linkedList.addNode(new Node(90));
		 */
		reverseLinkedList.solution(linkedList);
		linkedList.displayLinkedListNodes();
	}

}
