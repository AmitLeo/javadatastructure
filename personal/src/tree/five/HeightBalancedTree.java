package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * http://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 * 
 * A tree where no leaf is much farther away from the root than any other leaf.
 * Different balancing schemes allow different definitions of “much farther” and
 * different amounts of work to keep them balanced. Consider a height-balancing
 * scheme where following conditions should be checked to determine if a binary
 * tree is balanced. An empty tree is height-balanced. A non-empty binary tree T
 * is balanced if:
 * 
 * @author amishash
 *
 */
public class HeightBalancedTree {

	private boolean flag = true;

	private boolean solution(Tree argTree) {
		recursiveChecker(argTree.getRootNode(), 0);
		return flag;
	}

	private int recursiveChecker(Node argNode, int count) {
		if (argNode == null)
			return count;
		else {
			count++;
			int leftHeight = recursiveChecker(argNode.getLeftNode(), count);
			int rightHeight = recursiveChecker(argNode.getRightNode(), count);
			if (Math.abs(leftHeight - rightHeight) > 1) {
				flag = false;
			}
			return Math.abs(leftHeight - rightHeight);
		}
	}

	public static void main(String[] args) {
		HeightBalancedTree heightBalancedTree = new HeightBalancedTree();
		System.out.println(heightBalancedTree.solution(TreeFactory
				.getHeightUnbalancedTree()));
		heightBalancedTree.flag = true;
		System.out.println(heightBalancedTree.solution(TreeFactory.getTree()));
	}

}
