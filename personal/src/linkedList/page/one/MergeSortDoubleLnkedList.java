package linkedList.page.one;

import linkedList.DoubleLinkedList;
import linkedList.DoubleNode;
import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/merge-sort-for-doubly-linked-list/
 * 
 * Merge Sort for Doubly Linked List Given a doubly linked list, write a
 * function to sort the doubly linked list in increasing order using merge sort.
 * 
 * @author amishash
 *
 */
public class MergeSortDoubleLnkedList {

	private DoubleLinkedList solution(DoubleLinkedList sll) {
		sll.setRootNode(recursiveSolution(sll.getRootNode(), 8, 0));
		return sll;
	}

	private DoubleNode recursiveSolution(DoubleNode argNode, int size,
			int counter) {
		if (1 == size) {
			return argNode;
		} else {
			counter++;
			DoubleNode nodes[] = splitNodes(argNode, size / 2);
			DoubleNode nod1 = recursiveSolution(nodes[0], size / 2, counter);
			DoubleNode nod2 = recursiveSolution(nodes[1], size / 2, counter);
			return mergeNode(nod1, nod2);
		}
	}

	private DoubleNode mergeNode(DoubleNode argNode1, DoubleNode argNode2) {
		DoubleLinkedList sll = new DoubleLinkedList();
		while (argNode1 != null || argNode2 != null) {
			if (argNode1 != null && argNode2 == null) {
				sll.addNode(argNode1);
				return sll.getRootNode();
			} else if (argNode2 != null && argNode1 == null) {
				sll.addNode(argNode2);
				return sll.getRootNode();
			}
			if (argNode1.getData() < argNode2.getData()) {
				sll.addNode(new DoubleNode(argNode1.getData()));
				argNode1 = argNode1.getNextNode();
			} else {
				sll.addNode(new DoubleNode(argNode2.getData()));
				argNode2 = argNode2.getNextNode();
			}
		}
		return sll.getRootNode();
	}

	private DoubleNode[] splitNodes(DoubleNode argNodes, int splitPoint) {
		DoubleNode rootNode = argNodes;
		splitPoint--;
		while (splitPoint > 0) {
			argNodes = argNodes.getNextNode();
			splitPoint--;
		}
		DoubleNode halves[] = new DoubleNode[2];
		halves[1] = argNodes.getNextNode();
		argNodes.setNextNode(null);
		halves[0] = rootNode;
		return halves;

	}

	public static void main(String[] args) {
		MergeSortDoubleLnkedList mergeSortDoubleLnkedList = new MergeSortDoubleLnkedList();
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		DoubleNode dn1 = new DoubleNode(90);
		DoubleNode dn2 = new DoubleNode(20);
		DoubleNode dn3 = new DoubleNode(10);
		DoubleNode dn4 = new DoubleNode(40);
		DoubleNode dn5 = new DoubleNode(15);
		DoubleNode dn6 = new DoubleNode(160);
		DoubleNode dn7 = new DoubleNode(150);
		DoubleNode dn8 = new DoubleNode(120);
		doubleLinkedList.addNode(dn1);
		doubleLinkedList.addNode(dn2);
		doubleLinkedList.addNode(dn3);
		doubleLinkedList.addNode(dn4);
		doubleLinkedList.addNode(dn5);
		doubleLinkedList.addNode(dn6);
		doubleLinkedList.addNode(dn7);
		doubleLinkedList.addNode(dn8);
		doubleLinkedList.displayLinkedListNodes();
		System.out.println("After sorting");
		mergeSortDoubleLnkedList.solution(doubleLinkedList)
				.displayLinkedListNodes();
		;

	}

}
