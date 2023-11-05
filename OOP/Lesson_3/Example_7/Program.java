package OOP.Lesson_3.Example_7;

// три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));

        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
