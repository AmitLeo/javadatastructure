package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/given-linked-list-reverse-alternate-nodes-append
 * -end/
 * 
 * Given a linked list, reverse alternate nodes and append at the end Given a
 * linked list, reverse alternate nodes and append them to end of list. Extra
 * allowed space is O(1)
 * 
 * @author amishash
 *
 */
public class AlternateNodesAppednEnd {

	Node rootN = null;

	private SingleLinkedList solution(SingleLinkedList sll) {
		Node rootNode = sll.getRootNode();
		SingleLinkedList singleLinkedList = new SingleLinkedList();

		while (rootNode != null) {
			rootNode = rootNode.getNextNode();
			singleLinkedList.addNode(new Node(rootNode.getData()));
			rootNode.setNextNode(rootNode.getNextNode());
			rootNode = rootNode.getNextNode();
		}
		recursiveReverse(singleLinkedList.getRootNode());
		sll.addNode(rootN);
		return sll;
	}

	private Node recursiveReverse(Node argNode) {
		if (argNode.getNextNode() == null) {
			if (rootN == null)
				rootN = argNode;
			return argNode;
		} else {
			Node temp = recursiveReverse(argNode.getNextNode());
			temp.setNextNode(argNode);
			return argNode;
		}
	}

	public static void main(String[] args) {
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
		AlternateNodesAppednEnd alternateNodesAppednEnd = new AlternateNodesAppednEnd();
		alternateNodesAppednEnd.solution(sll1).displayLinkedListNodes();
	}

}
