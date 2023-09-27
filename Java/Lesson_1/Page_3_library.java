package Java.Lesson_1;

public class Page_3_library {

//----------------(Функции и методы)-------------------------
    static void sayHi(){
        System.out.println("Hello Java!");
    }

    static int sum(int a, int b){
        return a + b;
    }

    static double factor(int number){
        if (number == 1) return 1;
        return number * factor(number - 1);
    }
}
