package graph;

public class GraphUtils {
  
  
  public static Graph createGraph()
  {
    Vertex ver1=new Vertex("1");
    Vertex ver2=new Vertex("2");
    Vertex ver3=new Vertex("3");
    Vertex ver4=new Vertex("4");
    Vertex ver5=new Vertex("5");
    Vertex ver6=new Vertex("6");
    Vertex ver7=new Vertex("7");
    Vertex ver8=new Vertex("8");

    ver1.addChild(ver2);
    
    ver2.addChild(ver3);
    ver2.addChild(ver4);
    
    ver3.addChild(ver5);
    ver3.addChild(ver7);
    ver3.addChild(ver6);
    
    ver4.addChild(ver5);

    ver5.addChild(ver3);
    ver5.addChild(ver4);
    ver5.addChild(ver7);
    ver5.addChild(ver8);
    
    ver6.addChild(ver3);
    ver6.addChild(ver7);
    
    
    ver7.addChild(ver3);
    ver7.addChild(ver5);
    
    return new Graph(ver1);
  }

}
