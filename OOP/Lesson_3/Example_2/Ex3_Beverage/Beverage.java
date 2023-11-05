package OOP.Lesson_3.Example_2.Ex3_Beverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> {       // Абстрактный родительский класс напитков.
    List<Ingredient> components;                       // Коллекция.
    int index;                                         // Индекс.

    public Beverage() {                                // Конструктор инициализации коллекции.
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){    // Метод добавления компонентов.
        components.add(component);
    }

    @Override
    public boolean hasNext() {                        // Метод перебора итератором компонентов hasNext().
        return index < components.size();
    }
    @Override
    public Ingredient next() {                        // Метод перебора итератором компонентов next().
        return components.get(index++);
    }
}
