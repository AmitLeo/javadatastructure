package linkedList.page.one;

import dp.SumEvenOddOne;
import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/maximum-sum-linked-list-two-sorted-linked-lists-common-nodes/
 * Construct a Maximum Sum Linked List out of two Sorted Linked Lists having some Common nodes
 * Given two sorted linked lists, 
 * construct a linked list that contains maximum sum path from start to end.
 *  The result list may contain nodes from both input lists. When constructing the result list, 
 *  we may switch to the other input list only at the point of intersection
 *  (which mean the two node with the same value in the lists).
 *  You are allowed to use O(1) extra space.

 * @author amishash
 *
 */
public class MaximumSumSortedLinkedList {

	
	private SingleLinkedList solution(SingleLinkedList sll1, SingleLinkedList sll2)
	{
		SingleLinkedList sl=new SingleLinkedList();
		
		Node n1=sll1.getRootNode();
		Node n2=sll2.getRootNode();

		Node prevNodeOne=null;
		Node prevNodeTwo=null;
		double sumNodeOne=0;
		double sumNodeTwo=0;
		while(n1!=null || n2!=null)
		{
			if(n1.getData()==n2.getData())
			{
				if(prevNodeOne==null)
				{
					prevNodeOne=n1;
					prevNodeTwo=n2;
					sumNodeOne=n1.getData();
					sumNodeTwo=n2.getData();
					n1=n1.getNextNode();
					n2=n2.getNextNode();
					
				}else
				{
					if(sumNodeOne>sumNodeTwo)
					{
						Node temp=n1.getNextNode();
						n1.setNextNode(null);
						sl.addNode(prevNodeOne);
						prevNodeOne=temp;
						n1=prevNodeTwo;
						n2=n2.getNextNode();
					}else
					{
						Node temp=n2.getNextNode();
						n2.setNextNode(null);
						sl.addNode(prevNodeTwo);
						prevNodeTwo=temp;
						n2=prevNodeTwo;
						n1=n1.getNextNode();
					}
				}	
			}else 
			{
				if(prevNodeOne==null){
					if(n1.getData()<n2.getData()){
						sl.addNode(n2);
						n1=n1.getNextNode();
						n2=n2.getNextNode();
					}
					else{
						sl.addNode(n1);
						n1=n1.getNextNode();	
						n2=n2.getNextNode();
					}
				}else
				{
					if(n1.getData()<n2.getData()){
						sumNodeOne=sumNodeOne+n1.getData();
						n1=n1.getNextNode();
					}
					else{
						sumNodeTwo=sumNodeTwo+n2.getData();
						n2=n2.getNextNode();
					}
				}
			}
		}
		return sl;
	}
	public static void main(String[] args) {

		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(3);
		Node node3 = new Node(30);
		Node node4 = new Node(90);
		Node node5 = new Node(120);
		Node node6 = new Node(240);
		Node node7 = new Node(151);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);

		SingleLinkedList sll2 = new SingleLinkedList();
		Node node11 = new Node(0);
		Node node21 = new Node(3);
		Node node31 = new Node(12);
		Node node41 = new Node(32);
		Node node51 = new Node(90);
		Node node61 = new Node(125);
		Node node71 = new Node(240);
		Node node81 = new Node(249);
		sll2.addNode(node11);
		sll2.addNode(node21);
		sll2.addNode(node31);
		sll2.addNode(node41);
		sll2.addNode(node51);
		sll2.addNode(node61);
		sll2.addNode(node71);
		sll2.addNode(node81);

		MaximumSumSortedLinkedList maximumSumSortedLinkedList=new MaximumSumSortedLinkedList();
		maximumSumSortedLinkedList.solution(sll1, sll2).displayLinkedListNodes();;
	}

}
