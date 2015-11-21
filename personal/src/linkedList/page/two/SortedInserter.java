package linkedList.page.two;

import linkedList.CircularLinkedList;
import linkedList.Node;

/**
 * 
 * 
 * http://www.geeksforgeeks.org/sorted-insert-for-circular-linked-list/
 * 
 * Difficulty Level: Rookie
 * Write a C function to insert a new value in a sorted Circular Linked List (CLL). 
 * For example, if the input CLL is following.

 * @author amishash
 *
 */

public class SortedInserter {

	public CircularLinkedList solution(CircularLinkedList cl, double data)
	{
		Node rootNode=cl.getRootNode();
		if(rootNode.getData()==data)
		{
			rootNode=rootNode.getNextNode();
				while(data!=rootNode.getData())
					rootNode=rootNode.getNextNode();
				
				Node node=new Node(data);
				node.setNextNode(cl.getRootNode());
				rootNode.setNextNode(node);
				cl.setRootNode(node);
			
		}else 
		{

			Node prevNode=rootNode;
			while(rootNode.getNextNode()!=null)
			{
				if(rootNode.getData()<=data)
				{
					Node node=new Node(data);
					node.setNextNode(rootNode.getNextNode());
					rootNode.setNextNode(node);
					break;
				}
				prevNode=rootNode;
				rootNode=rootNode.getNextNode();
			}
		}
		return cl;
	}

	public static void main(String[] args) {
		SortedInserter SortedInserter=new SortedInserter();
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		circularLinkedList.addNode(node1);
		circularLinkedList.addNode(node2);
		circularLinkedList.addNode(node3);
		circularLinkedList.addNode(node4);
		circularLinkedList.print();

		SortedInserter.solution(circularLinkedList, 25);
		circularLinkedList.print();

		

	}

}
