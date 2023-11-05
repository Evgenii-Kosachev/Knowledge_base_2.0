package OOP.Lesson_3.Example_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();

    // Collections.sort(numbers); - стандартная сортировка коллекции чисел.
//         List<Integer> numbers = new ArrayList<>();   // Коллекция чисел.

//         for (int i = 0; i < 10; i++) {               // Добавляем числа в коллекцию.
//            numbers.add(r.nextInt(1,20));
//         }

//         System.out.println(numbers);
//         Collections.sort(numbers);
//         System.out.println(numbers + "\n");



    // Comparable<Worker> - не стандартная сортировка коллекции (наш класс).
//         List<Worker> db = new ArrayList<>();   // Коллекция Worker.

//         for (int i = 0; i < 5; i++) {          // Заполняем коллекцию.
//             db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18,31),
//             r.nextInt(10000)));
//         }
//         System.out.println(db);

//         Collections.sort(db);          // Сортируем коллекцию (по возрасту).
        // Array.sort(...)

//         System.out.println(db);



    // Comparable<Worker>
        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt(18, 31), r.nextInt(10000)));
        }
        System.out.println(db);

//         db.sort(new AgeComporator());                        // Сортировка по возрасту с помощью компаратора.
        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));   // Сортировка с помощью лямбда выражения.
        System.out.println(db);



        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
    }
}
