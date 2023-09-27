package Java.Lesson_2;

import java.io.IOException;
import java.util.logging.*;

public class Page_3 {
    public static void main(String[] args) throws IOException {

/*-------------------------(Логирование)----------------------
    Логи содержат системную информацию работы программного или аппаратного комплекса.
    В них  записываются действия разного приоритета от  пользователя, или программного продукта.
    Процесс ведения логов называют “логированием” (журналированием).
*/
/*
    Использование
    Logger logger = Logger.getLogger()

    Уровни важности ошибки
    INFO, DEBUG, ERROR, WARNING и др.

    Вывод
    ConsoleHandler info = new ConsoleHandler();
    log.addHandler(info);

    Формат вывода: структурированный, абы как*
    XMLFormatter, SimpleFormatter
*/
        // Выведение текстового лога в консоль.
//        Logger logger = Logger.getLogger(Program.class.getName());   // Создали переменную logger. Указываем имя класса для которого добавили логирование.

//        ConsoleHandler ch = new ConsoleHandler();                    // Куда выводить ошибки. В терминал.
//        logger.addHandler(ch);                                       // Указываем logger куда отправлять ошибки (терминал).
//
//        SimpleFormatter sFormat = new SimpleFormatter();
//        ch.setFormatter(sFormat);
//
//        logger.log(Level.WARNING, "Тестовое логирование 1");
//        logger.info("Тестовое логирование 2");


        // Выведение XML лога в консоль.
//        Logger logger = Logger.getLogger(Program.class.getName());

//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
//
//        XMLFormatter xml = new XMLFormatter();
//        ch.setFormatter(xml);
//
//        logger.log(Level.WARNING, "Тестовое логирование 1");
//        logger.info("Тестовое логирование 2");


        // Выведение XML лога в файл.
        Logger logger = Logger.getLogger(Page_3.class.getName());

        // Куда выводить ошибки. В файл.
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);                                         // Указываем logger куда отправлять ошибки (в файл).

        // Формат вывода сообщений: текстовый и XML.
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        // То, что выводим.
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}

/*
    Проверочная работа:
    - Файловая система.                      - создать каталог и подкаталоги.
    - String, StringBuilder, Scanner.        - сформировать наполнение файла. Рассмотреть возможность копирования данных с другого файла.
    - Запись и чтение файлов, исключения.    - записать файл, вывести его содержимое в консоль.
    - Логирование (файл).                    - сформировать отчет.

    M (model)      - логика.
    V (view)       - общается с клиентом.
    C (controller) - сборочный узел.
*/
