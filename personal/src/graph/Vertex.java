package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
  
  private boolean visited;
  private String data;
  private List<Vertex> children;
  
  /**
   * @return the visited
   */
  public boolean isVisited() {
    return visited;
  }

  /**
   * @param visited the visited to set
   */
  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public Vertex(String argData)
  {
    this.data=argData;
    children=new ArrayList<Vertex>();
  }

  public void addChild(Vertex childVertex)
  {
    children.add(childVertex);
  }

  /**
   * @return the data
   */
  public String getData() {
    return data;
  }

  /**
   * @return the children
   */
  public List<Vertex> getChildren() {
    return children;
  }
  
}
