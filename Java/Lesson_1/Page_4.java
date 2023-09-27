package Java.Lesson_1;

import java.io.*;
//import java.io.IOException;

//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;

/*-----------(Запись в файл)
    FileWriter - это самый простой способ записать информацию в файл. Отлично подходит для записи небольших объемов данных.
    BufferedWriter - почти аналогичен FileWriter, но использует внутри себя буфер для записи данных в файл. Отлично подходит для записи больших объемов данных.

    FileWriter и BufferedWriter хорошо справляются с записью текстовой информации в файл, но когда стоит задача записывать в файл данные потока, то желательно использовать FileOutputStream.

    FileReader
    BufferedReader
*/
/*-----------(Исключения в Java (Java Exception))
    Возникновение ошибок и непредвиденных ситуаций при выполнении программы называют исключением (exception).

    try – блок кода, в котором может произойти исключение.
    catch – блок кода, в котором происходит обработка исключения.
    finally – блок кода, который является необязательным, но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.

    throw – используется для возбуждения исключения;
    throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.

    Исключительные ситуации, возникающие в программе, можно разделить на две группы:
    1. Ситуации, при которых восстановление дальнейшей нормальной работы программы невозможно - Error.
    2. Восстановление возможно - Exception.
       - RuntimeException - исключение, восстановление работы программы невозможно.
       - Остальные ситуации, предвидимые еще на стадии написания программы, и для которых должен быть написан код обработки.
*/

public class Page_4 {
    public static void main(String[] args) throws Exception {  // throws Exception - обработка ошибок(проще) - для "Чтение, Вариант посимвольно"
//----------------(Работа с файлами)-------------------------
//----------(Создание и запись/дозапись)
        try (FileWriter fw = new FileWriter("file.txt", false)) {   // try/catch - обработка ошибок. false/true - запись/дозапись.
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.append("line 3");
            fw.flush();
        } catch (IOException ex) {    // Ведение лога.
            System.out.println(ex.getMessage());
        }


//---------(Чтение, Вариант посимвольно)
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();


//---------(Чтение, Вариант построчно)
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
