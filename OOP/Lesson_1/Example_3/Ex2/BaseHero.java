package OOP.Lesson_1.Example_3.Ex2;

import java.util.Random;

// В первую очередь описываем все то, что присутствует у всех персонажей: номер, имя, запас жизни, функция рандом
public class BaseHero {
    protected static int number;
    protected static Random r;


    protected String name;
    protected int hp;
    protected int maxHp;
    static {                           // Инициализатор статических полей.
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }


    public BaseHero(String name, int hp) {    // Конструктор персонажа.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }
    public BaseHero() {                                               // Конструктор персонажа по умолчанию.
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }


    public void healed(int Hp) {                                           // Лечение
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    public void GetDamage(int damage) {                                   // Получение урона
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
    public String getInfo() {                                               // Получение информации.
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
}
