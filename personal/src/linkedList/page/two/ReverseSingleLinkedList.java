package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * Write a function to reverse a linked list Iterative Method Iterate trough the
 * linked list. In loop, change next to prev, prev to current and current to
 * next.
 *
 * http://www.geeksforgeeks.org/write-a-function-to-reverse-the-nodes-of-a-
 * linked-list/
 * 
 * @author amishash
 *
 */
public class ReverseSingleLinkedList {

	public SingleLinkedList solution(SingleLinkedList sll) {
		Node currentNode = sll.getRootNode();
		Node prevNode = null;
		Node nextNode = currentNode.getNextNode();
		while (nextNode != null) {
			currentNode.setNextNode(prevNode);
			prevNode = currentNode;
			Node temp = nextNode.getNextNode();
			nextNode.setNextNode(currentNode);
			currentNode = nextNode;
			nextNode = temp;
		}
		sll.setRootNode(currentNode);
		return sll;
	}
	
	private Node solution(Node argCurrRootNode,int argSize,Node argPrevNode)
	{
		Node currentNode = argCurrRootNode;
		Node prevNode = argPrevNode;
		Node nextNode = currentNode.getNextNode();
		int count=1;
		while (nextNode != null && argSize>count) {
			currentNode.setNextNode(prevNode);
			prevNode = currentNode;
			Node temp = nextNode.getNextNode();
			nextNode.setNextNode(currentNode);
			currentNode = nextNode;
			nextNode = temp;
			count++;
		}
		
		if(nextNode!=null)
			solution(nextNode,3,argCurrRootNode);
		
		return currentNode;
	}

	public static void main(String[] args) {
		ReverseSingleLinkedList reverseSingleLinkedList = new ReverseSingleLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		//reverseSingleLinkedList.solution(sll1);
		sll1.displayLinkedListNodes();
		sll1.setRootNode(reverseSingleLinkedList.solution(sll1.getRootNode(), 3, null));
		sll1.displayLinkedListNodes();

	}

}
