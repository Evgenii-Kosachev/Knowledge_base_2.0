package Java.Lesson_3;

import java.util.*;

/*------------------------------(Iterator and Iterable)---------------------------------
    Iterable (повторяемый) - свойство, способность к перебору.
    Iterator - интерфейс, предоставляющий доступ к элементам коллекции и навигацию по ним.

    Итератор: замена цикла for для коллекций на foreach. Foreach только для итерируемых объектов.

    ------------<<< Iterator<E> vs ListIterator<E> >>>------------
    Iterator позволяет перемещаться по коллекции, получать или удалять элементы. Доступны для всех коллекций.
    ListIterator расширяет Iterator, чтобы обеспечить двунаправленный обход списка и модификацию элементов. Доступны только для List.

    Используя iterator() / listIterator(), получаем доступ к каждому элементу в коллекции, по одному элементу за раз.

    Iterator<E>
      boolean hasNext( ) - Возвращает true, если есть ещё элементы. В противном случае возвращает false.
	  E next( )          - Возвращает следующий элемент. Вызывает исключение NoSuchElementException, если не существует следующего элемента.
	  void remove( )     - Удаляет текущий элемент. Выбрасывает IllegalStateException, если делается попытка вызвать remove(), которому не предшествует вызов next().

    ListIterator<E>
      void add(Object obj)   - Вставляет obj в список перед элементом, который будет возвращен следующим вызовом next().
 	  boolean hasNext( )     - Возвращает true, если есть следующий элемент. В противном случае возвращает false.
	  boolean hasPrevious( ) - Возвращает true, если есть предыдущий элемент. В противном случае возвращает false.
	  Object next( )         - Возвращает следующий элемент. A NoSuchElementException вызывается, если не существует следующего элемента.
	  int nextIndex( )       - Возвращает индекс следующего элемента. Если нет следующего элемента, возвращается размер списка.
	  Object previous( )     - Возвращает предыдущий элемент. A NoSuchElementException вызывается, если не существует следующего элемента.
	  int previousIndex( )   - Возвращает индекс предыдущего элемента. Если нет предыдущего элемента, возвращается -1.
	  void remove( )         - Удаляет текущий элемент из списка. Вызывается IllegalStateException, если вызывается функция remove() вызвана перед next() или previous().
	  void set(Object obj)   - Назначает obj текущему элементу. Это последний элемент, возвращаемый вызовом либо next(), либо previous().
*/

public class Page_3 {
    public static void main(String[] args) {

    // Создание Iterator на основе Object.
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);  // Коллекция сформированная из List.of().

        // Создаем итератор.
        Iterator<Integer> col = list.iterator();                // На основе коллекции list создаем Iterator. Обобщение <> должно совпадать.
        while (col.hasNext()) {                                 // hasNext() - пока есть следующий элемент давать его. Бегаем Iterator по list.
            System.out.println(col.next());
//            col.remove();     // Ошибка: удалять нельзя.
//            col.next();       // Ошибка: дважды вызывать функцию next() нельзя.
        }
        System.out.println();



    // Разные способы пробежать по коллекции.
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayList<Integer> list2 = new ArrayList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
        Collections.addAll(list2, array);

        // Так можно для ArrayList. Метод get(i) работает за константное время (бегает по индексу массива).
        // В LinkedList будет работать гораздо медленнее (перебирает список с самого начала до нужного элемента).
        for (int i = 0; i < list2.size(); i++) {
            System.out.printf("%d ", list2.get(i));
        }
        System.out.println();

        // Iterator перебирает элементы коллекции не анализируя их. Одинаково эффективен для ArrayList, LinkedList...
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%d ", iterator.next());
        }
        System.out.println();

        // Foreach: i - переменная цикла, list2 - имя коллекции.
        // Сокращенная запись итератора. Изменять коллекцию во время перебора нельзя.
        for (Integer i : list2) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // ListIterator - только для List.
        ListIterator<Integer> list2Iterator = list2.listIterator();
        while (list2Iterator.hasNext()) {
            System.out.printf("%d ", list2Iterator.next());
        }


        // Удаление элементов при обходе коллекции. Создадим список имен, после чего получим итератор коллекции, пройдемся по всем элементам и удалим всех "mike".
        final List<String> names = new ArrayList<>(List.of("mark", "mike", "kate"));
        final Iterator<String> iteratorr = names.iterator();
        while (iteratorr.hasNext()) {
            final String name = iteratorr.next();
            if ("mike".equals(name)) {
                iteratorr.remove();
            }
        }
        System.out.println("\n" + names); // [mark, kate]
    }
}
