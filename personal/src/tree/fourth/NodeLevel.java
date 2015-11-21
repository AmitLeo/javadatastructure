package tree.fourth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/print-nodes-at-k-distance-from-root/
 * 
 * Get Level of a node in a Binary Tree Given a Binary Tree and a key, write a
 * function that returns level of the key. For example, consider the following
 * tree. If the input key is 3, then your function should return 1. If the input
 * key is 4, then your function should return 3. And for key which is not
 * present in key, then your function should return 0.
 * 
 * 
 * @author amishash
 *
 */
public class NodeLevel {

	private void solution(Tree argTee, String nodeData) {
		recurSol(argTee.getRootNode(),0,nodeData);
	}

	private void recurSol(Node argRootNode, int height, String nodeChar) {

		if (argRootNode == null)
			return;
		else {
			if (argRootNode.getData().equalsIgnoreCase(nodeChar)) {
				System.out.println(height);
				return;
			}
			height++;
			recurSol(argRootNode.getLeftNode(), height, nodeChar);
			recurSol(argRootNode.getRightNode(), height, nodeChar);
		}
	}

	public static void main(String[] args) {

		NodeLevel nodeLevel = new NodeLevel();
		nodeLevel.solution(TreeFactory.getTree(), "d");
		nodeLevel.solution(TreeFactory.getTree(), "a");
	}

}
