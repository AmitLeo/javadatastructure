package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/identical-linked-lists/ Two Linked Lists are
 * identical when they have same data and arrangement of data is also same. For
 * example Linked lists a (1->2->3) and b(1->2->3) are identical. . Write a
 * function to check if the given two linked lists are identical.
 * 
 * @author amishash
 *
 */
public class IdenticalList {

	private boolean solution(SingleLinkedList sll1, SingleLinkedList sll2) {
		boolean identical = true;
		Node rootNode1 = sll1.getRootNode();
		Node rootNode2 = sll2.getRootNode();
		while (rootNode1 != null && rootNode2 != null) {
			if (rootNode1.getData() == rootNode2.getData()) {
				rootNode1 = rootNode1.getNextNode();
				rootNode2 = rootNode2.getNextNode();
			} else {
				return false;
			}
		}
		return identical;
	}

	public static void main(String argArr[]) {
		IdenticalList identicalList = new IdenticalList();
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
		
		Node node11 = new Node(10);
		Node node12 = new Node(20);
		Node node13 = new Node(30);
		Node node14 = new Node(40);
		Node node15 = new Node(50);
		Node node16 = new Node(60);
		//Node node17 = new Node(10);
		Node node17 = new Node(70);
		Node node18 = new Node(80);
		SingleLinkedList sll2 = new SingleLinkedList();

		sll2.addNode(node11);
		sll2.addNode(node12);
		sll2.addNode(node13);
		sll2.addNode(node14);
		sll2.addNode(node15);
		sll2.addNode(node16);
		sll2.addNode(node17);
		sll2.addNode(node18);
		System.out.println(identicalList.solution(sll1, sll2));
	}
}
