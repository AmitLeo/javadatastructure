package linkedList;

/**
 * 
 * @author amishash
 *
 */
public class SingleLinkedList {

	private Node _rootNode;
	

	public Node getStringNode() {
		return _rootNode;
	}


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
			// System.out.println("root Node" + argNode.getData());
		} else {
			while (tempNode.getNextNode() != null)
				tempNode = tempNode.getNextNode();
			tempNode.setNextNode(argNode);
		}

	}

	public void addNode(Node argNode, boolean argSorted)
	{
		if(argSorted)
			addSortedWay(argNode);
		else
			addNode(argNode);
	}
	public void displayLinkedListNodes() {
		System.out.println("elements of linked list:");
		Node tempNode = getRootNode();
		System.out.println(tempNode.getData());
		while (tempNode.getNextNode() != null) {
			System.out.println(tempNode.getNextNode().getData() + " ");
			tempNode = tempNode.getNextNode();
		}
	}
	
	

	private void addSortedWay(Node argNode)
	{
		Node tempNode = getRootNode();
		if (tempNode == null || tempNode.getData()>argNode.getData()) {
			_rootNode = argNode;
			argNode.setNextNode(tempNode);
		} else {
			while (tempNode.getNextNode() != null  && tempNode.getNextNode().getData()<argNode.getData())
				tempNode=tempNode.getNextNode();
			argNode.setNextNode(tempNode.getNextNode());
			tempNode.setNextNode(argNode);
		}
	}
	
	public void clear()
	{
		setRootNode(null);	
	}
}
