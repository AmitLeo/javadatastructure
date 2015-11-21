package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;
import tree.sixth.TreeTraversals;

/**
 * http://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-
 * into-its-mirror-tree/
 * 
 * Write an Efficient C Function to Convert a Binary Tree into its Mirror Tree
 * Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with
 * left and right children of all non-leaf nodes interchanged.
 * 
 * @author amishash
 */
public class MirrorTree {

	private Tree solution(Tree argTree) {
		recursiveMirror(argTree.getRootNode());
		return argTree;
	}

	private void swapNodes(Node argRootNode) {
		Node tempNode = argRootNode.getLeftNode();
		argRootNode.setLeftNode(argRootNode.getRightNode());
		argRootNode.setRightNode(tempNode);
	}

	private void recursiveMirror(Node argRootNode) {
		if (argRootNode == null)
			return;
		else {
			recursiveMirror(argRootNode.getLeftNode());
			recursiveMirror(argRootNode.getRightNode());
			swapNodes(argRootNode);
		}
	}

	public static void main(String[] args) {
		TreeTraversals traversal = new TreeTraversals();
		MirrorTree mirrorTree = new MirrorTree();
		traversal.inOrder(TreeFactory.getTree().getRootNode());
		Tree tree = mirrorTree.solution(TreeFactory.getTree());
		System.out.println();
		System.out.println("Mirror Image");
		traversal.inOrder(tree.getRootNode());
	}

}
