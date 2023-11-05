package OOP.Lesson_2.Example_0;

// Подробнее о static.
public class Program {
//    public static void A() {                  // Используя static.
//        System.out.println("A()");
//    }
    public void A() {                           // Не используя static.
        System.out.println("A()");
    }


    public static void main(String[] args) {
//        A();                                  // Используя static.
        Program program = new Program();        // Не используя static.
        program.A();
        //----------------------------------------------------------------------



        Foo f1 = new Foo();                   // Экземпляр класса.
        f1.value = 123;                       // Поле value для каждого экземпляра класса свое. Используем его через имя экземпляра - f1.
//        System.out.println(f1.value);

        f1.printCount();                      // Null. Значение не инициализировано.


//        Foo.count = 123000;                 // Статическая переменная для всех экземпляров класса едина. Используем через имя типа.
                                              // Для static не используют this, super. Доступность можно регулировать модификаторами доступа: public, private, protected.
        System.out.println(Foo.getCount());


        Foo f2 = new Foo();
        f2.value = 222;
//        System.out.println(f2.value);

        f2.printCount();


        Foo f3 = new Foo();
        f3.value = 444;
//        System.out.println(f3.value);

        f3.printCount();
    }
}
