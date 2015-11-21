package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/rearrange-a-given-linked-list-in-place/
 * 
 * 
 * Rearrange a given linked list in-place. Given a singly linked list L0 -> L1
 * -> … -> Ln-1 -> Ln. Rearrange the nodes in the list so that the new formed
 * list is : L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 …
 * 
 * You are required do this in-place without altering the nodes’ values.
 * 
 * @author amishash
 *
 */
public class RearrangeLinkedList {

	Node parentNode;

	private SingleLinkedList solution(SingleLinkedList sll) {
		solution(sll.getRootNode(), sll.getRootNode());
		sll.setRootNode(parentNode);
		return sll;
	}

	private Node solution(Node argNode1, Node argNode2) {
		if (argNode1.getNextNode() == null) {
			argNode1.setNextNode(argNode2);
			parentNode = argNode1;
			return argNode2;
		} else {
			Node tempNode = solution(argNode1.getNextNode(), argNode2);
			if (tempNode != null) {
				Node nextNode = tempNode.getNextNode();
				tempNode.setNextNode(argNode1);
				if (nextNode.getNextNode().getData() == argNode1.getData()) {
					argNode1.setNextNode(nextNode);
					nextNode.setNextNode(null);
					nextNode = null;
				} else
					argNode1.setNextNode(nextNode);
				return nextNode;
			} else
				return null;
		}
	}

	public static void main(String[] args) {
		RearrangeLinkedList rearrangeLinkedList = new RearrangeLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		sll1.addNode(node9);
		rearrangeLinkedList.solution(sll1).displayLinkedListNodes();
		;

	}
}
