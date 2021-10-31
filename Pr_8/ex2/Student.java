public class Student {

    private int GPA;
    private String name;

    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "GPA= " + GPA + " Name= " + name;
    }
}
