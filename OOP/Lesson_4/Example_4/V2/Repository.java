package OOP.Lesson_4.Example_4.V2;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {        // Обобщение позволяет обойти ошибки полиморфизма. В одном списке не может быть два типа данных: VideoContent и AudioContent.
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
