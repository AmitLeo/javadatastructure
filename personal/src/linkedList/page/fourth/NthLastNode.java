package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;

public class NthLastNode {

	private Node solution(SingleLinkedList linkedList, int elemNumber) {
		Node tempNode = linkedList.getRootNode();
		Node actualNode = linkedList.getRootNode();
		for (int i = 0; i < elemNumber; i++)
			actualNode = actualNode.getNextNode();

		while (actualNode != null) {
			actualNode = actualNode.getNextNode();
			tempNode = tempNode.getNextNode();
		}

		return tempNode;
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.addNode(new Node(10));
		linkedList.addNode(new Node(20));
		linkedList.addNode(new Node(30));
		linkedList.addNode(new Node(40));
		linkedList.addNode(new Node(50));
		linkedList.addNode(new Node(60));
		linkedList.addNode(new Node(70));
		linkedList.addNode(new Node(80));
		linkedList.addNode(new Node(90));
		NthLastNode nthLastNode = new NthLastNode();
		System.out.println(nthLastNode.solution(linkedList, 3).getData());
	}

}
