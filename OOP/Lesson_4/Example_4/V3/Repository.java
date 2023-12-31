package OOP.Lesson_4.Example_4.V3;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Content> {   // Тип Т должен быть в одной иерархии с типом Content и ниже его находиться (Т наследник Content).
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach
}
