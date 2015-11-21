package linkedList.page.fourth;

import java.util.HashSet;
import java.util.Set;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/write-a-c-function-to-detect-loop-in-a-linked-
 * list/
 * 
 * Given a linked list, check if the the linked list has loop or not. Below
 * diagram shows a linked list with a loop.
 * 
 * @author amishash
 *
 */

public class LoopDetector {

	public boolean solution2(SingleLinkedList sll) {
		Set<Node> uniquNode = new HashSet<Node>();
		Node node = sll.getRootNode();
		while (node != null) {
			if (uniquNode.contains(node))
				return true;
			else
				uniquNode.add(node);
			node = node.getNextNode();
		}
		return false;
	}

	public boolean solution1(SingleLinkedList sll) {
		boolean loopDetector = false;
		Node firstNode = sll.getRootNode();
		Node secondNode = firstNode.getNextNode().getNextNode();
		while (secondNode != null) {
			if (firstNode == secondNode) {
				loopDetector = true;
				break;
			}
			secondNode = secondNode.getNextNode();
			if (secondNode != null) {
				secondNode = secondNode.getNextNode();
			} else
				return loopDetector;
			firstNode = firstNode.getNextNode();
		}
		return loopDetector;
	}

	public static void main(String[] args) {
		LoopDetector loopDetector = new LoopDetector();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		Node node8 = new Node(80);

		SingleLinkedList loopedlinkedList = new SingleLinkedList();
		loopedlinkedList.addNode(node1);
		loopedlinkedList.addNode(node2);
		loopedlinkedList.addNode(node3);
		loopedlinkedList.addNode(node4);
		loopedlinkedList.addNode(node5);
		loopedlinkedList.addNode(node6);
		loopedlinkedList.addNode(node7);
		loopedlinkedList.addNode(node8);
		loopedlinkedList.addNode(node1);

		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNode(new Node(10));
		linkedList.addNode(new Node(20));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(60));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(80));
		linkedList.addNode(new Node(30));
		System.out.println(loopDetector.solution1(loopedlinkedList));
		System.out.println(loopDetector.solution1(linkedList));

		System.out.println(loopDetector.solution2(loopedlinkedList));
		System.out.println(loopDetector.solution2(linkedList));

	}

}
