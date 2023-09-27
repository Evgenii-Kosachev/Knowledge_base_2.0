package Program.Comparable;

public class Student implements Comparable<Student> {
    private final String name;
    private final double avgMark;

    public Student(String name, double avgMark) {
        this.name = name;
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "{n='" + name + '\'' + ", m=" + avgMark + '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
