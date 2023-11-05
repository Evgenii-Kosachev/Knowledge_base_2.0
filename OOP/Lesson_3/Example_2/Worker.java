package OOP.Lesson_3.Example_2;

import java.util.Iterator;

public class Worker implements Iterator<String> {     // Добавляем итератор к классу.
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
        this.index = 0;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }



// Реализация итератора.
    int index;        // Индекс который мы будем перебирать итератором.

    @Override
    public boolean hasNext() {     // Задаем hasNext()
        return index++ < 4;        // 4 поля класса Worker, которые будем перебирать.
    }
    @Override
    public String next() {         // Задаем next().
        switch (index) {
            case 1:
                // Если индекс = 1   return firstName;
                return String.format("firstName: %s", firstName);
            case 2:
                // Если индекс = 2   return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
                // Если индекс = 3   return age;
                return String.format("age: %d", age);
            default:
                // Если индекс = 4   return salary;
                return String.format("salary: %d", salary);

        }
    }
}
