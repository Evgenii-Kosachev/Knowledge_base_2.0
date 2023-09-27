package Java.Lesson_1;

import java.util.Scanner;

public class Page_2 {
    public static void main(String[] args){
/*----------------(Получение данных из терминала)-------------------------
    Класс Scanner умеет считывать данные из разных источников: консоль, файлы, интернет.

    System.in - чтение с консоли.
    System.out - вывод в консоль.

    Преобразование данных в тип.
     next() - считывает одно «слово». Слова разделяются пробелами или enter.
     nextLine() - считывает целую строку.
     nextInt() - считывает данные и преобразует их в тип int.
     nextByte(), nextShort(), nextLong(), nextFloat(), nextDouble() — работают аналогично.


    Проверка данных на соответствие типу (возвращают true или false).
     hasNext() — проверяет, являются ли данные словом.
     hasNextLine() — проверяет, являются ли данные строкой.
     hasNextInt() — проверяет, являются ли данные числом.
     hasNextByte(), hasNextShort(), hasNextLong(), hasNextFloat(), hasNextDouble() — работают аналогично.

    useDelimeter() - разделитель строки.

    Регулярные выражения (RegEx) - это шаблон для поиска строки в тексте.
*/
        System.out.println("Получение данных из терминала: Scanner");

        // простая работа
        Scanner iScanner = new Scanner(System.in);    // iScanner - переменная, экземпляр класса Scanner.
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        // смешанные данные
        Scanner eScanner = new Scanner(System.in);
        System.out.print("int a: ");
        int x = eScanner.nextInt();
        System.out.print("double a: ");
        double y = eScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        eScanner.close();

        // сложение
        String s = "10 20 40";                // по умолчанию разделитель это пробел
        Scanner scanner = new Scanner(s);
//        int i = scanner.nextInt();    // 10
//        int ii = scanner.nextInt();   // 20
//        System.out.println(i + ii);   // 10+20=30
        System.out.println(scanner.nextInt() + scanner.nextInt());   // или так
        scanner.close();

        // разделитель\печать строки.
        Scanner scan = new Scanner("Anna Mills/Female/18");
//        Scanner scan = new Scanner("Anna Mills/Female/18").useDelimiter("/");   // или так
        scan.useDelimiter("/");       // указываем разделитель / Можно и без этой строчки.
        while(scan.hasNext()){
            System.out.println(scan.next());
        }           // распечатываем строки
        scan.close();                        // закрываем сканер

        // проверка данных на соответствие получаемого типа
        Scanner ssc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (ssc.hasNextInt()) {
            int numbers = ssc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + numbers);
        } else {
            System.out.println("Извините, но это явно не число!");
        }
        ssc.close();


/*----------------(Форматированный вывод)-------------------------
    Виды спецификаторов:
     %d: для целочисленных значений
     %x: для вывода шестнадцатеричных чисел
     %f: для вывода чисел с плавающей точкой
     %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
     %c: для вывода одиночного символа
     %s: для вывода строковых значений
*/
        System.out.println("Форматированный вывод");

        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;   // собираем строку в ручную
        System.out.println(res);

        int l = 1, p = 2;
        int z = l + p;
        String result = String.format("%d + %d = %d \n", l, p, z);  // так присваиваем отформатированные данные переменной.
        System.out.printf("%d + %d = %d \n", l, p, z);
        System.out.println(result);

        // Спецификаторы
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);
        System.out.printf("%.2f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%e\n", pi);
        System.out.printf("%.2e\n", pi);
        System.out.printf("%.3e\n", pi);
        System.out.println();


//----------------(Область видимости переменных)-------------------------
// У переменных существует понятие «область видимости».
// Если переменную объявили внутри некоторого блока фигурных скобок { }, то снаружи этого блока переменная будет недоступна.
        int f = 111;                     // Здесь переменную не можем назвать 'n'. Что доступно снаружи, доступно и внутри.
        {
            int n = 123;                // Область видимости этой переменной ограничено фигурными скобками. Что находится внутри, недоступно снаружи.
            System.out.println(n + f);
        }
        int n = 222;                    // А здесь можем.
        System.out.println(n);
    }
}
