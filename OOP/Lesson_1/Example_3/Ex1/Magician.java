package OOP.Lesson_1.Example_3.Ex1;

import java.util.Random;

public class Magician {
    private static int number;           // Номер персонажа.
    private static Random r;             // Рассчитывает атаку.


    //-----------------<<< Поля класса >>>-------------------
    private String name;
    private int hp;
    private int maxHp;
    private int mana;             // Особенность класса персонажа: Маг - мана, Хил - эликсир.
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }


//-----------------<<< Методы класса >>>-------------------
    public Magician(String name, int hp, int mana) {                  // Конструктор создания персонажа.
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }
    public Magician() {                                                // Конструктор
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }


    public int Attack() {                                               // Механизм атаки.
        int damage = Magician.r.nextInt(20, 30);
        this.mana -= (int) (damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }
    public void healed(int Hp) {                                       // Лечение персонажа.
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    public void GetDamage(int damage) {                                // Получение урона.
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
    public String getInfo() {                                          // Получение информации.
        return String.format("Name: %s  Hp: %d Energy:  %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }
}
