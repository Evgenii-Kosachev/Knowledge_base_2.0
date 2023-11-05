package OOP.Lesson_4.Example_3;

import java.util.List;

// Класс, который возвращает значение коллекции независимо от ее типа.
public class Methods {
// Так делать не надо.
//    public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {return col.get(index);}
//    public static String getElementFromStringCollection(List<String> col, int index) {return col.get(index);}
//    public static Double getElementFromDoubleCollection(List<Double> col, int index) {return col.get(index);}

// А так правильно.
    public static <U> U getElementFromUCollection(List<U> col, int index) {return col.get(index);}



    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {  // На вход получаем значения неизвестного типа.
        // Map<Integer,String> hm = new HashMap<>();      Пример использования.
        // hm.put(key, value)
        return arg2;                                   // Возвращаемый тип T2 - т.е. без типа.
    }
}
