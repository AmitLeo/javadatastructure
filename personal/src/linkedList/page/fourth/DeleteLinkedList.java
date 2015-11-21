package linkedList.page.fourth;

import linkedList.Node;
import linkedList.SingleLinkedList;
/**
 * 
 * @author amishash
 *
 */
public class DeleteLinkedList {

	public void solution(SingleLinkedList linkedList) {
		Node currentNode=linkedList.getRootNode();
		while(currentNode!=null)
		{	
			Node nextNode=currentNode.getNextNode();
			currentNode.setNextNode(nextNode);
		}
		System.out.println(linkedList.getRootNode().getData());
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

		DeleteLinkedList deleteLinkedList = new DeleteLinkedList();
		deleteLinkedList.solution(linkedList);
		System.out.println(deleteLinkedList == null);
		linkedList.displayLinkedListNodes();
	}

}
