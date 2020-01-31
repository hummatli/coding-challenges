package experiments;

import java.util.HashMap;

public class HackerRank {


    static public void main(String[] arr){

        int[] ar = {1,2};
        System.out.println("Do");

        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < ar.length; i++){
            Integer curKey = ar[i];
            Integer curVal = m.getOrDefault(curKey, 0);

            Integer playerID = curVal;
            curVal++;

            if(curVal != null){
                curVal++;
                m.put(curKey, 1);
            }
        }
    }
}
