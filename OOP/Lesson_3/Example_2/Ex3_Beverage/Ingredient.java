package OOP.Lesson_3.Example_2.Ex3_Beverage;

public abstract class Ingredient {        // Абстрактный родительский класс ингридиентов.
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
