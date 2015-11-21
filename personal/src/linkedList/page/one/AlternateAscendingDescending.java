package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;
import linkedList.page.three.SortedMerger;
import linkedList.page.two.ReverseSingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/rearrange-a-given-linked-list-in-place/
 * 
 * Sort a linked list that is sorted alternating ascending and descending orders?
 * Given a Linked List. The Linked List is in alternating ascending and descending orders. 
 * Sort the list efficiently.
 * 
 * @author amishash
 *
 */
public class AlternateAscendingDescending {
	
	private SingleLinkedList Solution(SingleLinkedList sll)
	{
		SingleLinkedList even=new SingleLinkedList();
		Node halves[]=new Node[2];
		Node argRootNode= sll.getRootNode();
		while(argRootNode.getNextNode()!=null)
		{
			Node tempNode=argRootNode.getNextNode();
			if(tempNode.getNextNode()!=null)
				argRootNode.setNextNode(tempNode.getNextNode());
			argRootNode=argRootNode.getNextNode();
			tempNode.setNextNode(null);
			even.addNode(tempNode);
		}
		ReverseSingleLinkedList reverseSingleLinkedList=new ReverseSingleLinkedList();
		halves[0]=reverseSingleLinkedList.solution(even).getRootNode();
		halves[1]=even.getRootNode();
		return  new SortedMerger().solution(reverseSingleLinkedList.solution(even), sll);
	}
	
	
	public static void main(String[] args) {

		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(40);
		Node node3 = new Node(53);
		Node node4 = new Node(30);
		Node node5 = new Node(67);
		Node node6 = new Node(12);
		Node node7 = new Node(89);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		
		AlternateAscendingDescending alternateAscendingDescending=new AlternateAscendingDescending();
		alternateAscendingDescending.Solution(sll1).displayLinkedListNodes();
	}

}
