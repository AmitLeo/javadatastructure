package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/given-only-a-pointer-to-a-node-to-be-deleted-in-a-singly-linked-list-how-do-you-delete-it/
 *Given only a pointer to a node to be deleted in a singly linked list, how do you delete it?
 *A simple solution is to traverse the linked list until you find the node you want to delete. 
 *But this solution requires pointer to the head node which contradicts the problem statement.
 *Fast solution is to copy the data from the next node to the node to be deleted and delete the next node. Something like following.
 * @author amishash
 *
 */
public class DeleteNodeGiven {
	
	private SingleLinkedList deleteNode(SingleLinkedList sll,Node argToDeletedNode)
	{
		argToDeletedNode.setData(argToDeletedNode.getNextNode().getData());
		argToDeletedNode.setNextNode(argToDeletedNode.getNextNode().getNextNode());
		return sll;
	}

	public static void main(String[] args) {
		DeleteNodeGiven deleteNodeGiven=new DeleteNodeGiven();
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
		deleteNodeGiven.deleteNode(sll1, node2);
		sll1.displayLinkedListNodes();
		

	}

}
