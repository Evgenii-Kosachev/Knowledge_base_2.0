package OOP.Lesson_1.Example_3.Ex1;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();              // Создали мага.
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();                  // Создали жреца.
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();                  // Создали жреца 2.
        System.out.println(hero3.getInfo());
    }
}

/*
    Проблема 1. Код мага и жреца почти один в один повторяются. DRY - Don't repeat yourself.
    Решение: принцип наследования. Описываем общие состояния и поведения. При создании нового класса используем как шаблон частично или полностью описанный ранее.
*/