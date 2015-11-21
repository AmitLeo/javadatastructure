package linkedList.page.two;

import linkedList.Node;
import linkedList.SingleLinkedList;

/**
 * 
 * @author amishash
 *
 */
public class MergeSortLinkedList {

	public SingleLinkedList solution(SingleLinkedList sll) {
		sll.setRootNode(recursiveSolution(sll.getRootNode(), 8, 0));
		return sll;
	}

	private Node recursiveSolution(Node argNode, int size, int counter) {
		if (1 == size) {
			return argNode;
		} else {
			counter++;
			Node nodes[] = splitNodes(argNode, size / 2);
			Node nod1 = recursiveSolution(nodes[0], size / 2, counter);
			Node nod2 = recursiveSolution(nodes[1], size / 2, counter);
			return mergeNode(nod1, nod2);
		}
	}

	private Node mergeNode(Node argNode1, Node argNode2) {
		SingleLinkedList sll = new SingleLinkedList();
		while (argNode1!= null || argNode2 != null) {
			if (argNode1 != null
					&& argNode2 == null) {
				sll.addNode(argNode1);
				return sll.getRootNode();
			} else if (argNode2 != null
					&& argNode1 == null) {
				sll.addNode(argNode2);
				return sll.getRootNode();
			}
			if (argNode1.getData() < argNode2.getData()) {
				sll.addNode(new Node(argNode1.getData()));
				argNode1 = argNode1.getNextNode();
			} else {
				sll.addNode(new Node(argNode2.getData()));
				argNode2 = argNode2.getNextNode();
			}
		}
		return sll.getRootNode();
	}

	private Node[] splitNodes(Node argNodes, int splitPoint) {
		Node rootNode = argNodes;
		splitPoint--;
		while ( splitPoint > 0) {
			argNodes = argNodes.getNextNode();
			splitPoint--;
		}
		Node halves[] = new Node[2];
		halves[1] = argNodes.getNextNode();
		argNodes.setNextNode(null);
		halves[0] = rootNode;
		return halves;

	}

	public static void main(String[] args) {

		MergeSortLinkedList mergeSortLinkedList = new MergeSortLinkedList();
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
		mergeSortLinkedList.solution(sll1).displayLinkedListNodes();;

	}

}
