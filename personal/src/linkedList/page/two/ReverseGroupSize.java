package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/ Reverse
 * a Linked List in groups of given size Given a linked list, write a function
 * to reverse every k nodes (where k is an input to the function).
 * 
 * @author amishash
 *
 */
public class ReverseGroupSize {

	private int size;
	private Node rootNode;
	private Node prevNode;
	private Node nextNode;

	private SingleLinkedList solution(SingleLinkedList argSll, int argSize) {
		size = argSize;
		Node tempNode = argSll.getRootNode();
		getReversePatch(tempNode, 0);
		argSll.setRootNode(rootNode);
		return argSll;
	}

	private Node getReversePatch(Node argRootNode, int counter) {
		if (argRootNode.getNextNode() == null) {
			return argRootNode;
		} else if (counter == size) {
			if (rootNode == null)
				rootNode = argRootNode;
			else
				prevNode.setNextNode(argRootNode);
			
			nextNode = argRootNode.getNextNode();
			return argRootNode;
		} else {
			counter++;
			Node tempNode = getReversePatch(argRootNode.getNextNode(), counter);
			tempNode.setNextNode(argRootNode);
			if (counter == 1) {
				prevNode=argRootNode;
				argRootNode.setNextNode(nextNode);
				if(nextNode!=null)
				tempNode.setNextNode(getReversePatch(nextNode, 0));
			} else {
				argRootNode.setNextNode(null);
			}
			return argRootNode;
		}
	}

	public static void main(String[] args) {
		ReverseGroupSize reverseGroupSize = new ReverseGroupSize();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		Node node9 = new Node(90);
		
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);

		sll1.addNode(node9);
		reverseGroupSize.solution(sll1, 2).displayLinkedListNodes();
		;

	}

}
