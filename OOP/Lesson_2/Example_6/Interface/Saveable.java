package OOP.Lesson_2.Example_6.Interface;

import OOP.Lesson_2.Example_6.Document.TextDocument;

// Начинаем здесь.
// Интерфейс реализует способность файлов сохраняться.

public interface Saveable {
    void SaveAs(TextDocument document, String path);   // Передаем формат файла в который будем сохранять и путь до него.
}
