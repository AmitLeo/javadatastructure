package arrays;

/**
 * Find length of the longest consecutive path from a given starting character
 * Given a matrix of characters. Find length of the longest path from a given character, 
 * such that all characters in the path are consecutive to each other, i.e., every character in path is next to previous in alphabetical order.
 * It is allowed to move in all 8 directions from a cell.
 * @author amishash
 *
 */

public class LogestConsecutive {
  
 public String  path="";
  
 public boolean isPosiblePosition(int iIndex,int jIndex, char argArr[][])
  {
    if(iIndex>=0 && jIndex>=0 && iIndex<argArr.length && jIndex<argArr[iIndex].length)
      return true;
    else
      return false;
  }
  
  
  public void formPath(char argArr[][], int argiIndex,int argjIndex)
  {
    /**
    i-1,j-1 ;  i-1,j  ; i-1,j+1
    i,j-1   ;  I,j    ; i,j+1
    i+1,j-1 ;  I+1,j  ; i+1,j+1
     */
    // case :1   i-1,j-1
    if(isPosiblePosition( argiIndex-1,argjIndex-1,argArr) && isValidNextCandidate(argArr[argiIndex-1][argjIndex-1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex-1][argjIndex-1];
      formPath(argArr,argiIndex-1,argjIndex-1);
    }// case :2   i-1,j-1
    else if(isPosiblePosition( argiIndex-1,argjIndex,argArr) && isValidNextCandidate(argArr[argiIndex-1][argjIndex], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex-1][argjIndex];
      formPath(argArr,argiIndex-1,argjIndex);
    }// case :3  i-1,j+1
    else if(isPosiblePosition( argiIndex-1,argjIndex+1,argArr) && isValidNextCandidate(argArr[argiIndex-1][argjIndex+1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex-1][argjIndex+1];
      formPath(argArr,argiIndex-1,argjIndex+1);
    }// case :4   i,j-1
    else if(isPosiblePosition( argiIndex,argjIndex-1,argArr)&& isValidNextCandidate(argArr[argiIndex][argjIndex-1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex][argjIndex-1];
      formPath(argArr,argiIndex,argjIndex-1);
    }// case :5   i,j+1
    else if(isPosiblePosition( argiIndex,argjIndex+1,argArr)&& isValidNextCandidate(argArr[argiIndex][argjIndex+1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex][argjIndex+1];
      formPath(argArr,argiIndex,argjIndex+1);
    }// case :6   i+1,j-1
    else if(isPosiblePosition( argiIndex+1,argjIndex-1,argArr)&& isValidNextCandidate(argArr[argiIndex+1][argjIndex-1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex+1][argjIndex-1];
      formPath(argArr,argiIndex+1,argjIndex-1);
    }// case :7   i+1,j
    else if(isPosiblePosition( argiIndex+1,argjIndex,argArr)&& isValidNextCandidate(argArr[argiIndex+1][argjIndex], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex+1][argjIndex];
      formPath(argArr,argiIndex+1,argjIndex);
    }// case :8   i+1,j
    else if(isPosiblePosition( argiIndex+1,argjIndex+1,argArr)&& isValidNextCandidate(argArr[argiIndex+1][argjIndex+1], argArr[argiIndex][argjIndex]) )
    {
      path=path+argArr[argiIndex+1][argjIndex+1]; 
      formPath(argArr,argiIndex+1,argjIndex+1);
    }
    else
    {
      System.out.println(path);
    }
  }
  
  
  public boolean isValidNextCandidate(char argNextChar,char argCurrChar)
  {
    if (argNextChar-argCurrChar==1)
      return true;
    else
      return false;
  }
  
  public void solution(char argArr[][], char argStaringPoint)
  {
    for(int i =0;i<argArr.length;i++)
    {
      for(int j =0;j<argArr.length;j++)
      {
        if(argStaringPoint==argArr[i][j]){
          path=path+argArr[i][j];
          formPath(argArr,i,j);
          break;
        }
      }
    }
  }

  

  public static void main(String[] args) {
   char mat1[][] = { {'a','c','d'},
                     {'h','b','e'},
                     {'i','g','f'}  };
  
  char mat2[][] = { {'b', 'e', 'f'},
                     {'h', 'd', 'a'},
                     {'i', 'c', 'a'} };
  
    LogestConsecutive logestConsecutive=new LogestConsecutive();
    logestConsecutive.solution(mat1,'e');
    logestConsecutive.solution(mat2,'b');
  }

}
