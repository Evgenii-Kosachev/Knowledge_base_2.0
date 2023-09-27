package Java.Lesson_3.Page_4;

import Java.Lesson_3.Page_4.Comparable.Student;
import Java.Lesson_3.Page_4.Comparator.ComparatorByAvgMark;
import Java.Lesson_3.Page_4.Comparator.Student2;

import java.util.Arrays;
import java.util.Collections;

/*------------(Сортировка коллекций)-----------------
    Простое использование метода sort().
      Если у нас в списке находятся объекты классов, которые известно как сравнить, то достаточно просто вызвать метод sort() и передать туда список.
      Таким образом в списке элементы поменяют порядок и будут отсортированы в порядке возрастания.
      Так мы можем сортировать множество стандартных классов, таких как String, Integer, Double, Character и множество других.
      Если мы хотим сортировать элементы в обратном порядке. То для этого используется дополнительный аргумент в методе сортировки: Collections.reverseOrder().

    Добавляем возможность сортировки своих классов.
      Если стандартные классы уже готовы к сортировке, то если мы напишем свой класс, Java не будет знать как ей сравнивать с объектами этого же класса.
      - Comparator<T>   - используем когда надо сравнивать элементы разных классов.
        Создаем класс Comparator. В этом классе нужно реализовать метод compare(T o1, T o2):
        - Если объект о1 меньше, чем объект о2, то необходимо вернуть отрицательное число.
        - Если объекты равны, то ноль.
        - Если объект o1 больше, чем o2, то возвращаем положительное число.
        Если нужен обратный порядок сортировки, то не нужно создавать еще один компаратор, можно воспользоваться методом reversed().
        Такой вариант отлично подходит, когда нам надо сортировать объекты по разным правилам и можем использовать нужный нам класс Comparator.

      - Comparable<T>    - используем когда надо сравнивать только элементы этого класса.
        Не обязательно создавать отдельный класс для сортировки. Можно добавить интерфейс Comparable тому классу, который необходимо будет сортировать
        и прописать правила сравнения в методе compareTo(T o). Тогда не потребуется указывать каждый раз компаратор, данное правило сравнение будет по-умолчанию для этого объекта.
        Обратный порядок сортировки делается также методом reverse();
*/

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
