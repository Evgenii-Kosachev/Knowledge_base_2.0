package OOP.Lesson_1.Example_1.Ex1;

// Стихийный подход + немного процедурного.
public class Incorrect {
    static double distance(int x1, int y1, int x2, int y2) {                 // Метод считающий расстояние.
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        int aX = 0, aY = 0;
        int bX = 0, bY = 1;

        System.out.println(distance(aX, aY, bX, bY));
        // Создать точку
        // Печать точки
    }
}
