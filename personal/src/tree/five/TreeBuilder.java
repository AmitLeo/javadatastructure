package tree.five;

import tree.Node;
import tree.Tree;
import tree.sixth.TreeTraversals;

/**
 * 
 * http://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-
 * traversal/
 * 
 * Let us consider the below traversals: Inorder sequence: D B E A F C Preorder
 * sequence: A B D E C F
 * 
 * @author amishash
 *
 */

public class TreeBuilder {

	private Tree getSolution(String argInorder, String preOrder) {
		Tree tree = new Tree();
		tree.setRootNode(generateTree(argInorder, preOrder));
		return tree;
	}

	private String[] splitter(String argInOrder, String argPreOrder) {
		String temp[] = new String[3];
		for (int i = 0; i < argInOrder.length(); i++) {
			if (argPreOrder.charAt(0) == argInOrder.charAt(i)) {
				temp[0] = "" + argInOrder.substring(0, i );
				temp[1] = "" + argInOrder.substring(i + 1, argInOrder.length());
				temp[2] = "" + argPreOrder.charAt(0);
				return temp;
			}
		}
		return temp;
	}

	private Node generateTree(String inorder, String preOrder) {
		if (inorder.length() == 1 ) {
			preOrder=preOrder.substring(1);
			return new Node("" + inorder.charAt(0));
		} else if (inorder == null ||inorder.length()==0|| preOrder.length()==0) {
			return null;
		}
		String[] node = splitter(inorder, preOrder);
		Node root = new Node(node[2]);
		preOrder=preOrder.substring(1);
		root.setLeftNode(generateTree(node[0], preOrder.substring(0, node[0].length())));
		root.setRightNode(generateTree(node[1], preOrder.substring(node[0].length())));
		return root;
	}

	public static void main(String[] args) {

		TreeBuilder tb = new TreeBuilder();
		Tree tree=tb.getSolution("DBEAFC", "ABDECF");
		TreeTraversals tt=new TreeTraversals();
		tt.inOrder(tree.getRootNode());
		System.out.println();
		tt.postOrder(tree.getRootNode());
		System.out.println();
		tt.preOrder(tree.getRootNode());

	}

}
