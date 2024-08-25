import java.security.SignatureSpi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//ВВОД И ВЫВОД ДАННЫХ С КЛАВИАТУРЫ


//  ЗАДАНИЕ: Считай с клавиатуры три строки. А затем:
//
//        Выведи на экран третью строку в неизменном виде.
//        Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//        Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
//        Пример ввода:
//
//        Строка Номер РАЗ
//        Вторая строка
//        Строка 3
//        Пример вывода:
//
//        Строка 3
//        ВТОРАЯ СТРОКА
//        строка номер раз

//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите первую строку:");
//        String str1 = console.nextLine();

//        System.out.println("Введите вторую строку:");
//        String str2 = console.nextLine();

//        System.out.println("Введите третью строку:");
//        String str3 = console.nextLine();
//
//        System.out.println(" ");
//
//        System.out.println("Третья строка:");
//        System.out.println(str3);

//        System.out.println("Вторая строка в верхнем регистре:");
//        System.out.println(str2.toUpperCase());

//        System.out.println("Первая строка в нижнем регистре:");
//        System.out.println(str1.toLowerCase());
//
//        console.close();


//  ЗАДАНИЕ: Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
//
//        Пример ввода:
//        51
//        101
//        201

//        Пример вывода:
//        117

//        Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
//        Используй деление без остатка.

//        Scanner console = new Scanner(System.in);
//
//        int num = 0;
//
//        System.out.println("Введите первое число:");
//        num = num + console.nextInt();

//        System.out.println("Введите второе число:");
//        num = num + console.nextInt();

//        System.out.println("Введите третее число:");
//        num = num + console.nextInt();
//
//        System.out.println("Среднее арифмитическое:");
//        System.out.println(num / 3);

//        console.close();


//УСЛОВНЫЙ ОПЕРАТОР


//  ЗАДАНИЕ: Ввести с клавиатуры температуру на улице.
//        Если температура меньше 0, вывести надпись "на улице холодно",
//        иначе - вывести надпись "на улице тепло".
//
//        int t = 0;
//        String cold = "на улице холодно";
//        String warm = "на улице тепло";
//
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите температуру на улице:");
//
//        if (console.hasNextInt()){
//            t = console.nextInt();
//
//            if (t < 0) {
//                System.out.println(cold);
//            } else {
//                System.out.println(warm);
//            }

//        } else {
//            System.out.println("Это не число, перезапустите программу и попробуйте снова!");
//        }
//
//        console.close();


//  ЗАДАНИЕ: Ввести с клавиатуры имя и возраст.
//        Если возраст в пределах 18-28 (включительно),
//        то вывести надпись "Имя, явитесь в военкомат",
//        где Имя - это имя, введенное ранее с клавиатуры.
//
//        Пример ввода:
//        Amigo
//        18

//        Пример вывода:
//        Amigo, явитесь в военкомат

//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите имя:");
//        String name = console.nextLine();

//        System.out.println("Введите возраст:");
//        int age = console.nextInt();
//
//        if (age >= 18 && age <= 28){
//            System.out.println(name + ", явитесь в военкомат");
//        } else {
//            System.out.println("Ваш призывной возраст не подходит для службы в армии");
//        }

//        console.close();


//  ЗАДАНИЕ: Ввести с клавиатуры три целых числа.
//        Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
//        Если такая пара существует, вывести на экран числа через пробел.
//        Если все три числа равны между собой, то вывести все три.
//
//        Примеры:
//        a) при вводе чисел 1 2 2 получим вывод 2 2
//        b) при вводе чисел 2 2 2 получим вывод 2 2 2

//        Scanner console = new Scanner(System.in);
//        String s = " ";
//
//        System.out.println("Введите первое число:");
//        int num1 = console.nextInt();

//        System.out.println("Введите второе число:");
//        int num2 = console.nextInt();

//        System.out.println("Введите третье число:");
//        int num3 = console.nextInt();
//
//        if (num1 == num2 && num1 == num3) {
//            s = num1 + " " + num2 + " " + num3;
//        } else if (num1 == num2) {
//            s = num1 + " " + num2;
//        } else if (num1 == num3) {
//            s = num1 + " " + num3;
//        } else if (num2 == num3) {
//            s= num2 + " " + num3;
//        }
//
//        if (s != " ") {
//            System.out.println("Повторяющиеся числа:");
//            System.out.println(s);
//        } else System.out.println("Повторяющихся чисел нет");
//
//        console.close();


//  ЗАДАНИЕ: Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
//
//        Для этого тебе нужно:
//        Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
//        Определить возможность существования треугольника по сторонам.
//        Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
//        Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
//        То есть, тебе нужно выполнить три сравнения:
//
//        Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
//        Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
//        то треугольника с такими сторонами не существует.
//
//        Scanner console = new Scanner(System.in);
//
//        System.out.println("Введите первую сторону треугольника:");
//        int a = console.nextInt();

//        System.out.println("Введите вторую сторону треугольника:");
//        int b = console.nextInt();

//        System.out.println("Введите третью сторону треугольника:");
//        int c = console.nextInt();
//
//        if (a+b <= c || b+c <= a || a+c <= b) {
//            System.out.println("Треугольник не существует");
//        } else {
//            System.out.println("Треугольник существует");
//        }
//
//        console.close();


//        У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.

//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }

//        Если числа одинаковые, то выводится любое.
//        Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите первое число:");
//        int numberA = scanner.nextInt();

//        System.out.println("Введите второе число:");
//        int numberB = scanner.nextInt();
//
//        System.out.println("Наибольшее число:");
//        int number = (numberA > numberB) ? numberA : numberB;
//
//        System.out.println(number);
//
//        scanner.close();


//  ЗАДАНИЕ: Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.

//        String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";

//        Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
//        Перепиши программу без использования тернарного оператора
//
//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//
//        String result;
//
//        if (number < 5) {
//            result = "число меньше 5";
//        } else if (number > 5) {
//            result = "число больше 5";
//        } else result = "число равно 5";
//
//        System.out.println(result);
//
//        scanner.close();


//  ЗАДАНИЕ: Напиши программу, которая считывает с клавиатуры два вещественных числа (double)
//        и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите первое число");
//        double num1 = scan.nextDouble();

//        System.out.println("Введите второе число");
//        double num2 = scan.nextDouble();
//
//        if (Math.abs(num1-num2) < 0.000001) {
//            System.out.println("Числа равны");
//        } else System.out.println("Числа не равны");
//
//        scan.close();

//  ЗАДАНИЕ: Напиши программу, которая считывает с клавиатуры две строки
//        и выдает сообщение о том, одинаковые ли эти строки.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите первую строку");
//        String str1 = scan.nextLine();
//
//        System.out.println("Введите вторую строку");
//        String str2 = scan.nextLine();
//
//        if (str1.equals(str2)) {
//            System.out.println("Строки одинаковые");
//        } else System.out.println("Строки разные");
//
//        scan.close();


//  ЗАДАНИЕ: В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
//        с выводом соответствующего сообщения после каждого сравнения:

//        "ссылки на строки одинаковые" или "ссылки на строки разные".
//
//        Порядок сравнения должен быть следующим:
//        - строку string1 со строкой string2
//        - строку string2 со строкой string3
//        - строку string1 со строкой string3.
//
//        String string1 = "Амиго";
//        String string2 = string1;
//        String string3 = new String(string1);
//
//
//        String same = "ссылки на строки одинаковые";
//        String different = "ссылки на строки разные";
//
//        if (string1 == string2) {
//            System.out.println(same);
//        } else System.out.println(different);
//
//        if (string2 == string3) {
//            System.out.println(same);
//        } else System.out.println(different);
//
//        if (string1 == string3) {
//            System.out.println(same);
//        } else System.out.println(different);


//  ЗАДАНИЕ: Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
//        и теперь невозможно набирать буквы в верхнем регистре.
//        Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
//        Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен".
//        В ином случае - "доступ запрещен".

//        String secret = "AmIGo";
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите код доступа:");
//        String pass = scan.nextLine();
//
//        if (pass.equalsIgnoreCase(secret)){
//            System.out.println("Доступ разрешен!");
//        } else {
//            System.out.println("Доступ запрещен!");
//        }
//
//        scan.close();


//ЦИКЛЫ


//  ЗАДАНИЕ: Используя цикл while вывести на экран сто раз цитату (переменная quote):
//        «Я никогда не буду работать за копейки. Амиго»
//        Каждое значение вывести с новой строки.

//        int i = 1;
//        String quote = "Я никогда не буду работать за копейки. Амиго";
//
//        while (i < 101) {
//            System.out.println(i + ". " + quote);
//            ++i;
//        }

//  ЗАДАНИЕ: Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
//        Каждый вывод - с новой строки.

//        Пример вывода на экран для имени Света:
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.

//        Scanner scan = new Scanner(System.in);

//        System.out.println("Введите имя:");
//        String name = scan.nextLine();

//        String text = " любит меня.";
//        int i = 1;
//
//        while (i < 11) {
//            System.out.println(i + ". " + name + text);
//            i++;
//        }
//
//        scan.close();


//  ЗАДАНИЕ: Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
//        пока пользователь не введет слово "ENTER".
//        Вывести на экран полученную сумму и завершить программу.

//        Scanner scan = new Scanner(System.in);
//        int sum = 0;
//        String isExit = "ENTER";
//
//        while (true) {
//
//            System.out.println("Введите число для суммирования или введите " + isExit + " для выхода:");
//
//            if (scan.hasNextInt()){
//                sum = sum + scan.nextInt();
//            } else if (scan.nextLine().equals(isExit)) {
//                break;
//            }
//        }

//        System.out.println("Сумма введенных чисел: " + sum);
//        scan.close();


//  ЗАДАНИЕ: Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник
//        размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

//        Пример вывода:
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ
//        QQQQQQQQQQ

//        int i = 0;
//
//        while (i < 5){
//
//            int j = 0;
//
//            while (j < 10) {
//                System.out.print("Q");
//                ++j;
//            }
//
//            System.out.println();
//            ++i;
//        }


//  ЗАДАНИЕ: Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
//        размером 10 (высота) на 20 (ширина) из букв 'Б'.
//        Незаполненная часть состоит из пробелов.
//
//        Пример вывода:
//        ББББББББББББББББББББ
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        Б                  Б
//        ББББББББББББББББББББ

//        int i = 0;
//
//        while (i < 10){
//
//            int j = 0;
//
//            while (j < 20) {
//
//                if (i != 0 && i != 9 && j != 0 && j != 19) {
//                    System.out.print(" ");
//                } else System.out.print("X");
//
//                ++j;
//            }
//
//            System.out.println();
//            ++i;
//        }


//  ЗАДАНИЕ: Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//        Слово "enough" выводить не нужно.
//        Для этого необходимо использовать бесконечный цикл (while(true)).
//
//        Подсказка: чтобы завершить бесконечный цикл, используй оператор break.

//        Scanner scan = new Scanner(System.in);
//        String s;
//        String isExit = "enough";
//
//        while (true){
//
//            System.out.println("Введите строку или введите " + isExit + " для выхода:");
//            s = scan.nextLine();
//
//            if (s.equals(isExit)) break;
//            else System.out.println(s);
//        }
//
//        scan.close();


//  ЗАДАНИЕ: Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
//
//        Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.

//        int i = 1;
//
//        while (i < 101){
//
//            if ((i % 3) == 0) {
//                System.out.println(i);
//                ++i;
//            } else {
//                ++i;
//                continue;
//            }
//        }


//  ЗАДАНИЕ: Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
//        например, строка или символ.
//        Выведи на экран минимальное число из введенных.
//        Если введено несколько таких чисел, необходимо вывести любое из них.
//
//        Пример ввода:
//        8
//        4
//        9
//        4
//        5
//        e
//
//        Пример вывода:
//        4

//        Scanner scan = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        int temp;
//
//        System.out.println("Введите число:");
//
//        while (scan.hasNextInt()){
//            temp = scan.nextInt();
//            min = Math.min(min, temp);
//        }
//
//        System.out.println(min);
//        scan.close();


//  ЗАДАНИЕ: Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
//        например, строка или символ.
//        Выведи на экран максимальное четное число из введенных.
//        Если введено несколько таких чисел, необходимо вывести любое из них.
//
//        Пример ввода:
//        8
//        9
//        8
//        4
//        5
//        e
//
//        Пример вывода:
//        8

//        Scanner scan = new Scanner(System.in);
//        int max_ch = Integer.MIN_VALUE;
//        int temp;
//
//        System.out.println("Введите число:");
//
//        while (scan.hasNextInt()){
//
//            temp = scan.nextInt();
//
//            if (temp % 2 == 0 && max_ch < temp){
//                max_ch = temp;
//            }
//        }
//
//        System.out.println(max_ch);
//        scan.close();


//  ЗАДАНИЕ: В этой задаче нужно:
//
//        Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
//        Должно быть введено минимум два числа. Если введено меньше двух целых чисел,
//        то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
//        Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
//        Если таких чисел несколько, то необходимо вывести любое из них.
//        Минимальных чисел тоже может быть несколько.
//
//        Пример ввода:
//        8
//        4 // минимальное число
//        7
//        4 // минимальное число
//        5 // второе по величине число (второе минимальное)
//        9
//        5 // второе по величине число (второе минимальное)
//        exit
//        Пример вывода:
//        5

//        Scanner scan = new Scanner(System.in);
//        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
//        int temp;
//
//        System.out.println("Введите число:");
//
//        while (scan.hasNextInt()){
//
//            temp = scan.nextInt();
//
//            if (min1 > temp) {
//                min2 = min1;
//                min1 = temp;
//            } else min2 = Math.min(min2, temp);
//
//        }
//
//        System.out.println("Первое минимальное число: " + min1);
//        System.out.println("Второе минимальное число: " + min2);

//        scan.close();


//  ЗАДАНИЕ: Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
//        Каждое значение нужно выводить с новой строки.

//    for(int i = 1; i <= 15; i++){
//        if(i % 2 == 0) System.out.println(i);
//    }


//  ЗАДАНИЕ: В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
//        Допиши программу, чтобы на экран выводилась сумма чисел
//        от start (включительно) до end (не включительно), кратных multiple.
//        Для этого используй цикл for.
//        Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите три целых числа:");
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        int multiple = scanner.nextInt();
//
//        int sum = 0;
//
//        for (int i = start; i < end; i++) {
//            if (i % multiple == 0) {
//                sum = sum + i;
//            } else continue;
//        }

//        System.out.println("Результат:");
//        System.out.println(sum);

//        scan.close();


//  ЗАДАНИЕ: Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник
//        из восьмёрок со сторонами (катетами) 10 и 10.
//        То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д.
//
//        Пример вывода на экран:
//        8
//        88
//        888
//        8888
//        88888
//        888888
//        8888888
//        88888888
//        888888888
//        8888888888

//        for (int i = 0; i < 10; i++){
//
//            for (int j = 0; j < 10; j++) {
//
//                if (j <= i) System.out.print("X");
//                else System.out.print("O");
//
//            }
//
//            System.out.println();
//        }


//  ЗАДАНИЕ: В этой задаче нужно:

//        Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//        Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
//        Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
//
//        Пример ввода:
//        абв
//        2
//
//        Пример вывода:
//        абв
//        абв

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите строку:");
//        String s = scan.nextLine();

//        System.out.println("Ввести число, сколько раз будет выведена строка:");
//        int number = scan.nextInt();

//        int i = 0;
//
//        System.out.println("Вывод строки:");

//        do {
//            System.out.println(s);
//            i++;
//        } while (i < number);
//
//        scan.close();


//  ЗАДАНИЕ: Для решения этой задачи нужно:

//        Ввести с клавиатуры положительное целое число radius. Это будет радиус окружности.
//        Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
//        Результатом должно стать целое число (тип int).
//        Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
//        В качестве значения pi используй 3.14.
//
//        Пример ввода:
//        5
//
//        Пример вывода:
//        78

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите радиус круга:");
//        int radius = scan.nextInt();

//        double pi = 3.14;
//        int S = (int) (pi * radius * radius);
//
//        System.out.println("Площадь круга равна: " + S);

//        scan.close();


//  ЗАДАНИЕ: Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
//        Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
//        Второе - количество людей в кабинете.
//        Вывести на экран результат деления первого числа на второе.
//        Результатом должно быть вещественное число.
//
//        Пример ввода:
//        3
//        2
//
//        Пример вывода:
//        1.5

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите количество банок колы:");
//        int a = scan.nextInt();

//        System.out.println("Введите количество людей:");
//        int b = scan.nextInt();
//
//        double c = 1.0 * a / b;
//
//        System.out.println("Количество банок колы на человека: " + c);
//        scan.close();


//  ЗАДАНИЕ: Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
//        Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
//        Поэтому сделаем конвертер величин скорости из м/с в км/ч.
//        Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
//        Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
//        Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
//        Для округления необходимо использовать метод Math.round().

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите скорость ветра в м/с:");
//        int speed = scan.nextInt();
//
//        double speed_conv = Math.round(speed * 3.6);
//        System.out.println("скорость ветра в км/ч: " + speed_conv);
//
//        scan.close();


//  ЗАДАНИЕ: В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
//        Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
//        Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
//        В зависимости от полученных данных, округлить переменную glass:
//        до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
//        Результат вывести на экран.
//
//        Пример ввода:
//        true
//
//        Пример вывода:
//        1
//
//        Подсказка:
//        Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().

//        double glass = 0.5;
//
//        Scanner scan = new Scanner(System.in);

//        System.out.println("Введите true или false:");
//        boolean b = scan.nextBoolean();
//
//        if (b) {
//            glass = Math.ceil(glass);
//            int result = (int)glass;
//            System.out.println("Вы оптимист! Ваш результат: " + result);
//        } else {
//            glass = Math.floor(glass);
//            int result = (int)glass;
//            System.out.println("Вы пессимист! Ваш результат: " + result);
//        }
//
//        scan.close();


//  ЗАДАНИЕ: В методе main(String[]) тебе нужно заполнить массив strings значениями.
//        Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная),
//        иначе присвоить "Нечётный".
//        Вывод текста в консоль в тестировании не участвует.

//        String ODD = "Нечётный";
//        String EVEN = "Чётный";
//        String[] strings = new String[5];
//
//        for (int i = 0; i < strings.length; i++) {
//            if (i % 2 == 0) strings[i] = EVEN;
//            else strings[i] = ODD;
//        }

//        System.out.print("index = 0");
//        System.out.println(" value = " + strings[0]);
//        System.out.print("index = 1");
//        System.out.println(" value = " + strings[1]);
//        System.out.print("index = 2");
//        System.out.println(" value = " + strings[2]);
//        System.out.print("index = 3");
//        System.out.println(" value = " + strings[3]);
//        System.out.print("index = 4");
//        System.out.println(" value = " + strings[4]);


//  ЗАДАНИЕ: Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
//        если значение этого элемента чётное.

//        int[] array = new int[]{-1, 2, 3, -4, -5};
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) array[i] = array[i] * -1;
//        }
//            System.out.println(array[0]);
//            System.out.println(array[1]);
//            System.out.println(array[2]);
//            System.out.println(array[3]);
//            System.out.println(array[4]);

//  ЗАДАНИЕ: Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов
//      firstArray и secondArray в один массив resultArray.
//        Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
//        Программа должна правильно обрабатывать массивы любой длины.

//        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//        int[] resultArray;
//
//        int n = firstArray.length + secondArray.length;
//
//        resultArray = new int[n];
//
//        for (int i = 0; i < firstArray.length; i++) {
//            resultArray[i] = firstArray[i];
//        }
//
//        for (int i = firstArray.length, j = 0; i < n ; i++, j++) {
//            resultArray[i] = secondArray[j];
//        }
//
//        for (int i = 0; i < resultArray.length; i++) {
//                System.out.print(resultArray[i] + ", ");
//        }


//  ЗАДАНИЕ: Тебе нужно написать программу, которая:
//
//        Считывает с консоли целое число N.
//        Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
//        Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
//        Каждое число выводить с новой строки. Число N выводить не нужно.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите число:");
//        int n = scan.nextInt();
//
//        int[] array = new int[n];
//
//        if (n > 0){
//
//            for (int i = 0; i < n; i++) {
//                array[i] = scan.nextInt();
//            }
//
//            if (n % 2 != 0){
//                for (int i = 0; i < n; i++) {
//                    System.out.println(array[i]);
//                }
//            } else {
//                for (int i = n-1; i >= 0; i--) {
//                    System.out.println(array[i]);
//                }
//            }
//        }


//  ЗАДАНИЕ:Чтобы выполнить эту задачу, тебе нужно:
//
//        Ввести с клавиатуры число N.
//        Считать N целых чисел и заполнить ими массив.
//        Найти минимальное число среди элементов массива и вывести в консоль

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите число:");
//        int n = scan.nextInt();
//
//        int[] array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = scan.nextInt();
//        }
//
//        int min = array[0];
//
//        for (int i = 1; i < n; i++) {
//            min = Math.min(min, array[i]);
//        }
//
//        System.out.println(min);
//        scan.close();

//  ЗАДАНИЕ: Считать 6 строк и заполнить ими массив strings.
//        Удалить повторяющиеся строки из массива strings, заменив их на null
//        (null должны быть не строками "null").
//
//        Примеры.
//
//        Массив после чтения строк:
//        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//        Массив после удаления повторяющихся строк:
//        {null, null, null, "Java", "Tasks", null}


//        String[] strings = new String[6];
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите 6 строк:");
//
//        for (int i = 0; i < 6; i++) {
//            strings[i] = scan.nextLine();
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//
//            for (int j = 1; j < 6; j++) {

//                if(strings[i] != null && strings[j] != null && strings[i].equals(strings[j]) && i != j){
//                    strings[i] = null;
//                    strings[j] = null;

//                }
//            }
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//        }
//
//        scan.close();




























































    }
}