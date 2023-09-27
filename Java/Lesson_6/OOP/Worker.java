package Java.Lesson_6.OOP;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;


    // задаем способ вывода в консоль
    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s s:%d", id, firstName, lastName, salary);
    }

    // Необходимо для сравнения экземпляров класса. Переопределяем хеш-код.
    public boolean equals(Object o) {            // Object o - то, с чем нужно сравнить.
        var t = (Worker) o;                      // "Кастуем" Object o как Worker и помещаем в переменную, которую будем сравнивать с тем что нужно сравнить. т.е. что с чем.
        return id == t.id && firstName == t.firstName;   // Если одинаковые id и имена, то равны.
    }

    @Override
    public int hashCode() {
        return id;
    }
}
