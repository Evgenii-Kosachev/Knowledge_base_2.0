package OOP.Lesson_1.Example_2;

public class Robot2 {
//---------------------(Поля класса)------------
    // Сделали поля класса private. Теперь они доступны только для чтения: getName(), getLevel().

    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота! Не должно начинаться с цифры.
     * @param level Уровень робота.
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
    }


//---------------------<<< Методы класса >>>------------
    // Сделали методы класса private. Теперь они запускаются только: powerOn(), powerOff(). Эти два метода доступны пользователю и один work().
    // Методы вкл\выкл подсистем

    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){
        return this.level;
    }

    public String getName(){
        return this.name;
    }

    /**Загрузка BIOS */
    private void startBIOS() { System.out.println("Start BIOS..."); }

    /**Загрузка OS */
    private void startOS() { System.out.println("Start OS..."); }

    /**Приветствие */
    private void sayHi() { System.out.println("Hello world..."); }

    /**Выгрузка BIOS */
    private void stopBIOS() { System.out.println("Stop BIOS..."); }

    /**Выгрузка OS */
    private void stopOS() { System.out.println("Stop OS..."); }

    /**Прощание */
    private void sayBye() { System.out.println("Bye..."); }

    /**Работа */
    public void work() { System.out.println("Working..."); }
}
