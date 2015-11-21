package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a matrix of ‘O’ and ‘X’, replace ‘O’ with ‘X’ if surrounded by ‘X’
 * Given a matrix where every element is either ‘O’ or ‘X’, replace ‘O’ with ‘X’
 * if surrounded by ‘X’. A ‘O’ (or a set of ‘O’) is considered to be by surrounded by ‘X’ 
 * if there are ‘X’ at locations just below, just above, just left and just right of it.
 * 
 * 
 */
public class ReplaceXOs {

  
  class Index
  {
    int xIndex;
    int yIndex;
    
    /**
     * @return the xIndex
     */
    public int getxIndex() {
      return xIndex;
    }
    /**
     * @return the yIndex
     */
    public int getyIndex() {
      return yIndex;
    }

    public Index(int argX,int argY)
    {
      this.xIndex=argX;
      this.yIndex=argY;
    }
  }
  
  
  
  
  public void solution(char argArr[][])
  {
    List <Index> indexesList=new ArrayList();
    for(int i=1;i<argArr.length;i++)
    {
      for(int j=1;j<argArr[i].length;j++)
      {
        if(argArr[i][j]=='O')
        {
          // Check UpSide
            for(int m=i-1;m>=0;m--)
            {
              List <Index> tempIndexesList=new ArrayList();
              tempIndexesList.add(new Index(m,j));
              if(argArr[m][j]=='X')
              {
                // Check downward direction
                for(int n=i+1;n<argArr.length;n++)
                {
                  tempIndexesList.add(new Index(n,j));
                  if(argArr[n][j]=='X')
                  {
                    for(int o=j-1;o>=0;o--)
                    {
                      tempIndexesList.add(new Index(i,o));
                      if(argArr[i][o]=='X')
                      {
                        for(int p=j+1;p<argArr.length;p++)
                        {
                          tempIndexesList.add(new Index(i,p));
                          if(argArr[i][p]=='X')
                          {
                            indexesList.addAll(tempIndexesList);
                            System.out.println(i+" "+j);
                            break;
                          }
                          }
                        break;}
                      }
                    break;}
                    }
                   break; }
                  }
                }
        }
      }
    
 /*   for(Index index:indexesList)
      System.out.println(Math.abs(index.getxIndex())+" "+Math.abs(index.getyIndex()));
*/  }
  
  
  public static void main(String[] args) {

      char[][] xoArr=  {{'X', 'O', 'X', 'X', 'X', 'X'},
                        {'X', 'O', 'X', 'X', 'O', 'X'},
                        {'X', 'X', 'X', 'O', 'O', 'X'},
                        {'O', 'X', 'X', 'X', 'X', 'X'},
                        {'X', 'X', 'X', 'O', 'X', 'O'},
                        {'O', 'O', 'X', 'O', 'O', 'O'},
                     };
    
    ReplaceXOs rReplaceXOs=new ReplaceXOs();
    rReplaceXOs.solution(xoArr);
    
  }

}
