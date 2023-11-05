package OOP.Lesson_3.Example_2;

import OOP.Lesson_3.Example_2.Ex3_Beverage.*;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
    // Intro Iterator
//     List<Integer> nums = new ArrayList<>();
//     nums.add(1);
//     nums.add(12);
//     nums.add(123);
//     nums.add(1234);
//     nums.add(12345);
//
//     Iterator<Integer> iter = nums.iterator();
//     while (iter.hasNext()) {
//         System.out.println(iter.next());
//     }



    // Worker Iterator
        Worker worker = new Worker("Имя", "Фамилия", 23, 4567);  // Создали экземпляр Worker

        // Iterator<Integer> iter = nums.iterator();   // Явно обращаемся к методу итератора.
        Iterator<String> components = worker;          // На прямую обращаемся итератором к экземпляру класса worker. В классе должен быть прописан итератор.

        while (components.hasNext()) {
            System.out.println(worker.next());
        }
        System.out.println();



    // Beverage Iterator
        Beverage latte = new Coffee();                 // Процесс создания напитка типа кофе.
        latte.addComponent(new Water("Вода"));   // Добавляем компоненты.
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;         // Пробегаемся итератором по компонентам напитка.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
