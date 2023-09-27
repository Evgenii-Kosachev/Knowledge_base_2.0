package Program.Comparator;

import java.util.Comparator;

public class ComparatorByAvgMark implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return Double.compare(o1.getAvgMark(), o2.getAvgMark());
    }
}
