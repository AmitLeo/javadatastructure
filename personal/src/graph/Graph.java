package graph;

public class Graph {
  
  private Vertex rootVertex;
  /**
   * @param rootVertex
   */
  public Graph(Vertex rootVertex)
  {
    this.rootVertex=rootVertex;
  }
  
  /**
   * @return the rootVertex
   */
  public Vertex getRootVertex() {
    return rootVertex;
  }

  /**
   * @param rootVertex the rootVertex to set
   */
  public void setRootVertex(Vertex rootVertex) {
    this.rootVertex = rootVertex;
  }
}
