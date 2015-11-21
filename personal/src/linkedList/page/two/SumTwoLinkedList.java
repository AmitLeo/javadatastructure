package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/sum-of-two-linked-lists/
 *
 * Add two numbers represented by linked lists | Set 2 Given two numbers
 * represented by two linked lists, write a function that returns sum list. The
 * sum list is linked list representation of addition of two input numbers. It
 * is not allowed to modify the lists. Also, not allowed to use explicit extra
 * space (Hint: Use Recursion).
 * 
 * @author amishash
 *
 */
public class SumTwoLinkedList {
	
	private Node rootNode;

	private void solution(SingleLinkedList sll1, SingleLinkedList sll2) {
		recursiveAdd(sll1.getRootNode(),sll2.getRootNode(),0);
		sll1.setRootNode(rootNode);
		sll1.displayLinkedListNodes();
	}

	private Node recursiveAdd(Node argRootNode1, Node argRootNode2, double carry) {
		if (argRootNode1.getNextNode() == null
				&& argRootNode2.getNextNode() == null) {
			rootNode= new Node(0);
			return rootNode;
			
		} else {
			Node tempNode = recursiveAdd(argRootNode1.getNextNode(),
					argRootNode2.getNextNode(), carry);
			int one=(int)argRootNode1.getData();
			int two=(int)argRootNode2.getData();
			carry = (one+ two + carry) % 10;
			Node nod=new Node( (one+ two + carry) / 10);
			tempNode.setNextNode(nod);
			return nod;
		}
	}

	public static void main(String[] args) {

		SumTwoLinkedList sumTwoLinkedList = new SumTwoLinkedList();
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		
		Node node11 = new Node(1);
		Node node12 = new Node(2);
		Node node13 = new Node(3);
		Node node14 = new Node(4);
		Node node15 = new Node(5);
		Node node16 = new Node(6);
		//Node node17 = new Node(1);
		Node node17 = new Node(7);
		Node node18 = new Node(8);
		SingleLinkedList sll2 = new SingleLinkedList();

		sll2.addNode(node11);
		sll2.addNode(node12);
		sll2.addNode(node13);
		sll2.addNode(node14);
		sll2.addNode(node15);
		sll2.addNode(node16);
		sll2.addNode(node17);
		sll2.addNode(node18);
		sumTwoLinkedList.solution(sll1,sll2);
	}

}
