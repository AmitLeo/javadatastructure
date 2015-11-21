package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * Write a SortedMerge() function that takes two lists, each of which is sorted
 * in increasing order, and merges the two together into one list which is in
 * increasing order. SortedMerge() should return the new list. The new list
 * should be made by splicing together the nodes of the first two lists. For
 * example if the first linked list a is 5->10->15 and the other linked list b
 * is 2->3->20, then SortedMerge() should return a pointer to the head node of
 * the merged list 2->3->5->10->15->20. There are many cases to deal with:
 * either ‘a’ or ‘b’ may be empty, during processing either ‘a’ or ‘b’ may run
 * out first, and finally there’s the problem of starting the result list empty,
 * and building it up while going through ‘a’ and ‘b’.
 * 
 * @author amishash
 *
 */

public class SortedMerger {

	public SingleLinkedList solution(SingleLinkedList sll1,
			SingleLinkedList sll2) {
		Node rootNode1 = sll1.getRootNode();
		Node rootNode2 = sll2.getRootNode();

		SingleLinkedList singleLinkedList = new SingleLinkedList();
		while (rootNode1 != null || rootNode2 != null) {
			if (rootNode1 == null || rootNode2 != null
					&& rootNode1.getData() > rootNode2.getData()) {
				singleLinkedList.addNode(new Node(rootNode2.getData()));
				rootNode2 = rootNode2.getNextNode();
			} else if (rootNode2 == null || rootNode1 != null
					&& rootNode1.getData() < rootNode2.getData()) {
				singleLinkedList.addNode(new Node(rootNode1.getData()));
				rootNode1 = rootNode1.getNextNode();
			}
		}
		return singleLinkedList;
	}

	public static void main(String[] args) {
		SortedMerger sortedMerger = new SortedMerger();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		Node node11 = new Node(15);
		Node node12 = new Node(23);
		Node node13 = new Node(35);
		Node node14 = new Node(39);
		SingleLinkedList sll2 = new SingleLinkedList();
		sll2.addNode(node11);
		sll2.addNode(node12);
		sll2.addNode(node13);
		sll2.addNode(node14);
		SingleLinkedList sll3 = sortedMerger.solution(sll1, sll2);
		sll3.displayLinkedListNodes();

	}

}
