package graph.topologicalordering;

import graph.Vertex;

import java.util.Stack;

public class TopologicalOrdering {
  
  private Stack<Vertex> stack=new Stack<Vertex>();
  
  private  void topologicalOrder(Vertex argRVertex)
  {
    argRVertex.setVisited(true);
    for(Vertex v:argRVertex.getChildren())
    {
      v.setVisited(true);
      topologicalOrder(v);
    }
    stack.push(argRVertex);
  }
  
  
  
 public static void main(String[] args) {
   
   Vertex v1=new Vertex("A");
   Vertex v2=new Vertex("B");
   Vertex v3=new Vertex("C");
   Vertex v4=new Vertex("D");
   
   v1.addChild(v2);
   v1.addChild(v3);
   v2.addChild(v4);
   TopologicalOrdering tp=new TopologicalOrdering();
   tp.topologicalOrder(v1);
   
   
   for(Vertex v:tp.stack)
   {
     System.out.println(v.getData());
   }
   
}

}
