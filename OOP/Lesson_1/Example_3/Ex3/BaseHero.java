package OOP.Lesson_1.Example_3.Ex3;

import java.util.Random;

public class BaseHero {
    protected static int number;
    protected static Random r;


    protected String name;
    protected int hp;
    protected int maxHp;
    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }


    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }
    public BaseHero() {
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }


    public void Attack(BaseHero target) {                       // Атака из класса персонажа вынесена теперь в базовый класс. Передается в него переменная базового типа. Урон рассчитывается здесь с особенностью конкретного персонажа.
        int damage = BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
}
