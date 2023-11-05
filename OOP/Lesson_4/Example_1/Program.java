package OOP.Lesson_4.Example_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
    // type save. Так правильно.
        List<String> list = new ArrayList<String>();   // Обобщение <String> в коллекции позволяет избежать ошибок.
        // List<String> list = new ArrayList<>();      // 9 и 10 строчки идентичны.
        // new ArrayList<>(); != new ArrayList();      // А 11 строка нет, отсутствует обобщение.

        for (int i = 1; i <= 5; i++) {
            list.add(String.format("string %d", i));
        }
        System.out.println(list);

//          list.add(123);  // Ошибка. Нельзя положить число в коллекцию строк List<String>.
        // Метод add(int, String) в списке типов<String> неприменим для аргументов (int)



    // raw type. Так делать нельзя.
        // ArrayList - это необработанный, сырой тип (нет <>). Ссылки на универсальный тип ArrayList<E> должны быть параметризованы
        List list2 = new ArrayList();    //  List list - интерфейс. ArrayList() - экземпляр класса.

        for (int i = 1; i <= 5; i++) {
            list2.add(String.format("string %d", i));
        }

        System.out.println(list2);
        System.out.println(allLength(list2));

        list2.add(123);
        System.out.println(list2);
        //System.out.println(allLength(list));
        // ClassCastException: класс java.lang. Целое число не может быть приведено к классу java.lang.Строка
    }



    static int allLength(List li) {
        int count = 0;
        for (Object o : li) {
            count += ((String)o).length();
        }
        return count;
    }
}
