import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StructQueue {
    PriorityQueue<Integer> q1;
    PriorityQueue<Integer> q2;

    StructQueue(Integer[] x, Integer[] y) {
        q1 = new PriorityQueue<>();
        q2 = new PriorityQueue<>();
        Add(x, q1);
        Add(y, q2);
    }

    public static void Add(Integer[] x, Queue<Integer> q) {
        q.addAll(Arrays.asList(x));
    }

    public void ToPlay() {
        int step = 0;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (step > 106) {
                System.out.println("botva");
                return;
            }
            else step++;
            int value1 = q1.poll();
            int value2 = q2.poll();
            if (((value1 > value2) && value1 != 9 && value2 != 0) || (value1 == 0 && value2 == 9)) {
                q1.add(value1);
                q1.add(value2);
            }
            else {
                q2.add(value1);
                q2.add(value2);
            }
        }
        if (q2.isEmpty()) System.out.println("first " + step);
        else if (q1.isEmpty()) System.out.println("second " + step);
    }
}
