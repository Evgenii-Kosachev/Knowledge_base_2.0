package OOP.Lesson_1.Example_3.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*-----------------(Полиморфизм)-----------------------
    Полиморфизм – это свойство системы, позволяющее использовать объекты с одинаковым интерфейсом без информации о типе и внутренней структуре объекта.
    Полиморфизм - это способность использовать объект вне зависимости от его реализации, благодаря, полиморфной переменной – это переменная, которая может принимать значения разных типов.
    Полиморфизм - это способность функции работать с данными разных типов.
*/
public class Program {
    public static void main(String[] args) {
        // BaseHero hero3 = new Magician();      // BaseHero - базовый класс, hero3 - экземпляр базового класса. В экземпляр базового класса положили экземпляр мага - Magician().
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();        // BaseHero - базовый класс, hero3 - экземпляр
        // System.out.println(hero4.getInfo());


    // Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);
        // hero4.Attack(hero3);

        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());



    // Teams
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;


        List<BaseHero> teams = new ArrayList<>();    // Коллекция базового класса, в которой хранятся персонажи разного типа.
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {       // Если 0 - создаем жреца.
                teams.add(new Priest());
                priestCount++;
            }
            else{
                teams.add(new Magician());          // Если 1 - создаем мага.
                magicianCount++;
            }
            System.out.println(teams.get(i).getInfo());
        }

        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);


    // todo добавить ещё один класс и
    // реализовать возможность лечения героев
    }
}
