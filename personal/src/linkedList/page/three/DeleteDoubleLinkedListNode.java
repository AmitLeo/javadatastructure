package linkedList.page.three;

import linkedList.DoubleLinkedList;
import linkedList.DoubleNode;

/**
 * http://www.geeksforgeeks.org/delete-a-node-in-a-doubly-linked-list/
 * Delete a node in a Doubly Linked List
 * 
 * Write a function to delete a given node in a doubly linked list.
 * 
 * @author amishash
 *
 */
public class DeleteDoubleLinkedListNode {
	
	private void solution(DoubleLinkedList argDoubleLinkedList, double argData)
	{
		DoubleNode tempNode=argDoubleLinkedList.getRootNode();
		while(tempNode.getNextNode()!=null)
		{
			tempNode=tempNode.getNextNode();
			if(tempNode.getData()==argData)
				tempNode.getPreviousNode().setNextNode(tempNode.getNextNode());
		}
	}

	public static void main(String[] args) {

		DeleteDoubleLinkedListNode deleteDoubleLinkedListNode=new DeleteDoubleLinkedListNode();
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		DoubleNode dn1=new DoubleNode(10);
		DoubleNode dn2=new DoubleNode(20);
		DoubleNode dn3=new DoubleNode(30);
		DoubleNode dn4=new DoubleNode(40);
		DoubleNode dn5=new DoubleNode(50);
		DoubleNode dn6=new DoubleNode(60);
		doubleLinkedList.addNode(dn1);
		doubleLinkedList.addNode(dn2);
		doubleLinkedList.addNode(dn3);
		doubleLinkedList.addNode(dn4);
		doubleLinkedList.addNode(dn5);
		doubleLinkedList.addNode(dn6);
		doubleLinkedList.displayLinkedListNodes();
		deleteDoubleLinkedListNode.solution(doubleLinkedList,20);
		doubleLinkedList.displayLinkedListNodes();
	}

}
