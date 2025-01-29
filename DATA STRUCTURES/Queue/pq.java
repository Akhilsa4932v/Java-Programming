import java.util.Comparator;
import java.util.PriorityQueue;
public class pq {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //to get o/p in descending order. beacause by default pq prints in ascending order for integers

        pq.add(5);
        pq.add(2);
        pq.add(7);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
