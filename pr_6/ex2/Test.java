public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
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
        SortingStudentsByGPA temp;
        quickSort(students, 0,students.length-1);
        System.out.println("Произошла быстрая сортировка по GPA!");
        System.out.println();
        for (Student s : students) {
            System.out.println(s);
        }
    }
    public static void quickSort(Student[] source, int leftBorder, int rightBorder) {
        SortingStudentsByGPA P =  new SortingStudentsByGPA();
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student current = source[(leftMarker + rightMarker) / 2];
        do {
            while (P.compare(current, source[leftMarker]) < 0) {
                leftMarker++;
            }while (P.compare(current, source[rightMarker]) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}