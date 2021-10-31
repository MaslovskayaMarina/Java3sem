import java.util.LinkedList;

public class StructDoubleList {
    LinkedList<Integer> q1;
    LinkedList<Integer> q2;

    StructDoubleList(Integer[] x, Integer[] y) {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        Add(x, q1);
        Add(y, q2);
    }

    public static void Add(Integer[] x, LinkedList<Integer> q) {
        for (int i = x.length - 1; i >= 0; i--)
            q.add(x[i]);
    }

    public void ToPlay() {
        int step = 0;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (step > 106) {
                System.out.println("botva");
                return;
            }
            else step++;
            int value1 = q1.pop();
            int value2 = q2.pop();
            if ((value1 > value2 && value1 != 9 && value2 != 0) || (value1 == 0 && value2 == 9)){
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
