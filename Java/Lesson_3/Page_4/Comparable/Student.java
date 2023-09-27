package Java.Lesson_3.Page_4.Comparable;

// Для создания возможности сортировки, необходимо научить сравнивать объекты с другими такого-же типа.
// И такая реализация будет использоваться по-умолчанию при сравнении объектов одного класса (implements Comparable<Student>).
public class Student implements Comparable<Student> {
    // поля класса
    private final String name;
    private final double avgMark;

    // конструктор класса на основе которого создаются его экземпляры
    public Student(String name, double avgMark) {
        this.name = name;
        this.avgMark = avgMark;
    }



  // В Java есть встроенные аннотации. @Override у метода — говорит о том, что родительский метод переопределён в наследнике.

    // задаем способ вывода в консоль
    @Override
    public String toString() {
        return "{n='" + name + '\'' + ", m=" + avgMark + '}';
    }

    // реализуем метод compareTo (необходим для сравнения), список сортируется по полю name
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
