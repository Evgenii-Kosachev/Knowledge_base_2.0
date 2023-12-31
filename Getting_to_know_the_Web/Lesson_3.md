# **Урок 3. Основы JavaScript**

## **Подключение JS**

Чтобы добавлять js-программки (скрипты) на html-страницу, необходим тег `<script>`.

```javascript
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
    </head>
    <body>
        <p>Это обычный HTML документ</p>
        <script language="JavaScript">
            alert ("Привет, мир!");
        </script>
        <p>Выходим обратно в HTML</p>
    </body>
</html>
```

Браузер читает HTML-документ сверху вниз, и начинает отображать страницу, показывая часть документа до тега `<script>`. Встретив тег `<script>`, переключается в JavaScript-режим и выполняет сценарий. В нашем коде он встречает оператор `alert` и понимает, что нужно вывести на экран все то, что заключено в кавычки.

Как только браузер закончил выполнение, он возвращается в HTML-режим и отображает оставшуюся часть документа.

Если JavaScript-кода много, его выносят в отдельный файл, который, как правило, имеет расширение *.js.

Чтобы JavaScript-кoд включить в HTML-документ из внешнего файла, нужно использовать атрибут src (source) тега `<script>`. Его значением должен быть URL-aдpec файла, в котором содержится JS-код:

```html
<script src="/scripts/script.js"></script>
```

В этом примере указан путь к файлу с именем script.js, который содержит скрипт. Принцип указания пути аналогичен тому случаю, когда мы вставляли картинки в html-документ с помощью тега `<img>`. При этом файл script.js должен содержать только JavaScript-кoд, который в другом бы случае располагался бы между тегами `<script>` и `</script>`.

---

## **Примитивные типы данных**

Значение в JavaScript всегда относится к данным определённого типа. Например, это может быть строка или число. В JavaScript имеются следующие примитивные типы данных: number, boolean, string, undefined, null.

Переменная в JavaScript может содержать любые данные. Там может быть строка вначале, а далее, например - число:

```javascript
// Это не ошибка
let message = "string";
message = 1234;
```

- ### **Число**

    ```javascript
    let n = 321;
    n = 54.321;
    ```

  В этой конструкции **let** – зарезервированное слово, которое аналогично математическому: «Пусть n = 123». Вместо **let** еще можно встретить **var**.

  Числовой тип данных (number) представляет как целочисленные значения, так и числа с плавающей точкой (для представления дробей). С числами можно осуществлять арифметические операции, например, умножение *, деление /, сложение +, вычитание - и так далее.

  Кроме обычных чисел, в js существуют специфические числовые значения: **Infinity** и **NaN**. Они относятся к типу «число». Конечно, это не числа в привычном значении этого слова.

    - **Infinity** представляет собой математическую бесконечность ∞. Это особое значение, которое больше любого числа. Мы можем получить его в результате деления на ноль или задать явно:

      ```javascript
      alert( 5 / 0 ); // Infinity
      alert( Infinity ); // Infinity
      ```

    - **NaN** (Not a Number) означает вычислительную ошибку. Это результат неправильной или неопределённой математической операции, например:

      ```javascript
      alert( "не число" / 4 ); // NaN, такое деление является ошибкой
  
      // Значение NaN «прилипчиво». Любая операция с NaN возвращает NaN:
      alert( "не число" / 4 + 5 ); // NaN
      ```

      Именно потому, что математические операции в JavaScript «безопасны». Можно делить на нуль, вычислять не вычисляемые выражения и от этого ничего не перестанет работать.

- ### **Строка**

  Строка (string) в JavaScript заключается в кавычки.

    ```javascript
    let str = "Это строка";
    ```

  В JavaScript можно встретить три типа кавычек: двойные - "", одинарные - '', обратные - ``.

  Между двойными и одинарными кавычками для JS разницы не существует. Обратные же кавычки имеют расширенную функциональность. Они позволяют нам встраивать выражения в строку, заключая их в `${…}`.

    ```javascript
    let name = "Мир";
    let name = 'Мир';

    // Вставим переменную
    alert( `Привет, ${name}!` ); // Привет, Мир!

    // Вставим выражение
    alert( `результат: ${2 + 2}` ); // результат: 4
    ```

  Выражение внутри `${…}` вычисляется, и его результат становится частью строки. Мы можем положить туда всё что угодно: переменную name, или выражение 2 + 2, или что-то более сложное. Все данные, которые мы вводим с клавиатуры по умолчанию для JS принадлежат строковому типу.

- ### **Булевый (логический) тип**

  Булевый тип (**boolean**) принимает только два значения: истина (true) и ложь (false).  
  Такой тип, как правило, используется для хранения значений да/нет – (true/false). Можно провести двоичную аналогию 1 и 0.

    ```javascript
    let name = true; // да, поле отмечено
    let age = false; // нет, поле не отмечено
    ```

  Булевые значения также могут быть результатом сравнений:

    ```javascript
    let compare = 5 > 2;
    alert( compare ); // true (результатом сравнения будет "да")
    ```

- ### **Значение «null»**

  Специальное значение **null** не относится ни к одному из типов, описанных выше.  
  Оно формирует отдельный тип, который содержит только значение **null**:

    ```javascript
    let age = null;
    ```

  В JavaScript **null** – это просто специальное значение, которое представляет собой «ничего», «пусто» или «значение неизвестно».  
  В приведённом выше коде указано, что значение переменной age неизвестно.

- ### **Значение «undefined»**

  Специальное значение undefined также стоит особняком. Оно формирует тип из самого себя так же, как и null.  
  Оно означает, что значение не было присвоено.  
  Если переменная объявлена, но ей не присвоено никакого значения, то её значением будет undefined:

    ```javascript
    let age;
    alert(age); // выведет "undefined"

    // Технически мы можем присвоить значение undefined любой переменной:
    let age = 123;

    // изменяем значение на undefined
    age = undefined;
    alert(age); // "undefined"
    ```

  …Но так делать не рекомендуется. Обычно **null** используется для присвоения переменной «пустого» или «неизвестного» значения, а **undefined** – для проверок, была ли переменная назначена.

- ### **Оператор typeof**

  Оператор **typeof** возвращает тип аргумента. Удобно его применять, когда нам необходимо сделать проверку.  
  У него есть две синтаксические формы: **typeof x**, **typeof(x)**. Работает со скобками или без скобок. Результат один и тот же.

    ```javascript
    // Вызов typeof x возвращает строку с именем типа:
    typeof undefined // "undefined"
    typeof 0 // "number"
    typeof true // "boolean"
    typeof "oo" // "string"
    ```

---

## **Взаимодействие: alert, prompt, confirm**

Познакомимся с несколькими функциями браузера для удобного ввода и вывода данных: **alert**, **prompt** и **confirm**.

- **alert.** Она показывает сообщение и ждёт, пока пользователь нажмёт кнопку «ОК».

    ```javascript
    alert("Привет");
    ```

  Небольшое окно с сообщением, вылезающее поверх остальных называется модальным окном. Пользователь не может взаимодействовать с интерфейсом остальной части страницы, нажимать на другие кнопки и т.д. до тех пор, пока взаимодействует этим с окном. В нашем случае – пока не будет нажата кнопка «Закрыть».

- **prompt.** Этот код отобразит модальное окно с текстом, полем для ввода текста и кнопками OK (Проложить)/Отмена.

    ```javascript
    let test = prompt("Test");

    // Синтаксис
    result = prompt(title, [default]);

    // title - текст для отображения в окне.
    // default - необязательный второй параметр, который устанавливает начальное значение в поле для текста в окне.
    ```

  Пользователь напечатает что-либо в поле ввода и нажмет «Продолжить». В нашем примере введённый текст будет присвоен переменной **result**. Можно также отменить ввод нажатием на кнопку «Отмена» или нажав на клавишу Esc. В этом случае **result** присвоится значение null.  
  **Title** лучше ставить всегда, чтобы пользователь понимал, какой ввод данных от него ожидается.

- **confirm**. Функция confirm отображает модальное окно с текстом вопроса question и двумя кнопками: Да и Нет. Результат – true, если нажата кнопка Да. В других случаях – false.

    ```javascript
    result = confirm(question);

    let right = confirm("Ты всегда прав?");
    alert( right ); // true, если нажата OK
    ```

---

## **Арифметика в JS**

Поддерживаются следующие математические операторы:

- Сложение **+**,
- Вычитание **-**,
- Умножение **\***,
- Деление **/**,
- Взятие остатка от деления **%**,
- Возведение в степень **\*\***.

Первые четыре оператора очевидны, а про % и ** стоит сказать несколько слов. Также стоит не забывать, что все данные, которые мы вводим с клавиатуры, например, используя оператор `prompt()`, по умолчанию в JS принадлежат строковому типу.

Чтобы изменить эту ситуацию, необходимо использовать функцию `parseInt()`, которая переводит строковый тип данных в числовой:

```javascript
let number = parseInt(prompt(“Введите число”));
alert(number+1);
```

- ### **Взятие остатка %**

  Несмотря на обозначение, оператор взятия остатка %, никакого отношения к процентам не имеет - это остаток от целочисленного деления a на b.

    ```javascript
    alert( 4 % 3 ); // 1, остаток от деления 4 на 3
    ```

- ### **Возведение в степень \*\***

  Выражение a**b означает, что a умножается само на себя b раз.

    ```javascript
    alert( 2 ** 3 ); // 8 (2 умножено на себя 3 раза)
    ```

  Математически, оператор работает и для нецелых чисел. Например, квадратный корень является возведением в степень 1/2:

    ```javascript
    alert( 25 ** (1/2) ); // 5 (степень 1/2 эквивалентна взятию квадратного корня)
    ```

- ### **Сложение строк при помощи бинарного +**

  Обычно при помощи плюса '+' складывают два числа. Такие операции называют бинарными. Но если бинарный оператор '+' применить к строкам, то он их объединяет в одну, как мы уже видели ранее. Это называется конкатенацией:

    ```javascript
    let s = "это" + "строка";
    alert(s); // этострока
    ```

  Сложение и преобразование строк - это особенность бинарного плюса +. Другие арифметические операторы работают только с числами и всегда преобразуют операнды в числа.

    ```javascript
    alert( 8 - '2' ); // 6, '2' приводится к числу
    alert( '8' / '2' ); // 4, оба операнда приводятся к числам
    ```

- ### **Приведение к числу, унарный +**

  Плюс + существует в двух формах: бинарной, которую мы использовали выше, и унарной.  
  Унарный - это применённый к одному значению. Если операнд не число, унарный плюс преобразует его в число.

    ```javascript
    // Не влияет на числа
    let x = 1;
    alert( +x ); // 1

    // Преобразует не числа в числа
    alert( +true ); // 1
    alert( +"" ); // 0
    ```

  На самом деле это, то же самое, что и `Number(...)`, только короче – аналог уже знакомой функции `parseInt()`, работающий для всех типов данных, а не только для строк. Необходимость преобразовывать строки в числа возникает очень часто. Например, обычно значения полей HTML-формы — это строки.  
  С точки зрения математика, такое использование плюсов нелогично. Но с точки зрения программиста тут нет ничего особенного: сначала выполнятся унарные плюсы, которые приведут строки к числам, а затем бинарный '+' их сложит.  
  Унарные плюсы обладают более высоким приоритетом, поэтому выполняются до бинарного сложения.

---

## **Условное ветвление: if, '?'**

Порой нам нужно выполнить то или иное действие в зависимости от условий. Для этого можно использовать инструкцию if или условный оператор ?.

- ### **Инструкция «if»**

  Инструкция if(...) вычисляет условие в скобках и, если результат true, то выполняет блок кода.

    ```javascript
    let year = prompt('Какой сейчас год?', '');
    if (year == 2022) alert( 'Вы правы!' );
    ```

  В примере выше, условие - это простая проверка на равенство (year == 2022), но оно может быть и гораздо более сложным.  
  Если мы хотим выполнить более одной инструкции, то нужно заключить блок кода в фигурные скобки:

    ```javascript
    if (year == 2022) {
        alert( "Правильно!" );
        alert( "Вы такой умный!" );
    }
    ```

  Рекомендуется использовать фигурные скобки {} всегда, когда вы используете инструкцию if, даже если выполняется только одна команда. Это улучшает читаемость кода.

  **Блок «else»**  
  Инструкция if может содержать необязательный блок «else» («иначе»). Он выполняется, когда условие ложно.

    ```javascript
    let year = prompt('Какой сейчас год?', '');

    if (year == 2022) {
        alert( 'Да вы знаток!' );
    } else {
        alert( 'А вот и неправильно!' ); // любое значение, кроме 2022
    }
    ```

- ### **Условный оператор „?“**

  Оператор ? аналогичен if. Его также называют «тернарный», так как этот оператор, единственный в своём роде, имеет три аргумента.

    ```javascript
    // Сначала вычисляется условие: если оно истинно, тогда возвращается значение1, в противном случае - значение2.
    let result = условие ? значение1 : значение2;
    

    let accessAllowed = (age > 20) ? true : false;
    ```

---

## **Логические операторы**

В JavaScript есть три логических оператора: || (ИЛИ, «+»), && (И, «х») и ! (НЕ, «_»).
![Логические операторы](<img/Boolean_operators.png>)  
Данные операторы могут применяться к значениям любых типов. Результаты данных операций также могут иметь различный тип.

- ### **Логическое И (&&)**

    ```javascript
    <script>
        alert( true && true ); // true
        alert( false && true ); // false
        alert( true && false ); // false
        alert( false && false ); // false
    </script>
    ```

  Часто оператор **И &&** используется совместно с двумя выражениями сравнения:

    ```javascript
    <script>
        var x = 0, y = 0;
        alert( х == 0 && у == 0 ); // true (true && true)
    </script>
    ```

  Операторы сравнения имеют более высокий приоритет, чем логические операторы **&&** и **||**. Для оператора **&&** не обязательно, чтобы его операнды были булевыми значениями. Он принимает любые значения, поскольку они могут быть преобразованы в булевы.

- ### **Логическое || (ИЛИ)**

  Оператор «ИЛИ» выглядит как двойной символ вертикальной черты и называется логическим сложением:

    ```javascript
    result = a || b;

    // Существует четыре возможные логические комбинации:
    alert( true || true );   // true
    alert( false || true );  // true
    alert( true || false );  // true
    alert( false || false ); // false
    ```

  Как видно, результат операций всегда равен true, за исключением случая, когда оба аргумента false. Если значение не логического типа, то оно к нему приводится в целях вычислений. Например, число 1 будет воспринято как true, а 0 – как false:

    ```javascript
    if (1 || 0) {            // работает как if( true || false )
        alert( 'Истина!' );
    }
    ```

  Обычно оператор || используется в if для проверки истинности любого из заданных условий.

    ```javascript
    let hour = 8;

    if (hour < 10 || hour > 18) {
        alert( 'Офис закрыт.' );
    }
    ```

- ### **Логическое НЕ (!)**

  Оператор логического НЕ ! является унарным оператором, помещаемым перед одиночным операндом. Он преобразует значение своего операнда в булево значение, затем инвертирует это значение в противоположное и возвращает, полученное в результате инвертирования, булево значение.

    ```javascript
    <script>
        alert ( !false );    // true
        alert ( !"строка" ); // false
        alert ( !0 );        // true
        alert ( !NaN);       // true
        alert ( !"" );       // true
        alert ( !777 );      // false
        alert ( !null );     // true
    </script>
    ```

  Оператор ! всегда возвращает true или false, поэтому его можно использовать для преобразования любого значения x в его логический эквивалент, дважды применив этот оператор: !!x.

    ```javascript
    <script>
        alert ( !!"строка" ); // true
        alert ( !!0 );        // false
        alert ( !!NaN);       // false
        alert ( !!"" );       // false
        alert ( !!777 );      // true
        alert ( !!null );     // false
    </script>
    ```

---

## **Операторы присваивания**

В результате операции присваивания операнду слева от оператора присваивания (знак "=") устанавливается значение, которое берётся из правого операнда. Основным оператором присваивания является =, он присваивает значение правого операнда операнду, находящемуся слева. Таким образом, выражение x = y означает, что x присваивается значение y.

Существуют также составные операторы присваивания, которые используются для сокращённого представления операций, описанных в следующей таблице:

- **Присваивание:** x=y ---> x=y
- **Присваивание со сложением:** x += y ---> x=x+y
- **Присваивание с вычитанием:** x -= y ---> x=x-y
- **Присваивание с умножением:** x *= y ---> x=x*y
- **Присваивание с делением:** x /= y ---> x=x/y
- **Присваивание по модулю:** x %= y ---> x=x%y

---

## **Циклы**

При написании скриптов зачастую встаёт задача сделать однотипное действие много раз. Например, вывести даты из списка одна за другой. Или просто перебрать все числа от 1 до 10 и для каждого выполнить одинаковый код. Для многократного повторения одного участка кода предусмотрены циклы.

- ### **Цикл «while»**

    ```javascript
    while (condition) {
        // код
        // также называемый "телом цикла"
    }
    ```

  Код из тела цикла выполняется, пока условие `condition` истинно. Например, цикл ниже выводит i, пока i < 5:

    ```javascript
    let i = 0;
    while (i < 5) {   // выводит 0, затем 1, затем 2, 3, 4
        alert( i );
        i++;
    }
    ```

  Одно выполнение тела цикла по-научному называется итерация. Цикл в примере выше совершает три итерации.

  Если бы строка `i++` отсутствовала в примере выше, то цикл бы повторялся (в теории) вечно. На практике, конечно, браузер не позволит такому случиться, он предоставит пользователю возможность остановить «подвисший» скрипт, а JavaScript на стороне сервера придётся «убить» процесс.

  Любое выражение или переменная может быть условием цикла, а не только сравнение: условие `while` вычисляется и преобразуется в логическое значение. Например, `while (i)` - более краткий вариант `while (i != 0)`:

    ```javascript
    let i = 5;
    while (i) {      // когда i будет равно 0, условие станет ложным, и цикл остановится
        alert( i );
        i--;
    }
    ```

  Фигурные скобки не требуются для тела цикла из одной строки.

- ### **Цикл «do…while»**

  Проверку условия можно разместить под телом цикла, используя специальный синтаксис do..while:

    ```javascript
    do {
        // тело цикла
    } while (condition);
    ```

  Цикл сначала выполнит тело, а затем проверит условие `condition`, и пока его значение равно true, он будет выполняться снова и снова.

    ```javascript
    let i = 0;
    do {
        alert( i );
        i++;
    } while (i < 5);
    ```

  Такая форма синтаксиса оправдана, если вы хотите, чтобы тело цикла выполнилось хотя бы один раз, даже если условие окажется ложным. На практике чаще используется форма с предусловием: `while(…) {…}`.

- ### **Цикл «for»**

  Самый распространённый цикл — цикл for. Используется всегда, когда количество итераций (повторов) цикла заранее известно.

    ```javascript
    for (начало; условие; шаг) {
        // ... тело цикла ...
    }
    ```

  Цикл ниже выполняет alert(i) для i от 0 до (но не включая) 5:

    ```javascript
    for (let i = 0; i < 5; i++) {   // выведет 0, затем 1, затем 2, 3, 4
        alert(i);
    }
    ```

---

## **Конструкция "switch"**

Конструкция **switch** заменяет собой сразу несколько **if**.  
Она представляет собой более наглядный способ сравнить выражение сразу с несколькими вариантами.  
Конструкция **switch** имеет один или более блоков **case** и необязательный блок **default**.

```javascript
switch(x) {
    case 'value1':    // if (x === 'value1')
        ...
        [break]
    case 'value2':    // if (x === 'value2')
        ...
        [break]
    default:
        ...
        [break]
}
```

- Переменная **x** проверяется на строгое равенство первому значению **value1**, затем второму **value2** и так далее.
- Если соответствие установлено – **switch** начинает выполняться от соответствующей директивы **case** и далее, до ближайшего **break** (или до конца **switch**).
- Если ни один **case** не совпал – выполняется (если есть) вариант **default**.

```javascript
let a = 2 + 4;

switch (a) {
    case 3:
        alert( 'Маловато' );
        break;
    case 6:
        alert( 'В точку!' );
        break;
    case 7:
        alert( 'Перебор' );
        break;
    default:
        alert( "Нет таких значений" );
}
```

Здесь оператор **switch** последовательно сравнит a со всеми вариантами из **case**. Если **break** нет, то выполнение пойдёт ниже по следующим **case**, при этом остальные проверки игнорируются.

```javascript
// Пример без break

let a = 2 + 4;

switch (a) {
    case 3:
        alert( 'Маловато' );
    case 6:
        alert( 'В точку!' );
    case 7:
        alert( 'Перебор' );
    default:
        alert( "Нет таких значений" );
}
```

В примере выше последовательно выполнятся три alert.

---

## **Функции**

Зачастую нам надо повторять одно и то же действие во многих частях программы.

Например, необходимо красиво вывести сообщение при приветствии посетителя, при выходе посетителя с сайта, ещё где-нибудь, выполнить одни и те же арифметические операции с разными значениями.

Чтобы не повторять один и тот же код во многих местах, придуманы функции. Функции являются основными «строительными блоками» программы.  
Примеры встроенных функций мы уже видели - это `alert(message)`, `prompt(message, default)` и `confirm(question)`. Но можно создавать и свои.

- ### **Объявление функции**

  Вначале идёт ключевое слово **function**, после него имя функции, затем список параметров в круглых скобках через запятую (в вышеприведённом примере он пустой) и, наконец, код функции, также называемый «телом функции», внутри фигурных скобок.

    ```javascript
    // Пример объявления функции:

    function showMessage() {
        alert( 'Всем привет!' );
    }

    // Новая функция может быть вызвана по её имени: showMessage().
    showMessage();
    showMessage();
    ```

  Этот пример явно демонстрирует одно из главных предназначений функций: избавление от дублирования
  кода. Если понадобится поменять сообщение или способ его вывода - достаточно изменить его в одном месте: в функции, которая его выводит.

- ### **Локальные переменные**

  Это переменные, объявленные внутри функции, они видны только внутри этой функции, но не доступны в основном теле программы.

    ```javascript
    function showMessage() {
        let message = "Привет, это Василий!"; // локальная переменная
        alert( message );
    }

    showMessage();      // Привет, я Василий!
    alert( message );   // <-- в этом случае будет ошибка, т.к. переменная видна только внутри функции
    ```

- ### **Внешние переменные**

    ```javascript
    // Функция имеет доступ к внешним переменным, например:
    let userName = 'Евгений';

    function showMessage() {
        let message = 'Привет, ' + userName;
        alert(message);
    }

    showMessage();    // Привет, Евгений
    ```

  Функция обладает полным доступом к внешним переменным и может изменять их значение.

---

## **Ресурсы**

[Wm-school.ru](<https://wm-school.ru/js/javascript_in_HTML.php>)  
[Learn.javascript.ru](<https://learn.javascript.ru>)  
[Developer.mozilla.org](<https://developer.mozilla.org/ru/docs/Web/JavaScript/Guide/Expressions_and_Operators>)

---
[Вернуться назад](<Getting_to_know_the_Web.md>)