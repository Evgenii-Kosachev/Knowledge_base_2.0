package OOP.Lesson_4.Example_2;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        Worker w = new Worker(28, "firstName", "lastName", 20, 22);

    // ParameterizedWorker
        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(    // Класс один. Тип данных - <Integer>.
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(           // Класс один. Тип данных - <String>.
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());



    // MultiParameterized
        // MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
        //         1, 2.0, "3.0");
        // System.out.println(mp1);

        // MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
        //         "1", "2.0", "3.0");
        // System.out.println(mp2);
    }
}
