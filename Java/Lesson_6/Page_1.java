package Java.Lesson_6;

import java.util.*;

/*------------------(Множество коллекций Set)-----------------
    Set — это неупорядоченное множество уникальных элементов, в котором не допускаются повторяющиеся элементы.
    Уникальность элементов проверяется с помощью метода equals().

    В отличие от интерфейса List, Set не предоставляет методы для доступа к элементам по индексу, поскольку наборы не упорядочены.

    Следует проявлять большую осторожность, если изменяемые объекты используются в качестве элементов множества.
    Поведение множества непредсказуемо, если значение объекта изменяется таким образом, который влияет на сравнения на equals().

    ----------------<<< Методы equals() и hashCode() >>>---------------------
    Если пользовательские объекты хранятся в коллекциях, особенно в Set и Map, необходимо правильно переопределить методы equals() и hashCode().
    Это обеспечивает правильное сравнение объектов и корректное поведение коллекций.


    ------------------<<< Интерфейс Set расширяет Collection >>>-------------
    add(Object o)             – Добавляет указанный элемент в это множество, если он еще не присутствует. Если это множество уже содержит указанный элемент, вызов оставляет множество неизменным и возвращает false.
    addAll(Collection c)      – Добавление элементов коллекции, если они отсутствуют.

    remove(Object o)          – Удаляет указанный элемент из этого множества, если он присутствует.
    clear()                   – Удаляет все элементы из этого множества. Множество будет пустым после вызова этого метода.

    contains(Object o)        – Проверка присутствия элемента в наборе. Возвращает true, если элемент найден.
    containsAll(Collection c) – Проверка присутсвия коллекции в наборе. Возвращает true, если все элементы содержатся в наборе.

    isEmpty()                 – Возвращает true, если это множество не содержит элементов.
    size()                    – Возвращает количество элементов в этом множестве.
*/
public class Page_1 {
    public static void main(String[] args) {
/*----------------(HashSet)--------------------------
    HashSet использует хеш-таблицу для хранения элементов, и поэтому его операции add(), remove() и contains()
    имеют постоянное время выполнения - O(1). Он не поддерживает дубликаты элементов.

    Под капотом HashSet трудится HashMap.
    Когда добавляется элемент в HashSet, он фактически добавляется как ключ в HashMap, где значение этого ключа - это константа.
    Соответственно, два разных объекта считаются одинаковыми, если они равны с точки зрения метода equals() и имеют одинаковый хеш-код.

    Функции HashSet:
      isEmpty() –   проверка на пустоту.
      add(V) –      добавление элемента в коллекцию.
      remove(V) –   удаление элемента из коллекции.
      contains(V) – проверка на включение элемента в коллекции.
      clear() –     удаление всех элементов коллекции.
      size() –      возвращает количество элементов коллекции.

    HashSet как синоним множества
      addAll(Coll) – объединение множеств.
      retainAll(Coll) – пересечение множеств.
      removeAll(Coll) – разность множеств.

      first()
      last()
      headSet(E)
      tailSet(E)
      subSet(E1, E2)
*/
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12));   // true
        set.add(null);
        System.out.println(set.size());         // 5
        System.out.println(set);                // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set) System.out.println(item);   // 1 1234 123
        set.clear();
        System.out.println(set);                // []


        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a);   // [1, 2, 3, 4, 5, 6]
        System.out.println(b);   // [17, 2, 3, 5, 7, 11]
        System.out.println(u);   // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r);   // [2, 3, 5, 7]
        System.out.println(s);   // [1, 4, 6]
        boolean res = a.addAll(b);



/*----------------(LinkedHashSet)--------------------------
    Обзор функционала LinkedHashSet
      ● В основе HashMap.
      ● Помнит порядок.
    Использовать, когда нужен HashSet с запоминанием порядка элемента.

    LinkedHashSet:
      isEmpty() –   проверка на пустоту.
      add(V) –      добавление элемента в коллекцию.
      remove(V) –   удаление элемента из коллекцию.
      contains(V) – проверка на включение элемента в коллекции.
      clear() –     удаление всех элементов коллекции.
      size() –      возвращает количество элементов коллекции.
*/
        var aa = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var bb = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        aa.add(28);
        System.out.println(aa);   // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(bb);   // [13, 3, 17, 7, 2, 11, 5]



/*----------------(TreeSet)--------------------------
    TreeSet использует под капотом TreeMap.

    Обзор функционала TreeSet
      ● В основе TreeMap.
      ● Упорядочен по возрастанию.
      ● null’ов быть не может.
*/
        var aaa = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var bbb = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(aaa);                     // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(bbb);                     // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(aaa.headSet(4));     // [1, 2, 3]
        System.out.println(aaa.tailSet(4));   // [4, 5, 6, 7]
        System.out.println(aaa.subSet(3, 5));            // [3, 4]

        var aaaaa = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var bbbbb = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(aaaaa);                  // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(bbbbb);                  // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(aaaaa.contains(1));      // true
    }
}
