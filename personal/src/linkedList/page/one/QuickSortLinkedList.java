package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * https://www.youtube.com/watch?v=fKYjJRFTefU&index=1&list=RDfKYjJRFTefU
 * 
 * QuickSort on Singly Linked List
 * QuickSort on Singly linked list was given as an exercise. 
 * 
 * @author amishash
 *
 */

public class QuickSortLinkedList {

	private SingleLinkedList sll1=new SingleLinkedList();
	
	private void  quickSortRecur( Node argNode, Node argPivotNode){
		if(argNode.getNextNode()==argPivotNode)
			return;
		Node divider=argNode;
		Node startNode=argNode;
		while(argNode!=argPivotNode){
			if(argNode.getData()<argPivotNode.getData()){
				Node nextDivider=divider.getNextNode();
				if(divider!=argNode)
				swap(divider,argNode);
				divider=nextDivider;
			}
			argNode=argNode.getNextNode();
		}
		Node nextStart=divider.getNextNode();
		swap(divider,argPivotNode);
		quickSortRecur(nextStart, divider);
		quickSortRecur(startNode, divider);
	}
	
	public  void swap( Node argNode, Node argPivotNode){
		if(argNode==null||argPivotNode==null)
			return;
		Node argRootNode=this.sll1.getRootNode();
		Node prevNode1=null;
		Node prevNode2=null;
		Node currNode1=null;
		Node curreNode2=null;
		if(argNode==argRootNode)
		{
			currNode1=argNode;
		}
		while(argRootNode!=null){
			if(argRootNode.getNextNode().getData()==argNode.getData()){
				currNode1=argRootNode.getNextNode();
				prevNode1=argRootNode;
			}
			if(argRootNode.getNextNode().getData()==argPivotNode.getData()){
				curreNode2=argRootNode.getNextNode();
				prevNode2=argRootNode;
				break;
			}else
				argRootNode=argRootNode.getNextNode();
		}
		Node tempNode=currNode1.getNextNode();

		
		if(prevNode1!=null)
			prevNode1.setNextNode(curreNode2);
		else
			sll1.setRootNode(curreNode2);
		prevNode2.setNextNode(currNode1);
		
		currNode1.setNextNode(curreNode2.getNextNode());
		curreNode2.setNextNode(tempNode);
	}
	
	
	public static void main(String[] args) {
		QuickSortLinkedList quickSortLinkedList=new QuickSortLinkedList();
		
		Node node1 = new Node(12);
		Node node2 = new Node(15);
		Node node3 = new Node(10);
		Node node4 = new Node(11);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(2);
		Node node8 = new Node(3);
		quickSortLinkedList.sll1.addNode(node1);
		quickSortLinkedList.sll1.addNode(node2);
		quickSortLinkedList.sll1.addNode(node3);
		quickSortLinkedList.sll1.addNode(node4);
		quickSortLinkedList.sll1.addNode(node5);
		quickSortLinkedList.sll1.addNode(node6);
		quickSortLinkedList.sll1.addNode(node7);
		quickSortLinkedList.sll1.addNode(node8);
		
		quickSortLinkedList.quickSortRecur(quickSortLinkedList.sll1.getRootNode(), node8);

	}

}
