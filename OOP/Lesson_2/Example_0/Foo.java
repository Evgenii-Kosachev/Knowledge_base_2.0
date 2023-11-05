package OOP.Lesson_2.Example_0;

class Doo extends Foo {        // Класс Doo расширяет класс Foo.
    public void M() {
        Foo.getCount();        // Имеет доступ к public методу, но не к private переменной.
        Foo.count = 12;        // Если переменной поменять статус на protected, она станет видна.
    }
}

public class Foo {
    public Integer value;                // Какая-то переменная внутри класса.

    protected static Integer count;      // Какая-то статическая переменная внутри класса. count = 0; - не правильно.
    static {                             // Статический инициализатор. Более правильная инициализация статических переменных.
        count = 0;                       // Вместо null будет писать 0.
    }
    public static Integer getCount() {   // Статический метод. Static - не имеет иерархии, ему не надо this, super. Стараться как можно меньше использовать static.
        return count;
    }   // Геттер.


    public Foo() {                       // Конструктор класса, увеличивающий статическую переменную на 1 после каждого обращения.
        count++;
    }


    public void printCount() {
        System.out.println(count);
    }
}
