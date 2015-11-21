package linkedList.page.two;


import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * http://www.geeksforgeeks.org/delete-nodes-which-have-a-greater-value-on-right
 * -side/ Delete nodes which have a greater value on right side Given a singly
 * linked list, remove all the nodes which have a greater value on right side.
 * Examples: a) The list 12->15->10->11->5->6->2->3->NULL should be changed to
 * 15->11->6->3->NULL. Note that 12, 10, 5 and 2 have been deleted because there
 * is a greater value on the right side. When we examine 12, we see that after
 * 12 there is one node with value greater than 12 (i.e. 15), so we delete 12.
 * When we examine 15, we find no node after 15 that has value greater than 15
 * so we keep this node. When we go like this, we get 15->6->3
 * 
 * b) The list 10->20->30->40->50->60->NULL should be changed to 60->NULL. Note
 * that 10, 20, 30, 40 and 50 have been deleted because they all have a greater
 * value on the right side. c) The list 60->50->40->30->20->10->NULL should not
 * be changed.
 * 
 * 
 * @author amishash
 *
 */
public class DeleteNodeGreater {

	private Node reverseLinkedList(Node argRootNode) {
		Node currentNode = argRootNode;
		Node prevNode = null;
		Node nextNode = currentNode.getNextNode();
		while (nextNode != null) {
			currentNode.setNextNode(prevNode);
			prevNode = currentNode;
			Node temp = nextNode.getNextNode();
			nextNode.setNextNode(currentNode);
			currentNode = nextNode;
			nextNode = temp;
		}
		return currentNode;
	}

	private SingleLinkedList solution(SingleLinkedList sll) {
		sll.setRootNode(reverseLinkedList(sll.getRootNode()));
		Node currentNode = sll.getRootNode();
		while (currentNode.getNextNode() != null) {
			if (currentNode.getData() > currentNode.getNextNode().getData())
				currentNode
						.setNextNode(currentNode.getNextNode().getNextNode());
			else
				currentNode = currentNode.getNextNode();
		}
		sll.setRootNode(reverseLinkedList(sll.getRootNode()));
		return sll;
	}

	public static void main(String[] args) {
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
		DeleteNodeGreater deleteNodeGreater = new DeleteNodeGreater();
		deleteNodeGreater.solution(sll1).displayLinkedListNodes();
		;

	}

}
