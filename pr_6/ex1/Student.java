public class Student implements Comparable {
    private int iDNumber;
    private String name;
    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }
    @Override
    public String toString() {
        return "ID="+iDNumber+" Name= "+name;
    }
    @Override
    public int compareTo(Object o) {
        return this.iDNumber - ((Student) o).iDNumber;
    }
}
