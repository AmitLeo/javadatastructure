package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/merge-a-linked-list-into-another-linked-list-at-
 * alternate-positions/ Merge a linked list into another linked list at
 * alternate positions Given two linked lists, insert nodes of second list into
 * first list at alternate positions of first list. For example, if first list
 * is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should
 * become 5->12->7->10->17->2->13->4->11->6 and second list should become empty.
 * The nodes of second list should only be inserted when there are positions
 * available. For example, if the first list is 1->2->3 and second list is
 * 4->5->6->7->8, then first list should become 1->4->2->5->3->6 and second list
 * to 7->8. Use of extra space is not allowed (Not allowed to create additional
 * nodes), i.e., insertion must be done in-place. Expected time complexity is
 * O(n) where n is number of nodes in first list. The idea is to run a loop
 * while there are available positions in first loop and insert nodes of second
 * list by changing pointers. Following are C and Java implementations of this
 * approach.
 * 
 * @author amishash
 *
 */
public class MergeAlternativePosition {

	private SingleLinkedList solution(SingleLinkedList sll,
			SingleLinkedList sll2) {
		solution(sll.getRootNode(), sll2.getRootNode());
		return sll;
	}

	private void solution(Node argRootNode1, Node argRootNode2) {
		while (argRootNode1 != null) {
			Node tempNode = argRootNode1.getNextNode();
			Node tempNode2 = argRootNode2.getNextNode();
			argRootNode2.setNextNode(tempNode);
			argRootNode1.setNextNode(argRootNode2);
			argRootNode1 = tempNode;
			argRootNode2 = tempNode2;
		}
	}

	public static void main(String[] args) {
		MergeAlternativePosition mergeAlternativePosition = new MergeAlternativePosition();
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

		SingleLinkedList sll2 = new SingleLinkedList();
		Node node11 = new Node(112);
		Node node21 = new Node(115);
		Node node31 = new Node(110);
		Node node41 = new Node(111);
		Node node51 = new Node(15);
		Node node61 = new Node(16);
		Node node71 = new Node(12);
		Node node81 = new Node(13);
		sll2.addNode(node11);
		sll2.addNode(node21);
		sll2.addNode(node31);
		sll2.addNode(node41);
		sll2.addNode(node51);
		sll2.addNode(node61);
		sll2.addNode(node71);
		sll2.addNode(node81);
		mergeAlternativePosition.solution(sll1, sll2).displayLinkedListNodes();
	}

}
