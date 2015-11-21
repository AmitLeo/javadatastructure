package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * depth first traversal
 *
 * 
 * @author amishash
 */
public class BFS {

  public void traversal(Graph graph)
  {
    Vertex rootNode=graph.getRootVertex();
    Queue<Vertex> traversalQueue=new LinkedList<Vertex>();
    traversalQueue.add(rootNode);
    while(traversalQueue.size()>0)
    {
      Vertex temp=traversalQueue.poll();
      temp.setVisited(true);
      System.out.println(temp.getData());
      Iterator <Vertex> childIter=temp.getChildren().iterator();
      while(childIter.hasNext())
      {
        Vertex toBeProcessed=childIter.next();
        if(!toBeProcessed.isVisited())
          traversalQueue.add(toBeProcessed);
     }
    }
  }
  
  public static void main(String[] args) {
    BFS bfs=new BFS();
    bfs.traversal(GraphUtils.createGraph());
  }
}
