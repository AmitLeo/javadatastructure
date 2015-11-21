package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/
 * 
 * Given a singly linked list, write a function to swap elements pairwise. For
 * example, if the linked list is 1->2->3->4->5 then the function should change
 * it to 2->1->4->3->5, and if the linked list is 1->2->3->4->5->6 then the
 * function should change it to 2->1->4->3->6->5.
 * 
 * @author amishash
 *
 */
public class PairwiseSwap {

	private SingleLinkedList iterativeSolution(SingleLinkedList argSll) {
		Node tempNode = argSll.getRootNode();
		Node prevNode = null;
		Node rootNode = null;
		while (tempNode != null && tempNode.getNextNode() != null) {
			Node tmpNode = swap(tempNode, tempNode.getNextNode());
			if (prevNode == null) {
				rootNode = tmpNode;
			} else {
				prevNode.setNextNode(tmpNode);
			}
			prevNode = tmpNode.getNextNode();
			tempNode = prevNode.getNextNode();
		}
		argSll.setRootNode(rootNode);
		return argSll;
	}

	private SingleLinkedList solution(SingleLinkedList argSll) {
		argSll.setRootNode(recursiveSol(argSll.getRootNode()));
		return argSll;
	}

	private Node recursiveSol(Node argNode) {
		if (argNode.getNextNode() == null) {
			return argNode;
		} else {
			Node tempNode = recursiveSol(argNode.getNextNode());
			return swap(argNode, tempNode);
		}
	}

	private Node swap(Node argNode, Node argNode2) {
		Node tempNode2Next = argNode2.getNextNode();
		argNode2.setNextNode(argNode);
		argNode.setNextNode(tempNode2Next);
		return argNode2;
	}

	public static void main(String[] args) {
		PairwiseSwap pairwiseSwap = new PairwiseSwap();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		sll1.displayLinkedListNodes();/*
									 * pairwiseSwap.solution(sll1).
									 * displayLinkedListNodes();
									 */
		pairwiseSwap.iterativeSolution(sll1).displayLinkedListNodes();
	}
}
