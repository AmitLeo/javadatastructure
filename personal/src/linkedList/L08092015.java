package linkedList;

public class L08092015 {

  
  public void sortLinkedList(SingleLinkedList argSingleLinkedList)
  {
    Node currentNode= argSingleLinkedList.getRootNode();
    while (currentNode.getNextNode()!=null)
    {
      currentNode=currentNode.getNextNode();
      
      
      
    }
  }
  
  
  
  
  
  
  public static void swapTwoLinkedListNodes( SingleLinkedList argSingleLinkedList)
  {
    Node iterateNode=argSingleLinkedList.getRootNode();
    Node prevNode=null;
    while(iterateNode.getNextNode()!=null)
    {
        Node node1=iterateNode;
        Node node2=iterateNode.getNextNode();
        Node nodeNext=node2.getNextNode();
        swapElements(node1,node2);
        if(prevNode==null)
          argSingleLinkedList.setRootNode(node2);
        else 
          prevNode.setNextNode(node2);
        prevNode=node1;

        if(null==nodeNext)
          break;
        iterateNode= nodeNext;
    }
  }
  
 public static void swapElements(Node argNode1, Node argNode2){
   Node tempNode=argNode2.getNextNode();
   argNode2.setNextNode(argNode1);
   argNode1.setNextNode(tempNode);
 }
  

  public  static void swapLinkedListNodes( double argDouble1,double argDouble2, SingleLinkedList argsll)
  {
    System.out.println("Elements to be swapped:" +argDouble1 +" and "+argDouble2);
    Node firstPreviousNode=null;
    Node actualFirstNode=null;
    Node firstAfterNode=null;
    Node secondPreviousNode=null;
    Node actualSecondNode=null;
    Node secondAfterNode=null;
    Node iteratorNode=argsll.getRootNode();
    Node previousNode=null;
    while(iteratorNode!=null)
    {
      if(iteratorNode.getData()==argDouble1){
        actualFirstNode=iteratorNode;
        firstPreviousNode=previousNode;
        firstAfterNode=iteratorNode.getNextNode();
      }else if(iteratorNode.getData()==argDouble2){
        actualSecondNode=iteratorNode;
        secondPreviousNode=previousNode;
        secondAfterNode=iteratorNode.getNextNode();
      }
      previousNode=iteratorNode;
      iteratorNode=iteratorNode.getNextNode();
    }
    if(firstPreviousNode==null){
      actualFirstNode.setNextNode(secondAfterNode);
      secondPreviousNode.setNextNode(actualFirstNode);
      actualSecondNode.setNextNode(firstAfterNode);
      argsll.setRootNode(actualSecondNode);
    }else if(actualSecondNode==firstAfterNode){ // if elements are adjacent to each other.
      actualFirstNode.setNextNode(secondAfterNode);
      actualSecondNode.setNextNode(actualFirstNode);
      firstPreviousNode.setNextNode(actualSecondNode);
    }else if(secondAfterNode==null){
      actualSecondNode.setNextNode(firstAfterNode);
      firstPreviousNode.setNextNode(actualSecondNode);
      actualFirstNode.setNextNode(null);
      secondPreviousNode.setNextNode(actualFirstNode);
    }    
    else{
      actualFirstNode.setNextNode(secondAfterNode);
      secondPreviousNode.setNextNode(actualFirstNode);
      actualSecondNode.setNextNode(firstAfterNode);
      firstPreviousNode.setNextNode(actualSecondNode);
    }
  }
  
  public static void createLinkedList(int length ,SingleLinkedList sll)
  {
    int counter =3;
    while(length>=0)
    {
     sll.addNode(new Node(counter*5));
     counter++;
     length--;
    }
  }
  public static void main(String[] args) {
    SingleLinkedList sll=new SingleLinkedList();
    createLinkedList(6,sll);
    sll.displayLinkedListNodes();
    /*swapLinkedListNodes(20d,30d,sll);
    sll.displayLinkedListNodes();
    swapLinkedListNodes(15d,30d,sll);
    sll.displayLinkedListNodes(); 
    swapLinkedListNodes(25d,30d,sll);
    sll.displayLinkedListNodes();*/
    swapTwoLinkedListNodes(sll);
    sll.displayLinkedListNodes();
  }
}
