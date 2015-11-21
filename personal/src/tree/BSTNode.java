package tree;

/**
 * 
 * 
 * @author amishash
 *
 */
public class BSTNode{

	private double data;
	private BSTNode leftNode;
	private BSTNode rightNode;
	
	public BSTNode(int data)
	{
		this.data=data;
	}
	
	
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
	
	
	public BSTNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BSTNode leftNode) {
		this.leftNode = leftNode;
	}
	public BSTNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(BSTNode rightNode) {
		this.rightNode = rightNode;
	}
	
	
	
}
