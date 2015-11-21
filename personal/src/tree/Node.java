package tree;
/**
 * @author amishash
 *
 */
public class Node {

	private int  numericData;
	private String data;
	private Node leftNode;
	private Node rightNode;

	public Node(int numericData) {
		this.numericData = numericData;
	}
	
	public Node(String argData) {
		this.data = argData;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getNumericData() {
		return numericData;
	}

	public void setNumericData(int numericData) {
		this.numericData = numericData;
	}

	
}
