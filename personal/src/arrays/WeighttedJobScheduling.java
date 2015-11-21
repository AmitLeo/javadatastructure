package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * Weighted Job Scheduling
 * Given N jobs where every job is represented by following three elements of it.
 * 1) Start Time
 * 2) Finish Time.
 * 3) Profit or Value Associated.
 * Find the maximum profit subset of jobs such that no two jobs in the subset overlap.
 * 
 * http://www.geeksforgeeks.org/weighted-job-scheduling/
 * @author amishash
 *
 */

public class WeighttedJobScheduling {


  class Job implements Comparable<Job>
  {
    int startingTime;
    int endTime;
    int weight;

    public  Job(int argStartingTime,int argEndTime,int argWeight)
    {
      this.startingTime=argStartingTime;
      this.endTime=argEndTime;
      this.weight=argWeight;
    }
    public int compareTo(Job o) {
     return this.startingTime-o.startingTime;
    }
    /**
     * @return the startingTime
     */
    public int getStartingTime() {
      return startingTime;
    }
    /**
     * @return the endTime
     */
    public int getEndTime() {
      return endTime;
    }
    /**
     * @return the weight
     */
    public int getWeight() {
      return weight;
    }
  }
  
  
  public void solution(List <Job> argArrList)
  {
    int max=0;
    for(int j=0;j<argArrList.size();j++) {
      Job job=argArrList.get(j);
      int counter=0;
      if(argArrList.get(counter).getEndTime()<=job.getStartingTime())
            counter++;
      if(counter>0){
        int tempWeight=Math.abs(job.getWeight()+argArrList.get(--counter).getWeight());
        if(tempWeight>max)
          max=tempWeight;
        }
    }
    System.out.println(max);
  }
    
  
  public static void main(String[] args) {

    WeighttedJobScheduling weighttedJobScheduling=new WeighttedJobScheduling();
    
    List<Job> al=new ArrayList<Job>();
    al.add(weighttedJobScheduling.new Job(3,5,20));
    al.add(weighttedJobScheduling.new Job(1,2,50));
    al.add(weighttedJobScheduling.new Job(6,19,100));
    al.add(weighttedJobScheduling.new Job(2,100,200));
    Collections.sort(al); 
    weighttedJobScheduling.solution(al);
        
  }
}
