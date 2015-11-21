package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * http://www.geeksforgeeks.org/foldable-binary-trees/ Foldable Binary Trees
 * Question: Given a binary tree, find out if the tree can be folded or not. A
 * tree can be folded if left and right subtrees of the tree are structure wise
 * mirror image of each other. An empty tree is considered as foldable.
 *
 * @author amishash
 *
 */
public class FoldableBinaryTree {

	private boolean solution(Tree argTree) {
		return isFoldable(argTree.getRootNode().getLeftNode(), argTree
				.getRootNode().getRightNode());
	}

	private boolean isFoldable(Node argRightNode, Node argLeftNode) {
		if (argRightNode == null && argLeftNode == null) {

			return true;
		} else if (argRightNode != null && argLeftNode == null
				|| argRightNode == null && argLeftNode != null) {
			return false;
		} else {

			boolean flag1 = isFoldable(argLeftNode.getLeftNode(),
					argRightNode.getRightNode());
			boolean flag2 = isFoldable(argLeftNode.getRightNode(),
					argRightNode.getLeftNode());
			return flag1 & flag2;
		}
	}

	public static void main(String[] args) {
		FoldableBinaryTree foldableBinaryTree = new FoldableBinaryTree();
		System.out.println(foldableBinaryTree.solution(TreeFactory.getTree()));
		System.out.println(foldableBinaryTree.solution(TreeFactory
				.getHeightUnbalancedTree()));

	}

}
