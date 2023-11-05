package OOP.Lesson_3.Example_0;

public class Program {
    public static void main(String[] args) {
//      Foo foo = new Foo();        // Сделать как раньше нельзя - абстрактный класс.


        Foo foo = new Foo() {       // Создаем анонимный экземпляр абстрактного класса.
            @Override
            public void m1() {
                System.out.println("m1");
            }
            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
        foo.m1();

        Foo foo2 = new Foo() {       // Создаем анонимный экземпляр абстрактного класса.
            @Override
            public void m1() {
                System.out.println(">>>m1");
            }

            @Override
            public void m2() {
                System.out.println(">>>m2");
            }
        };
        foo2.m1();  // Новое поведение.
    }
}
