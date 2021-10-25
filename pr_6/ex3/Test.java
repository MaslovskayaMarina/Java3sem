public class Test {
    public static void main(String[] args) {
        Student[] students1 = new Student[] {
                new Student("Ольга"),
                new Student("Артём"),
                new Student("Кирилл"),
                new Student("Дарья")
        };
        Student[] students2 = new Student[] {
                new Student("Виталий"),
                new Student("Виталина"),
                new Student("Анастасия"),
                new Student("Яна")
        };
        System.out.println("Первый список студентов:");
        for (Student s : students1) {
            System.out.println(s);
        }
        System.out.println("\nВторой список студентов:");
        for (Student s : students1) {
            System.out.println(s);
        }
        System.out.println();
        Student[] students3 = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, students3,0,students1.length);
        System.arraycopy(students2, 0, students3,students1.length, students2.length);
        mergeSort(students3, 0, students3.length-1);
        System.out.println("Произошла сортировка слиянием!");
        System.out.println();
        for (Student s : students3) {
            System.out.println(s);
        }
    }
    static void mergeSort(Student[] students, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(students, lo, mid);
        mergeSort(students, mid + 1, hi);
        Student[] buf = new Student[students.length];
        System.arraycopy(students, 0, buf, 0, students.length);
        for (int k = lo; k <= hi; k++) {
            buf[k] = students[k];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                students[k] = buf[j];
                j++;
            }
            else if (j > hi) {
                students[k] = buf[i];
                i++;
            }
            else if (buf[j].compareTo(buf[i]) <= 0) {
                students[k] = buf[j];
                j++;
            }
            else {
                students[k] = buf[i];
                i++;
            }
        }
    }
}
