package tree.sixth;

import tree.Node;
import tree.Tree;
import tree.TreeFactory;

/**
 * 
 * a / \ b c / \ / \ d e f g
 * 
 * 
 * @author amishash
 *
 */
public class TreeTraversals {

	public void inOrder(Node argRootNode) {
		if (argRootNode == null)
			return;
		else {
			inOrder(argRootNode.getLeftNode());
			if(argRootNode.getData()==null)
				System.out.print(argRootNode.getNumericData() + ", ");
			else
				System.out.print(argRootNode.getData()+ ", ");
			inOrder(argRootNode.getRightNode());
		}
	}

	public void postOrder(Node argRootNode) {
		if (argRootNode == null)
			return;
		else {
			postOrder(argRootNode.getLeftNode());
			postOrder(argRootNode.getRightNode());
			System.out.print(argRootNode.getData() + ", ");
		}
	}

	public void preOrder(Node argRootNode) {
		if (argRootNode == null)
			return;
		else {
			System.out.print(argRootNode.getData() + ", ");
			preOrder(argRootNode.getLeftNode());
			preOrder(argRootNode.getRightNode());
		}
	}

	
	public static void main(String[] args) {

		Tree tree=TreeFactory.getTree();
		TreeTraversals treeTraversal = new TreeTraversals();
		treeTraversal.preOrder(tree.getRootNode());
		System.out.println("PreOrder");
		treeTraversal.postOrder(tree.getRootNode());
		System.out.println("PostOrder");
		treeTraversal.inOrder(tree.getRootNode());
		System.out.println("InOrder");
	}

}
