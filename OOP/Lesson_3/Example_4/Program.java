package OOP.Lesson_3.Example_4;

import OOP.Lesson_3.Example_4.ExBeverage.Coffee;
import OOP.Lesson_3.Example_4.ExBeverage.Water;

// Адаптируем предыдущий код для использования вместо итератора foreach.
// Для этого необходимо реализовать иной интерфейс.

// Проблема: три вода.

public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));

        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
