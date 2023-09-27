package Java.Lesson_2;

import java.io.File;

public class Page_2 {
    public static void main(String[] args) {
//-------------------------(Работа с файловой системой)----------------------
        // Файловая система состоит: каталоги и файлы.
        // Для работы нужно: File <имя> = new File(<полный путь к файлу>);

        File f1 = new File("file.txt");                                 // Относительный путь.
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");  // Абсолютный путь.

        // Файловые системы Windows и Linux разные, по этому надо этот момент учитывать при разработке.

//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());

        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt

        // Ошибки. Обработка ошибок.
        // Если можно обойтись без try-catch-finally стараться избегать.
        try {
//            Код, в котором может появиться ошибка
        } catch (Exception e) {
//            Обработка, если ошибка случилась
        }
        finally {
//            Код, который выполнится в любом случае
        }

        try {
            String pathProject = System.getProperty("user.dir");     // Прописываем путь к папке из которой запускается проект
            String pathFile = pathProject.concat("/file.txt");   // Указываем конкретный файл.
            File f3 = new File(pathFile);                            // Создаем файл и связываем с переменной f3.
            System.out.println("try");                               // Если все хорошо отработает эта строчка.
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }

/*---------<< Полезно знать: >>-------
    isHidden():          возвращает истину, если каталог или файл является скрытым
    length():            возвращает размер файла в байтах
    lastModified():      возвращает время последнего изменения файла или каталога
    list():              возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles():         возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir():             создает новый каталог
    renameTo(File dest): переименовывает файл или каталог

    length():            возвращает размер файла в байтах
    lastModified():      возвращает время последнего изменения файла или каталога
    list():              возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles():         возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
    mkdir():             создает новый каталог
    renameTo(File dest): переименовывает файл или каталог
*/
        // Работа с папками такая же как и с файлами независимо от операционной системы из-за кроссплатформенности Java.
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
    }
}
