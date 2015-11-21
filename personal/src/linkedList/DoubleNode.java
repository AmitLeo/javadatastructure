package linkedList;

public class DoubleNode {

	private double data;
	private DoubleNode previousNode;
	private DoubleNode nextNode;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public DoubleNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleNode previousNode) {
		this.previousNode = previousNode;
	}

	public DoubleNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleNode nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleNode(double argDouble) {
		this.data=argDouble;
	}

}
