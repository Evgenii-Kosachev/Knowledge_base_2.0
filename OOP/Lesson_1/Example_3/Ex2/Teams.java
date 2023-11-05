package OOP.Lesson_1.Example_3.Ex2;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;                                     // Команда из 10 персонажей.
        Random rand = new Random();

        int magicianCount = rand.nextInt(0, teamCount);   // Генерируем кол-во магов, от которых будет зависеть кол-во жрецов.
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];             // Храним жрецов.
        Magician[] magicians = new Magician[magicianCount];     // Храним магов.

        for (int i = 0; i < priestCount; i++) {                 // Заполняем массив жрецов.
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {               // Заполняем массив магов.
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }
    }
}
