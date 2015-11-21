package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
 * Delete N nodes after M nodes of a linked list Given a linked list and two
 * integers M and N. Traverse the linked list such that you retain M nodes then
 * delete next N nodes, continue the same till end of the linked list.
 * 
 * @author amishash
 *
 */
public class DeleteMNLinkedList {

	private SingleLinkedList solution(SingleLinkedList sll, int m, int n) {
		Node rootNode = sll.getRootNode();
		m--;
		while (rootNode != null && m > 0) {
			rootNode = rootNode.getNextNode();
			m--;
		}
		while (rootNode != null && n > 0) {
			rootNode.setNextNode(rootNode.getNextNode().getNextNode());
			n--;
		}
		return sll;
	}

	public static void main(String[] args) {

		DeleteMNLinkedList deleteMNLinkedList = new DeleteMNLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(12);
		Node node2 = new Node(15);
		Node node3 = new Node(10);
		Node node4 = new Node(11);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(2);
		Node node8 = new Node(3);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		deleteMNLinkedList.solution(sll1, 2, 2).displayLinkedListNodes();
		;

	}

}
