package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
 * Root to leaf path sum equal to a given number Given a binary tree and a
 * number, return true if the tree has a root-to-leaf path such that adding up
 * all the values along the path equals the given number. Return false if no
 * such path can be found.
 * 
 * @author amishash
 *
 */
public class RootToLeafPathSum {

	private boolean solution(Tree argTree, int argSum) {
		return isPathExistsSum(argTree.getRootNode(), argSum, 0);
	}

	private boolean isPathExistsSum(Node argRootNode, int sum, int count) {
		if (argRootNode == null) {
			if (sum == count)
				return true;
			else
				return false;
		} else {
			count = count + Integer.parseInt(argRootNode.getData());
			boolean flag1 = isPathExistsSum(argRootNode.getLeftNode(), sum,
					count);
			boolean flag2 = isPathExistsSum(argRootNode.getRightNode(), sum,
					count);
			return flag1 | flag2;
		}

	}

	public static void main(String[] args) {
		RootToLeafPathSum rootToLeafPathSum = new RootToLeafPathSum();
		System.out.println(rootToLeafPathSum.solution(TreeFactory.getNumricTree(), 14));
		System.out.println(rootToLeafPathSum.solution(TreeFactory.getNumricTree(), 13));
	}

}
