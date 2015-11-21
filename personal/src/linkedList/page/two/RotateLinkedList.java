package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/rotate-a-linked-list/ Given a singly linked
 * list, rotate the linked list counter-clockwise by k nodes. Where k is a given
 * positive integer. For example, if the given linked list is
 * 10->20->30->40->50->60 and k is 4, the list should be modified to
 * 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in
 * linked list. To rotate the linked list, we need to change next of kth node to
 * NULL, next of last node to previous head node, and finally change head to
 * (k+1)th node. So we need to get hold of three nodes: kth node, (k+1)th node
 * and last node. Traverse the list from beginning and stop at kth node. Store
 * pointer to kth node. We can get (k+1)th node using kthNode->next. Keep
 * traversing till end and store pointer to last node also. Finally, change
 * pointers as stated above.
 * 
 * @author amishash
 *
 */
public class RotateLinkedList {

	private SingleLinkedList rotateLinkedListCounter(SingleLinkedList sll,
			int size) {
		Node rootNode = sll.getRootNode();
		Node startingNode = rootNode;
		size--;
		while (startingNode.getNextNode() != null) {

			if (size == 0) {
				Node temp = startingNode.getNextNode();
				startingNode.setNextNode(null);
				startingNode = temp;
				sll.setRootNode(startingNode);

			} else {
				startingNode = startingNode.getNextNode();
			}
			size--;
		}
		startingNode.setNextNode(rootNode);
		return sll;
	}

	public static void main(String[] args) {
		RotateLinkedList rll = new RotateLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		rll.rotateLinkedListCounter(sll1, 4).displayLinkedListNodes();
		;
	}

}
