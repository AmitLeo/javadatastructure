package tree;

/**
 * Binary Search Tree
 * 
 * @author amishash
 *
 */
public class BSTree {

	private BSTNode _rootNode;

	public BSTNode getRootNode() {
		return _rootNode;
	}

	public void setRootNode(BSTNode _rootNode) {
		this._rootNode = _rootNode;
	}

	public void addNode(BSTNode argBSTNode) {
		if (getRootNode() == null)
			setRootNode(argBSTNode);
		else {
			BSTNode tempNode = getRootNode();
			BSTNode prevNode = tempNode;
			while (tempNode != null) {
				if (tempNode.getData() > argBSTNode.getData()) {
					prevNode = tempNode;
					tempNode = tempNode.getLeftNode();
				} else {
					prevNode = tempNode;
					tempNode = tempNode.getRightNode();
				}
			}
			if (prevNode.getData() > argBSTNode.getData())
				prevNode.setLeftNode(argBSTNode);
			else
				prevNode.setRightNode(argBSTNode);
		}
	}

	private void displayNode(BSTNode argbstNode) {
		System.out.println(argbstNode.getLeftNode().getData() + "   "
				+ argbstNode.getRightNode().getData());
		if(argbstNode.getLeftNode()!=null)
		displayNode(argbstNode.getLeftNode());
		if(argbstNode.getRightNode()!=null)
		displayNode(argbstNode.getRightNode());
	}

	public void displayTree() {
		BSTNode bstNode = getRootNode();
		System.out.println(bstNode.getData());
		displayNode(bstNode);
	}
}
