package tree.five;

import linkedList.DoubleLinkedList;
import linkedList.DoubleNode;
import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/the-great-tree-list-recursion-problem/
 * 
 * @author amishash
 *
 */
public class TreeListRecursion {

	private DoubleLinkedList solution(Tree argTree) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		createList(argTree.getRootNode(), doubleLinkedList);
		doubleLinkedList.displayLinkedListNodes();
		return doubleLinkedList;
	}

	private void createList(Node argNode, DoubleLinkedList argSDoubleLinkedList) {

		if (argNode.getLeftNode() == null) {
			argSDoubleLinkedList.addNode(new DoubleNode(Integer
					.parseInt(argNode.getData())));
			return;
		} else {
			createList(argNode.getLeftNode(), argSDoubleLinkedList);
			DoubleNode doubleNode2 = new DoubleNode(Integer.parseInt(argNode
					.getData()));
			argSDoubleLinkedList.addNode(doubleNode2);
			createList(argNode.getRightNode(), argSDoubleLinkedList);
		}
	}

	public static void main(String[] args) {
		TreeListRecursion treeListRecursion = new TreeListRecursion();
		treeListRecursion.solution(TreeFactory.getNumricOrderedTree());
	}
}
