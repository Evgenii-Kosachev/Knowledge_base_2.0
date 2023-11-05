package OOP.Lesson_1.Example_3.Ex2;

public class Magician extends BaseHero {     // Magician(дочерний) ---(наследник)--- BaseHero(родительский). Описывая конкретного Magician говорим, что он должен быть похож на BaseHero.
    private int mana;            // Особенность этого класса - мана.
    private int maxMana;


    public Magician() {
        /*
            После наследования можем использовать все то, что было в базовом классе.
            this.mana.     // Это поле было описано в текущем классе.
            this.name.     // Это поле было описано в базовом классе.

            Public, static, protected.
            Пример: protected int hp;
            То, что помечено модификатором доступа protected и public будет доступно в рамках текущего класса и всех классов наследников.

            Если раньше обращались к членам текущего класса через this, то теперь:
              this - обращение к членам текущего класса.
              super - обращение к членам базового класса. super.name = ";"; - пойти в базовый клас и поправить там name. Перейти можно - F12.
        */

        super(String.format("Hero_Magician #%d", ++Magician.number),  // Можем переиспользовать конструктор базового класса передавая ему какие-то аргументы.
                Magician.r.nextInt(100, 200));
        this.maxMana = Magician.r.nextInt(50, 150);       // До инициализации запаса манны.
        this.mana = maxMana;
    }


    public int Attack() {
        int damage = BaseHero.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }
    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);   // Добавляем к текущему getInfo отображение маны.
    }
}
