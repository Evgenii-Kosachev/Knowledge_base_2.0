package OOP.Lesson_2.Example_6;

import OOP.Lesson_2.Example_6.Applications.Notepad;
import OOP.Lesson_2.Example_6.Format.*;

public class Program {
    public static void main(String[] args) {
        Notepad notes = new Notepad();                 // Создаем записную книжку.
        notes.newFile();                               // Создаем новый файл.

        notes.currentDocument().addAllText("text1");   // Записываем какой-то текст.
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");

        notes.SaveAs("file1", new Txt());         // "file1" - куда сохраняем, Txt() - в каком формате.
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
    }
}
