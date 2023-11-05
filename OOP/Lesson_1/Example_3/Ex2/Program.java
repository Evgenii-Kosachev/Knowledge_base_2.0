package OOP.Lesson_1.Example_3.Ex2;

/*-----------------(Наследование)-----------------------
    Наследование – это свойство системы, позволяющее описать новый класс на основе уже существующего, с частично или полностью заимствующейся функциональностью.

    Класс, от которого производится наследование, называется базовым или родительским.
    Новый класс – потомком, наследником или производным классом.
*/
public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());         // Герой2 атакует героя3.
        hero3.GetDamage(hero3.Attack());         // Герой3 атакует героя3. Не корректно.
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
        //hero3.GetDamage(hero3.Attack());
    }
}
