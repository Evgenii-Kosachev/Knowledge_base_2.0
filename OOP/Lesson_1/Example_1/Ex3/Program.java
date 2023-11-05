package OOP.Lesson_1.Example_1.Ex3;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);          // Чтобы указывать значения при создании экземпляра класса, это поведение надо прописать в самом классе.

//        System.out.println(a);
//        System.out.println(a.toString());                  // toString() - метод который вызывается по умолчанию.
//        System.out.println(a.getInfo());                   // getInfo() - метод, с помощью которого задали формат вывода данных. Private, не можем к нему обратиться напрямую.
        System.out.println("a (" + a + ")");                 // Переопределили метод toString(). т.е. задали формат вывода данных (ссылается на getInfo()). А так можем.

        Point2D b = new Point2D(0);
        System.out.println("b (" + b + ")");

//        System.out.println(distance(a, b));                // Метод перенесен в класс Point2D.

                                                             // Если имеется static (public static double distance(Point2D a, Point2D b)),
                                                             // то необходимо обращаться через имя типа: Point2D.distance(a, b). Point2D a - экземпляр класса, а Point2D - тип.
        var dis = Point2D.distance(a, b);
        System.out.println("Дистанция " + dis);



//----------------------<<< public / private >>>--------------------------------
        //        a.x = 13;                                  (private)    Так сделать нельзя, доступ к переменной класса закрыт (запись).
        a.setX(12);
        a.setY(6);

//        System.out.println(a.x);                           (private)    Так сделать нельзя, доступ к переменной класса закрыт (чтение).
        System.out.println("a(x:" + a.getX() + ")");
        System.out.println("a(y:" + a.getY() + ")");

                                                             // Пример: аккаунт, пароль - не видит никто (private), никнейм - видят все (public).
    }
}
