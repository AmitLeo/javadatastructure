package tree;

/**
 * 
 * @author amishash
 *
 */
public class TreeFactory {

	public static BSTree getBST() {
		BSTNode sbtNode1 = new BSTNode(10);
		BSTNode sbtNode2 = new BSTNode(20);
		BSTNode sbtNode3 = new BSTNode(5);
		BSTNode sbtNode4 = new BSTNode(25);
		BSTNode sbtNode5 = new BSTNode(15);
		BSTNode sbtNode6 = new BSTNode(1);
		BSTNode sbtNode7 = new BSTNode(8);
		BSTree bstTree = new BSTree();
		bstTree.addNode(sbtNode1);
		bstTree.addNode(sbtNode2);
		bstTree.addNode(sbtNode3);
		bstTree.addNode(sbtNode4);
		bstTree.addNode(sbtNode5);
		bstTree.addNode(sbtNode6);
		bstTree.addNode(sbtNode7);

		return bstTree;
	}

	
	public static Tree subTree()
	{
		Node node2 = new Node("b");
		Node node4 = new Node("d");
		Node node5 = new Node("e");
		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		Tree tree = new Tree();
		tree.setRootNode(node2);
		return tree;

	}
	public static Tree getTree() {
		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		Node node5 = new Node("e");
		Node node6 = new Node("f");
		Node node7 = new Node("g");

		node1.setLeftNode(node2);
		node1.setRightNode(node3);

		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		node3.setLeftNode(node6);
		node3.setRightNode(node7);

		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
	}

	public static Tree getNumricTree() {
		Node node1 = new Node("10");
		Node node2 = new Node("2");
		Node node3 = new Node("8");

		Node node4 = new Node("1");
		Node node5 = new Node("1");

		Node node6 = new Node("3");
		Node node7 = new Node("5");

		node1.setLeftNode(node2);
		node1.setRightNode(node3);

		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		node3.setLeftNode(node6);
		node3.setRightNode(node7);

		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
	}

	public static Tree getNumricOrderedTree() {
		Node node1 = new Node(10);
		Node node2 = new Node(6);
		Node node3 = new Node(15);

		Node node4 = new Node(3);
		Node node5 = new Node(8);

		Node node6 = new Node(14);
		Node node7 = new Node(18);

		node1.setLeftNode(node2);
		node1.setRightNode(node3);

		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		node3.setLeftNode(node6);
		node3.setRightNode(node7);

		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
	}
	public static Tree getBigTree() {
		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		Node node5 = new Node("e");
		Node node6 = new Node("f");
		Node node7 = new Node("g");
		Node node8 = new Node("e");
		Node node9 = new Node("f");
		Node node10 = new Node("g");
		node1.setLeftNode(node2);
		node1.setRightNode(node3);

		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		node3.setLeftNode(node6);
		node3.setRightNode(node7);
		node7.setLeftNode(node8);
		node8.setLeftNode(node9);
		node9.setRightNode(node10);
		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
	}

	public static Tree getHeightUnbalancedTree() {
		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		Node node5 = new Node("e");
		Node node6 = new Node("f");
		Node node7 = new Node("g");
		Node node8 = new Node("e");
		Node node9 = new Node("f");
		Node node10 = new Node("g");
		node1.setLeftNode(node2);
		node1.setRightNode(node3);
		node2.setLeftNode(node4);

		node3.setRightNode(node7);
		node7.setLeftNode(node8);
		node9.setRightNode(node10);
		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
	}
	
	
	public static Tree getVeryBigTree()
	{
		Node node1 = new Node("a");
		
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		
		Node node4 = new Node("d");
		Node node5 = new Node("e");
		
		Node node6 = new Node("f");
		Node node7 = new Node("g");
		
		Node node8 = new Node("h");
		Node node9 = new Node("i");
		Node node10 = new Node("j");
		Node node11 = new Node("k");
		Node node12 = new Node("l");
		Node node13 = new Node("m");
		Node node14 = new Node("n");
		Node node15 = new Node("o");
	
		node1.setLeftNode(node2);
		node1.setRightNode(node3);

		node2.setLeftNode(node4);
		node2.setRightNode(node5);

		node3.setLeftNode(node6);
		node3.setRightNode(node7);


		node4.setLeftNode(node8);
		node4.setRightNode(node9);
		node5.setLeftNode(node10);
		node5.setRightNode(node11);
		

		node6.setLeftNode(node12);
		node6.setRightNode(node13);
		node7.setLeftNode(node14);
		node7.setRightNode(node15);
		Tree tree = new Tree();
		tree.setRootNode(node1);
		return tree;
		
	}
}
