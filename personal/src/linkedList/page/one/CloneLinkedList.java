package linkedList.page.one;

import java.util.HashMap;
import java.util.Map;


/**
 * http://www.geeksforgeeks.org/a-linked-list-with-next-and-arbit-pointer/
 * 
 * Clone a linked list with next and random pointer | Set 1 You are given a
 * Double Link List with one pointer of each node pointing to the next node just
 * like in a single link list. The second pointer however CAN point to any node
 * in the list and not just the previous node. Now write a program in O(n) time
 * to duplicate this list. That is, write a program which will create a copy of
 * this list. Let us call the second pointer as arbit pointer as it can point to
 * any arbitrary node in the linked list.
 * 
 * @author amishash
 *
 */

public class CloneLinkedList {
	
	public SpecialLinkedList solution(SpecialLinkedList argSpecialLinkedList){
		SpecialLinkedList sll=new SpecialLinkedList();
		Map <Double,SpecialNode> map=new HashMap<Double,SpecialNode>();
		SpecialNode argSpecialNode=argSpecialLinkedList.getRootNode();
		while(argSpecialNode!=null){
			SpecialNode sn=new SpecialNode(argSpecialNode.getData());
			map.put(sn.getData(), argSpecialNode.getArbitary());
			sll.addNode(sn);
			argSpecialNode=argSpecialNode.getNext();
		}

		SpecialNode specialNode=sll.getRootNode();
		while(specialNode!=null){
			specialNode.setArbitary(
					map.get(
							map.get(specialNode.getData()).getData()
							));
			specialNode=specialNode.getNext();
		}
		return sll;
	}

	
	
	public static void main(String[] args) {
		CloneLinkedList cll=new CloneLinkedList();
		SpecialLinkedList sll=new SpecialLinkedList();
		SpecialNode s1=new SpecialNode(1);
		SpecialNode s2=new SpecialNode(2);
		SpecialNode s3=new SpecialNode(3);
		SpecialNode s4=new SpecialNode(4);
		SpecialNode s5=new SpecialNode(5);
		sll.addNode(s1);
		sll.addNode(s2);
		sll.addNode(s3);
		sll.addNode(s4);
		sll.addNode(s5);
		s1.setArbitary(s3);
		s3.setArbitary(s5);
		s5.setArbitary(s2);
		s2.setArbitary(s1);
		s4.setArbitary(s2);
		sll.displayLinkedListNodes();
		cll.solution(sll).displayLinkedListNodes();;
	}
}

class SpecialLinkedList {

	private SpecialNode _rootNode;

	public SpecialNode getStringNode() {
		return _rootNode;
	}

	public SpecialNode getRootNode() {
		return _rootNode;
	}

	public void setRootNode(SpecialNode node) {
		this._rootNode = node;

	}

	public void addNode(SpecialNode argNode) {
		SpecialNode tempNode = getRootNode();
		if (tempNode == null) {
			_rootNode = argNode;
			// System.out.println("root Node" + argNode.getData());
		} else {
			while (tempNode.getNext() != null)
				tempNode = tempNode.getNext();
			tempNode.setNext(argNode);
		}

	}

	public void displayLinkedListNodes() {
		System.out.println("elements of linked list:");
		SpecialNode tempNode = getRootNode();
		System.out.println(tempNode.getData() +" " +tempNode.getArbitary().getData());
		while (tempNode.getNext() != null) {
			System.out.println(tempNode.getNext().getData() + " " + tempNode.getArbitary().getData());
			tempNode = tempNode.getNext();
		}
	}

}

class SpecialNode {

	double data;
	SpecialNode next;
	SpecialNode arbitary;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public SpecialNode( double argdata) {
		data=argdata;
	}

	public SpecialNode getNext() {
		return next;
	}

	public void setNext(SpecialNode next) {
		this.next = next;
	}

	public SpecialNode getArbitary() {
		return arbitary;
	}

	public void setArbitary(SpecialNode arbitary) {
		this.arbitary = arbitary;
	}
}