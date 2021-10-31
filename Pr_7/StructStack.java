import java.util.Stack;

public class StructStack {
    Stack<Integer> st1;
    Stack<Integer> st2;

    StructStack(Integer[] x, Integer[] y) {
        st1 = new Stack<>();
        st2 = new Stack<>();
        Add(x, st1);
        Add(y, st2);
    }

    public static void Add(Integer[] x, Stack<Integer> st) {
        for (int i = x.length - 1; i >= 0; i--)
            st.push(x[i]);
    }

    public void ToPlay() {
        int step = 0;
        while (!st1.empty() && !st2.empty()) {
            if (step > 106) {
                System.out.println("botva");
                return;
            }
            else step++;
            int value1 = st1.pop();
            int value2 = st2.pop();
            if ((value1 > value2 && value1 != 9 && value2 != 0) || (value1 == 0 && value2 == 9)) {
                st1.add(0, value1);
                st1.add(0, value2);
            }
            else {
                st2.add(0, value1);
                st2.add(0, value2);
            }
        }
        if (st2.empty()) System.out.println("first " + step);
        else if (st1.empty()) System.out.println("second " + step);
    }
}
