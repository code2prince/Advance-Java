package Practice;
import java.util.*;
public class PriorityQueueExample {
    public static void main(String arg[]){
        int []arr={2,3,4,5,1,7,3,4};

        // ByDefault it uses Min heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }

        // If u want to use max heap then Comparator.reverseOrder() need to use
        PriorityQueue<Integer> newPq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:arr){
            newPq.add(i);
        }
        System.out.print("Min head: ");
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+ " ");
        }

        System.out.print("Max heap: ");
        while(!newPq.isEmpty()){
            System.out.print(newPq.poll()+ " ");
        }
    }
}
