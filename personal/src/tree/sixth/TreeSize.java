package tree.sixth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * http://www.geeksforgeeks.org/write-a-c-program-to-calculate-size-of-a-tree/
 * 
 * @author amishash
 *
 */
public class TreeSize {

	private int sizeCounter = 0;

	private int solution(Tree argRootNode) {
		size(argRootNode.getRootNode());
		return sizeCounter;
	}

	private void size(Node argRootNode) {
		if (argRootNode == null)
			return;
		else {
			sizeCounter++;
			size(argRootNode.getLeftNode());
			size(argRootNode.getRightNode());
		}
	}

	public static void main(String[] args) {
		TreeSize treeSize = new TreeSize();
		System.out.println(treeSize.solution(TreeFactory.getTree()));
	}

}
