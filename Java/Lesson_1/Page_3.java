package Java.Lesson_1;

public class Page_3 {
    public static void main(String[] args){
//----------------(Функции и методы)-------------------------
// Функции и методы — это технически одно и то же. Функции могут не принадлежать классам, а методы принадлежат. В java все функции являются методами.
        System.out.println("Функции и методы");

        Page_3_library.sayHi();
        System.out.println(Page_3_library.sum(1, 3));
        System.out.println(Page_3_library.factor(5));
        System.out.println();


//----------------(Управляющие конструкции)-------------------------
        System.out.println("Управляющие конструкции");

        // Вариант 1.
        int a = 1, b = 2;
        int c;
        if(a > b){
            c = a;
        }else{
            c = b;
        }
        System.out.println(c);

        // Вариант 2.
        int a2 = 1, b2 = 2;
        int c2 = 0;
        if(a2 > b2) c2 = a2;
        if(b2 > a2) c2 = b2;
        System.out.println(c2);

        // Вариант 3 (тернарный оператор).
        int a3 = 1, b3 = 2;
        int min = a3 < b3 ? a3 : b3;   // Если условие выполняется, то возвращается выражение до двоеточия, а если нет после (только так).
        System.out.println(min);
        System.out.println();


//----------------(Оператор выбора)-------------------------
        System.out.println("Оператор выбора: switch.");

        int k = 1;
        switch (k){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("a");   // если хотя бы одно условие выполнится (1 - 5)
                break;
            case 10:
                System.out.println("b");
                break;
            default:
                System.out.println("Out of range.");
                break;
        }
        System.out.println();


/*----------------(Циклы)-------------------------
    Цикл — это многократное выполнение одинаковой последовательности действий.

    В java доступны следующие циклы:
    - цикл while;
    - цикл do while;
    - цикл for; и его модификация for in (для перебора коллекций)
*/
        System.out.println("Циклы");

        // while
        int value = 321, count = 0;

        while (value != 0){
            value /= 10;
            count++;
        }
        System.out.println("while: " + count);

        // do while (сначала делает потом проверяет)
        do{
            value /= 10;
            count++;
        }while (value != 0);
        System.out.println("do while: " + count);

        //  БЫДЛО КОД. Операторы для управления циклами — continue и break.
        //  Выполнение следующей итерации цикла — continue. Прерывание текущей итерации цикла — break. * ближайшего к оператору
        System.out.print("Быдло код: ");
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) continue;  // continue - прерывает итерацию, цикл продолжается. break - прерывает цикл.
            System.out.print(i);
        }

        for (int i = 0; i < 10; i++) {
            if ( i < 4)break;
            for (int j = 0; j < 5; j++) {
                break;
            }
            if (i > 7)break;
        }

        // for
        int s = 0;
        for (int i = 1; i <= 10; i++){
            s += i;
        }
        System.out.println("\nfor: " + s);

        // for: вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // for: (foreach) работает только для коллекций
        int[] arr = {1, 2, 3, 4, 5, 77};
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
