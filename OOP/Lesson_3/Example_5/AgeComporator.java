package OOP.Lesson_3.Example_5;

import java.util.Comparator;

public class AgeComporator implements Comparator<Worker> {   // Такое решение позволяет изменять критерии сортировки.
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
