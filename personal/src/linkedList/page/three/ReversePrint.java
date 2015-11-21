package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * Given a linked list, print reverse of it using a recursive function. For
 * example, if the given linked list is 1->2->3->4, then output should be
 * 4->3->2->1.
 * 
 * http://www.geeksforgeeks.org/write-a-recursive-function-to-print-reverse-of-a
 * -linked-list/
 * 
 * @author amishash
 *
 */
public class ReversePrint {

	private void solution(SingleLinkedList sll) {
		recursivePrint(sll.getRootNode());
	}

	private void recursivePrint(Node argRootNode) {
		if (argRootNode == null)
			return;
		else
			recursivePrint(argRootNode.getNextNode());
		System.out.println(argRootNode.getData());
		return;
	}

	public static void main(String[] args) {
		ReversePrint reversePrint = new ReversePrint();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node7 = new Node(70);
		Node node8 = new Node(80);
		sll1.addNode(node2, true);
		sll1.addNode(node1, true);
		sll1.addNode(node7, true);
		sll1.addNode(node3, true);
		sll1.addNode(node8, true);
		sll1.addNode(node4, true);
		sll1.addNode(node5, true);
		reversePrint.solution(sll1);
	}

}
