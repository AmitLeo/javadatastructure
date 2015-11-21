package linkedList;

/**
 * 
 * @author amishash
 *
 */
public class DoubleLinkedList {

	private DoubleNode _rootNode;

	public DoubleNode getRootNode() {
		return _rootNode;
	}

	public void setRootNode(DoubleNode node) {
		this._rootNode = node;

	}

	public void addNode(DoubleNode argNode) {
		DoubleNode tempNode = getRootNode();
		if (tempNode == null) {
			_rootNode = argNode;
		} else {
			while (tempNode.getNextNode() != null)
				tempNode = tempNode.getNextNode();
			argNode.setPreviousNode(tempNode);
			tempNode.setNextNode(argNode);
		}
	}
	
	public void displayLinkedListNodes() {
		System.out.println("elements of linked list:");
		DoubleNode tempNode = getRootNode();
		System.out.println(tempNode.getData());
		while (tempNode.getNextNode() != null) {
			System.out.println(tempNode.getNextNode().getData() + " ");
			tempNode = tempNode.getNextNode();
		}
	}

}
