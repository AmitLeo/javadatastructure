package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;
import tree.sixth.TreeTraversals;

/**
 * http://www.geeksforgeeks.org/convert-an-arbitrary-binary-tree-to-a-tree-that-
 * holds-children-sum-property/
 * 
 * Convert an arbitrary Binary Tree to a tree that holds Children Sum Property
 * Question: Given an arbitrary binary tree, convert it to a binary tree that
 * holds Children Sum Property. You can only increment data values in any node
 * (You cannot change structure of tree and cannot decrement value of any node).
 * For example, the below tree doesn’t hold the children sum property, convert
 * it to a tree that holds the property.
 * 
 * @author amishash
 *
 */
public class TreeConverter {

	private void solution(Tree argTree) {
		TreeTraversals treeTrav = new TreeTraversals();
		treeTrav.inOrder(argTree.getRootNode());
		recursive(argTree.getRootNode());
		System.out.println();
		treeTrav.inOrder(argTree.getRootNode());

	}

	private int recursive(Node argNode) {
		if (argNode == null) {
			return 0;
		} else {
			while (argNode != null) {
				int rightSum = +recursive(argNode.getRightNode());
				int leftSum = +recursive(argNode.getLeftNode());
				int parentSum = argNode.getNumericData();
				int childSum = rightSum + leftSum;
				if (childSum != 0) {
					if (childSum == parentSum)
						return rightSum + leftSum;
					else {
						if (childSum > parentSum)
							argNode.setNumericData(childSum);
						else if (childSum < parentSum)
							argNode.getLeftNode().setNumericData(
									leftSum + (parentSum - childSum));
					}
				}
				return argNode.getNumericData();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		TreeConverter treeConverter = new TreeConverter();
		treeConverter.solution(TreeFactory.getNumricOrderedTree());
	}
}
