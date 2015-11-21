package tree.sixth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-
 * identical/
 * 
 * Two trees are identical when they have same data and arrangement of data is
 * also same. To identify if two trees are identical, we need to traverse both
 * trees simultaneously, and while traversing we need to compare data and
 * children of the trees.
 * 
 * @author amishash
 *
 */

public class IdenticalTrees {

	private boolean flag = true;

	private boolean solution(Tree argTree1, Tree argTree2) {
		Tree tree1 = TreeFactory.getTree();
		Tree tree2 = TreeFactory.getTree();
		isIdentical(tree1.getRootNode(), tree2.getRootNode());
		return flag;
	}

	private void isIdentical(Node argNode1, Node argNode2) {
		if (argNode1 == null && argNode2 == null)
			return;
		else {
			if (argNode1 != null && argNode2 != null
					&& argNode1.getData() == argNode2.getData()) {
				isIdentical(argNode1.getLeftNode(), argNode2.getLeftNode());
				isIdentical(argNode1.getRightNode(), argNode2.getRightNode());
			} else
				flag = false;
		}
	}

	public static void main(String[] args) {
		IdenticalTrees identicaltrees = new IdenticalTrees();
		System.out.println(identicaltrees.solution(TreeFactory.getTree(),
				TreeFactory.getTree()));
	}

}
