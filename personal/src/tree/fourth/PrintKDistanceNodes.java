package tree.fourth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * http://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/
 * 
 * Print nodes at k distance from root Given a root of a tree, and an integer k.
 * Print all the nodes which are at k distance from root. For example, in the
 * below tree, 4, 5 & 8 are at distance 2 from root.
 * 
 * @author amishash
 *
 */
public class PrintKDistanceNodes {

	private void solution(Tree argTree, int argRootDistance) {
		recursive(argTree.getRootNode(), 0, argRootDistance);
	}

	private void recursive(Node argRootNode, int height, int distance) {
		if (distance == height && argRootNode != null) {
			System.out.println(argRootNode.getData());
		} else {
			height++;
			recursive(argRootNode.getLeftNode(), height, distance);
			recursive(argRootNode.getRightNode(), height, distance);
		}
	}

	public static void main(String[] args) {
		PrintKDistanceNodes printKDistanceNodes = new PrintKDistanceNodes();
		printKDistanceNodes.solution(TreeFactory.getTree(), 2);

	}

}
