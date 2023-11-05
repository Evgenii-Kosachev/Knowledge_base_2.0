package OOP.Lesson_1.Example_2;

import java.util.ArrayList;

public class Robot3 {
    enum State {        // Состояние робота: On/Off.
        On, Off
    }

    // В системе не допускается использование нескольких персонажей с одинаковыми именами.
    private static int defaultIndex;               // Дефолтный индекс для нумерации персонажей.
    private static ArrayList<String> names;        // Коллекция имен.

    // Запускаем систему контроля.
    static {
        defaultIndex = 1;                 // Индекс будет начинаться с 1.
        names = new ArrayList<String>();  // Коллекция имен пустая.
    }

//---------------------<<< Поля класса >>>------------
    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    private State state;    // Состояние робота: On/Off.

    /**
     * Создание робота
     *
     * @param name  Имя робота! Не должно начинаться с цифры
     * @param level Уровень робота
     */
    // Вариант 1.
    private Robot3(String name, int level) {
        System.out.println(Character.isDigit(name.charAt(0)));
        if ((name.isEmpty()                                               // Если у робота нет имени - true,
                || Character.isDigit(name.charAt(0)))                     // имя начинается с цифры - true,
                || Robot3.names.indexOf(name) != -1) {                    // такое имя уже в коллекции - true.
            this.name = String.format("DefaultName_%d", defaultIndex++);  // По умолчанию будет использоваться это имя.
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);  // Добавляем имя в коллекцию.
        this.level = level;           // Инициализация уровня.
        this.state = State.Off;       // Инициализация состояния (по умолчанию Off).
    }



/*--------(Вариант 2. То же самое, только конструктор с одним аргументом: имя)--------
    public Robot3(String name) {
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot3.names.indexOf(name) == -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = 1;                   // По умолчанию присваивается 1 уровень.
        this.state = State.Off;
    }
*/



/*--------(Вариант 3. То же самое, только конструктор без аргументов)--------
    public Robot3() {
        this.name = String.format("DefaultName_%d", defaultIndex++);
        Robot3.names.add(this.name);
        this.level = 1;
        this.state = State.Off;
    }
*/

    // правильные конструкторы
    public Robot3(String name) {  // Конструктор с одним параметром вызывает
        this(name, 1);       // конструктор с двумя аргументами.
    }

    public Robot3() {             // Конструктор без параметров вызывает
        this("");           // конструктор с одним параметром передавая в качестве аргумента пустую строку.
    }                             // Пользователь может указать имя или обойтись именем по умолчанию.


//---------------------<<< Методы класса >>>------------
    // Методы вкл\выкл подсистем

    public void power() {
        if (this.state == State.Off) {  // Если система выключена,
            this.powerOn();             // включить ее,
            this.state = State.On;      // поменять состояние.
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }
    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }


    public int getLevel() {
        return this.level;
    }
    public String getName() {
        return this.name;
    }

    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /** Работа */
    public void work() {
        if (this.state == State.On) {           // Если состояние включено
            System.out.println("Working...");   // задачу можно решать.
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name, this.level);
    }
}
