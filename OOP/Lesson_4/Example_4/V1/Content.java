package OOP.Lesson_4.Example_4.V1;

public abstract class Content {  // Базовый тип - родитель.
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
