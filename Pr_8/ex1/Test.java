public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(12, "Ольга"),
                new Student(10, "Артём"),
                new Student(189, "Кирилл"),
                new Student(2, "Дарья")
        };
        System.out.println("Был создан список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        Student temp;
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            for (; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j + 1] = students[j];
            }
            students[j + 1] = current;
        }
        System.out.println("Произошла сортировка вставками по ID!");
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
