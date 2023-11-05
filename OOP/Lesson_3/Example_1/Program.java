package OOP.Lesson_3.Example_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();    // Создаем коллекцию чисел.
        nums.add(1);                               // Наполняем коллекцию.
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();   // nums.iterator() - обращаемся итератором к нашей коллекции. iter - переменная итератора которая перебирает значения коллекции.
        while (iter.hasNext()) {                    // цикл. iter.hasNext() - пока есть следующий элемент итератора делать шаг.
            System.out.println(iter.next());        // iter.next() - шаг.
        }



        Worker worker = new Worker("Имя", "Фамилия", 23, 4567);

//        Iterator<Object> components = worker.iterator();   // Обратиться к методу итератора не получится т.к. он не реализован. Реализовать можно с помощью интерфейса.
    }
}
