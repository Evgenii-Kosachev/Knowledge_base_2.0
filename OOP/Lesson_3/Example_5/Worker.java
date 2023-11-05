package OOP.Lesson_3.Example_5;

public class Worker implements Comparable<Worker> {   // Вместо Iterator<>  -  Comparable<Worker>
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }
    @Override
    public int compareTo(Worker o) {              // Сравнение двух Worker (по возрасту).
//        if (this.age > o.age) return 1;         // Если возраст текущего Worker больше того которого нам подсунули, возвращаем 1.
//        else if (this.age < o.age) return -1;
//        else return 0;

        return  Integer.compare(this.age, o.age);          // Короткая запись (сравнения по возрасту).
//        return  Integer.compare(this.salary, o.salary);  // Короткая запись (сравнения по зарплате).
    }
}
