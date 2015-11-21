package linkedList.page.one;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * http://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
 * 
 * Sort a linked list of 0s, 1s and 2s Given a linked list of 0s, 1s and 2s,
 * sort it. Source: Microsoft Interview | Set 1
 * 
 * @author amishash
 *
 */
public class Sort102sLinkedList {

	private SingleLinkedList solution(SingleLinkedList argsll) {
		int count0s = 0;
		int count1s = 0;
		int count2s = 0;
		Node rootNode = argsll.getRootNode();
		while (rootNode != null) {
			switch ((int) rootNode.getData()) {
			case 0:
				count0s++;
				break;
			case 1:
				count1s++;
				break;
			case 2:
				count2s++;
				break;
			}
			rootNode = rootNode.getNextNode();
		}
		rootNode = argsll.getRootNode();
		;
		while (count0s > 0) {
			rootNode.setData(0);
			rootNode = rootNode.getNextNode();
			count0s--;
		}
		while (count1s > 0) {
			rootNode.setData(1);
			rootNode = rootNode.getNextNode();
			count1s--;
		}
		while (count2s > 0) {
			rootNode.setData(2);
			rootNode = rootNode.getNextNode();
			count2s--;
		}
		return argsll;
	}

	public static void main(String[] args) {

		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(1);
		Node node2 = new Node(1);
		Node node3 = new Node(1);
		Node node4 = new Node(0);
		Node node5 = new Node(0);
		Node node6 = new Node(2);
		Node node7 = new Node(0);
		Node node8 = new Node(2);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		sll1.addNode(node8);
		Sort102sLinkedList sort102sLinkedList = new Sort102sLinkedList();
		sort102sLinkedList.solution(sll1).displayLinkedListNodes();

	}

}
