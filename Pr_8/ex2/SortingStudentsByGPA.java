import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object A, Object B) {
        return ((Student) A).getGPA() - ((Student) B).getGPA();
    }
}
