package linkedList.page.three;

import java.util.HashSet;
import java.util.Set;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-
 * of-two-linked-lists/
 * 
 * Write a function to get the intersection point of two Linked Lists. There are
 * two singly linked lists in a system. By some programming error the end node
 * of one of the linked list got linked into the second list, forming a inverted
 * Y shaped list.
 * 
 * Write a program to get the point where two linked list merge.
 * 
 * @author amishash
 *
 */
public class IntersectionPoint {

	private void solution(SingleLinkedList sll1, SingleLinkedList sll2) {
		Set<Node> address = new HashSet<Node>();
		Node rootNode = sll1.getRootNode();

		while (rootNode != null) {
			address.add(rootNode);
			rootNode = rootNode.getNextNode();
		}
		rootNode = sll2.getRootNode();
		while (rootNode != null) {
			int size = address.size();
			address.add(rootNode);
			if (size == address.size()) {
				System.out.println(rootNode.getData());
				break;
			}
			rootNode = rootNode.getNextNode();

		}

	}

	public static void main(String[] args) {

		IntersectionPoint IntersectionPoint = new IntersectionPoint();

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

		SingleLinkedList sll2 = new SingleLinkedList();
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll2.addNode(node4);
		sll2.addNode(node7);
		sll2.addNode(node8);

		IntersectionPoint.solution(sll1, sll2);

	}

}
