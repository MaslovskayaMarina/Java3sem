import java.util.Scanner;
public class LeftRightAndRightLeft {
    private int N = 0;
    private static int k = 0;
    public LeftRightAndRightLeft (int N) {
        this.N = N;
        k = 0;
        while (this.N != 0) {
            this.N = this.N / 10;
            k++;
        }
        System.out.println("\nЧисло: " + N + "\nВывод слева направо");
        recursion1(N, k);
        System.out.println("Вывод справа налево");
        recursion2(N, k);
    }
    public static int recursion1(int N, int k) {
        if (k == 0) {
            System.out.println();
            return 0;
        }
        else {
            int s = 1;
            for (int i = 1; i < k; i++) s = s * 10;
            System.out.print(N / s + " ");
            N = N % s;
            k--;
            return recursion1(N, k);
        }
    }
    public static int recursion2(int N, int k) {
        if (k == 0) {
            System.out.println();
            return 0;
        }
        else {
            System.out.print(N % 10 + " ");
            N = N / 10;
            k--;
            return recursion2(N, k);
        }
    }
    public static int recursion3(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) return 0;
        else if (k % 2 == 1) System.out.println(num);
        k++;
        return recursion3();
    }
}
