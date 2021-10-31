public class Student implements Comparable <Student>{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name= " + name;
    }

    @Override
    public int compareTo(Student B) {
        return this.name.compareTo(B.name);
    }
}
