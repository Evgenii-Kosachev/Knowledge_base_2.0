package Program.Comparator;

public class Student2 implements Comparable<Student2> {
    private final String name;
    private final double avgMark;

    public Student2(String name, double avgMark) {
        this.name = name;
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "{n='" + name + '\'' + ", m=" + avgMark + '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public double getAvgMark() {
        return avgMark;
    }
}
