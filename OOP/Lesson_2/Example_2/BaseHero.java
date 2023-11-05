package OOP.Lesson_2.Example_2;

import java.util.Random;

public abstract class BaseHero {              // Добавили abstract. Теперь класс BaseHero является абстрактным.
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



    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
    protected void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }
    protected void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else { die(); }
    }



    public abstract void die();  // Abstract метод. У каждого наследника будет этот метод, но со своей реализацией. Наследникам, через @Override необходимо редактировать его под себя.

}
