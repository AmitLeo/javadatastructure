package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree
 * / Given a binary tree, write a function that returns true if the tree
 * satisfies below property. For every node, data value must be equal to sum of
 * data values in left and right children. Consider data value as 0 for NULL
 * children. Below tree is an example
 * 
 * @author amishash
 *
 */
public class ChildrenSumProperty {
	private boolean flag = true;

	private boolean solution(Tree tree) {
		checkRecursively(tree.getRootNode());
		return flag;
	}

	private void checkRecursively(Node argRootNode) {
		int left = 0;
		int right = 0;
		if (argRootNode.getLeftNode() != null)
			left = Integer.parseInt(argRootNode.getLeftNode().getData());
		if (argRootNode.getRightNode() != null)
			right = Integer.parseInt(argRootNode.getRightNode().getData());
		if (left + right == 0)
			return;
		if (Integer.parseInt(argRootNode.getData()) != left + right) {
			flag = false;
			return;
		} else {
			checkRecursively(argRootNode.getLeftNode());
			checkRecursively(argRootNode.getRightNode());
		}

	}

	public static void main(String[] args) {
		ChildrenSumProperty childrenSumProperty = new ChildrenSumProperty();
		System.out.println(childrenSumProperty.solution(TreeFactory
				.getNumricTree()));
	}

}
