package tree.fourth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-
 * binary-tree/
 * 
 * 
 * Check if a binary tree is subtree of another binary tree | Set 1 Given two
 * binary trees, check if the first tree is subtree of the second one. A subtree
 * of a tree T is a tree S consisting of a node in T and all of its descendants
 * in T. The subtree corresponding to the root node is the entire tree; the
 * subtree corresponding to any other node is called a proper subtree. For
 * example, in the following case, tree S is a subtree of tree T.
 * 
 * @author amishash
 *
 */
public class SubTree {

	boolean flag = true;
	Node tempNode;

	private boolean solution(Tree argBigTree, Tree argSmallTree) {
		findRootNode(argBigTree.getRootNode(), argSmallTree.getRootNode());
		isIdentical(tempNode, argSmallTree.getRootNode());
		return flag;
	}

	private void isIdentical(Node argNode1, Node argNode2) {
		if (argNode1 == null && argNode2 == null)
			return;
		else {
			if (argNode1 != null && argNode2 != null
					&& argNode1.getData() == argNode2.getData()) {
				isIdentical(argNode1.getLeftNode(), argNode2.getLeftNode());
				isIdentical(argNode1.getRightNode(), argNode2.getRightNode());
			} else
				flag = false;
		}
	}

	private void findRootNode(Node argBigTree, Node argSmallTree) {
		if (argBigTree == null) {
			return;
		} else if (argBigTree.getData()
				.equalsIgnoreCase(argSmallTree.getData())) {
			this.tempNode = argBigTree;
		} else {
			findRootNode(argBigTree.getLeftNode(), argSmallTree);
			findRootNode(argBigTree.getRightNode(), argSmallTree);
		}
	}

	public static void main(String[] args) {
		SubTree subTree = new SubTree();
		System.out.println(subTree.solution(TreeFactory.getTree(),
				TreeFactory.subTree()));
	}

}
