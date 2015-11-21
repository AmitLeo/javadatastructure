package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * Program to count leaf nodes in a binary tree
 * 
 * @author amishash
 *
 */
public class LeafNodeCount {

	private int leafNodeCount = 0;

	private void resetLeafNodeCunter() {
		this.leafNodeCount = 0;
	}

	private int solution(Tree argTree) {
		leafNodeCount(argTree.getRootNode());
		return leafNodeCount;
	}

	private void leafNodeCount(Node argRootNode) {
		if (argRootNode.getLeftNode() == null
				&& argRootNode.getRightNode() == null)
			leafNodeCount++;
		else {
			if (argRootNode.getLeftNode() != null)
				leafNodeCount(argRootNode.getLeftNode());

			if (argRootNode.getRightNode() != null)
				leafNodeCount(argRootNode.getRightNode());
		}
	}

	public static void main(String[] args) {
		LeafNodeCount leafNodeCount = new LeafNodeCount();
		System.out.println(leafNodeCount.solution(TreeFactory.getTree()));
		leafNodeCount.resetLeafNodeCunter();
		System.out.println(leafNodeCount.solution(TreeFactory.getBigTree()));

	}
}
