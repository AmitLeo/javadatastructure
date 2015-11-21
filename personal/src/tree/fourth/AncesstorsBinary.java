package tree.fourth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * http://www.geeksforgeeks.org/print-ancestors-of-a-given-node-in-binary-tree/
 * 
 * Print Ancestors of a given node in Binary Tree Given a Binary Tree and a key,
 * write a function that prints all the ancestors of the key in the given binary
 * tree. For example, if the given tree is following Binary Tree and key is 7,
 * then your function should print 4, 2 and 1.
 *
 * 
 * @author amishash
 *
 */
public class AncesstorsBinary {

	private void solution(Tree argTree, String argData) {
		System.out.println(getAncessotors(argTree.getRootNode(), argData,
				new String()));
	}

	private String getAncessotors(Node argRootNode, String argData, String sb) {

		if (argRootNode == null)
			return null;
		else {
			if (argRootNode.getData().equalsIgnoreCase(argData)) {
				System.out.print(sb);
			}
			getAncessotors(argRootNode.getLeftNode(), argData,
					sb + argRootNode.getData());
			getAncessotors(argRootNode.getRightNode(), argData, sb
					+ argRootNode.getData());
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		AncesstorsBinary ancesstorsBinary = new AncesstorsBinary();
		ancesstorsBinary.solution(TreeFactory.getTree(), "d");
	}
}
