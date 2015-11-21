package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * 
 * Swap nodes in a linked list without swapping data Given a linked list and two
 * keys in it, swap nodes for two given keys. Nodes should be swapped by
 * changing links. Swapping data of nodes may be expensive in many situations
 * when data contains many fields. It may be assumed that all keys in linked
 * list are distinct.
 * 
 * http://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-
 * data/
 * 
 */
public class SwapNodesLinkedList {

	public SingleLinkedList solution(SingleLinkedList argSingleLinkedList,
			double argKey1, double argKey2) {
		Node argRootNode = argSingleLinkedList.getRootNode();
		Node prevNode1 = null;
		Node currNode1 = null;
		Node prevNode2 = null;
		Node curreNode2 = null;
		Node temp = null;
		if (argRootNode.getData() == argKey1) {
			currNode1 = argRootNode;
		}
		if (argRootNode.getData() == argKey2) {
			curreNode2 = argRootNode;
		}

		while (argRootNode.getNextNode() != null) {
			if (argRootNode.getNextNode().getData() == argKey1) {
				prevNode1 = argRootNode;
				currNode1 = argRootNode.getNextNode();
			} else if (argRootNode.getNextNode().getData() == argKey2) {
				prevNode2 = argRootNode;
				curreNode2 = argRootNode.getNextNode();
			}
			argRootNode = argRootNode.getNextNode();
		}
		if (prevNode1 == null) {
			prevNode2 = null;
			argSingleLinkedList.setRootNode(curreNode2);
		} else if (prevNode2 == null) {
			argSingleLinkedList.setRootNode(currNode1);
		} else {
			temp = curreNode2.getNextNode();
			prevNode1.setNextNode(curreNode2);
			prevNode2.setNextNode(currNode1);
		}
		curreNode2.setNextNode(currNode1.getNextNode());
		currNode1.setNextNode(temp);
		return argSingleLinkedList;
	}

	public static void main(String[] args) {

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
		SwapNodesLinkedList swapNodesLinkedList = new SwapNodesLinkedList();
		swapNodesLinkedList.solution(sll1, 4, 7).displayLinkedListNodes();
		;

	}

}
