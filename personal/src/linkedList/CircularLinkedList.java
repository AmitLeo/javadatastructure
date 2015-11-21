package linkedList;

public class CircularLinkedList {
	private Node _rootNode;

	public Node getRootNode() {
		return _rootNode;
	}

	public void setRootNode(Node node) {
		this._rootNode = node;

	}

	public void addNode(Node argNode) {
		Node tempNode = getRootNode();
		if (tempNode == null) {
			_rootNode = argNode;
			_rootNode.setNextNode(_rootNode);
			// System.out.println("root Node" + argNode.getData());
		} else {
			while (tempNode.getNextNode() != _rootNode)
				tempNode = tempNode.getNextNode();
			argNode.setNextNode(_rootNode);
			tempNode.setNextNode(argNode);
		}

	}

	public void print() {
		Node tempNode = getRootNode();
		System.out.println(tempNode.getData());
		tempNode = tempNode.getNextNode();
		while (tempNode != getRootNode()) {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getNextNode();
		}

	}

}
