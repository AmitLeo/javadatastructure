package dp;
/**
 * 
 * Count even length binary sequences with same sum of first and second half bits
 * Given a number n, find count of all binary sequences of length 2n such that sum of first n bits is same as sum of last n bits.
 * 
 * @author amishash
 *
 */
public class EvenLengthBinarySequence {

  public double solution(int argN)
  {
    double count=2;
    CombinationsCalculation combinationsCalculation=new CombinationsCalculation();
    for(int i=1;i<argN;i++){
      int sqr=combinationsCalculation.NCR(argN,i);
      count=count+Math.pow(sqr,2);
    }
    return count;
  }
    
  
  public static void main(String[] args) {
    EvenLengthBinarySequence evenLengthBinarySequence=new EvenLengthBinarySequence();
    System.out.println(evenLengthBinarySequence.solution(2));
    System.out.println(evenLengthBinarySequence.solution(1));
    System.out.println(evenLengthBinarySequence.solution(4));

  }

}
