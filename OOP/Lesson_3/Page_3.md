# Стандартные интерфейсы Java и придание нового поведения своим типам

## Примеры

0. [Использование Анонимных классов.](<Example_0/Program.java>)  
«Применяйте анонимные классы, если вам нужен локальный класс для одноразового использования».


1. Использование Iterator.  
[Проблема:](<Example_1/Program.java>) Iterator знает как работать со стандартными объектами, но не знает как работать с объектами созданными нами.  
[Решение:](<Example_2/Program.java>) добавляем классу интерфейс Iterator и прописываем его логику.


2. [Использование Iterable.](<Example_4/Program.java>)  
Проблема: Iterator громоздкий и не работает с foreach.  
Решение: используем вместо интерфейса Iterator интерфейс Iterable и переписываем логику с помощью анонимных классов. 


3. [Использование Comparable.](<Example_5/Program.java>)


4. [Сравнение разными способами: Comparable, equals, ==.](<Example_6/Program.java>)


5. [Исключение дубликатов на этапе добавления в коллекцию.](<Example_7/Program.java>)

---
[Вернуться назад](<../Object-oriented_programming.md>)