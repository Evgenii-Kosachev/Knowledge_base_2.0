package OOP.Lesson_2.Example_6.Applications;

import OOP.Lesson_2.Example_6.Document.TextDocument;
import OOP.Lesson_2.Example_6.Format.TextFormat;

import java.util.ArrayList;
import java.util.List;

// Здесь расписана работа приложения.
public class Notepad {
    private List<TextDocument> documents;
    private int index;

    public Notepad() {
        documents = new ArrayList<>();
        index = -1;
    }

    public void newFile() {
        documents.add(new TextDocument());
        index++;
    }

    public TextDocument currentDocument(){
        return documents.get(index);
    }

    public void SaveAs(String path, TextFormat format) {
        format.SaveAs(documents.get(index), path);
    }
}
