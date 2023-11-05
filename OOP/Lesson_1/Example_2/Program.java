package OOP.Lesson_1.Example_2;

/*-----------------(Инкапсуляция)-----------------------
    Инкапсуляция – это свойство системы, позволяющее объединить данные и методы, работающие с ними в классе,
    скрыв детали реализации и защитив от пользователя этого класса объектов.

    Объединение данных, логики их обработки и сокрытие деталей их реализации.
*/
public class Program {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("name_1", 1);          // Создаем экземпляр класса, присваиваем значения: имя, уровень.
        System.out.printf("%s %d\n", robot1.name, robot1.level);     // Информация о роботе.

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        robot1.sayBye();
        robot1.stopOS();
        robot1.stopBIOS();
        System.out.println();
/*
    Проблема 1. Пользователь имеет доступ ко всем командам. Нарушив последовательность исполнения можно "сломать" систему.
    Решение: ограничить свободу действия пользователя.

    Проблема 2. Пользователь имеет доступ ко всем данным. Внесение не корректных данных может "сломать" программу.
*/



        Robot2 robot2 = new Robot2("name_2", 1);
        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());

        robot2.powerOn();
        robot2.work();
        robot2.work();
        robot2.work();
        robot2.powerOff();
/*
    Проблема 1. Пользователь по-прежнему влияет на очередность запуска команд. Может попробовать выполнить работу на выключенной системе.
    Решение: ограничить свободу действия пользователя.
*/



        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);

        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
    }
}
