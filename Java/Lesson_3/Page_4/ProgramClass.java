package Program;


import Program.Comparable.Student;
import Program.Comparator.ComparatorByAvgMark;
import Program.Comparator.Student2;

import java.util.Arrays;
import java.util.Collections;

public class ProgramClass {
    public static void main(String[] args) {
    // sort()
        //создание списка на основе массива
        var stringList = Arrays.asList("z", "b", "c", "a", "k", "z");
        System.out.println(stringList);

        //сортировка списка в порядке возрастания
        Collections.sort(stringList);
        System.out.println(stringList);

        //сортировка списка в обратном направлении
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println(stringList);

        System.out.println();



    // Comparable<T>
        var ivan = new Student("Иван", 4.3);
        var olga = new Student("Ольга", 3.8);
        var eugene = new Student("Женя", 4.9);

        var studentList = Arrays.asList(ivan, olga, eugene);
        System.out.println(studentList);

        //сортировка списка
        Collections.sort(studentList);
        System.out.println(studentList);

        System.out.println();



    // Comparator<T>
        var ivan2 = new Student2("Иван", 4.3);
        var olga2 = new Student2("Ольга", 3.8);
        var eugene2 = new Student2("Женя", 4.9);

        var studentList2 = Arrays.asList(ivan2, olga2, eugene2);
        System.out.println(studentList2);

        //сортировка списка с использованием компаратора
        Collections.sort(studentList2, new ComparatorByAvgMark());
        System.out.println(studentList2);
    }
}
