package tree.five;

import java.util.LinkedList;
import java.util.Queue;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/maximum-width-of-a-binary-tree/ Maximum width of
 * a binary tree Given a binary tree, write a function to get the maximum width
 * of the given tree. Width of a tree is maximum of widths of all levels. Let us
 * consider the below example tree.
 * 
 * @author amishash
 *
 */
public class MaximumWidth {

	public int solution(Tree argTree) {
		int maxWidth = 0;
		Queue<Node> queu = new LinkedList<Node>();
		queu.add(argTree.getRootNode());
		while (queu.size() > 0) {
			if (queu.size() > maxWidth)
				maxWidth = queu.size();
			Node node = queu.remove();
			if (node.getLeftNode() != null)
				queu.add(node.getLeftNode());
			if (node.getRightNode() != null)
				queu.add(node.getRightNode());
		}
		return maxWidth;
	}

	public static void main(String[] args) {
		MaximumWidth maxWidth = new MaximumWidth();
		System.out.println(maxWidth.solution(TreeFactory.getTree()));
	}
}
