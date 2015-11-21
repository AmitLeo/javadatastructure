package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-
 * end-in-a-linked-list/
 * 
 * Swap Kth node from beginning with Kth node from end in a Linked List Given a
 * singly linked list, swap kth node from beginning with kth node from end.
 * Swapping of data is not allowed, only pointers should be changed. This
 * requirement may be logical in many situations where the linked list data part
 * is huge (For example student details line Name, RollNo, Address, ..etc). The
 * pointers are always fixed (4 bytes for most of the compilers).
 * 
 * @author amishash
 *
 */
public class SwapKNode {

	private int lastIndexNode;

	Node pre1;
	Node currNode;
	Node pre2;
	Node currNode2;

	private SingleLinkedList solution(SingleLinkedList argSingleLinkedList,
			int k) {
		solution(argSingleLinkedList.getRootNode(), k, 1);
		Node temp = currNode.getNextNode();
		Node temp2 = currNode2.getNextNode();
		pre1.setNextNode(currNode2);
		pre2.setNextNode(currNode);
		currNode.setNextNode(temp2);
		currNode2.setNextNode(temp);
		return argSingleLinkedList;
	}

	private void solution(Node argRootNode, int k, int length) {
		if (argRootNode == null)
			lastIndexNode = length - k;
		else {
			length++;
			solution(argRootNode.getNextNode(), k, length);
			if (length == k) {
				pre1 = argRootNode;
				currNode = argRootNode.getNextNode();
			} else if (length == lastIndexNode) {
				pre2 = argRootNode;
				currNode2 = argRootNode.getNextNode();
			}
		}
	}

	public static void main(String[] args) {

		SwapKNode swapKNode = new SwapKNode();
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
		swapKNode.solution(sll1, 3).displayLinkedListNodes();
	}
}
