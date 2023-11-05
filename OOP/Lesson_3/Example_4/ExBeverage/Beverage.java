package OOP.Lesson_3.Example_4.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {   // Вместо Iterator<Ingredient>.  Это необходимо для работы foreach.
    public List<Ingredient> components;
    int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){   // Можно прописать проверку на добавление уже имеющегося компонента.
        components.add(component);
    }
}
