package tree.sixth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * Write a C Program to Find the Maximum Depth or Height of a Tree
 * 
 * @author amishash
 *
 */
public class TreeHeight {

	private int solution(Tree argTree) {
		return treeHeight(argTree.getRootNode(), 0);
	}

	private int treeHeight(Node argRootNode, int argHeight) {
		if (argRootNode == null)
			return argHeight;
		else {
			argHeight++;
			return Math.max(treeHeight(argRootNode.getLeftNode(), argHeight),
					treeHeight(argRootNode.getRightNode(), argHeight));
		}
	}

	public static void main(String[] args) {
		TreeHeight treeHeight = new TreeHeight();
		System.out.println(treeHeight.solution(TreeFactory.getTree()));
		System.out.println(treeHeight.solution(TreeFactory.getBigTree()));
	}
}
