import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
    }

    public static void Exercise1() {
        Integer[] x = new Integer[5];
        Integer[] y = new Integer[5];
        Input(x);
        Input(y);
        StructStack p = new StructStack(x, y);
        p.ToPlay();
   }

public static void Exercise2() {
        Integer[] x = new Integer[5];
        Integer[] y = new Integer[5];
        Input(x);
        Input(y);
        StructQueue p = new StructQueue(x, y);
        p.ToPlay();
    }

    public static void Exercise3() {
        Integer[] x = new Integer[5];
        Integer[] y = new Integer[5];
        Input(x);
        Input(y);
        StructDeque p = new StructDeque(x, y);
        p.ToPlay();
    }

    public static void Exercise4() {
        Integer[] x = new Integer[5];
        Integer[] y = new Integer[5];
        Input(x);
        Input(y);
        StructDoubleList p = new StructDoubleList(x, y);
        p.ToPlay();
    }

    public static void Input(Integer [] x) {
        Scanner in = new Scanner(System.in);
        System.out.println("Numbers: ");
        for (int i = 0; i < 5; i++){
            x[i] = in.nextInt();
        }
    }
}
