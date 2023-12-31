package Java.Lesson_2;
/*------------------(Знакомство с API и как им пользоваться)-------------------------

    API (Application programming interface) — это контракт, который предоставляет программа. «Ко мне можно обращаться так и так, я обязуюсь делать то и это».
    Что такое API для нас: Это возможности, который предоставляют разработчики языка для удобного взаимодействия с его функционалом.

    Что такое API для нас в Java:
    1. Строки,
    2. Работа с файловой системой,
    3. Логирование,
    4. Импорт,
    5. XML.
*/
public class Page_1 {
    public static void main(String[] args) {
//-------------------------(Строки)----------------------
        // Создать строку из 1 млн плюсиков. Пример 1 (не оптимальный ~ 41000 ms).
        var s = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }

        // Пример 2 (оптимальный ~ 9 ms). Использование StringBuilder вместо String.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }

        System.out.println(System.currentTimeMillis() - s);
        System.out.println(str);
        System.out.println(sb);

/*---------<< Полезно знать: >>-------
    concat():                объединение строк
    valueOf():               преобразует Object в строковое представление (завязан на toString())
    join():                  объединяет набор строк в одну с учетом разделителя
    charAt():                получение символа по индексу
    indexOf():               первый индекс вхождения подстроки
    lastIndexOf():           последний индекс вхождения подстроки
    startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
    replace():               замена одной подстроки на другую

    trim():                      удаляет начальные и конечные пробелы
    substring():                 возвращает подстроку, см.аргументы
    toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
    сompareTo():                 сравнивает две строки
    equals():                    сравнивает строки с учетом регистра
    equalsIgnoreCase():          сравнивает строки без учета регистра
    regionMatches():             сравнивает подстроки в строках
*/

        // Строка и массив символов не одно и тоже в Java. Для того, что бы из строки сделать набор символов надо это явно указать.
        String[] name = { "C", "е", "р", "г", "е", "й" };       // Массив символов
        String sk = "СЕРГЕЙ КА.";                               // Строка

        System.out.println(sk.toLowerCase());                                                  // сергей ка. Все с маленькой буквы.
        System.out.println(String.join("", name));                                     // Cергей. Весь массив символов разом.
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));   // Cергей
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));  // C,е,р,г,е,й
/*
        String vs StringBuilder. Какой тип данных когда использовать.
    Много изменений – String.              Изменение уже имеющихся строк.
    Много преобразований – StringBuilder.  Создание новых строк.
*/
    }
}
