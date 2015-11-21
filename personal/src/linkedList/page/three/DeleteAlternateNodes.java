package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/delete-alternate-nodes-of-a-linked-list/
 * 
 * Given a Singly Linked List, starting from the second node delete all
 * alternate nodes of it. For example, if the given linked list is 1->2->3->4->5
 * then your function should convert it to 1->3->5, and if the given linked list
 * is 1->2->3->4 then convert it to 1->3.
 * 
 * @author amishash
 *
 */
public class DeleteAlternateNodes {

	private SingleLinkedList solution(SingleLinkedList sll) {
		Node tempRootNode = sll.getRootNode();
		while (tempRootNode.getNextNode().getNextNode() != null) {
			Node temp = tempRootNode.getNextNode().getNextNode();
			tempRootNode.setNextNode(tempRootNode.getNextNode().getNextNode());
			tempRootNode = temp;
		}
		return sll;
	}

	public static void main(String[] args) {
		DeleteAlternateNodes deleteAlternateNodes = new DeleteAlternateNodes();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll1.addNode(node6, true);
		sll1.addNode(node2, true);
		sll1.addNode(node1, true);
		sll1.addNode(node7, true);
		sll1.addNode(node3, true);
		sll1.addNode(node8, true);
		sll1.addNode(node4, true);
		sll1.addNode(node5, true);
		sll1.displayLinkedListNodes();
		deleteAlternateNodes.solution(sll1).displayLinkedListNodes();
	}
}
