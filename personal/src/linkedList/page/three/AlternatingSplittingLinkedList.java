package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/alternating-split-of-a-given-singly-linked-list/
 * 
 * Write a function AlternatingSplit() that takes one list and divides up its
 * nodes to make two smaller lists ‘a’ and ‘b’. The sublists should be made from
 * alternating elements in the original list. So if the original list is
 * 0->1->0->1->0->1 then one sublist should be 0->0->0 and the other should be
 * 1->1->1.
 * 
 * @author amishash
 *
 */
public class AlternatingSplittingLinkedList {

	private void solution(SingleLinkedList sll) {

		Node argRooNode=sll.getRootNode();
		SingleLinkedList dummy=new SingleLinkedList();
		while(argRooNode.getNextNode()!=null && argRooNode.getNextNode().getNextNode()!=null){
			Node tempNode=argRooNode.getNextNode().getNextNode();
			dummy.addNode(new Node(argRooNode.getNextNode().getData()));
			argRooNode.setNextNode(tempNode);
			argRooNode=tempNode;
		}
		dummy.displayLinkedListNodes();
		sll.displayLinkedListNodes();
	}

	public static void main(String[] args) {
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
		AlternatingSplittingLinkedList alternatingSplittingLinkedList = new AlternatingSplittingLinkedList();
		alternatingSplittingLinkedList.solution(sll1);
	}

}
