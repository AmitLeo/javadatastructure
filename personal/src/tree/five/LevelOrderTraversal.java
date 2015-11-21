package tree.five;

import java.util.LinkedList;
import java.util.Queue;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * Level Order Tree Traversal
 * 
 * @author amishash
 *
 */

public class LevelOrderTraversal {

	private void solution2(Tree argTree) {
		System.out.println(argTree.getRootNode().getData());
		recursiveSolution(argTree.getRootNode());
	}

	private void recursiveSolution(Node argRootNode) {
		if (argRootNode == null) {
			return;
		} else {
			if (argRootNode.getLeftNode() != null)
				System.out.println(argRootNode.getLeftNode().getData());
			if (argRootNode.getRightNode() != null)
				System.out.println(argRootNode.getRightNode().getData());
			if (argRootNode.getLeftNode() != null)
				recursiveSolution(argRootNode.getLeftNode());
			if (argRootNode.getRightNode() != null)
				recursiveSolution(argRootNode.getRightNode());
		}
	}

	private void extraSpaceSolution(Tree argTree) {
		Queue<Node> queu = new LinkedList<Node>();
		queu.add(argTree.getRootNode());
		while (queu.size() > 0) {
			Node node = queu.remove();
			System.out.println(node.getData());
			if (node.getLeftNode() != null)
				queu.add(node.getLeftNode());
			if (node.getRightNode() != null)
				queu.add(node.getRightNode());
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		levelOrderTraversal.extraSpaceSolution(TreeFactory.getTree());
		levelOrderTraversal.solution2(TreeFactory.getTree());
	}

}
