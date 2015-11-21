package tree.five;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * http://www.geeksforgeeks.org/diameter-of-a-binary-tree/
 * 
 * @author amishash
 *
 */
public class DiameterBinaryTree {

	private int max_diameter = 0;

	private void resetDiameter() {
		max_diameter = 0;
	}

	private int solution(Tree argTree) {
		return recursiveSol(argTree.getRootNode(), 0);
	}

	private int recursiveSol(Node argRootNode, int height) {

		if (argRootNode == null)
			return height;
		else {
			while (argRootNode != null) {
				height++;
				int tempLeft=recursiveSol(argRootNode.getLeftNode(), height);
				int tempRight=recursiveSol(argRootNode.getRightNode(), height);
				if ( (tempLeft-height) + (tempRight-height) > max_diameter)
					max_diameter = (tempLeft-height) + (tempRight-height) ;
				return Math.max(tempLeft, tempRight);
			}
		}
		return max_diameter;
	}

	public static void main(String[] args) {
		DiameterBinaryTree diameterBinaryTree = new DiameterBinaryTree();
		diameterBinaryTree.solution(TreeFactory.getTree());
		System.out.println(diameterBinaryTree.max_diameter);
		diameterBinaryTree.resetDiameter();
		diameterBinaryTree.solution(TreeFactory
				.getVeryBigTree());
		System.out.println(diameterBinaryTree.max_diameter);
	}

}
