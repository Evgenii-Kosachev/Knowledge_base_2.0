package OOP.Lesson_1.Example_1.Ex2;

/*---------------(Класс и его экземпляры)---------------
    Класс - это чертеж, а экземпляр этого класса - объект. У класса может быть много объектов, а у объекта только один класс.
    В Java не поддерживается множественное наследование, это когда у одного объекта два "класса - родителя".
    Объекты одного класса похожи друг на друга, но могут иметь индивидуальные особенности.

    Таким образом, класс — это описание того, какими свойствами и поведением будет обладать объект.
    А объект — это экземпляр с собственным состоянием этих свойств.

    Поля – данные, описание класса.
    Методы – инструменты, определяют поведение класса.
*/
public class Program {
    // Так было раньше. Метод принимал 4 аргумента для 2 точек (по 2 на точку - координаты x и y)
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Теперь используем ООП: класс - Point2D, экземпляры класса - a и b.
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();             // Экземпляр класса - a
        a.x = 0;                               // Поля.
        a.y = 2;
        System.out.println(a.toString());

        Point2D b = new Point2D();            // Экземпляр класса - b
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());

        System.out.println(distance(a, b));   // Вычисляем дистанцию между точками.
    }
}
