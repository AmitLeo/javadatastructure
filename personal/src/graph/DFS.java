package graph;

import java.util.Stack;

public class DFS {
  public void traversal(Graph graph)
  {
    Vertex rootNode=graph.getRootVertex();
    Stack <Vertex> stack=new Stack<Vertex>();
    stack.add(rootNode);
    while(stack.size()>0)
    {
      Vertex temp=stack.pop();
      System.out.println(temp.getData());
      temp.setVisited(true);
      for(Vertex ver:temp.getChildren())
      {
        if(!ver.isVisited()){
          ver.setVisited(true);
          stack.push(ver);
        }
      }
    }
  }
  
  public static void main(String[] args) {
    DFS bfs=new DFS();
    bfs.traversal(GraphUtils.createGraph());
  }
}
