package BigProblems;

import java.util.LinkedList;
import java.util.Queue;


public class Voting {
    public static String Votingpredict(String senate){
        Queue<Integer> RadientQue = new LinkedList<Integer>();
        Queue<Integer> DemQue = new LinkedList<Integer>();
        int n = senate.length();

        //populate the querie with inital database
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                RadientQue.add(i);
            } else{
                DemQue.add(i);
            }
        }

        //Simulate the rounds
        while (!RadientQue.isEmpty() && !DemQue.isEmpty()) {
            int rQ = RadientQue.poll();
            int dQ = DemQue.poll();

            if (rQ < dQ) {
                RadientQue.add(rQ + n);
            }else {
                DemQue.add(dQ + n);
            }
            
        }
        return RadientQue.isEmpty() ? "Dire" : "Radiant";
    }
    public static void main(String[] args) {
        System.out.println(Votingpredict("RDD"));

    }
}
