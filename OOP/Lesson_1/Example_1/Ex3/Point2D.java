package OOP.Lesson_1.Example_1.Ex3;

// Принцип dry - Don’t repeat yourself — «не повторяйтесь». Когда пишется код, всегда необходимо думать о том,
// как можно переиспользовать тот или иной фрагмент, что можно выделить в универсальную функцию или класс, сделать модулем.


/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y;                        // Это координата х и у. По умолчанию public: int x, y;
                                             // Private - закрывает доступ к переменной экземплярам класса (от несанкционированного доступа).
                                             // Получить доступ можно через геттеры и сеттеры.


/*--------------------------< Как это могло быть (неправильно) >---------------
    public Point2D() {                       Теперь это наш конструктор по умолчанию, который заполняет значения нулями. Можно задать другое поведение по умолчанию.
        x = 0;
        y = 0;
    }

    public Point2D(int value) {              Если будет указано одно значение, оно будет присвоено двум точкам. Point2D(10) вместо Point2D(10, 10).
        x = value;
        y = value;
    }
*/



//---------------------------<<< То как должно быть >>>
    /**
     * Это конструктор ... просто пишем /** и enter.
     * @param valueX это координата X
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) {  // Это не метод (нет никакого возвращаемого типа), а конструктор. Указываем аргументы конструктора: valueX и valueY.
        x = valueX;
        y = valueY;

                                              // Конструктором задается поведение класса.
                                              // До тех пор, пока пользователь не создал свой конструктор используется конструктор по умолчанию.
    }

    public Point2D(int value) {
//        x = value;
//        this.x = value;                     // this. - обращение к чему угодно в рамках класса. Можно не писать, но с ним понятней.
        this(value, value);                   // Используем конструктор: Point2D(int valueX, int valueY)
    }

    public Point2D() {                        // Будет вызываться первым. Затем с одним значением и т.д. (по умолчанию)
        this(0);
    }



//------------------------------(Разграничение прав доступа: геттеры и сеттеры)------------------------
    public int getX() {            // Чтение x
        return x;
    }

    public int getY() {            // Чтение y
        return y;
    }

    public void setX(int value){   // Запись x
        this.x = value;
    }

    public void setY(int value){   // Запись y
        this.y = value;
    }



//-------------------------------------------------------------------------------
    // Метод, с помощью которого задали формат вывода данных. Public - виден всем, private - только внутри класса.
    private String getInfo(){
        return String.format("x: %d; y: %d", x , y);
    }

    // Переопределение метода toString(). Переопределить - значит изменить существующий, а перегрузить - значит создать новый.
    @Override
    public String toString() {
        return getInfo();                  // Ссылается на getInfo().
    }

    // Метод, который рассчитывает дистанцию.
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }























    //    /**
//     * Это конструктор ...
//     * @param valueX это координата Х
//     * @param valueY это координата Y
//     */
//    public Point2D(int valueX, int valueY) {
//        x = valueX;
//        y = valueY;
//    }
//
//    public Point2D(int value) {
//        this(value, value);
//    }
//    public Point2D() {
//        this(0);
//    }
//
//    public int getX(){
//        return x;
//    }
//
//    public int getY(){
//        return y;
//    }
//
//    public void setX(int value){
//        this.x = value;
//    }
//
//    public void setY(int value){
//        this.y = value;
//    }
//
//
//    private String getInfo(){
//        return String.format("x: %d; y: %d", x, y);
//    }
//    @Override
//    public String toString() {
//        return getInfo();
//    }
//
//    public static double distance(Point2D a, Point2D b) {
//        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
//    }
}
