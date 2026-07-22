package Practice.Day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;

        Map<Integer,Integer> mpp=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int currReq=target-arr[i];
            if(mpp.containsKey(currReq)){
                System.out.println((mpp.get(currReq))+ " " + i);
                //return new int[] {mpp.get(currReq), i};
            }
            mpp.put(arr[i],i);
        }
        System.out.println(mpp);  //{2=0, 7=1, 11=2, 15=3}
    }
}
