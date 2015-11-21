package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * Given a binary tree, print out all of its root-to-leaf paths one per line.
 * http://www.geeksforgeeks.org/given-a-binary-tree-print-all-root-to-leaf-paths/
 * @author amishash
 *
 */
public class RootToLeaf {

	private void solution(Tree argTree) {
		printPaths(argTree.getRootNode(), argTree.getRootNode().getData());
	}

	private void printPaths(Node argRootNode, String sb) {
		if (argRootNode.getRightNode() == null
				&& argRootNode.getLeftNode() == null)
			System.out.println(sb.toString());
		else {
			if (argRootNode.getLeftNode() == null)
				System.out.println(sb.toString());
			else
				printPaths(argRootNode.getLeftNode(), sb
						+ argRootNode.getLeftNode().getData());
			if (argRootNode.getRightNode() == null)
				System.out.println(sb.toString());
			else
				printPaths(argRootNode.getRightNode(), sb
						+ argRootNode.getRightNode().getData());
		}
	}

	public static void main(String[] args) {
		RootToLeaf rootToLeaf = new RootToLeaf();
		rootToLeaf.solution(TreeFactory.getTree());
	}

}
