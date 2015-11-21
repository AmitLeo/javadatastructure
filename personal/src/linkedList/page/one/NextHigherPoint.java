package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;
import linkedList.page.two.MergeSortLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/point-to-next-higher-value-node-in-a-linked-list
 * -with-an-arbitrary-pointer/
 * 
 * Point to next higher value node in a linked list with an arbitrary pointer
 * Given singly linked list with every node having an additional “arbitrary”
 * pointer that currently points to NULL. Need to make the “arbitrary” pointer
 * point to the next higher value node.
 * 
 * @author amishash
 *
 */
public class NextHigherPoint {

	private SingleLinkedList solution(SingleLinkedList arLinkedList) {
		MergeSortLinkedList mergeSortLinkedList = new MergeSortLinkedList();
		arLinkedList = mergeSortLinkedList.solution(arLinkedList);
		return arLinkedList;
	}

	public static void main(String[] args) {

		NextHigherPoint nextHigherPoint = new NextHigherPoint();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(11);
		Node node2 = new Node(2);
		Node node3 = new Node(30);
		Node node4 = new Node(1);
		Node node5 = new Node(100);
		Node node6 = new Node(61);
		Node node7 = new Node(57);
		Node node8 = new Node(83);
		Node node9 = new Node(19);

		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		sll1.addNode(node9);
		nextHigherPoint.solution(sll1).displayLinkedListNodes();

	}

}
