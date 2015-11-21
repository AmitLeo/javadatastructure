package linkedList.page.three;

import linkedList.Node;
import linkedList.SingleLinkedList;
import tree.Tree;

/**
 * 
 * 
 * Given a Doubly Linked List which has data members sorted in ascending order.
 * Construct a Balanced Binary Search Tree which has same data members as the given Doubly Linked List. 
 * The tree must be constructed in-place (No new node should be allocated for tree conversion)
 * @author amishash
 *
 */

public class LinkedListToBST {


	private  int middleIndex=-1;
	Tree tree	=new Tree();;
	private Tree solution(SingleLinkedList sll){
	
		solution(sll.getRootNode(),1);
		return tree;
	}
	
		

	private tree.Node  recursiveSolution(Node argNode, int size, int counter) {
		if (1 == size) {
			return new tree.Node((int)argNode.getData());
		} else {
			counter++;
			Node nodes[] = splitNodes(argNode, size / 2);
			tree.Node  root = recursiveSolution(nodes[1], 1, 1);
			if(tree.getRootNode()==null)
				tree.setRootNode(root);
			root.setLeftNode(recursiveSolution(nodes[0], size / 2, counter));
			root.setRightNode(recursiveSolution(nodes[2], size / 2, counter));
			return root;
		}
	}


	private Node[] splitNodes(Node argNodes, int splitPoint) {
		Node rootNode = argNodes;
		Node center;
		Node rightNode;
		splitPoint--;
		while ( splitPoint > 0) {
			argNodes = argNodes.getNextNode();
			splitPoint--;
		}
		Node halves[] = new Node[3];
		center=argNodes.getNextNode();
		argNodes.setNextNode(null);
		halves[0] = rootNode;
		
		rightNode=center.getNextNode();
		center.setNextNode(null);
		halves[1] =center;
		halves[2] = rightNode;
		return halves;

	}
	
	private tree.Node solution(Node argNode,int counter)
	{
		if(argNode.getNextNode()==null)
		{
			middleIndex=(counter+1)/2;
			tree.Node temp=new tree.Node((int)argNode.getData());
			return temp;
		}else
		{
			counter++;
			tree.Node temp=solution(argNode.getNextNode(), counter);
			tree.Node temp2=new tree.Node((int)argNode.getData());
			
			if(temp.getLeftNode()!=null && temp.getRightNode()!=null)
			{   
				if(temp2.getNumericData()>temp.getNumericData()){
					temp2.setLeftNode(temp);
					temp2=temp;
				}else{
					temp2.setRightNode(temp);
				}
			}else 
			{
				if(temp2.getNumericData()>temp.getNumericData()){
					temp2.setLeftNode(temp);
				}else{
					if(temp.getLeftNode()==null)
					{
						temp.setLeftNode(temp2);
						temp2=temp;
					}else
					{
						temp2.setRightNode(temp);
					}
				}
			}
		if(middleIndex==counter)
					tree.setRootNode(temp);
			return temp2;
		}
	}
	public static void main(String[] args) {
		LinkedListToBST linkedListToBST=new LinkedListToBST();
		
		SingleLinkedList sll1 = new SingleLinkedList();
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);
		Node node7 = new Node(70);
		sll1.addNode(node1);
		sll1.addNode(node2);
		sll1.addNode(node3);
		sll1.addNode(node4);
		sll1.addNode(node5);
		sll1.addNode(node6);
		sll1.addNode(node7);
		tree.Node tempTree=linkedListToBST.recursiveSolution(sll1.getRootNode(),7,1);
		
	}

}
