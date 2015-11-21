package tree.five;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * Level order traversal in spiral form
 * 
 * @author amishash
 *
 */
public class LevelOrderSpiralTraversal {

	private void sol(Tree argTree) {
		Queue queue = new LinkedList();
		queue.add(argTree.getRootNode());
		System.out.println(rootNode.getData());
		extra( queue, 1);

	}

	private void extra(Queue<Node> queue, int counter) {
		System.out.println(rootNode.getData());
		while (queue.size() > 0) {
			Node tempNode = queue.pop();
			if (tempNode.getLeftNode() != null)
				System.out.println(tempNode.getLeftNode().getData());
			if (tempNode.getRightNode() != null)
				System.out.println(tempNode.getRightNode().getData());
			if (tempNode.getLeftNode() != null)
				queue.add(tempNode.getLeftNode());
			if (tempNode.getRightNode() != null)
				queue.add(tempNode.getRightNode());
		}
	}

	private Queue<Node> printQueue(Queue<Node> queue, int counter) {
		if (counter % 2 == 0) 
			Collections.reverse((List) queue);
		while(queue.size()>0){
			Node temp=queue.remove();
			System.out.println(temp.getData());
		}
		return queue;
	}

	private void extraSpaceSolution(Tree argTree) {
		Node rootNode = argTree.getRootNode();
		Stack<Node> queue = new Stack<Node>();
		queue.add(rootNode);
		System.out.println(rootNode.getData());
		while (queue.size() > 0) {
			Node tempNode = queue.pop();
			if (tempNode.getLeftNode() != null)
				System.out.println(tempNode.getLeftNode().getData());
			if (tempNode.getRightNode() != null)
				System.out.println(tempNode.getRightNode().getData());
			if (tempNode.getLeftNode() != null)
				queue.add(tempNode.getLeftNode());
			if (tempNode.getRightNode() != null)
				queue.add(tempNode.getRightNode());
		}
	}

	private void solution(Tree argTree) {
		System.out.println(argTree.getRootNode().getData());
		recursiveLevelOrderSpiral(argTree.getRootNode(), true);
	}

	private void recursiveLevelOrderSpiral(Node argRootNode, boolean toggler) {

		if (argRootNode == null) {
			return;
		} else {
			if (toggler) {
				if (argRootNode.getLeftNode() != null)
					System.out.println(argRootNode.getLeftNode().getData());
				if (argRootNode.getRightNode() != null)
					System.out.println(argRootNode.getRightNode().getData());
				if (argRootNode.getRightNode() != null)
					recursiveLevelOrderSpiral(argRootNode.getRightNode(),
							!toggler);
				if (argRootNode.getLeftNode() != null)
					recursiveLevelOrderSpiral(argRootNode.getLeftNode(),
							!toggler);

			} else {
				if (argRootNode.getRightNode() != null)
					System.out.println(argRootNode.getRightNode().getData());
				if (argRootNode.getLeftNode() != null)
					System.out.println(argRootNode.getLeftNode().getData());
				if (argRootNode.getLeftNode() != null)
					recursiveLevelOrderSpiral(argRootNode.getLeftNode(),
							!toggler);
				if (argRootNode.getRightNode() != null)
					recursiveLevelOrderSpiral(argRootNode.getRightNode(),
							!toggler);
			}
		}
	}

	public static void main(String[] args) {
		LevelOrderSpiralTraversal levelOrderSpiralTraversal = new LevelOrderSpiralTraversal();
		// levelOrderSpiralTraversal.solution(TreeFactory.getVeryBigTree());
		levelOrderSpiralTraversal.sol(TreeFactory
				.getVeryBigTree());
	}

}
