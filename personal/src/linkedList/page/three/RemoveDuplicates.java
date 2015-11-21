package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/
 * 
 * @author amishash
 *
 */
public class RemoveDuplicates {
	
	private SingleLinkedList sortedSolution(SingleLinkedList argSll1) {
		Node tempNode = argSll1.getRootNode();
		while (tempNode.getNextNode() != null) {
			Node nextNode = tempNode.getNextNode();
			if (nextNode != null) {
				if (nextNode.getData() == tempNode.getData())
					tempNode.setNextNode(nextNode.getNextNode());
				else
					tempNode = tempNode.getNextNode();
			}
		}
		return argSll1;
	}
	
	public static void main(String[] args) {

		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(10);
		Node node3 = new Node(40);
		Node node4 = new Node(40);
		Node node5 = new Node(40);
		Node node6 = new Node(50);
		Node node7 = new Node(70);
		Node node8 = new Node(70);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.sortedSolution(sll1);
		sll1.displayLinkedListNodes();
	}

}
