package arrays;

public class MissingAirthmeticProgression {

  public void solution(int argArr[]) {
    binarySearch(0, argArr.length-1,argArr.length/2, argArr);
  }

  public void binarySearch(int argStartElem, int argEndElem,int midElem, int argArr[]) {
    int  rightDiff = argArr[argEndElem]-argArr[midElem] ;
    int  leftDiff = argArr[midElem] - argArr[argStartElem];
    if(leftDiff==0||rightDiff==0)
      System.out.println("Missing Element is b/w Index "+argStartElem+" "+argEndElem);
    else if (leftDiff < rightDiff)
      binarySearch(midElem , argEndElem,(midElem+argEndElem)/2, argArr);
    else if (leftDiff > rightDiff)
      binarySearch(argStartElem, midElem,(argStartElem+midElem)/2 ,argArr);
}
  public static void main(String[] args) {
    MissingAirthmeticProgression missingAirthmeticProgression = new MissingAirthmeticProgression();
    missingAirthmeticProgression.solution(new int[] {2, 4, 8, 10, 12});
    missingAirthmeticProgression.solution(new int[] {1, 6, 11, 16, 26});
    

  }

}
