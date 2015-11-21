package linkedList;

public class Node {
	
	private String sdata;
	private double data;
	private Node nextNode = null;


	public Node(String sdata) {
		this.sdata = sdata;
	}


	public String getStringData() {
		return sdata;
	}

	public void setStringData(String sdata) {
		this.sdata = sdata;
	}
	public Node(double argData) {
		this.data = argData;
	}

	/**
	 * @return the data
	 */
	public double getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(double data) {
		this.data = data;
	}

	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode
	 *            the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
