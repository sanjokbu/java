import java.time.*;
import java.time.format.TextStyle;
import java.util.*;


public class Main {


//////////////////////////////ВВОД И ВЫВОД ДАННЫХ С КЛАВИАТУРЫ//////////////////////////////////////////////


//  ЗАДАНИЕ: Считай с клавиатуры три строки. А затем:
//    Выведи на экран третью строку в неизменном виде.
//    Выведи на экран вторую строку, предварительно преобразовав ее к верхнему регистру.
//    Выведи на экран первую строку, предварительно преобразовав ее к нижнему регистру.
//
//    Пример ввода:
//    Строка Номер РАЗ
//    Вторая строка
//    Строка 3
//
//    Пример вывода:
//    Строка 3
//    ВТОРАЯ СТРОКА
//    строка номер раз

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Считай с клавиатуры три целых числа. Выведи на экран их среднее арифметическое.
//    Пример ввода:
//    51
//    101
//    201
//
//    Пример вывода:
//    117
//
//    Среднее арифметическое - это число, равное сумме всех чисел, деленной на их количество.
//    Используй деление без остатка.

//    public static void main(String[] args) {

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
//    }


////////////////////////////////////////УСЛОВНЫЙ ОПЕРАТОР///////////////////////////////////////////


//  ЗАДАНИЕ: Ввести с клавиатуры температуру на улице.
//    Если температура меньше 0, вывести надпись "на улице холодно",
//    иначе - вывести надпись "на улице тепло".

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Ввести с клавиатуры имя и возраст.
//    Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя, явитесь в военкомат",
//    где Имя - это имя, введенное ранее с клавиатуры.
//
//    Пример ввода:
//    Amigo
//    18
//
//    Пример вывода:
//    Amigo, явитесь в военкомат

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Ввести с клавиатуры три целых числа.
//    Определить, есть ли среди них хотя бы одна пара равных между собой чисел.
//    Если такая пара существует, вывести на экран числа через пробел.
//    Если все три числа равны между собой, то вывести все три.
//
//    Примеры:
//    a) при вводе чисел 1 2 2 получим вывод 2 2
//    b) при вводе чисел 2 2 2 получим вывод 2 2 2

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Напишем программу, которая будет просчитывать возможность
//    существования треугольника на основе длин его сторон.

//    Для этого тебе нужно:
//    Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
//    Определить возможность существования треугольника по сторонам.
//    Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
//    Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
//
//    То есть, тебе нужно выполнить три сравнения:
//    Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
//    Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
//    то треугольника с такими сторонами не существует.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.

//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }

//        Если числа одинаковые, то выводится любое.
//        Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.

//    public static void main(String[] args) {
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
//    }


//  ЗАДАНИЕ: Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.

//    String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
//
//    Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
//    Перепиши программу без использования тернарного оператора

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Напиши программу, которая считывает с клавиатуры два вещественных числа (double)
//    и выдает сообщение о том, равны ли эти числа с точностью до одной миллионной.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Напиши программу, которая считывает с клавиатуры две строки
//    и выдает сообщение о том, одинаковые ли эти строки.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
//    с выводом соответствующего сообщения после каждого сравнения:
//    "ссылки на строки одинаковые" или "ссылки на строки разные".
//
//    Порядок сравнения должен быть следующим:
//    - строку string1 со строкой string2
//    - строку string2 со строкой string3
//    - строку string1 со строкой string3.

//    public static void main(String[] args) {

//        String string1 = "Амиго";
//        String string2 = string1;
//        String string3 = new String(string1);
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
//  }


//  ЗАДАНИЕ: Амиго создал секретное слово для доступа к закрытой информации, но у него сломалась клавиатура,
//    и теперь невозможно набирать буквы в верхнем регистре.
//    Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
//    Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен".
//    В ином случае - "доступ запрещен".

//    public static void main(String[] args) {

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
//    }


////////////////////////////////////////////////ЦИКЛЫ///////////////////////////////////////////////////////


//  ЗАДАНИЕ: Используя цикл while вывести на экран сто раз цитату (переменная quote):
//    «Я никогда не буду работать за копейки. Амиго»
//    Каждое значение вывести с новой строки.

//    public static void main(String[] args) {

//        int i = 1;
//        String quote = "Я никогда не буду работать за копейки. Амиго";
//
//        while (i < 101) {
//            System.out.println(i + ". " + quote);
//            ++i;
//        }
//    }


//  ЗАДАНИЕ: Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
//    Каждый вывод - с новой строки.
//
//    Пример вывода на экран для имени Света:
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.
//    Света любит меня.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму,
//    пока пользователь не введет слово "ENTER".
//    Вывести на экран полученную сумму и завершить программу.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник
//    размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.
//
//    Пример вывода:
//    QQQQQQQQQQ
//    QQQQQQQQQQ
//    QQQQQQQQQQ
//    QQQQQQQQQQ
//    QQQQQQQQQQ

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур)
//    размером 10 (высота) на 20 (ширина) из букв 'Б'.
//    Незаполненная часть состоит из пробелов.
//
//    Пример вывода:
//    ББББББББББББББББББББ
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    Б                  Б
//    ББББББББББББББББББББ

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//    Слово "enough" выводить не нужно.
//    Для этого необходимо использовать бесконечный цикл (while(true)).
//
//    Подсказка: чтобы завершить бесконечный цикл, используй оператор break.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.
//    Для этого используй цикл while.
//    Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
//    например, строка или символ.
//    Выведи на экран минимальное число из введенных.
//    Если введено несколько таких чисел, необходимо вывести любое из них.
//
//    Пример ввода:
//    8
//    4
//    9
//    4
//    5
//    e
//
//    Пример вывода:
//    4

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое:
//    например, строка или символ.
//    Выведи на экран максимальное четное число из введенных.
//    Если введено несколько таких чисел, необходимо вывести любое из них.
//
//    Пример ввода:
//    8
//    9
//    8
//    4
//    5
//    e
//
//    Пример вывода:
//    8

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: В этой задаче нужно:
//    Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
//    Должно быть введено минимум два числа. Если введено меньше двух целых чисел,
//    то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
//    Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры.
//    Если таких чисел несколько, то необходимо вывести любое из них.
//    Минимальных чисел тоже может быть несколько.
//
//    Пример ввода:
//    8
//    4 // минимальное число
//    7
//    4 // минимальное число
//    5 // второе по величине число (второе минимальное)
//    9
//    5 // второе по величине число (второе минимальное)
//    exit
//
//    Пример вывода:
//    5

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Напиши программу, в которой с помощью цикла for на экран будут выведены чётные числа от 1 до 15.
//    Каждое значение нужно выводить с новой строки.

//    public static void main(String[] args) {

//        for(int i = 1; i <= 15; i++){
//            if(i % 2 == 0) System.out.println(i);
//        }
//    }


//  ЗАДАНИЕ: В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
//    Допиши программу, чтобы на экран выводилась сумма чисел
//    от start (включительно) до end (не включительно), кратных multiple.
//    Для этого используй цикл for.
//    Подсказка: чтобы перейти к следующей итерации цикла, используй оператор continue.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Давай используем цикл for, чтобы вывести на экран прямоугольный треугольник
//    из восьмёрок со сторонами (катетами) 10 и 10.
//    То есть в первой строке должна быть одна 8, начиная слева, во второй - две и т.д.
//
//    Пример вывода на экран:
//    8
//    88
//    888
//    8888
//    88888
//    888888
//    8888888
//    88888888
//    888888888
//    8888888888

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: В этой задаче нужно:
//    Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
//    Вывести на экран строку number раз с помощью цикла do-while.
//    Каждое значение нужно вывести с новой строки.
//    Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.
//
//    Пример ввода:
//    абв
//    2
//
//    Пример вывода:
//    абв
//    абв

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Для решения этой задачи нужно:
//    Ввести с клавиатуры положительное целое число radius.
//    Это будет радиус окружности.
//    Вывести на экран площадь круга, рассчитанную по формуле: S = pi * radius * radius.
//    Результатом должно стать целое число (тип int).
//    Для этого нужно привести к типу int результат умножения (отбросить дробную часть, округлив вниз до целого числа).
//    В качестве значения pi используй 3.14.
//
//    Пример ввода:
//    5
//
//    Пример вывода:
//    78

//    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите радиус круга:");
//        int radius = scan.nextInt();

//        double pi = 3.14;
//        int S = (int) (pi * radius * radius);
//
//        System.out.println("Площадь круга равна: " + S);

//        scan.close();
//    }


//  ЗАДАНИЕ: Давай разделим ящик колы на кабинет программистов.
//    Для этого напишем программу, в которой:
//    Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике.
//    Второе - количество людей в кабинете.
//    Вывести на экран результат деления первого числа на второе.
//    Результатом должно быть вещественное число.
//
//    Пример ввода:
//    3
//    2
//
//    Пример вывода:
//    1.5

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
//    Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
//    Поэтому сделаем конвертер величин скорости из м/с в км/ч.
//    Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
//    Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
//    Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
//    Для округления необходимо использовать метод Math.round().

//    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите скорость ветра в м/с:");
//        int speed = scan.nextInt();
//
//        double speed_conv = Math.round(speed * 3.6);
//        System.out.println("скорость ветра в км/ч: " + speed_conv);
//
//        scan.close();
//    }


//  ЗАДАНИЕ: В методе main() есть переменная double glass = 0.5, которая символизирует наполовину заполненный стакан.
//    Для пессимиста он наполовину пуст, а для оптимиста - наполовину полон.
//    Необходимо считать с клавиатуры данные типа boolean, используя метод nextBoolean() объекта типа Scanner.
//    В зависимости от полученных данных, округлить переменную glass:
//    до целого числа вниз (0), если пессимист (false) и до целого числа вверх (1), если оптимист (true).
//    Результат вывести на экран.
//
//    Пример ввода:
//    true
//
//    Пример вывода:
//    1
//
//    Подсказка:
//    Чтобы округлить вещественное число до целого вниз, используй метод Math.floor(), вверх - метод Math.ceil().

//    public static void main(String[] args) {

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
//    }


///////////////////////////////////////////////МАССИВЫ///////////////////////////////////////////////////////


//  ЗАДАНИЕ: В методе main(String[]) тебе нужно заполнить массив strings значениями.
//    Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная),
//    иначе присвоить "Нечётный".
//    Вывод текста в консоль в тестировании не участвует.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который меняет знак элемента массива array на противоположный,
//    если значение этого элемента чётное.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов
//    firstArray и secondArray в один массив resultArray.
//    Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
//    Программа должна правильно обрабатывать массивы любой длины.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Тебе нужно написать программу, которая:
//    Считывает с консоли целое число N.
//    Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
//    Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
//    Каждое число выводить с новой строки. Число N выводить не нужно.

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ:Чтобы выполнить эту задачу, тебе нужно:
//    Ввести с клавиатуры число N.
//    Считать N целых чисел и заполнить ими массив.
//    Найти минимальное число среди элементов массива и вывести в консоль

//    public static void main(String[] args) {

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
//    }


//  ЗАДАНИЕ: Считать 6 строк и заполнить ими массив strings.
//    Удалить повторяющиеся строки из массива strings, заменив их на null
//    (null должны быть не строками "null").
//
//    Примеры.
//
//    Массив после чтения строк:
//    {"Hello", "Hello", "World", "Java", "Tasks", "World"}

//    Массив после удаления повторяющихся строк:
//    {null, null, null, "Java", "Tasks", null}

//    public static void main(String[] args) {

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
//            for (int j = i + 1; j < strings.length; j++) {
//
//                if(strings[i] == null) {
//                    break;
//                } else if ( strings[i].equals(strings[j]) ){
//                    strings[i] = null;
//                    strings[j] = null;
//                }
//
//            }
//        }

//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i] + ", ");
//        }
//
//        scan.close();
//    }


//  ЗАДАНИЕ: Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
//    заполни его таблицей умножения и выведи в консоли в следующем виде:

//    1 2 3 4 …
//    2 4 6 8 …
//    3 6 9 12 …
//    4 8 12 16 …
//
//    Числа в строке разделены пробелом.

//    public static void main(String[] args) {
//
//        int[][] MULTIPLICATION_TABLE;
//
//        MULTIPLICATION_TABLE = new int[10][10];
//
//        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
//
//            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
//
//                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j+1);
//
//            }
//
//        }
//
//        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
//
//            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
//
//                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
//
//            }
//
//            System.out.println();
//        }
//    }


//  ЗАДАНИЕ: Создай треугольный массив, где значение каждого элемента — это сумма его индексов.
//
//    Например:
//    array[7][3] = 7 + 3 = 10,
//    array[3][0] = 3 + 0 = 3.
//
//    Выведи массив на экран в следующем виде:
//    0
//    1 2
//    2 3 4
//    3 4 5 6
//    4 5 6 7 8
//    5 6 7 8 9 10
//    ...
//
//    Числа в строке разделены пробелом.
//
//    Задать треугольный массив можно следующим образом:
//    int[][] array = new int[10][];
//    array[0] = new int[1];
//    array[1] = new int[2];
//    array[2] = new int[3];
//    ...

//    public static void main(String[] args) {

//        int[][] result = new int[10][];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = new int [i+1];
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = i + j;
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


//  ЗАДАНИЕ: Двумерный массив — это массив массивов, то есть в каждой его ячейке находится ссылка на некий массив.
//    Но гораздо проще его представить в виде таблицы, у которой задано количество строк (первое измерение)
//    и количество столбцов (второе измерение).
//    В этой задаче мы будем создавать такой массив.
//
//    Для этого реализуй метод main(String[]), который:
//    Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
//    Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
//    Инициализирует двумерный массив multiArray:
//    количеством строк N;
//    строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).
//
//    Пример:

//    Введено число 5.
//    Введены числа 1, 7, 5, 9, 3.
//
//    Получаем такой массив:
//
//    []
//    [][][][][][][]
//    [][][][][]
//    [][][][][][][][][]
//    [][][]

//    public static void main(String[] args) {

//        int[][] multiArray;
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Введите количество строк в массиве:");
//        int n = scan.nextInt();
//
//        multiArray = new int[n][];
//
//        for (int i = 0; i < n; i++) {
//            int t = scan.nextInt();
//            multiArray[i] = new int[t];
//        }

//        scan.close();
//    }


//  ЗАДАНИЕ: В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray

//    public static void main(String[] args) {

//        int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//
//                System.out.print("{");
//
//                for (int k = 0; k < multiArray[i][j].length; k++) {
//                    System.out.print(" " + multiArray[i][j][k] + " ");
//                }
//
//                System.out.print("}");
//            }
//            System.out.println();
//        }
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который выводит массивы strings и ints
//    в консоли с помощью метода Arrays.toString()

//    public static void main(String[] args) {

//        String[] strings = new String[]{"I", "love", "Java"};
//        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//
//        String s = Arrays.toString(strings);
//        String i = Arrays.toString(ints);
//
//        System.out.println(s);
//        System.out.println(i);
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который выводит массивы strings и ints
//    в консоли c помощью метода Arrays.deepToString(Object[][]).

//    public static void main(String[] args) {

//        String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
//        int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//
//        String s = Arrays.deepToString(strings);
//        String i = Arrays.deepToString(ints);
//
//        System.out.println(s);
//        System.out.println(i);
//    }


//  ЗАДАНИЕ: Исправь работу метода main(String[]), который выводит в консоли true,
//    если arrayFirst равняется arraySecond, иначе — false.

//    public static void main(String[] args) {

//        int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//
//        boolean b = Arrays.deepEquals(arrayFirst, arraySecond);
//
//        System.out.println(b);
//    }


//  ЗАДАНИЕ: Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
//    Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
//    Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
//    Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
//    При тестировании значения полей класса Solution будут разными, учти это.

//    public static void main(String[] args) {

//        int[] array = new int[20];
//        int valueStart = 10;
//        int valueEnd = 13;
//
//        if (array.length % 2 == 0){
//            Arrays.fill(array, 0,(array.length/2), valueStart);
//            Arrays.fill(array, (array.length/2), array.length, valueEnd);
//        } else {
//            Arrays.fill(array, 0,(array.length/2)+1, valueStart);
//            Arrays.fill(array, (array.length/2)+1, array.length, valueEnd);
//        }

//        System.out.println(Arrays.toString(array));
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который делит массив array на два подмассива и
//    заполняет ими двумерный массив result.
//    Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
//    Для разделения массива используй метод Arrays.copyOfRange(int[], int, int).
//    Порядок элементов не меняй.
//    При тестировании значения полей класса Solution будут разными, учти это.

//    public static void main(String[] args) {

//        int[][] result = new int[2][];
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        if (array.length % 2 == 0){
//            result[0] = new int[array.length / 2];
//            result[0] = Arrays.copyOfRange(array, 0, (array.length / 2));
//
//            result[1] = new int[array.length / 2];
//            result[1] = Arrays.copyOfRange(array, (array.length / 2), array.length);
//
//        } else {
//            result[0] = new int[(array.length / 2) + 1];
//            result[0] = Arrays.copyOfRange(array, 0, (array.length / 2 + 1));
//
//            result[1] = new int[array.length / 2];
//            result[1] = Arrays.copyOfRange(array, (array.length / 2 + 1), array.length);
//
//        }
//
//        System.out.println(Arrays.deepToString(result));
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который сортирует массив array по возрастанию.
//    Для сортировки массива используй метод Arrays.sort(int[]).

//    public static void main(String[] args) {

//        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//
//        Arrays.sort(array);
//
//        System.out.println(Arrays.toString(array));
//    }


//  ЗАДАНИЕ: Реализуй метод main(String[]), который выводит в консоль true,
//    если элемент содержится в переданном массиве, иначе — false.
//    Массив array не должен изменять расположение своих элементов.
//
//    Для поиска элемента в массиве нужен бинарный поиск.
//    Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
//    Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
//    вторым параметром — искомый элемент.
//    Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента, если такой элемент есть в массиве.
//
//    Для сортировки массива можно использовать метод Arrays.sort(int[]).
//    При тестировании значения переменных класса Solution будут разными.

//    public static void main(String[] args) {

//        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int element = 5;
//
//        int[] temp_array = Arrays.copyOf(array, array.length);
//
//        Arrays.sort(temp_array);
//
//        int b = Arrays.binarySearch(temp_array, element);
//
//        if (b >= 0) System.out.println(true);
//        else System.out.println(false);
//    }


////////////////////////////////////////////////ФУНКЦИИ/////////////////////////////////////////////


//  ЗАДАНИЕ: Метод main выводит слишком много строк информации о различных понятиях.
//    Было бы логично разделить вывод информации о водороде и об острове Ява на разные методы.
//    Создай public static void printHydrogenInfo() метод, который должен выводить все строки о водороде.
//    Также создай public static void printJavaInfo() метод, который будет выводить все строки об острове Ява.

//    public static void main(String[] args) {
//        printHydrogenInfo();
//        printJavaInfo();
//    }
//
//    public static void printHydrogenInfo() {
//        System.out.println("Водород:");
//        System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
//        System.out.println("Является самым легким элементом таблицы.");
//        System.out.println("Водород применяется в:");
//        System.out.println("-Химической промышленности;");
//        System.out.println("-Нефтеперерабатывающей промышленности;");
//        System.out.println("-Авиации;");
//        System.out.println("-Электроэнергетике.");
//    }
//
//    public static void printJavaInfo(){
//        System.out.println("Остров Ява:");
//        System.out.println("Входит в состав Индонезии.");
//        System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
//        System.out.println("Ява является самым населенным островом в мире:");
//        System.out.println("Общее население — 140 млн. человек.");
//        System.out.println("Плотность населения — 1061 чел/км.кв.");
//        System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
//    }


//  ЗАДАНИЕ: Перед тобой — плохой пример использования методов:

//    public static void print1(){
//        System.out.println("Я — поэт, зовусь я Цветик.");
//    }
//
//    public static void print2(){
//        System.out.println("От меня вам всем приветик.");
//    }
//
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        print1();
//        print2();
//    }
//    Методы разделили двустишие;
//    Одну строку кода не стоит оборачивать в отдельный метод.
//    Перепиши код так, чтобы весь текст выводился в методе main, а остальные методы удали.
//    Вывод программы не должен измениться.

//    public static void main(String[] args) {
//
//        System.out.println("Я — поэт, зовусь я Цветик.");
//        System.out.println("От меня вам всем приветик.");
//    }


//  ЗАДАНИЕ: Переименуй параметры метода printPersonInfo():

//    public static void main(String[] args) {
//        String firstName = "Ольга";
//        String lastName = "Киприяновна";
//        String favouriteDish = "Пельмени";
//        printPersonInfo(firstName, lastName, favouriteDish);
//    }
//
//    public static void printPersonInfo(String firstName, String lastName, String favouriteDish){
//        System.out.println("Краткое досье:");
//        System.out.println("Имя: " + firstName);
//        System.out.println("Фамилия: " + lastName);
//        System.out.println("Любимое блюдо: " + favouriteDish);
//    }

//        firstName в name;
//        lastName в surname;
//        favouriteDish в meal;
//        таким образом, чтобы функционал программы остался неизменным.
//        Имена переменных в методе main() оставь без изменений.

//    public static void main(String[] args) {
//        String firstName = "Настя";
//        String lastName = "Буланова";
//        String favouriteDish = "Блины";
//        printPersonInfo(firstName, lastName, favouriteDish);
//    }
//
//    public static void printPersonInfo(String name, String surname, String meal){
//        System.out.println("Краткое досье:");
//        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: " + surname);
//        System.out.println("Любимое блюдо: " + meal);
//    }


//  ЗАДАНИЕ: Метод createCrew() выводит должности и имена членов экипажа космического корабля.
//
//    Во избежание путаницы внутри метода:
//
//    public static void main(String[] args) {
//        String navigator = "Джон";
//        String pilot = "Пол";
//        String secondPilot = "Джордж";
//        String flightEngineer = "Ринго";
//        createCrew(navigator, pilot, secondPilot, flightEngineer);
//    }
//
//    public static void createCrew(String name1, String name2, String name3, String name4){
//        System.out.println("Четвёрка, которой предстоит покорить космос:");
//        System.out.println("Штурман: " + name1);
//        System.out.println("Пилот: " + name2);
//        System.out.println("Второй пилот: " + name3);
//        System.out.println("Бортинженер: " + name4);
//    }

//    измени имена параметров createCrew(), чтоб они соответствовали именам переменных, которые передаются в метод:
//    name1 в navigator
//    name2 в pilot
//    name3 в secondPilot
//    name4 в flightEngineer
//
//    При этом результат выполнения программы не должен измениться.

//    public static void main(String[] args) {
//        String navigator = "Джон";
//        String pilot = "Пол";
//        String secondPilot = "Джордж";
//        String flightEngineer = "Ринго";
//        createCrew(navigator, pilot, secondPilot, flightEngineer);
//    }
//
//    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
//        System.out.println("Четвёрка, которой предстоит покорить космос:");
//        System.out.println("Штурман: " + navigator);
//        System.out.println("Пилот: " + pilot);
//        System.out.println("Второй пилот: " + secondPilot);
//        System.out.println("Бортинженер: " + flightEngineer);
//    }


//  ЗАДАНИЕ: Напишем утилиту для работы с массивами. Основная часть функционала готова:

//    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//    }
//
//    public static void reverseArray(int[] array) {
//        //напишите тут ваш код
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }

//    метод printArray() выводит в консоли все элементы массива.
//    Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
//    Метод должен работать только с массивами целочисленных значений (int[]).
//
//    Пример:
//    Если массив содержал элементы:
//     1, 2, 3, 4, 5, 6, 7, 8, 9, 0
//
//    то после вызова метода reverseArray() должен содержать:
//    0, 9, 8, 7, 6, 5, 4, 3, 2, 1

//    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//    }
//
//    public static void reverseArray(int[] array) {
//        int[] temp_array = Arrays.copyOf(array, array.length);
//
//        for (int i = 0, j = array.length - 1 ; i < array.length; i++, j--) {
//            array[i] = temp_array[j];
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }


//  ЗАДАНИЕ: Неплохо было бы иметь один метод для решения различных задач.
//    У тебя есть возможность написать такой.
//    Создай еще 9 методов universalMethod(). В сумме их должно получиться 10.
//    Параметры, которые они должны принимать, придумай сам.

//    public static void main(String[] args) {
//    }
//
//    public static void universalMethod(){
//    }
//
//    public static void universalMethod(int x){
//    }
//
//    public static void universalMethod(String s){
//    }
//
//    public static void universalMethod(double d){
//    }
//
//    public static void universalMethod(boolean b){
//    }
//
//    public static void universalMethod(char ch){
//    }
//
//    public static void universalMethod(long l){
//    }
//
//    public static void universalMethod(short sh){
//    }
//
//    public static void universalMethod(int x, String s){
//    }
//
//    public static void universalMethod(char ch, long l, short sh){
//    }


//  ЗАДАНИЕ: Перед тобой метод signIn(), который приветствует пользователей сайта.
//    Сейчас он приветствует всех пользователей, а должен только зарегистрированных.
//    Имена всех незарегистрированных пользователей — "user".
//    Добавь проверку имени пользователя в начало метода signIn().
//    Если имя "user", прерви выполнение метода, используя ключевое слово return.

//    public static void main(String[] args) {

////        String name = "user";
//        String name = "Alex";
//        signIn(name);
//    }
//
//    public static void signIn(String username){
//
//        if (username != "user") {
//            System.out.println("Добро пожаловать " + username);
//            System.out.println("Очень скучали по Вам, " + username);
//        } else return;
//    }


//  ЗАДАНИЕ: Давай напишем реализацию калькулятора, который будет считать степени чисел.
//    Для этого создай метод cube().
//    В качестве аргумента он должен принимать целочисленное значение типа long.
//    Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
//    Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long.

//    public static void main(String[] args) {
//
//        long n = 10;
//        long result = cube(n);
//        System.out.println(result);
//
//    }
//
//    public static long cube(long n) {
//
//        long result = n * n * n;
//        return result;
//
//    }


/////////////////////////////////////////////////ТИПЫ ДАННЫХ/////////////////////////////////////////////////////


//  ЗАДАНИЕ: Как тебе уже известно, всего в языке Java 8 примитивных типов.
//    Создай по одной переменной каждого примитивного типа в классе Solution.
//    Переменные не должны находиться в каком-либо методе.

//    public static char ch;
//    public static byte b;
//    public static boolean b;
//
//    public static short sh;
//    public static int i;
//    public static long l;
//
//    public static double d;
//    public static float f;


//  ЗАДАНИЕ: Создай по одной переменной каждого примитивного численного типа в классе Solution.
//    Этим переменным присвой максимально возможное для них значение.
//    Никаких методов создавать не нужно.

//    public static byte b = Byte.MAX_VALUE;
//
//    public static short sh = Short.MAX_VALUE;
//    public static int i = Integer.MAX_VALUE;
//    public static long l = Long.MAX_VALUE;
//
//    public static double d = Double.MAX_VALUE;
//    public static float f = Float.MAX_VALUE;


//  ЗАДАНИЕ: Перед тобой 5 общеизвестных величин:
//    double earthDiameter = 12742.0;
//    double lightSpeed = 299792458.0;
//    double uraniumAtomicMass = 238.0289;
//    double averageBeeWeight = 0.085;
//    double javaDeveloperSalary = 10000.0;
//
//    Перепиши их в более читаемый формат — экспоненциальный.
//    Мантиcса должна представлять собой дробное число от 1.0 до 10.
//    После изменения формата чисел реальное значение, хранимое в переменной, не должно измениться.
//
//    Пример:
//    109.1678 — обычная форма;
//    1.091678E+2 — экспонентная форма записи.

//    double earthDiameter = 1.2742E4;
//    double lightSpeed = 2.99792458E8;
//    double uraniumAtomicMass = 2.380289E2;
//    double averageBeeWeight = 8.5E-2;
//    double javaDeveloperSalary = 1.0E4;


//  ЗАДАНИЕ: В методе main вызови метод div() 2 раза.
//    Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity",
//    а второй — "-Infinity".
//    Код метода div() изменять нельзя.

//    public static void main(String[] args) {
//        div(0.0, 100.0);
//        div(0.0, -100.0);
//
//    }
//
//    public static void div(double a, double b) {
//        System.out.println(b / a);
//    }


//  ЗАДАНИЕ: В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
//    Код метода div() изменять нельзя.

//    public static void main(String[] args) {
//        div(0.0, 0.0);
//    }
//
//    public static void div(double a, double b){
//        System.out.println(b/a);
//    }


//  ЗАДАНИЕ: В методе main() измени порядок вызова методов System.out.print() таким образом,
//    чтобы вывод на консоль был: "Hello char".
//    Значение переменных не изменяй. В методе main() никакого кода больше не дописывай.

//    public static char char1 = 101;
//    public static char char2 = 'H';
//    public static char char3 = 114;
//    public static char char4 = '\u006F';
//    public static char char5 = 108;
//    public static char char6 = 'h';
//    public static char char7 = 0x0063;
//    public static char char8 = ' ';
//    public static char char9 = 'l';
//    public static char char10 = 0x61;
//
//    public static void main(String[] args) {
//
//        System.out.print(char2); // H
//        System.out.print(char1); // e
//        System.out.print(char5); // l
//        System.out.print(char9); // l
//        System.out.print(char4); // o
//
//        System.out.print(char8); // " "
//
//        System.out.print(char7); // c
//        System.out.print(char6); // h
//        System.out.print(char10);// a
//        System.out.print(char3); // r
//
//        System.out.println();
//    }


//  ЗАДАНИЕ: Реализуй метод setValues(long value), чтобы он устанавливал
//    полученное значение параметра value переменным a, b, c и d.
//    Изменять типы переменных a, b, c и d нельзя.

//    public static byte a;
//    public static short b;
//    public static int c;
//    public static long d;
//
//    public static void main(String[] args) {
//        setValues(100);
//    }
//
//    public static void setValues(long value){
//        a = (byte)value;
//        b = (short)value;
//        c = (int)value;
//        d = value;
//    }


//  ЗАДАНИЕ: Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
//    Изменять типы переменных a, b, c и d нельзя.
//    Оператор приведения типа не должен отличаться от типа переменной.

//        long a = 109 + 15;
//        int b = (int) a * 2;
//        short c = (short) (a / b);
//        byte d = (byte) (a + b - c);


//  ЗАДАНИЕ: Часто перед началом использования массива его необходимо заполнить значениями по умолчанию.
//    Реализуй такое заполнение в методе fillArray(Integer[] array, int value).
//    В качестве аргументов метод принимает массив и значение, которым его необходимо заполнить.
//    Массив заполняется полностью, независимо от его длины.

//    public static void main(String[] args) {
//        Integer[] array = new Integer[5];
//        fillArray(array, 3);
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static void fillArray(Integer[] array, int value){
//        Arrays.fill(array, value);
//    }


//  ЗАДАНИЕ: Иногда необходимо заполнить какую-то часть массива одинаковыми значениями
//    или же удалить существующие (присвоить значение null).
//    Реализуй для этого более гибкий метод
//    fillArray(Integer[] array, int value, int begin, int end),
//    где:
//    array — массив, который необходимо заполнить;
//    value — значение, которым необходимо заполнить;
//    begin — начиная с какого индекса необходимо заполнять (включительно);
//    end — на каком индексе остановить заполнение (исключая).

//    public static void main(String[] args) {
//        Integer[] array = new Integer[5];
//        fillArray(array, 3, 1, 3);
//        System.out.println(Arrays.toString(array));
//    }
//
//    public static void fillArray(Integer[] array, int value, int begin, int end) {
//        Arrays.fill(array, begin, end, value);
//    }


//  ЗАДАНИЕ: Используя оператор new в методе main(), создай:
//    10 объектов типа String;
//    5 объектов типа int[] (массивов значений int);
//    2 объекта типа Scanner.

//    public static void main(String[] args) {
//
//        String text = new String("hallo");
//        String name = new String("Alex");
//        String s3 = new String();
//        String s4 = new String();
//        String s5 = new String();
//        String s6 = new String();
//        String s7 = new String();
//        String s8 = new String();
//        String s9 = new String();
//        String s10 = new String();
//
//        int[] array = new int[5];
//        int[] massive = new int[10];
//        int[] ar = new int[3];
//        int[] mas = new int[4];
//        int[] m = new int[93];
//
//        Scanner scan = new Scanner(System.in);
//        Scanner reader = new Scanner("hi");
//    }


/////////////////////////////////////////////КЛАСС MATH//////////////////////////////////////////////////


//  ЗАДАНИЕ: Реализуй методы sin(double), cos(double), tan(double) которые возвращают
//    синус, косинус и тангенс угла соответственно, полученного как параметр.
//    Угол задан в градусах.
//    В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.

//    public static void main(String[] args) {
//        System.out.println(sin(45.0));
//        System.out.println(cos(45.0));
//        System.out.println(tan(45.0));
//    }
//
//    public static double sin(double a) {
//
//        return Math.sin(toRadians(a));
//    }
//
//    public static double cos(double a) {
//        //напишите тут ваш код
//        return Math.cos(toRadians(a));
//    }
//
//    public static double tan(double a) {
//        //напишите тут ваш код
//        return Math.tan(toRadians(a));
//    }


//  ЗАДАНИЕ: Исправь методы класса Solution, используя класс Math:
//    sqrt(double) — должен возвращать квадратный корень переданного аргумента.
//    cbrt(double) — должен возвращать кубический корень переданного аргумента.
//    pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.

//    public static void main(String[] args) {
//        System.out.println(sqrt(4.0));
//        System.out.println(cbrt(27.0));
//        System.out.println(pow(2, 5));
//    }
//
//    public static double sqrt(double a) {
//        return Math.sqrt(a);
//    }
//
//    public static double cbrt(double a) {
//        return Math.cbrt(a);
//    }
//
//    public static double pow(int number, int power) {
//        return Math.pow(number, power);
//    }


//  ЗАДАНИЕ: В этой задаче тебе нужно:
//    Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
//    Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
//    В методе min(int[]) обязательно используй метод Math.min(int, int).

//    public static void main(String[] args) {
//
//        int[] intArray = getArrayOfTenElements();
//
//        System.out.println("Минимальное число из введенных");
//        System.out.println(min(intArray));
//    }
//
//    public static int min(int[] ints) {
//
//        int min = Integer.MAX_VALUE;
//
//        for (int anInt : ints) {
//            min = Math.min(min, anInt);
//        }
//        return min;
//    }
//
//    public static int[] getArrayOfTenElements() {
//
//        int[] array = new int[10];
//
//        Scanner scan = new Scanner(System.in);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Введите число:");
//            array[i] = scan.nextInt();
//        }
//        return array;
//    }


/////////////////////////////////////////////////СЛУЧАЙНЫЕ ЧИСЛА/////////////////////////////////////////////////


//  ЗАДАНИЕ: В этой задаче тебе предстоит реализовать метод generateNumber(),
//    который будет возвращать случайное число от 0 до 99.
//    В методе generateNumber() используй метод Math.random().

//    public static void main(String[] args) {
//        System.out.println(generateNumber());
//    }
//
//    public static int generateNumber() {
//        int n = (int) (Math.random() * 99);
//        return  n;
//    }


//  ЗАДАНИЕ: В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall,
//    который будет работать как шар предсказаний.
//    Он случайным образом возвращает фразу-ответ на заданный вопрос.
//    В методе getPrediction() нужно использовать метод nextInt(int) класса Random,
//    который должен возвращать значения от 0 до 7 включительно.
//    В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа:
//
//    0 -> Бесспорно
//    1 -> Определённо да
//    2 -> Вероятнее всего
//    3 -> Хорошие перспективы
//    4 -> Спроси позже
//    5 -> Попробуй снова
//    6 -> Мой ответ — нет
//    7 -> Весьма сомнительно
//    Иначе вернуть null.

//        private static final String CERTAIN = "Бесспорно";
//        private static final String DEFINITELY = "Определённо да";
//        private static final String MOST_LIKELY = "Вероятнее всего";
//        private static final String OUTLOOK_GOOD = "Хорошие перспективы";
//        private static final String ASK_AGAIN_LATER = "Спроси позже";
//        private static final String TRY_AGAIN = "Попробуй снова";
//        private static final String NO = "Мой ответ — нет";
//        private static final String VERY_DOUBTFUL = "Весьма сомнительно";
//
//    public static void main(String[] args) {

//        System.out.println(getPrediction());
//    }
//
//    public static String getPrediction() {
//
//            Random r = new Random();
//            int n = r.nextInt(8);
//
//            if (n == 0) {
//                return CERTAIN;
//            } else if (n == 1) {
//                return DEFINITELY;
//            } else if (n == 2) {
//                return MOST_LIKELY;
//            } else if (n == 3) {
//                return OUTLOOK_GOOD;
//            } else if (n == 4) {
//                return ASK_AGAIN_LATER;
//            } else if (n == 5) {
//                return TRY_AGAIN;
//            } else if (n == 6) {
//                return NO;
//            } else if (n == 7) {
//                return VERY_DOUBTFUL;
//            } else return null;
//    }


//////////////////////////////////////////////ПАУЗЫ В ПРОГРАММЕ//////////////////////////////////////////////////


//  ЗАДАНИЕ: В классе Solution в методе countDown() происходит обратный отсчет.
//    Тебе нужно сделать так, чтобы между выводом текста в консоль была пауза в 1 секунду.
//    В этом тебе поможет метод sleep(long) класса Thread.

//    public static void main(String[] args) throws InterruptedException {
//        countDown();
//    }
//    public static void countDown() throws InterruptedException {
//        System.out.println("3");
//        Thread.sleep(1000);
//        System.out.println("2");
//        Thread.sleep(1000);
//        System.out.println("1");
//        Thread.sleep(1000);
//        System.out.println("Старт!");
//    }


//  ЗАДАНИЕ: В классе Solution реализуй метод printNumbers(), который выводит числа
//    от 1 до 10 включительно с паузой между выводом каждого числа — 1,3 миллисекунды.
//    В этом тебе поможет метод sleep(long, int) класса Thread, который должен сработать 9 раз.

//    public static void main(String[] args) throws InterruptedException {
//        printNumbers();
//    }
//
//    public static void printNumbers() throws InterruptedException {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if (i == 10) break;
//            Thread.sleep(1, 300000);
//        }
//    }


//  ЗАДАНИЕ: В классе Solution реализуй метод setTimer(int, int, int, int, int),
//    который засыпает на определенное время, используя соответствующие методы
//    java.util.concurrent.TimeUnit.

//    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
//
//        System.out.println("Таймер запущен!");
//
//        TimeUnit.DAYS.sleep(days);
//        TimeUnit.HOURS.sleep(hours);
//        TimeUnit.MINUTES.sleep(minutes);
//        TimeUnit.SECONDS.sleep(seconds);
//        TimeUnit.MILLISECONDS.sleep(millis);
//
//        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
//    }


///////////////////////////////////////////ПОБИТОВЫЕ ОПЕРАЦИИ////////////////////////////////////////////////


//  ЗАДАНИЕ: Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
//   Примечание: нужно закомментировать только две строки.

//    public static void main(String[] args) {
//        int x = 7;      // 0b 00111
//        //   x = x & 25;// 0b 00111 (7) & 0b 11001 (25) = 0b 00001 (1) - не подходит
//            x = x & 5;  // 0b 00111 (7) & 0b 00101 (5) = 0b 00101 (5)
//        //   x = x & 3; // 0b 00101 (5) & 0b 00011 (3) = 0b 00001 (1) - не подходит
//            x = x & 12; // 0b 00101 (5) & 0b 01100 (12) = 0b 00100 (4)
//        //  x = x | 1;  // 0b 00100 (4) | ob 00001 (1) = 0b 00101 (5)
//        System.out.println(x);
//    }


//  ЗАДАНИЕ: В классе реализуй метод swap() так, чтобы он менял местами значения переменных x и y.
//    Можно использовать только операции:
//    Исключающее или.
//    Присваивание.
//    Исключающее или с присваиванием.
//
//    Не оставляй комментарии, не меняй остальной код.

//    private int x;
//    private int y;
//
//    public Pair(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("x=%d, y=%d", x, y);
//    }
//
//    public void swap() {
//        int temp = x;
//        x = y ^ 0;
//        y = temp;
//    }


//  ЗАДАНИЕ:Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
//    Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.

//    public static void main(String[] args) {
//        System.out.println(getPowerOfTwo(3));
//    }
//
//    public static int getPowerOfTwo(int power) {
//        int result = 2;
//
//        return result << (power - 1);
//    }


//  ЗАДАНИЕ: Реализуй методы:
//
//    setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos
//    числа number и возвращает новое значение.
//    resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos
//    числа number и возвращает новое значение.
//    checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos
//    числа number и возвращает true, если значение "1" и false, если "0".

//    public static int setFlag(int number, int flagPos) {
//        return (number | (1 << flagPos));
//    }
//
//    public static int resetFlag(int number, int flagPos) {
//        return (number & ~(1 << flagPos));
//    }
//
//    public static boolean checkFlag(int number, int flagPos) {
//        if (((number | (1 << flagPos)) - number) == 0){
//            return true;
//        } else return false;
//    }


//////////////////////////////////////НЮАНСЫ РАБОТЫ РАЗЛИЧНЫХ ОПЕРАТОРОВ/////////////////////////////////////////


//  ЗАДАНИЕ: Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30.
//    изменять можно только логические операторы: && на & и || на |.

//    public static void main(String[] args) {
//        taskForCondition();
//    }
//
//    public static void taskForCondition() {
//        int number = 15;
//        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25; // 1. (number += 15) = 30 / 2. (number < 15) = false  / 3. (number > 25) = false  / 4. 30 < 25 = false
//        System.out.println(number);
//        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40; // 1. b0 11110 | 00100 = 30 2. 30 > 12 = true -> дальше не выполняется
//        System.out.println(number);
//    }


//  ЗАДАНИЕ: Внеси исправления в метод main(), чтобы он выводил в консоли число 12.

//    public static void main(String[] args) {
//        int number = 2;
//        System.out.println(number + number * (number + ++number));
//    }


//  ЗАДАНИЕ: Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
//        В методе можно изменять только постинкремент на преинкремент и наоборот,
//        а также постдекремент на предекремент и наоборот.


/////////////////////////////////////////////////РАБОТА СО СТРОКАМИ/////////////////////////////////////////////////


//  ЗАДАНИЕ: В классе Solution объявлены четыре публичных поля, которые соответствуют четырем целочисленным типам.
//    При объявлении эти поля инициализируются разными значениями — целочисленными литералами.
//    Но программа не компилируется, и нужно это исправить.
//    Для этого внеси минимальные изменения в значения полей так,
//    чтобы тип переменной соответствовал типу целочисленного литерала.
//    Можно изменять только знак и тип литерала, не изменяя цифры и их порядок.

//        public byte b = -128;
//        public short s = -32768;
//        public int i = 1_234_567_890;
//        public long l = 2_345_678_900l;


//  ЗАДАНИЕ: В классе Solution объявлены и проинициализированы семь публичных полей.
//    Они инициализируются разными значениями — литералами с плавающей точкой.
//    Но программа не компилируется, и нужно это исправить.
//    Для этого измени типы полей, чтобы они соответствовали значениям.
//    Имена и значения полей не изменяй.

//        public double a = 0.;
//        public double b = .0;
//        public double c = 100D;
//        public double d = 100.0;
//        public double e = 1.11E5;
//        public float f = 200F;
//        public float g = 0.F;


//  ЗАДАНИЕ: В классе Solution объявлено и проинициализировано публичное строковое поле.
//    Но строка слишком длинная и неудобочитаемая.
//    Для лучшей читаемости нужно разделить её на 5 подстрок и склеить
//    их "оператором +" (конкатенация строк) в таком виде:
//
//    первая строка: "Всегда пишите код так, "
//    вторая строка: "будто сопровождать его будет "
//    третья строка: "склонный к насилию психопат, "
//    четвертая строка: "который знает, где вы живете. "
//    пятая строка: "Martin Golding"

//    public String text = "Всегда пишите код так, "
//            + "будто сопровождать его будет "
//            + "склонный к насилию психопат, "
//            + "который знает, где вы живете. "
//            + "Martin Golding";


//  ЗАДАНИЕ: В классе Solution объявлены четыре публичных символьных поля. Им присвоены некоторые значения.
//    Но программа не компилируется. Нужно это исправить, не меняя значения символов.
//    Все поля статические (static) — это нужно, чтобы в методе main() получить к ним доступ.
//    На результат можно посмотреть, запустив метод main(). Он не принимает участие в тестировании.

//        public static char first = '\u004A';
//        public static char second = 'a';
//        public static char third = '\u0076';
//        public static char fourth = 'a';
//
//        public static void main(String[] args) {
//            System.out.print(first);
//            System.out.print(second);
//            System.out.print(third);
//            System.out.print(fourth);
//        }


//  ЗАДАНИЕ: Публичный статический метод toOctal(int) должен переводить целое число, полученное
//    в качестве входящего параметра, из десятичной системы счисления в восьмеричную.
//    А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
//    Методы работают только с положительными числами.
//    Если входящий параметр меньше или равен 0, методы возвращают 0.
//    Твоя задача — реализовать эти методы.
//
//    Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
//    i равно 0
//    while(десятичное число не равно 0)
//    восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
//    десятичное число = десятичное число / 8
//    i увеличиваем на 1
//
//
//    Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
//    i равно 0
//    while(восьмеричное число не равно 0)
//    десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
//    восьмеричное число = восьмеричное число / 10
//    i увеличиваем на 1
//
//    Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).

//    public static void main(String[] args) {
//        int decimalNumber = 21;
//        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
//        int octalNumber = 25;
//        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
//    }
//
//    public static int toOctal(int decimalNumber) {
//
//        int anInt = decimalNumber;
//        int ostInt;
//        int number = 0;
//
//        for (int i = 0; anInt > 0; i++) {
//            ostInt = anInt % 8;
//            number = (int)(number + ostInt * Math.pow(10,i));
//            anInt = anInt / 8;
//        }
//        return number;
//    }
//
//    public static int toDecimal(int octalNumber) {
//
//        int anInt = octalNumber;
//        int ostInt;
//        int number = 0;
//
//        for (int i = 0; anInt > 0; i++) {
//            ostInt = anInt % 10;
//            number = (int)(number + ostInt * Math.pow(8,i));
//            anInt = anInt / 10;
//        }
//        return number;
//    }


//  ЗАДАНИЕ: Публичный статический метод toBinary(int) должен переводить целое число,
//    полученное в качестве входящего параметра, из десятичной системы счисления
//    в двоичную и возвращать его строковое представление.
//
//    А публичный статический метод toDecimal(String) наоборот — из строкового представления
//    двоичного числа в десятичное число.
//
//    Методы работают только с положительными числами и не пустыми строками.
//    Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку.
//    Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
//    Твоя задача — реализовать эти методы.
//
//    Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий:
//    while(десятичное число не равно 0)
//    двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
//    десятичное число = десятичное число / 2
//
//    Один из алгоритмов перевода представления двоичного числа в десятичное число следующий:
//    for (int i = 0; i < длины двоичного представления; i++)
//    десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
//
//    Изначально берется крайнее правое число из двоичного представления.
//    С каждой итерацией цикла берется следующее число ближе к началу двоичного представления.
//
//    Подсказка: чтобы возвести число к степени можно использовать метод Math.pow(число, степень).

//    public static void main(String[] args) {
//        int decimalNumber = 13;
//        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
//        String binaryNumber = "1101";
//        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
//    }

//    public static String toBinary(int decimalNumber) {

//        int anInt = decimalNumber;
//        int ostInt;
//        String s = "";
//
//        for (int i = 0; anInt > 0; i++) {
//            ostInt = anInt % 2;
//            s = ostInt + s;
//            anInt = anInt / 2;
//        }
//        return s;
//    }
//
//    public static int toDecimal(String binaryNumber) {

//        if (binaryNumber == null) return 0;

//        int number = 0;
//
//        for (int i = 0, j = 1; i < binaryNumber.length() ; i++, j++) {
//            char n = binaryNumber.charAt(binaryNumber.length() - j);
//            number = (int) (number + Character.getNumericValue(n) * Math.pow(2,i));
//        }
//        return number;
//    }


//  ЗАДАНИЕ: Публичный статический метод toHex(int) должен переводить целое число, полученное
//    в качестве входящего параметра, из десятичной системы счисления в шестнадцатеричную
//    и возвращать его строковое представление.
//
//    А публичный статический метод toDecimal(String) наоборот — из строкового представления
//    шестнадцатеричного числа в десятичное число.
//
//    Методы работают только с положительными числами и не пустыми строками.
//    Если входящий параметр меньше или равен 0, метод toHex(int) возвращает пустую строку.
//    Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
//    Твоя задача реализовать эти методы.
//
//    Также в классе Solution есть константа HEX, которая содержит в себе все символы,
//    используемые в шестнадцатеричной системе.
//
//    Один из алгоритмов перевода десятичного числа в шестнадцатеричное следующий:
//    while(десятичное число не равно 0)
//    представление шестнадцатеричного числа = символ из строки HEX с индексом,
//    равным остатку от деления десятичного числа на 16 + представление шестнадцатеричного числа
//    десятичное число = десятичное число / 16
//
//    Один из алгоритмов перевода шестнадцатеричного числа в десятичное следующий:
//    for (int i = 0; i < длина входящей строки; i++)
//    десятичное число = 16 * десятичное число + индекс символа из строки HEX,
//    равного символу из входящей строки с индексом i

//    private static final String HEX = "0123456789abcdef";
//
//    public static void main(String[] args) {
//        int decimalNumber = 1256;
//        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
//        String hexNumber = "4e8";
//        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
//    }
//
//    public static String toHex(int decimalNumber) {
//
//        int anInt = decimalNumber;
//        int ostInt;
//        String s = "";
//
//        for (int i = 0; anInt > 0; i++) {
//            ostInt = anInt % 16;
//            char n = HEX.charAt(ostInt);
//            s = n + s;
//            anInt = anInt / 16;
//        }
//        return s;
//    }
//
//    public static int toDecimal(String hexNumber) {
//
//        if (hexNumber == null) return 0;
//
//        int number = 0;
//
//        for (int i = 0, j = 1; i < hexNumber.length() ; i++, j++) {
//            char ch = hexNumber.charAt(hexNumber.length() - j);
//            int n = HEX.indexOf(ch);
//            number = (int) (number + n * Math.pow(16,i));
//        }
//        return number;
//    }


//  ЗАДАНИЕ: Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа,
//    полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и
//    возвращать его строковое представление.
//    А публичный статический метод toBinary(String) наоборот — из строкового представления
//    шестнадцатеричного числа в строковое представление двоичного числа.
//    Методы работают только с не пустыми строками.
//    Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
//    Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1,то метод возвращает пустую строку.
//    Если входящий параметр метода toBinary(String) содержит любой символ,
//    кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
//
//    Твоя задача — реализовать эти методы.
//
//    Один из алгоритмов перевода строкового представления двоичного числа в
//    строковое представление шестнадцатеричного числа следующий:
//    Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
//    Если это не так, то добавляем нужное количество 0 в начало строки.
//    Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
//
//    Например:
//    двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
//    шестнадцатеричное представление — "9d0".
//
//    Один из алгоритмов перевода строкового представления шестнадцатеричного числа в
//    строковое представление двоичного числа следующий:
//    Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
//
//    Например:
//    шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
//    двоичное представление — "1001 1101 0000".

//    private static final String HEX = "0123456789abcdef";
//    private static final String BINARY = "0000000100100011010001010110011110001001101010111100110111101111";
//
//    public static void main(String[] args) {
//        String binaryNumber = "0100111010000";
//        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
//        String hexNumber = "9d0";
//        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
//    }
//
//    public static String toHex(String binaryNumber) {
//
//        if (binaryNumber == null || !binaryNumber.matches("[0,1]+") ) return "";
//
//        if (binaryNumber.length() % 4 != 0) {
//            for (int i = 4; i > binaryNumber.length() % 4; i--) {
//                binaryNumber = 0 + binaryNumber;
//            }
//        }
//
//        int length = binaryNumber.length();
//        String s = "";
//
//        for (int i = 0; i < length / 4; i++) {
//
//            int number = 0;
//            String temp = binaryNumber.substring(length - (i * 4) - 4, length - (i * 4));
//
//            for (int j = 0; j < 4 ; j++) {
//                char n = temp.charAt(3 - j);
//                number = (int) (number + Character.getNumericValue(n) * Math.pow(2,j));
//            }
//
//           char n = HEX.charAt(number);
//            s = n + s;
//        }
//        return s;
//    }
//
//    public static String toBinary(String hexNumber) {
//
//        if (hexNumber == null || !hexNumber.matches("[0-9, a-f]+") ) return "";
//
//        String s = "";
//
//        for (int i = 0; i < hexNumber.length() ; i++) {
//
//            char ch = hexNumber.charAt(hexNumber.length() - (i+1));
//            int n = HEX.indexOf(ch);
//
//            s = BINARY.substring(n*4,n*4+4) + s;
//        }
//        return s;
//    }


//  ЗАДАНИЕ: Выведи на экран следующий текст в две строки:
//    It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
//    It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
//
//    Подсказка:
//    ” – экранирование двойной кавычки;
//    \\ – экранирование обратной косой черты (\).

//    public static void main(String[] args) {
//        String text1 = "It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"";
//        String text2 = "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"";
//        System.out.println(text1);
//        System.out.println(text2);
//    }


//  ЗАДАНИЕ: В публичный статический метод init(char[]) передается массив символов размером 9,
//    который нужно заполнить следующими символами:
//    0 - '\u00A9'
//    1 - '\u004A'
//    2 - '\u0061'
//    3 - '\u0076'
//    4 - '\u0061'
//    5 - '\u0052'
//    6 - '\u0075'
//    7 - '\u0073'
//    8 - '\u0068'

//    public static void main(String[] args) {
//        char[] symbols = new char[9];
//        init(symbols);
//        System.out.println(new String(symbols));
//    }
//
//    public static void init(char[] symbols) {
//        char[] s = new char[] {'\u00A9', '\u004A', '\u0061', '\u0076', '\u0061', '\u0052', '\u0075', '\u0073', '\u0068'};
//        for (int i = 0; i < symbols.length; i++) {
//            symbols[i] = s[i];
//        }
//    }


//  ЗАДАНИЕ: Проинициализируй статические переменные следующими значениями:
//    partyFace — "\uD83E\uDD73"
//    balloon — "\uD83C\uDF88"
//    gift — "\uD83C\uDF81"
//    partyPopper — "\uD83C\uDF89"
//    cake — "\uD83C\uDF82"

//    public static String partyFace = "\uD83E\uDD73";
//    public static String balloon = "\uD83C\uDF88";
//    public static String gift = "\uD83C\uDF81";
//    public static String partyPopper = "\uD83C\uDF89";
//    public static String cake = "\uD83C\uDF82";
//
//    public static void main(String[] args) {
//        printCongratulation();
//    }
//
//    public static void printCongratulation() {
//        String happyBirthday = "С днем рождения!";
//        String congratulation = partyFace + balloon + partyPopper + cake + gift;
//        System.out.println(happyBirthday + congratulation);
//    }


//  ЗАДАНИЕ: В этой задаче тебе нужно выполнить проверку URL-адреса.
//    Простая схема URL-адреса выглядит так:
//    <сетевой протокол>://<название ресурса>.<домен>
//
//    Метод checkProtocol(String) проверяет, какой сетевой протокол (http или https) у URL-адреса,
//    полученного входящим параметром, и возвращает результат проверки — строку название сетевого протокола.
//    А метод checkDomain(String) проверяет, какой домен (com, net, org или ru) у URL-адреса,
//    полученного входящим параметром, и возвращает результат проверки — строку название домена.
//
//    Если URL-адрес начинается не с http или https, то результат будет — "неизвестный".
//    Если URL-адрес заканчивается не на com, net, org или ru, то результат будет — "неизвестный".

//    public static void main(String[] args) {
//        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
//        for (String url : urls) {
//            String protocol = checkProtocol(url);
//            String domain = checkDomain(url);
//
//            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
//        }
//    }

//    public static String checkProtocol(String url) {
//
//        int i = url.indexOf("https");
//        if (i >= 0) return "https";
//
//        if (url.contains("http")) return "http";
//
//        return "неизвестный";
//    }
//
//    public static String checkDomain(String url) {
//
//        int i = url.lastIndexOf(".com");
//        if (i >= 0) return "com";
//
//        if (url.endsWith(".net")) return "net";
//        if (url.endsWith(".org")) return "org";
//
//        if (url.contains(".ru")) return "ru";
//
//        return "неизвестный";
//    }


//  ЗАДАНИЕ: Метод getIndexFromFirstWord(String, String) и метод getIndexFromLastWord(String, String) принимают строку и слово.
//    Нужно, чтобы метод getIndexFromFirstWord(String, String) вернул индекс первого символа первого слова
//    (второй параметр метода) в строке (первый параметр метода).
//    А метод getIndexFromLastWord(String, String) вернул индекс первого символа последнего слова
//    (второй параметр метода) в строке (первый параметр метода).
//
//    Пример:
//    строка — "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание."
//    слово — "код"
//
//    метод getIndexFromFirstWord(строка, слово) должен вернуть 40
//    метод getIndexFromLastWord(строка, слово) должен вернуть 58

//    public static void main(String[] args) {
//        String string = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
//        String word = "код";
//        int indexFromFirstWord = getIndexFromFirstWord(string, word);
//        int indexFromLastWord = getIndexFromLastWord(string, word);
//        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
//        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
//    }
//
//    public static int getIndexFromFirstWord(String string, String word) {
//        return string.indexOf(word);
//    }
//
//    public static int getIndexFromLastWord(String string, String word) {
//        return string.lastIndexOf(word);
//    }


//  ЗАДАНИЕ: Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути,
//    полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
//    Версия jdk начинается со строки "jdk" и заканчивается на "/".
//
//    Пример:
//    путь — "/usr/java/jdk1.8/bin/"
//    версия jdk — "jdk-13"
//
//    Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
//    Метод main() не принимает участия в тестировании

//    public static void main(String[] args) {
//        String path = "/usr/java/jdk1.8/bin/";
//
//        String jdk13 = "jdk-13";
//        System.out.println(changePath(path, jdk13));
//    }
//
//    public static String changePath(String path, String jdk) {
//
//        int i = path.indexOf("jdk");
//        int j = path.indexOf("/",i);
//
//        String old_jdk = path.substring(i,j);
//
//        path = path.replace(old_jdk, jdk);
//
//        return path;
//    }


//  ЗАДАНИЕ: Используя StringTokenizer раздели query на части по разделителю delimiter.
//
//    Пример:
//    getTokens("java.util.stream", "\\.")
//    возвращает массив строк
//    {"java", "util", "stream"}
//
//    Hint: решить задачу поможет метод countTokens().

//    public static void main(String[] args) {
//        String packagePath = "java.util.stream";
//        String[] tokens = getTokens(packagePath, "\\.");
//        System.out.println(Arrays.toString(tokens));
//    }
//
//    public static String[] getTokens(String query, String delimiter) {
//
//        StringTokenizer tokens = new StringTokenizer(query,delimiter);
//
//        int count = tokens.countTokens();
//        String[] s = new String[count];
//
//        for (int i = 0; i < count; i++) {
//            s[i] = tokens.nextToken();
//        }
//
//        return s;
//    }


//  ЗАДАНИЕ: Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
//    Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.
//
//    Для этого используй метод String.format().

//    public static void main(String[] args) {
//        System.out.println(format("Амиго", 5000));
//    }
//
//    public static String format(String name, int salary) {
//        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
//        return String.format(phrase, name, salary);
//    }


//  ЗАДАНИЕ: Метод equal(String, String) сравнивает строки по ссылке, используя оператор ==.
//    Нужно сделать так, чтобы метод возвращал true, если содержимое строк одинаковое,
//    и false — если разное, не используя метод equals().

//    public static void main(String[] args) {
//        String first = new String("JavaRush");
//        String second = new String("JavaRush");
//        String third = new String("javarush");
//        System.out.println(equal(first, second));
//        System.out.println(equal(second, third));
//    }
//
//    public static boolean equal(String first, String second) {
//        if (first.intern() == second.intern()) {
//            return true;
//        } return false;
//
//    }


//  ЗАДАНИЕ: Нужно реализовать 2 метода, используя StringBuilder:
//    addTo(String, String[]), replace(String, String, int, int).
//
//    Метод addTo(String, String[]) добавляет к строке, полученной первым параметром,
//    все строки по порядку из массива строк, полученного вторым параметром,
//    возвращает объект типа StringBuilder на основе этой строки.
//
//    Чтобы добавить новое значение к существующему объекту типа StringBuilder,
//    нужно вызвать у него метод append(String), в который передать это новое значение.
//
//    Метод replace(String, String, int, int) заменяет часть строки, полученной первым параметром,
//    начиная с индекса, полученного третьим параметром, и заканчивая индексом,
//    полученным четвертым параметром, на строку, полученную вторым параметром,
//    и возвращает объект типа StringBuilder на основе этой строки.
//
//    Чтобы заменить часть значения объекта типа StringBuilder, нужно у него вызвать метод
//    replace(int, int, String), в который передать начальную и конечную позицию для замены,
//    а также новое значение.

//    public static void main(String[] args) {
//        String string = "Учиться, учиться и еще раз учиться! ";
//
//        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
//        System.out.println(replace(string, ", ", 16, 27));
//    }
//
//    public static StringBuilder addTo(String string, String[] strings) {
//
//        StringBuilder strBuild = new StringBuilder(string);
//
//        for (String s : strings) {
//            strBuild.append(s);
//        }
//
//        return strBuild;
//    }
//
//    public static StringBuilder replace(String string, String str, int start, int end) {
//
//        StringBuilder strBuild = new StringBuilder(string);
//        strBuild.replace(start, end, str);
//
//        return strBuild;
//    }


//  ЗАДАНИЕ: Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.

//    public static void main(String[] args) {
//        String string = "Ходит кот задом наперед";
//        System.out.println(string);
//        System.out.println(reverseString(string));
//    }
//
//    public static String reverseString(String string) {
//        StringBuilder strBuild = new StringBuilder(string);
//        strBuild.reverse();
//
//        return strBuild.toString();
//    }


/////////////////////////////////////////////////ОБЪЕКТЫ//////////////////////////////////////////////////////////


//  ЗАДАНИЕ: Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли.
//    Для этого тебе нужно вызвать конструктор класса Skyscraper в методе main и в теле конструктора
//    вывести в консоль текст "Небоскреб построен.".

//    public class Skyscraper {
//
//        public Skyscraper(){
//            System.out.println("Небоскреб построен.");
//        }
//
//        public static void main(String[] args) {
//            Skyscraper skyscraper = new Skyscraper();
//        }
//    }


//  ЗАДАНИЕ: Давай построим жилой комплекс из трех высоток.
//    Для этого мы будем использовать три разных способа вывода информации:
//    Объявляет о результате постройки.
//    Объявляет о результате и указывает количество этажей.
//    Объявляет о результате и указывает застройщика.
//
//    Пример вывода:
//    Небоскреб построен.
//    Небоскреб построен. Количество этажей - 50
//    Небоскреб построен. Застройщик - JavaRushDevelopment
//
//    Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.

//    public class Skyscraper {
//        public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
//        public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
//        public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
//
//        public Skyscraper() {
//            System.out.println(SKYSCRAPER_WAS_BUILD);
//        }
//
//        public Skyscraper(int count) {
//            System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + count);
//        }
//
//        public Skyscraper(String string) {
//            System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + string);
//        }
//
//        public static void main(String[] args) {
//            Skyscraper skyscraper = new Skyscraper();
//            Skyscraper skyscraperTower = new Skyscraper(50);
//            Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
//        }
//    }


//  ЗАДАНИЕ: Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить,
//    а второй — на этапе планирования, поэтому о нем мало что известно.
//    Тебе нужно будет создать два конструктора: один с параметрами, второй — без.
//    Они оба должны инициализировать поля floorsCount и developer.

//    public class Skyscraper {
//        private int floorsCount;
//        private String developer;
//
//        public Skyscraper () {
//            floorsCount = 5;
//            developer = "JavaRushDevelopment";
//        }
//
//        public Skyscraper (int floorsCount, String developer) {
//            this.floorsCount = floorsCount;
//            this.developer = developer;
//        }
//
//        public static void main(String[] args) {
//            Skyscraper skyscraper = new Skyscraper();
//            Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
//        }
//    }


//  ЗАДАНИЕ: Почувствуй себя автоконструктором и найди решение, как сделать так, чтобы завод снова заработал.
//    Для этого тебе нужно добавить инициализацию полей в конструкторах соответствующими параметрами.
//    Если параметр отсутствует, то нужно инициализировать поле значением по умолчанию.
//    Для поля year это текущий год (4321), для поля color — Оранжевый.

//    public class CarConcern {
//        private final String manufacturer = "Lamborghini";
//        private final String model;
//        private final int year;
//        private final String color;
//
//        public CarConcern(String model, int year, String color) {
//            this.model = model;
//            this.year = year;
//            this.color = color;
//        }
//
//        public CarConcern(String model, int year) {
//            this.model = model;
//            this.year = year;
//            this.color = "Оранжевый";
//        }
//
//        public CarConcern(String model) {
//            this.model = model;
//            this.year = 4321;
//            this.color = "Оранжевый";
//        }
//    }


//  ЗАДАНИЕ: Постройка здания планировалась под ресторан и успешно завершилась,
//    но спустя некоторое время собственники решили переделать его под барбершоп.
//    Нам нужно сделать так, чтобы здание было универсальным, и его назначение
//    можно было менять, не создавая нового.
//    Для этого создай метод initialize, который будет устанавливать значение полю
//    type (определять тип здания), а конструктор убери.

//    public class Building {
//
//        private String type;
//
//        public void initialize(String type) {
//            this.type = type;
//        }
//
//        public static void main(String[] args) {
//            Building building = new Building();
//            building.initialize("Барбершоп");
//        }
//    }


//  ЗАДАНИЕ: Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
//    У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
//    Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор
//    базового класса (родителя), используя super("тип автомобиля"). Для этого в классе Solution
//    в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.
//
//    Вывод должен быть следующий (последовательность может быть любая):
//    Привет. Я ElectricCar
//    Привет. Я GasCar
//    Привет. Я HybridCar

//    public class Car {
//
//        public Car(String type) {
//            System.out.println("Привет. Я " + type);
//        }
//    }
//
//    public class GasCar extends Car {
//
//        public GasCar() {
//            super("GasCar");
//        }
//    }
//
//    public class HybridCar extends Car {
//
//        public HybridCar() {
//            super("HybridCar");
//        }
//    }
//
//    public class ElectricCar extends Car {
//
//        public ElectricCar() {
//            super("ElectricCar");
//        }
//    }
//
//    public class Solution {
//
//        public static void main(String[] args) {
//
//            ElectricCar ElectricCar = new ElectricCar();
//            GasCar GasCar = new GasCar();
//            HybridCar HybridCar = new HybridCar();
//
//        }
//    }


//  ЗАДАНИЕ: Ты сделал предзаказ на новенькую Bugatti ровно полгода назад.
//    Сейчас июнь, и было бы неплохо все-таки ездить на кабриолете.
//    Но ты забыл, в каком кузове заказывал машину.
//    Твоя задача — добавить функциональность для получения текущей конфигурации и
//    изменения её при необходимости. Для этого создай геттеры и сеттеры.
//
//    public class Bugatti {
//        private String color = "BLACK";
//        private int year = 2020;
//        private String body = "Coupe";
//
//        public String getBody() {
//            return body;
//        }
//
//        public void setBody(String body) {
//            this.body = body;
//        }
//    }


//  ЗАДАНИЕ: У нас есть класс Programmer, в котором есть очень важное поле — salary.
//    Наша задача следующая: нужно добавить возможность получить и
//    изменить значение этого поля, используя геттер и сеттер.
//    Но есть нюанс: зарплату можно только повышать.
//    Поэтому тебе нужно добавить проверку в сеттер:
//    если значение аргумента больше текущего значения,
//    то поле salary изменяем, иначе — игнорируем.

//    public class Programmer {
//        private int salary = 1000;
//
//        public int getSalary() {
//            return salary;
//        }
//
//        public void setSalary(int salary) {
//            if (salary > this.salary) this.salary = salary;
//        }
//    }


//  ЗАДАНИЕ: В методе main объявлены переменные типа String.
//    В консоли выводится результат их сравнения: если строки равны, выводится true, иначе — false.
//    Тебе нужно раскомментировать одну строку, чтобы получился следующий вывод:
//    true
//    true

//    public static void main(String[] args) {
//        String s1 = new String("JavaRush");
//        s1 = "JavaRush";
//        String s2 = "JavaRush";
////        s2 = new String("JavaRush");
//        String s3 = "JavaRush";
////        s3 = new String("JavaRush");
//        System.out.println(s1 == s3);
//        System.out.println(s2.equals(s3));
//    }


//  ЗАДАНИЕ: В методе main создаются два айфона с одинаковыми параметрами.
//    В консоли выводится результат их сравнения.
//    Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
//    Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
//    У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

//    public class Iphone {
//        private String model;
//        private String color;
//        private int price;
//
//        public Iphone(String model, String color, int price) {
//            this.model = model;
//            this.color = color;
//            this.price = price;
//        }
//
//        public boolean equals (Object obj){
//
//            if (this == obj) return true;
//
//            if (obj == null) return false;
//
//            Iphone iphone = (Iphone) obj;
//
//            if (this.price != iphone.price) return false;
//
//            boolean m;
//            boolean c;
//
//            if (this.model == null) {
//                m = iphone.model == null;
//            } else if (iphone.model == null) {
//                return false;
//            } else m = this.model.equals(iphone.model);
//
//            if (this.color == null) {
//                c = iphone.color == null;
//            } else if (iphone.color == null) {
//                return false;
//            } else c = this.color.equals(iphone.color);
//
//            return m && c;
//        }

//        public static void main(String[] args) {
//            Iphone iphone1 = new Iphone("X", "Black", 999);
//            Iphone iphone2 = new Iphone("X", "Black", 999);
//
//            System.out.println(iphone1.equals(iphone2));
//        }
//
//    }


//  ЗАДАНИЕ: Напиши свою реализацию hashCode, используя переменные model и year.
//    Если эти поля у двух объектов одинаковые, то должен возвращаться одинаковый hashCode.
//    Если правильно реализовать метод hashCode, вывод должен быть таким:
//    true
//    true
//    true
//    true
//    false
//    false

//    public class Car {
//        private String model;
//        private int year;
//
//        public Car(String model, int year) {
//            this.model = model;
//            this.year = year;
//        }
//
//        public int hashCode() {
//
//             int hash = this.year;
//
//            for (int i = 0; i < model.length(); i++) {
//
//                char n = model.charAt(i);
//                hash =  hash + getNumericValue(n);
//            }
//            return hash;
//        }
//
//        public static void main(String[] args) {
//            Car lamborghini = new Car("Lamborghini", 2020);
//            Car lamborghini1 = new Car("Lamborghini", 2020);
//            Car ferrari = new Car("Ferrari", 2020);
//            Car ferrari1 = new Car("Ferrari", 2020);
//            Car bugatti = new Car("Bugatti", 2020);
//            Car bugatti1 = new Car("Bugatti", 2020);
//            System.out.println(ferrari.hashCode() == ferrari.hashCode());
//            System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
//            System.out.println(ferrari.hashCode() == ferrari1.hashCode());
//            System.out.println(bugatti.hashCode() == bugatti1.hashCode());
//            System.out.println(bugatti.hashCode() == lamborghini.hashCode());
//            System.out.println(lamborghini.hashCode() == ferrari.hashCode());
//        }
//    }


//  ЗАДАНИЕ: Рассмотрим аналог памяти компьютера на примере массива строк.
//    Если удалить некоторые элементы, то в массиве появятся так называемые "дыры" - то есть элементы равные null.
//    Метод executeDefragmentation(String[]), принимающий массив строк,
//    выполняет его "дефрагментацию", то есть перемещает все объекты в начало массива в таком же порядке,
//    передвинув все "дыры" (элементы равные null) в конец массива.
//    В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
//    Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).

//    public class Memory {
//
//        public static void main(String[] args) {
//            String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
//            executeDefragmentation(memory);
//            System.out.println(Arrays.toString(memory));
//        }
//
//        public static void executeDefragmentation(String[] array) {
//
//            String[] temp = array.clone();
//
//            int j = 0;
//
//            for (int i = 0; i < array.length; i++) {
//                if (temp[i] != null) {
//                    array[j] = temp[i];
//                    j++;
//                }
//            }
//            Arrays.fill(array, j, array.length, null);
//        }
//    }


///////////////////////////////////////КЛАССЫ И static///////////////////////////////////////////////////////


//  ЗАДАНИЕ: Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
//    В классе Car создай внутренний класс (inner class) Engine.
//    В классе Engine создай boolean поле isRunning, которое принимает значение true,
//    если двигатель запущен, и false в противном случае.
//    Также в этот класс добавь методы start и stop, которые будут
//    запускать/останавливать двигатель (устанавливать соответствующее значение полю isRunning).
//    Чтобы использовать двигатель, создай поле engine типа Engine в классе Car.

//    public class Car {
//
//        Engine engine = new Engine();
//
//        class Engine {
//
//            private boolean isRunning;
//
//            public void start() {
//                isRunning = true;
//            }
//
//            public void stop() {
//                isRunning = false;
//            }
//        }
//    }


//  ЗАДАНИЕ: Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
//    Для этого создай внутренний статический (вложенный) класс Calculator
//    и перенеси в него методы add, subtract, multiply и divide.
//    Не забудь подкорректировать их вызовы.

//    public class Solution {
//
//        public static final String EQUAL = " = ";
//
//        public static void main(String[] args) {
//            int a = 45;
//            int b = 15;
//            Calculator.add(a, b);
//            Calculator.subtract(a, b);
//            Calculator.multiply(a, b);
//            Calculator.divide(a, b);
//        }
//
//        static class Calculator {
//
//            public static void add(int a, int b) {
//                System.out.println(a + " + " + b + EQUAL + (a + b));
//            }
//
//            public static void subtract(int a, int b) {
//                System.out.println(a + " - " + b + EQUAL + (a - b));
//            }
//
//            public static void multiply(int a, int b) {
//                System.out.println(a + " * " + b + EQUAL + (a * b));
//            }
//
//            public static void divide(int a, int b) {
//                System.out.println(a + " / " + b + EQUAL + (a / b));
//            }
//        }
//    }


//  ЗАДАНИЕ: В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
//    В методе main класса Solution создай по одному объекту каждого из них.

//    public class Solution {
//        public static void main(String[] args) {
//            Outer outer = new Outer();
//            Outer.Inner inner = outer.new Inner();
//            Outer.Nested nested = new Outer.Nested();
//        }
//    }
//
//    public class Outer {
//        class Inner {
//            Inner() {
//                System.out.println("Создание объекта внутреннего класса");
//            }
//        }
//        static class Nested {
//            Nested() {
//                System.out.println("Создание объекта вложенного класса");
//            }
//        }
//    }


/////////////////////////////////////////////КОЛЛЕКЦИИ, Generics//////////////////////////////////////////////


//  ЗАДАНИЕ: В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
//    Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
//    Для создания объектов-оберток используй метод Тип.valueOf(примитив).
//
//    Пример переменной объекта-обертки: Integer integerValueBox = ....;
//
//        byte byteValue;
//        short shortValue;
//        int intValue;
//        long longValue;
//        float floatValue;
//        double doubleValue;
//        char charValue;
//        boolean booleanValue;
//
//        Byte byteValueBox = Byte.valueOf(byteValue);
//        Short shortValueBox = Short.valueOf(shortValue);
//        Integer integerValueBox = Integer.valueOf(intValue);
//        Long longValueBox = Long.valueOf(longValue);
//        Float floatValueBox = Float.valueOf(floatValue);
//        Double doubleValueBox = Double.valueOf(doubleValue);
//        Character characterValueBox = Character.valueOf(charValue);
//        Boolean booleanValueBox = Boolean.valueOf(booleanValue);


//  ЗАДАНИЕ: В классе Solution представлены 8 объектов-оберток примитивных типов с именами вида типValueBox.
//    Для каждого из этих объектов-оберток необходимо создать переменные соответствующего
//    примитивного типа и присвоить им имена вида типValue.
//    Для создания переменной используй метод объекта-обертки типValueBox.примитивValue().
//
//    Пример переменной примитивного типа: int intValue = ....;
//
//        Byte byteValueBox;
//        Short shortValueBox;
//        Integer integerValueBox;
//        Long longValueBox;
//        Float floatValueBox;
//        Double doubleValueBox;
//        Character characterValueBox;
//        Boolean booleanValueBox;

//        byte byteValue = byteValueBox.byteValue();
//        short shortValue = shortValueBox.shortValue();
//        int intValue = integerValueBox.intValue();
//        long longValue = longValueBox.longValue();
//        float floatValue = floatValueBox.floatValue();
//        double doubleValue = doubleValueBox.doubleValue();
//        char charValue = characterValueBox.charValue();
//        boolean booleanValue = booleanValueBox.booleanValue();


//  ЗАДАНИЕ: В классе Solution есть три поля с одинаковыми значениями.
//    В методе main происходит их сравнение с выводом результата в консоли.
//    Добавь использование метода equals() в методе main такое минимальное количество раз, чтобы вывод был:
//    true
//    true
//    true

//    static Integer first = 1000;
//    static Integer second = 1000;
//    static int third = 1000;
//
//    public static void main(String[] args) {
//        System.out.println(first.equals(second));
//        System.out.println(third == second);
//        System.out.println(third == first);
//    }


//  ЗАДАНИЕ: В классе Solution есть поле balance, которое описывает баланс средств на банковском счете.
//    При объявлении проинициализируй его значением Integer.MAX_VALUE.
//    Реализуй метод processPayment(String), который принимает чек и производит списание средств
//    со счета соответственно чеку.
//    Метод main не принимает участие в проверке.

//    public static Integer balance = Integer.MAX_VALUE;
//
//    public static void main(String[] args) {
//        String bill = "1234567890";
//
//        System.out.println("Текущий баланс : " + balance);
//        processPayment(bill);
//        System.out.println("Текущий баланс : " + balance);
//    }
//
//    public static void processPayment(String bill) {
//        balance = balance - Integer.parseInt(bill);
//    }


//  ЗАДАНИЕ: Реализуй метод divide(double a, double b) так, чтобы в консоли выводился
//    результат деления числа a на число b.
//    Должно выводиться следующее значение:
//
//    Double.POSITIVE_INFINITY, если верен любой из следующих пунктов:
//        a положительное и b равно 0;
//        a равно Double.POSITIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
//        a равно Double.NEGATIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
//
//    Double.NEGATIVE_INFINITY, если верен любой из следующих пунктов:
//        a отрицательное и b равно 0;
//        a равно Double.NEGATIVE_INFINITY и b >= 0 и b не равно Double.POSITIVE_INFINITY;
//        a равно Double.POSITIVE_INFINITY и b < 0 и b не равно Double.NEGATIVE_INFINITY;
//
//    Double.NaN, если верен любой из следующих пунктов:
//        a равно 0 и b равно 0;
//        хотя бы один из операндов равен Double.NaN;
//        a равно Double.POSITIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
//        a равно Double.POSITIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
//        a равно Double.NEGATIVE_INFINITY и b равно Double.POSITIVE_INFINITY;
//        a равно Double.NEGATIVE_INFINITY и b равно Double.NEGATIVE_INFINITY;
//
//    Иначе выводить результат деления a на b.

//    public static void main(String[] args) {
//        divide(1, 0);
//        divide(-1, 0);
//        divide(0, 0);
//        divide(100, 20);
//        divide(200, 20);
//    }
//
//    public static void divide(double a, double b) {
//        if ( (a > 0 && b == 0) ||
//                (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) ) {
//            System.out.println(Double.POSITIVE_INFINITY);
//        } else if ( (a < 0 && b == 0) ||
//                (a == Double.NEGATIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) ||
//                (a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) ) {
//            System.out.println(Double.NEGATIVE_INFINITY);
//        } else if ( (a == 0 && b == 0) ||
//                (a == Double.NaN || b == Double.NaN) ||
//                (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY) ||
//                (a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b == Double.POSITIVE_INFINITY) ||
//                (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY) ){
//            System.out.println(Double.NaN);
//        } else System.out.println(a/b);
//    }


//  ЗАДАНИЕ: Реализуй методы countDigits(String), countLetters(String), countSpaces(String),
//    которые должны возвращать количество цифр, букв и пробелов в строке.

//    public static void main(String[] args) {
//        String string = "Думаю, это будет новой фичей." +
//                "Только не говорите никому, что она возникла случайно.";
//
//        System.out.println("Количество цифр в строке : " + countDigits(string));
//        System.out.println("Количество букв в строке : " + countLetters(string));
//        System.out.println("Количество пробелов в строке : " + countSpaces(string));
//    }
//
//    public static int countDigits(String string) {
//        int count = 0;
//
//        for (int i = 0; i < string.length() ; i++) {
//            char symbol = string.charAt(i);
//
//            if (Character.isDigit(symbol)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int countLetters(String string) {
//        int count = 0;
//
//        for (int i = 0; i < string.length() ; i++) {
//            char symbol = string.charAt(i);
//
//            if (Character.isLetter(symbol)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int countSpaces(String string) {
//        int count = 0;
//
//        for (int i = 0; i < string.length() ; i++) {
//            char symbol = string.charAt(i);
//
//            if (Character.isSpaceChar(symbol)) {
//                count++;
//            }
//        }
//        return count;
//    }


//  ЗАДАНИЕ: Есть список сотрудников waitingEmployees, которые ждут зарплату,
//    и список сотрудников alreadyGotSalaryEmployees, которые её уже получили.
//    Необходимо реализовать метод paySalary(String), который в качестве аргумента
//    принимает имя сотрудника, желающего получить зарплату.
//
//    Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
//    Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
//    Добавить имя сотрудника в список alreadyGotSalaryEmployees.
//    В списке waitingEmployees заменить имя сотрудника на null.

//    public static ArrayList<String> waitingEmployees = new ArrayList<>();
//    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
//
//    public static void initEmployees() {
//        waitingEmployees.add("Гвинно");
//        waitingEmployees.add("Гунигерд");
//        waitingEmployees.add("Боргелейф");
//        waitingEmployees.add("Нифрод");
//        waitingEmployees.add("Альбиуф");
//        waitingEmployees.add("Иногрим");
//        waitingEmployees.add("Фриле");
//    }
//
//    public static void main(String[] args) {
//        initEmployees();
//        System.out.println(waitingEmployees);
//        System.out.println(alreadyGotSalaryEmployees);
//        paySalary("Фриле");
//        System.out.println(waitingEmployees);
//        System.out.println(alreadyGotSalaryEmployees);
//    }
//
//    public static void paySalary(String name) {
//        if (name != null && waitingEmployees.contains(name)) {
//            alreadyGotSalaryEmployees.add(name);
//            int n = waitingEmployees.indexOf(name);
//            waitingEmployees.set(n, null);
//        }
//    }


//  ЗАДАНИЕ: Ты видишь рабочую программу, в которой массив int[] numbers заполняется числами в методе init().
//    Затем в методе reverse() происходит перестановка чисел в обратном порядке.
//    Твоя задача — переписать код так, чтобы вместо массива int[] numbers
//    использовался список ArrayList<Integer> numbers.
//    Название методов и переменных не изменяй.
//    Методы main() и print() не принимают участие в проверке.

//    public static ArrayList<Integer> numbers = new ArrayList<Integer>();
//
//    public static void main(String[] args) {
//        init();
//        print();
//
//        reverse();
//        print();
//    }
//
//    public static void init() {
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//    }
//
//    public static void reverse() {
//        int n = numbers.size() - 1;
//        for (int i = 0; i < numbers.size() / 2; i++) {
//            int temp = numbers.get(i);
//            numbers.set(i, numbers.get(n - i));
//            numbers.set((n - i), temp);
//        }
//    }
//
//    private static void print() {
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//    }


//  ЗАДАНИЕ: Перед тобой программа, которая сортирует элементы списка по возрастанию методом "пузырька".
//    Перепиши код, чтобы вместо списка ArrayList<Integer> numbers использовался массив int[] numbers.
//    Методы main() и print() не принимают участие в проверке.

//    public static int[] numbers = new int[]{56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
//
//    public static void main(String[] args) {
//        print();
//        sort();
//        System.out.println("\nОтсортированные числа в натуральном порядке:");
//        print();
//    }
//
//    public static void sort() {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = 0; j < numbers.length - i - 1; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void print() {
//        for (int number : numbers) {
//            System.out.print(number + "\t");
//        }
//    }


//  ЗАДАНИЕ: ArrayList — это список, который хранит динамически расширяемый массив элементов.
//    Сейчас мы будем реализовывать свою версию списка, в котором хранятся строки.

//    В классе CustomStringArrayList есть три поля:
//    String[] elements — это массив текущих элементов (в похожем массиве хранит значения ArrayList).
//    Изначально его размер равен 10 (capacity = 10).
//    int size — в нем хранится количество заполненных элементов, начальное значение — 0.
//    int capacity — вместимость в текущем массиве (elements) данных, которая будет увеличиваться
//    по ходу добавления данных.

//    Для простоты реализации у нас будут только два метода:
//    Публичный метод add(String), добавляющий элементы в массив, с помощью которого мы сможем увидеть,
//    как массив динамически расширяется.
//    Когда массив заполнен (size == capacity), вызывается метод grow() для расширения массива.
//    Приватный метод grow(), который должен присвоить полю elements новый массив вместимостью (capacity)
//    в полтора раза больше, чем у старого массива и скопировать данные из старого массива в новый в том же порядке.
//    Поле capacity должно увеличиться точно так же, как и размер массива.

//    public class CustomStringArrayList {
//
//        private int size;
//        private int capacity;
//        private String[] elements;
//
//        public CustomStringArrayList() {
//            capacity = 10;
//            size = 0;
//            elements = new String[capacity];
//        }
//
//        public void add(String element) {
//            if (size == capacity) {
//                grow();
//            }
//            elements[size] = element;
//            size++;
//        }
//
//        private void grow() {
//            String[] copy = elements.clone();
//            capacity = (int) (capacity * 1.5);
//            elements = new String[capacity];
//
//            for (int i = 0; i < copy.length; i++) {
//                elements[i] = copy[i];
//            }
//        }
//    }
//
//    public class Solution {
//
//        public static void main(String[] args) {
//            CustomStringArrayList arrayList = new CustomStringArrayList();
//            for(int i = 0; i < 25; i++) {
//                arrayList.add("count" + i);
//            }
//        }
//    }


//  ЗАДАНИЕ: В 3020 году ученые научились выращивать новые планеты,
//    одну из которых отправили в космос на орбиту Солнца.
//    Эта планета находится между Землей и Марсом.
//    Реализуй метод createNewPlanet(String), который должен добавлять
//    переданную планету в список planets сразу после Земли.
//    Посмотри, как изменился порядок следования планет.

//    public static ArrayList<String> planets = new ArrayList<>();
//
//    public static void main(String[] args) {
//        addPlanets();
//        print();
//        createNewPlanet("Звезда Смерти");
//        print();
//    }
//
//    public static void createNewPlanet(String planetName) {
//        int index = planets.indexOf("Земля") + 1;
//        planets.add(index, planetName);
//    }
//
//    public static void addPlanets() {
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//    }
//
//    public static void print() {
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
//        }
//        System.out.println();
//    }


//  ЗАДАНИЕ: В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
//
//    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));
//
//    public static void main(String[] args) {
//        programmingLanguages.remove("Pascal");
//        System.out.println(programmingLanguages);
//    }

//    private static ArrayList<String> initList() {
//        String glassTop     = "       🍷       ";
//        String glassSecond  = "      🍷🍷      ";
//        String glassThird   = "     🍷🍷🍷     ";
//        String glassFourth  = "    🍷🍷🍷🍷    ";
//        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
//        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
//        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
//        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
//        ArrayList<String> list = new ArrayList<>();
//        list.add(glassEighth);
//        list.add(glassSeventh);
//        list.add(glassSixth);
//        list.add(glassFifth);
//        list.add(glassFourth);
//        list.add(glassThird);
//        list.add(glassSecond);
//        list.add(glassTop);
//        return list;
//    }
//
//    public static void print(ArrayList<String> glasses) {
//        for(int i = glasses.size() - 1; i >= 0; i--) {
//            System.out.println(glasses.get(i));
//        }
//    }
//
//    public static void removeGlassesReverse(ArrayList<String> glasses) {
//        System.out.println("Начинаем разбирать пирамиду...");
//
//        int size = glasses.size();
//        for (int i = 0; i < size; i++) {
//            glasses.remove((size-i-1));
//        }
//
//        if(glasses.size() == 0) {
//            System.out.println("Пирамида разобрана!");
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> glasses = initList();
//        print(glasses);
//
//        removeGlassesReverse(glasses);
//        print(glasses);
//    }


//  ЗАДАНИЕ: В методе main создается и заполняется список разными объектами и
//    передается методу checkElementsType(ArrayList<Object>).
//
//    Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка, а также:
//    Для типа String вызывать printString();
//    Для типа Integer вызывать printInteger();
//    Для типа Integer[] вызывать printIntegerArray();
//    Для всех остальных типов вызывать printUnknown().

//    public static void main(String[] args) {
//        var elements = new ArrayList<>();
//        elements.add("Привет");
//        elements.add(10);
//        elements.add(new Integer[15]);
//        elements.add(new LinkageError());
//
//        checkElementsType(elements);
//    }
//
//    public static void checkElementsType(ArrayList<Object> elements) {
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i) instanceof String) printString();
//            else if (elements.get(i) instanceof Integer) printInteger();
//            else if (elements.get(i) instanceof Integer[]) printIntegerArray();
//            else printUnknown();
//        }
//    }
//
//    public static void printString() {
//        System.out.println("Строка");
//    }
//
//    public static void printInteger() {
//        System.out.println("Целое число");
//    }
//
//    public static void printIntegerArray() {
//        System.out.println("Массив целых чисел");
//    }
//
//    public static void printUnknown() {
//        System.out.println("Другой тип данных");
//    }


//  ЗАДАНИЕ: В классе Solution есть метод arrayToHashSet(String[]),
//    который должен из переданного массива вернуть HashSet<String> с теми же элементами.

//    public static void main(String[] args) {
//        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("___________________________________");
//
//        HashSet<String> hashSet = arrayToHashSet(array);
//        for(String s : hashSet) {
//            System.out.println(s);
//        }
//    }

//    public static HashSet<String> arrayToHashSet(String[] strings) {
////        HashSet<String> hashSet = new HashSet<String>();
////        Collections.addAll(hashSet, strings);
//
//        HashSet<String> hashSet = new HashSet<String>(Arrays.asList(strings));
//        return hashSet;
//    }


//  ЗАДАНИЕ: В классе Solution есть метод checkWords(String),
//    который должен проверять наличие переданного слова в множестве words.
//
//    Если слово есть, то выводим в консоль:
//    Слово [переданное слово] есть в множестве
//    Если нет:
//    Слова [переданное слово] нет в множестве
//
//    Пример вывода:
//    Слово Java есть в множестве

//    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
//
//    public static void checkWords(String word) {
//       if (words.contains(word)) {
//           System.out.println(String.format("Слово %s есть в множестве", word));
//       } else {
//           System.out.printf("Слова %s нет в множестве\n", word);
//       }
//    }
//
//    public static void main(String[] args) {
//        checkWords("JavaScript");
//        checkWords("Java");
//    }


//  ЗАДАНИЕ: В классе Solution есть метод print(HashSet<String>),
//    который должен выводить в консоли все элементы множества, используя iterator().

//    public static void print(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
//
//    public static void main(String[] args) {
//        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
//        print(words);
//    }


//  ЗАДАНИЕ: В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>),
//    которые выводят все элементы из переданных коллекций — списка и множества — с новой строки.
//    Твоя задача переписать методы на использование цикла for-each.

//    public static void printList(ArrayList<String> words) {
//        for (String word : words ) {
//            System.out.println(word);
//        }
//    }
//
//    public static void printHashSet(HashSet<String> words) {
//        for (String word : words ) {
//            System.out.println(word);
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
//        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
//        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
//        printList(wordsList);
//        System.out.println("__________________________________");
//        printHashSet(wordsHashSet);
//    }


//  ЗАДАНИЕ: В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:

//    removeBugWithFor(ArrayList<String>) - должен удалить строку из списка,
//    если она содержит слово bug, используя цикл for и счетчик.
//
//    removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка,
//    если она содержит слово bug, используя цикл while и метод iterator().
//
//    removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка,
//    если она содержит слово bug, используя цикл for-each и копию списка.
//
//    В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).

//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add("Hello world!");
//        words.add("Amigo");
//        words.add("Elly");
//        words.add("Kerry");
//        words.add("Bug");
//        words.add("bug");
//        words.add("Easy ug");
//        words.add("Risha");
//
//        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
//        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
//        ArrayList<String> copyWordsThird = new ArrayList<>(words);
//
//        removeBugWithFor(copyWordsFirst);
//        removeBugWithWhile(copyWordsSecond);
//        removeBugWithCopy(copyWordsThird);
//
//        copyWordsFirst.forEach(System.out::println);
//        String line = "_________________________";
//        System.out.println(line);
//        copyWordsSecond.forEach(System.out::println);
//        System.out.println(line);
//        copyWordsThird.forEach(System.out::println);
//        System.out.println(line);
//    }
//
//    public static void removeBugWithFor(ArrayList<String> list) {
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equalsIgnoreCase("bug")){
//                list.remove(i);
//                i--;
//            }
//        }
//    }
//
//    public static void removeBugWithWhile(ArrayList<String> list) {
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if (s.equalsIgnoreCase("bug")) {
//                iterator.remove();
//            }
//        }
//    }
//
//    public static void removeBugWithCopy(ArrayList<String> list) {
//        ArrayList<String> copyList = new ArrayList(list);
//
//        for (String s : copyList) {
//            if (s.equalsIgnoreCase("bug")) {
//                list.remove(s);
//            }
//        }
//    }


//  ЗАДАНИЕ: В классе Solution объявлены методы:
//    copy(ArrayList<String>, ArrayList<String>),
//    addAll(ArrayList<String>, String...),
//    replaceAll(ArrayList<String>, String, String).

//    Тебе нужно переписать их реализацию, используя при этом только соответствующие методы класса Collections.
//    Параметр String... означает то же, что и String[], только аргументы String можно передавать через запятую.

//    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
//        if(destination.size() < source.size()) {
//            throw new IndexOutOfBoundsException("Source does not fit in dest");
//        }
////        for (int i = 0; i < source.size(); i++) {
////            destination.set(i, source.get(i));
////        }
//
//        Collections.copy(destination, source);
//    }
//
//    public static void addAll(ArrayList<String> list, String... strings) {
////        for (String string : strings) {
////            list.add(string);
////        }
//
//        Collections.addAll(list, strings);
//    }
//
//    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
////        for (int i = 0; i < list.size(); i++) {
////            String string = list.get(i);
////            if(string.equals(oldValue)) {
////                list.set(i, newValue);
////            }
////        }
//
//        Collections.replaceAll(list, oldValue, newValue);
//    }


//  ЗАДАНИЕ: В классе Solution объявлены методы:
//    reverse(ArrayList<Integer>),
//    sort(ArrayList<Integer>),
//    rotate(ArrayList<Integer>, int),
//    shuffle(ArrayList<Integer>).

//    Тебе нужно разобраться, что делают методы, переписать их реализацию,
//    используя при этом только соответствующие методы класса Collections.

//    public static void reverse(ArrayList<Integer> list) {
////        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++) {
////            Integer integer = list.get(i);
////            list.set(i, list.get(j - i));
////            list.set(j - i, integer);
////        }
//
//        Collections.reverse(list);
//    }
//
//    public static void sort(ArrayList<Integer> list) {
////        int n = list.size();
////        int temp;
////        for (int i = 0; i < n; i++) {
////            for (int j = 1; j < (n - i); j++) {
////                if (list.get(j - 1) > list.get(j)) {
////                    temp = list.get(j - 1);
////                    list.set(j - 1, list.get(j));
////                    list.set(j, temp);
////                }
////            }
////        }
//
//        Collections.sort(list);
//    }
//
//    public static void rotate(ArrayList<Integer> list, int distance) {
////        for (int i = 0; i < distance; i++) {
////            list.add(0, list.get(list.size() - 1));
////            list.remove(list.size() - 1);
////        }
//
//       Collections.rotate(list, distance);
//    }
//
//    public static void shuffle(ArrayList<Integer> list) {
////        Random rand = new Random();
////        for (int i = 0; i < list.size(); i++) {
////            int randomIndexToSwap = rand.nextInt(list.size());
////            int temp = list.get(randomIndexToSwap);
////            list.set(randomIndexToSwap, list.get(i));
////            list.set(i, temp);
////        }
//
//        Collections.shuffle(list);
//    }


//  ЗАДАНИЕ: В классе Solution объявлены методы:
//    min(ArrayList<Integer>),
//    max(ArrayList<Integer>),
//    frequency(ArrayList<Integer>, Integer),
//    binarySearch(ArrayList<Integer>, Integer).
//
//    Тебе нужно разобраться, что делают методы, переписать их реализацию,
//    используя при этом только соответствующие методы класса Collections.
//
//    public static Integer min(ArrayList<Integer> list) {
////        Integer minimum = list.get(0);
////        for (int i = 1; i < list.size(); i++) {
////            if (list.get(i) < minimum) {
////                minimum = list.get(i);
////            }
////        }
////        return minimum;
//
//        return Collections.min(list);
//    }
//
//    public static Integer max(ArrayList<Integer> list) {
////        Integer maximum = list.get(0);
////        for (int i = 1; i < list.size(); i++) {
////            if (list.get(i) > maximum) {
////                maximum = list.get(i);
////            }
////        }
////        return maximum;
//
//        return Collections.max(list);
//    }
//
//    public static int frequency(ArrayList<Integer> list, Integer element) {
////        int frequency = 0;
////        if (element == null) {
////            return frequency;
////        } else {
////            for (Integer integer : list) {
////                if (element.equals(integer)) {
////                    frequency++;
////                }
////            }
////        }
////        return frequency;
//
//        return Collections.frequency(list, element);
//    }
//
//    public static int binarySearch(ArrayList<Integer> list, Integer key) {
////        int low = 0;
////        int high = list.size() - 1;
////        int mid = (low + high) / 2;
////        int index = -1;
////        while (low <= high) {
////            if (list.get(mid) < key) {
////                low = mid + 1;
////            } else if (list.get(mid).equals(key)) {
////                index = mid;
////                break;
////            } else {
////                high = mid - 1;
////            }
////            mid = (low + high) / 2;
////        }
////        return index;
//
//        return Collections.binarySearch(list, key);
//    }


//  ЗАДАНИЕ: В классе Solution объявлено поле grades типа HashMap<String, Double>,
//    где ключ — имя и фамилия студента, а значение - его средняя оценка.
//    Твоя задача — реализовать метод addStudents, который добавит 5 студентов с их средней оценкой в коллекцию grades.
//    Значения можешь выбрать любые.

//    public static HashMap<String, Double> grades = new HashMap<>();
//
//    public static void main(String[] args) {
//        addStudents();
//        System.out.println(grades);
//    }
//
//    public static void addStudents() {
//        grades.put("Анастасия Буланова", 4.8);
//        grades.put("Александр Буланов", 4.6);
//        grades.put("Михаил Буланов", 4.8);
//        grades.put("Егор Буланов", 4.9);
//        grades.put("Артем Кульков", 3.8);
//    }


//  ЗАДАНИЕ: В классе Solution объявлено поле grades типа HashMap<String, Double>,
//    где ключ — имя и фамилия студента, а значение - его средняя оценка.
//    На этот раз твоя задача — реализовать методы:
//    printStudents, который выводит только имена всех студентов (ключ коллекции);
//    getAverageMark, который возвращает средний балл всех студентов.

//    public static HashMap<String, Double> grades = new HashMap<>();
//
//    public static void main(String[] args) {
//        addStudents();
//        System.out.println("Список студентов группы: ");
//        printStudents();
//        System.out.print("Средний балл группы: " + getAverageMark());
//    }
//
//    public static void addStudents() {
//        grades.put("Давыдов Олег", 4.3d);
//        grades.put("Шульга Николай", 4.1d);
//        grades.put("Колос Василий", 4.9d);
//        grades.put("Шевченко Тарас", 3.7d);
//        grades.put("Марчук Любослав", 3.2d);
//    }
//
//    public static void printStudents() {
//        System.out.println(grades.keySet());
//    }
//
//    public static Double getAverageMark() {
//        Double sum = 0d;
//
//        for (Double value : grades.values()) {
//            sum = sum + value;
//        }
//
//        return sum/grades.size();
//    }


//  ЗАДАНИЕ: В классе Solution объявлено поле grades типа HashMap<String, Double>,
//    где ключ — имя и фамилия студента, а значение - его средняя оценка.
//    Попробуем сделать один метод, который будет выводить полную информацию о студентах,
//    используя метод entrySet класса HashMap.
//
//    Вывод должен быть следующий: [полное имя] : [средняя оценка]
//    Для студента Андрей Петров со средним баллом 4.5, вывод будет следующим:
//    Андрей Петров : 4.5

//    public static HashMap<String, Double> grades = new HashMap<>();
//
//    public static void main(String[] args) {
//        addStudents();
//        printStudentsInfo();
//    }
//
//    public static void addStudents() {
//        grades.put("Кесарчук Олег", 4.3d);
//        grades.put("Шульга Николай", 4.1d);
//        grades.put("Колос Василий", 4.9d);
//        grades.put("Шевченко Тарас", 3.7d);
//        grades.put("Марчук Любослав", 3.2d);
//    }
//
//    public static void printStudentsInfo() {
//        for (var pair : grades.entrySet()){
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
//    }


//  ЗАДАНИЕ: В классе Solution есть метод getProgrammingLanguages,
//    который возвращает список языков программирования.
//    Тебе нужно переписать этот метод, чтобы он возвращал HashMap<Integer, String>.
//    Ключом в этой коллекции будет индекс элемента в ArrayList.

//    public static void main(String[] args) {
//        System.out.println(getProgrammingLanguages());
//    }
//
//    public static HashMap<Integer, String> getProgrammingLanguages() {
//        HashMap<Integer, String> hashProgrammingLanguages = new HashMap<>();
//
//        ArrayList<String> programmingLanguages = new ArrayList<>();
//        programmingLanguages.add("Java");
//        programmingLanguages.add("Kotlin");
//        programmingLanguages.add("Go");
//        programmingLanguages.add("Javascript");
//        programmingLanguages.add("Typescript");
//        programmingLanguages.add("Python");
//        programmingLanguages.add("PHP");
//        programmingLanguages.add("C++");
//
//        for (int i = 0; i < programmingLanguages.size(); i++) {
//            hashProgrammingLanguages.put(i, programmingLanguages.get(i));
//        }
//        return hashProgrammingLanguages;
//    }


//  ЗАДАНИЕ: Пришло время познакомиться с двусвязным списком.
//    Решая эту задачу ты поймешь, как работает двусвязный список и сможешь добавлять в него элементы.
//    У тебя есть класс StringLinkedList, в котором есть поля first и last,
//    указывающие на первый и последний элемент соответственно.
//    Тебе нужно реализовать логику метода add, который будет добавлять элементы в список.
//
//    Подсказки:
//    Для правильной реализации важно понимать, что по списку можно проходить как с первого элемента
//    до последнего, так и наоборот, поэтому при добавлении новых элементов не забудь менять ссылки рядом стоящих.
//    Метод add должен создавать новый объект класса Node, в который он поместит переданное значение.
//    Перед тем как добавлять новую ноду, нужно изменить ссылку последней ноды на новосозданную,
//    а новосозданная станет последней.
//    Если в списке один элемент, то на него указывает first.next и last.prev одновременно.
//    Метод printAll создан для debug и в проверке не участвует.
//
//    Важно:
//    Node first не должна иметь значение, она указывает только на первый элемент(first.next);
//    Node last также не содержит значения, а только указывает на последний элемент(last.prev).

//    public class StringLinkedList {
//        private Node first = new Node();
//        private Node last = new Node();
//
//        public void printAll() {
//            Node currentElement = first.next;
//            while ((currentElement != null) && (currentElement != last)) {
//                System.out.println(currentElement.value);
//                currentElement = currentElement.next;
//            }
//        }
//
//        public void add(String value) {
//
//            Node newNode = new Node();
//            newNode.value = value;
//
//            if (first.next == null) {
//                first.next = newNode;
//                newNode.prev = first;
//            }
//
//            if (last.prev == null) {
//                last.prev = newNode;
//            }
//
//            newNode.prev = last.prev;
//            newNode.next = last;
//
//            last.prev.next = newNode;
//            last.prev = newNode;
//        }
//
//        public static class Node {
//            private Node prev;
//            private String value;
//            private Node next;
//        }
//    }


//  ЗАДАНИЕ: Решая эту задачу, ты научишься извлекать элемент из двусвязного списка.
//    Мы реализовали метод add, который добавляет элементы в конец списка.
//    Тебе нужно реализовать метод get(int), который вернет строку под индексом, переданным в метод.
//    Если строки с таким индексом нет, нужно вернуть null.
//    Помни, что first и last не имеют значений, а ссылаются только на первый и последний элемент соответственно.

//    public class StringLinkedList {
//        private Node first = new Node();
//        private Node last = new Node();
//
//        public StringLinkedList() {
//            first.next = last;
//            last.prev = first;
//        }
//
//        public void add(String value) {
//            Node newNode = new Node();
//            newNode.value = value;
//
//            Node prevLast = last.prev;
//            prevLast.next = newNode;
//            newNode.prev = prevLast;
//            newNode.next = last;
//            last.prev = newNode;
//        }
//
//        public String get(int index) {
//            Node temp = first.next;
//            String value = null;
//
//            for (int i = 0; i <= index; i++) {
//
//                if (temp.next == null){
//                    value = null;
//                    break;
//                }
//
//                value = temp.value;
//                temp = temp.next;
//            }
//            return value;
//        }
//
//        public static class Node {
//            private Node prev;
//            private String value;
//            private Node next;
//        }
//    }


//  ЗАДАНИЕ: Нужно создать набор значений (enum) для времен года.
//    Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
//    В методе Solution выведи все перечисления с новой строки.

//    public static void main(String[] args) {
//        enum Season {WINTER, SPRING, SUMMER, AUTUMN}
//        System.out.println(Season.WINTER);
//        System.out.println(Season.SPRING);
//        System.out.println(Season.SUMMER);
//        System.out.println(Season.AUTUMN);
//
//    }


//  ЗАДАНИЕ: В enum JavarushQuest хранится список квестов.
//    Твоя задача — получить массив всех элементов в методе main (используй метод values())
//    и вывести порядковый номер каждого из них (используй метод ordinal()) с новой строки.

//    public enum JavarushQuest {
//        JAVA_SYNTAX,
//        JAVA_CORE,
//        JAVA_MULTITHREADING,
//        JAVA_COLLECTIONS,
//        CS_50,
//        ANDROID,
//        GAMES
//    }
//
//    public static void main(String[] args) {
//
//        JavarushQuest[] quests = JavarushQuest.values();
//
//        for (var quest : quests){
//            System.out.println(quest.ordinal());
//        }
//    }


//  ЗАДАНИЕ: Пришло время раскрыть все карты и понять, как на самом деле работает enum.
//    Тебе нужно из enum Month сделать class, а также добавить и реализовать методы ordinal() и values().

//    public class Month {
//
//        public static final Month JANUARY = new Month(0);
//        public static final Month FEBRUARY = new Month(1);
//        public static final Month MARCH = new Month(2);
//        public static final Month APRIL = new Month(3);
//        public static final Month MAY = new Month(4);
//        public static final Month JUNE = new Month(5);
//        public static final Month JULY = new Month(6);
//        public static final Month AUGUST = new Month(7);
//        public static final Month SEPTEMBER = new Month(8);
//        public static final Month OCTOBER = new Month(9);
//        public static final Month NOVEMBER = new Month(10);
//        public static final Month DECEMBER = new Month(11);
//
//        private static final Month[] array = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
//
//        private final int value;
//
//        private Month(int value) {
//            this.value = value;
//        }
//
//        public int ordinal() {
//            return this.value;
//        }
//
//        public static Month[] values() {
//            return array;
//        }
//    }


//  ЗАДАНИЕ: В классе Solution реализуй метод getNextMonth, который должен возвращать следующий месяц,
//    а если передан последний месяц, возвращать первый. Используй методы values и ordinal.

//    public enum Month {
//        JANUARY,
//        FEBRUARY,
//        MARCH,
//        APRIL,
//        MAY,
//        JUNE,
//        JULY,
//        AUGUST,
//        SEPTEMBER,
//        OCTOBER,
//        NOVEMBER,
//        DECEMBER
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getNextMonth(Month.JANUARY));
//        System.out.println(getNextMonth(Month.JULY));
//    }
//
//    public static Month getNextMonth(Month month) {
//        int ordinal = month.ordinal();
//        Month[] values = Month.values();
//
//        if (ordinal >= (values.length - 1)){
//            return values[0];
//        }
//
//        return values[ordinal+1];
//    }


//  ЗАДАНИЕ: В enum Month добавь 4 метода:
//    getWinterMonths(), getSpringMonths(), getSummerMonths(), getAutumnMonths()
//    которые будут возвращать массив с тремя месяцами.

//    public enum Month {
//        JANUARY,
//        FEBRUARY,
//        MARCH,
//        APRIL,
//        MAY,
//        JUNE,
//        JULY,
//        AUGUST,
//        SEPTEMBER,
//        OCTOBER,
//        NOVEMBER,
//        DECEMBER;
//
//        public static Month[] getWinterMonths(){
//            Month[] valuesMonths = Month.values();
//            Month[] winterMonths = new Month[3];
//            winterMonths[0] = valuesMonths[11];
//            winterMonths[1] = valuesMonths[0];
//            winterMonths[2] = valuesMonths[1];
//
//            return winterMonths;
//        }
//
//        public static Month[] getSpringMonths(){
//            Month[] valuesMonths = Month.values();
//            Month[] springMonths = new Month[3];
//            springMonths[0] = valuesMonths[2];
//            springMonths[1] = valuesMonths[3];
//            springMonths[2] = valuesMonths[4];
//
//            return springMonths;
//        }
//
//        public static Month[] getSummerMonths(){
//            Month[] valuesMonths = Month.values();
//            Month[] summerMonths = new Month[3];
//            summerMonths[0] = valuesMonths[5];
//            summerMonths[1] = valuesMonths[6];
//            summerMonths[2] = valuesMonths[7];
//
//            return summerMonths;
//        }
//
//        public static Month[] getAutumnMonths(){
//            Month[] valuesMonths = Month.values();
//            Month[] autumnMonths = new Month[3];
//            autumnMonths[0] = valuesMonths[8];
//            autumnMonths[1] = valuesMonths[9];
//            autumnMonths[2] = valuesMonths[10];
//
//            return autumnMonths;
//        }
//    }


//  ЗАДАНИЕ: В классе Solution есть метод getMonthByIndex(int),
//    который возвращает название месяца по его номеру, начиная с 1.
//    Твоя задача — переписать метод, используя только оператор switch и
//    ключевые слова case, break и default.

//    public static void main(String[] args) {
//        System.out.println(getMonthByIndex(4));
//        System.out.println(getMonthByIndex(8));
//        System.out.println(getMonthByIndex(12));
//    }
//
//    public static String getMonthByIndex(int monthIndex) {
//        String monthString;
//
////        if (monthIndex == 1) {
////            monthString = "Январь";
////        } else if (monthIndex == 2) {
////            monthString = "Февраль";
////        } else if (monthIndex == 3) {
////            monthString = "Март";
////        } else if (monthIndex == 4) {
////            monthString = "Апрель";
////        } else if (monthIndex == 5) {
////            monthString = "Май";
////        } else if (monthIndex == 6) {
////            monthString = "Июнь";
////        } else if (monthIndex == 7) {
////            monthString = "Июль";
////        } else if (monthIndex == 8) {
////            monthString = "Август";
////        } else if (monthIndex == 9) {
////            monthString = "Сентябрь";
////        } else if (monthIndex == 10) {
////            monthString = "Октябрь";
////        } else if (monthIndex == 11) {
////            monthString = "Ноябрь";
////        } else if (monthIndex == 12) {
////            monthString = "Декабрь";
////        } else {
////            monthString = "Недействительный месяц";
////        }
////        return monthString;
//
//        switch (monthIndex)
//        {
//            case 1:
//                monthString = "Январь";
//                break;
//            case 2:
//                monthString = "Февраль";
//                break;
//            case 3:
//                monthString = "Март";
//                break;
//            case 4:
//                monthString = "Апрель";
//                break;
//            case 5:
//                monthString = "Май";
//                break;
//            case 6:
//                monthString = "Июнь";
//                break;
//            case 7:
//                monthString = "Июль";
//                break;
//            case 8:
//                monthString = "Август";
//                break;
//            case 9:
//                monthString = "Сентябрь";
//                break;
//            case 10:
//                monthString = "Октябрь";
//                break;
//            case 11:
//                monthString = "Ноябрь";
//                break;
//            case 12:
//                monthString = "Декабрь";
//                break;
//            default:
//                monthString = "Недействительный месяц";
//        }
//        return monthString;
//    }


//  ЗАДАНИЕ: В классе Solution есть метод getTranslationForDayOfWeek(String),
//    который возвращает перевод дня недели с русского на английский.
//    Твоя задача — переписать метод, используя только оператор if-else.

//    public static void main(String[] args) {
//        System.out.println(getTranslationForDayOfWeek("Вторник"));
//        System.out.println(getTranslationForDayOfWeek("Пятница"));
//        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
//    }
//
//    public static String getTranslationForDayOfWeek(String ru) {
//        String en;
//        if (ru.toLowerCase().equals("понедельник")) {
//            en = "Monday";
//        } else if (ru.toLowerCase().equals("вторник")) {
//            en = "Tuesday";
//        } else if (ru.toLowerCase().equals("среда")) {
//            en = "Wednesday";
//        } else if (ru.toLowerCase().equals("четверг")) {
//            en = "Thursday";
//        } else if (ru.toLowerCase().equals("пятница")) {
//            en = "Friday";
//        } else if (ru.toLowerCase().equals("суббота")) {
//            en = "Saturday";
//        } else if (ru.toLowerCase().equals("воскресенье")) {
//            en = "Sunday";
//        } else {
//            en = "Недействительный день недели";
//        }
//        return en;
//    }


//  ЗАДАНИЕ: В классе Solution есть метод getShapeNameByCountOfCorners(int),
//    который возвращает название многоугольника в зависимости от количества углов.
//    Твоя задача — переписать метод, используя только оператор switch.

//    public static void main(String[] args) {
//        System.out.println(getShapeNameByCountOfCorners(3));
//        System.out.println(getShapeNameByCountOfCorners(5));
//        System.out.println(getShapeNameByCountOfCorners(1));
//    }
//
//    public static String getShapeNameByCountOfCorners(int countOfCorner) {
//        return switch (countOfCorner) {
//            case 3 -> "Треугольник";
//            case 4 -> "Четырехугольник";
//            case 5 -> "Пятиугольник";
//            case 6 -> "Шестиугольник";
//            case 7 -> "Семиугольник";
//            case 8 -> "Восьмиугольник";
//            default -> "Другая фигура";
//        };
//    }


////////////////////////////////////////////////ИСКЛЮЧЕНИЯ//////////////////////////////////////////////////////////


//  ЗАДАНИЕ: Для начала разберись, что делает программа, а затем:

//    В методе addUser обработай значение, возвращаемое методом setName:
//    если setName вернул -1, выведи сообщение: "Имя не может быть null."
//    если -2, выведи сообщение: "Имя не может быть пустым."
//    если -3, выведи сообщение: "Имя не может содержать цифры."
//    если другое значение, кроме 0, выведи сообщение: "Неизвестная ошибка."
//
//    В методе addUser обработай значение, возвращаемое методом setAge:
//    если setAge вернул -1, выведи сообщение: "Возраст не может быть меньше 0."
//    если -2, выведи сообщение: "Возраст не может быть больше 150."
//    если другое значение, кроме 0, выведи сообщение "Неизвестная ошибка."
//
//    В методе findUserIndex обработай значение, возвращаемое методом indexOf:
//    если indexOf вернул -1, выведи сообщение "Пользователь '<имя пользователя>' не найден."
//    иначе — оставь текущее сообщение
//    Класс User не изменяй.

//    public class User {
//
//        private String name;
//        private int age;
//
//        public String getName() {
//            return name;
//        }
//
//        public int setName(String name) {
//            if (name == null) {
//                return -1;
//            } else if (name.isEmpty()) {
//                return -2;
//            } else if (name.matches(".*\\d.*")) {
//                return -3;
//            } else {
//                this.name = name;
//                return 0;
//            }
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public int setAge(int age) {
//            if (age < 0) {
//                return -1;
//            } else if (age > 150) {
//                return -2;
//            } else {
//                this.age = age;
//                return 0;
//            }
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) {
//                return true;
//            }
//            if (!(o instanceof User)) {
//                return false;
//            }
//            User user = (User) o;
//            return Objects.equals(getName(), user.getName());
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(getName());
//        }
//
//    }
//
//    public static final String INPUT_NAME = "\nВведите имя: ";
//    public static final String INPUT_AGE = "Введите возраст пользователя '%s': ";
//
//    public static final String CANNOT_BE_NULL = "Имя не может быть null.";
//    public static final String CANNOT_BE_EMPTY = "Имя не может быть пустым.";
//    public static final String CANNOT_CONTAIN_DIGIT = "Имя не может содержать цифры.";
//    public static final String CANNOT_BE_NEGATIVE = "Возраст не может быть меньше 0.";
//    public static final String CANNOT_BE_TOO_BIG = "Возраст не может быть больше 150.";
//    public static final String UNKNOWN_ERROR = "Неизвестная ошибка.";
//
//    public static final String FOUND = "\nПользователь '%s' найден под индексом %d.\n";
//    public static final String NOT_FOUND = "\nПользователь '%s' не найден.\n";
//
//    static List<User> users = new ArrayList<>();
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            addUser(new User());
//        }
//
//        User userToSearch = new User();
//        userToSearch.setName("Рафаэль");
//
//        findUserIndex(userToSearch);
//    }
//
//    static void addUser(User user) {
//        System.out.print(INPUT_NAME);
//        String name = scanner.nextLine();
//
//        System.out.printf(INPUT_AGE, name);
//        int age = Integer.parseInt(scanner.nextLine());
//
//        switch (user.setName(name)){
//            case 0:
//                break;
//            case -1:
//                System.out.println("Имя не может быть null.");
//                break;
//            case -2:
//                System.out.println("Имя не может быть пустым.");
//                break;
//            case -3:
//                System.out.println("Имя не может содержать цифры.");
//                break;
//            default:
//                System.out.println("Неизвестная ошибка.");
//        }
//
//        switch (user.setAge(age)){
//            case 0:
//                break;
//            case -1:
//                System.out.println("Возраст не может быть меньше 0.");
//                break;
//            case -2:
//                System.out.println("Возраст не может быть больше 150.");
//                break;
//            default:
//                System.out.println("Неизвестная ошибка.");
//        }
//
//        users.add(user);
//    }
//
//    static void findUserIndex(User user) {
//
//        if (users.indexOf(user) != -1) {
//            System.out.printf(FOUND, user.getName(), users.indexOf(user));
//        } else {
//            System.out.printf(NOT_FOUND, user.getName());
//        }
//    }


//  ЗАДАНИЕ: Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
//    Но есть проблема: если в журнале нет студента с нужным номером,
//    программа завершается с исключением ArrayIndexOutOfBoundsException.
//    Оберни одну строку в try-catch, чтобы программа продолжала работать.
//    В блоке catch выведи в консоли сообщение "Студента с таким номером не существует".

//    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
//    public static final String EXIT = "exit";
//    public static final String ANSWERING = "Отвечает ";
//    public static final String NOT_EXIST = "Студента с таким номером не существует";
//
//    static List<String> studentsJournal = Arrays.asList(
//            "Тимур Мясной"
//            , "Пенелопа Сиволап"
//            , "Орест Злобин"
//            , "Ирида Продувалова"
//            , "Гектор Гадюкин"
//            , "Электра Чемоданова"
//            , "Гвидон Недумов"
//            , "Роксана Борисенко"
//            , "Юлиан Мумбриков"
//            , "Зигфрид Горемыкин");
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print(PROMPT_STRING);
//            String input = scanner.nextLine();
//
//            if (input.toLowerCase().equals(EXIT)) {
//                break;
//            }
//
//            int studentId = Integer.parseInt(input);
//
//            try {
//                System.out.println(ANSWERING + studentsJournal.get(studentId));
//            } catch (Exception e) {
//                System.out.println(NOT_EXIST);
//            }
//        }
//    }


//  ЗАДАНИЕ: Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
//    И даже обрабатывает некорректные числа.
//    Но есть еще одна проблема: если введено не целое число, метод parseInt бросает NumberFormatException.
//    Оберни часть кода в try-catch так, чтобы программа продолжала работу, даже если было введено не целое число.
//    И если введено не целое число, выведи в консоль сообщение:
//    "Нужно ввести целое число" и выполни continue; для корректной работы цикла.

//    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
//    public static final String EXIT = "exit";
//    public static final String ANSWERING = "Отвечает ";
//    public static final String NOT_EXIST = "Студента с таким номером не существует";
//    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";
//
//    static List<String> studentsJournal = Arrays.asList(
//            "Тимур Мясной"
//            , "Пенелопа Сиволап"
//            , "Орест Злобин"
//            , "Ирида Продувалова"
//            , "Гектор Гадюкин"
//            , "Электра Чемоданова"
//            , "Гвидон Недумов"
//            , "Роксана Борисенко"
//            , "Юлиан Мумбриков"
//            , "Зигфрид Горемыкин");
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print(PROMPT_STRING);
//            String input = scanner.nextLine();
//            if (input.toLowerCase().equals(EXIT)) {
//                break;
//            }
//
//            int studentId;
//
//            try {
//                studentId = Integer.parseInt(input);
//            } catch (Exception e) {
//                System.out.println(INTEGER_REQUIRED);
//                continue;
//            }
//
//            try {
//                System.out.println(ANSWERING + studentsJournal.get(studentId));
//            } catch (Exception e) {
//                System.out.println(NOT_EXIST);
//            }
//        }
//    }


//  ЗАДАНИЕ: Программа считывает с консоли номер, находит в журнале соответствующего студента и вызывает его отвечать.
//    Методы parseInt и get могут бросать исключения NumberFormatException и ArrayIndexOutOfBoundsException.
//    Оберни их одним блоком try с двумя блоками catch.
//    Блок catch для NumberFormatException должен выводить сообщение:
//            "Нужно ввести целое число"
//    Блок catch для ArrayIndexOutOfBoundsException должен выводить сообщение:
//            "Студента с таким номером не существует".

//    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
//    public static final String EXIT = "exit";
//    public static final String ANSWERING = "Отвечает ";
//    public static final String NOT_EXIST = "Студента с таким номером не существует";
//    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";
//
//    static List<String> studentsJournal = Arrays.asList(
//            "Тимур Мясной"
//            , "Пенелопа Сиволап"
//            , "Орест Злобин"
//            , "Ирида Продувалова"
//            , "Гектор Гадюкин"
//            , "Электра Чемоданова"
//            , "Гвидон Недумов"
//            , "Роксана Борисенко"
//            , "Юлиан Мумбриков"
//            , "Зигфрид Горемыкин");
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.print(PROMPT_STRING);
//            String input = scanner.nextLine();
//            if (input.toLowerCase().equals(EXIT)) {
//                break;
//            }
//
//            try {
//                int studentId = Integer.parseInt(input);
//                System.out.println(ANSWERING + studentsJournal.get(studentId));
//            } catch (NumberFormatException numberFormatException) {
//                System.out.println(INTEGER_REQUIRED);
//            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//                System.out.println(NOT_EXIST);
//            }
//        }
//    }


//  ЗАДАНИЕ: Разберись, что делает программа.
//    В блоке catch выведи на экран переменную answer и брось дальше пойманное исключение.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        buyElephant(null, scanner);
//    }
//
//    static void buyElephant(String answer, Scanner scanner) {
//        if (answer == null) {
//            System.out.println("Купи слона");
//        } else if (answer.toLowerCase().equals("ок")) {
//            System.out.println("Так-то лучше :) Список твоих отговорок:");
//            throw new SecurityException();
//        } else {
//            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
//        }
//
//        answer = scanner.nextLine();
//
//        try {
//            buyElephant(answer, scanner);
//        } catch (Exception e) {
//            System.out.println(answer);
//            throw e;
//        }
//    }


//  ЗАДАНИЕ: Запусти программу и посмотри, что происходит.
//    В методе eat добавь блок finally, чтобы лев ложился спать, даже если ему не удалось перекусить.
//
//    Ожидаемый вывод в случае, когда food != null:
//    ищет еду
//    нашел мясо
//    все съел
//    лег спать
//
//    Ожидаемый вывод когда food == null:
//    ищет еду
//    ничего не нашел
//    лег спать голодным

//    public class Food {
//
//        String name;
//
//        public Food(String name) {
//            this.name = name;
//        }
//    }
//
//    public class Lion {
//
//        public void eat(Food food) {
//            try {
//                System.out.println();
//                System.out.println("ищет еду");
//                System.out.println("нашел " + food.name);
//                System.out.println("все съел");
//            } catch (NullPointerException e) {
//                System.out.println("ничего не нашел");
//                return;
//            } finally {
//                System.out.println("лег спать" + (food == null ? " голодным" : ""));
//            }
//        }
//    }
//
//
//    public class Solution {
//
//        public static void main(String[] args) {
//            Lion lion = new Lion();
//            lion.eat(new Food("мясо"));
//            lion.eat(null);
//        }
//    }


//  ЗАДАНИЕ: Перехвати исключение в методе main, чтобы программа компилировалась.
//    При возникновении исключения нужно вывести на экран строку errorMessage.

//    public static String errorMessage = "не повезло";
//
//    public static void main(String[] args) {
//        try {
//            generateLuckyNumber();
//        } catch (Exception exception) {
//            System.out.println(errorMessage);
//        }
//    }
//
//    static void generateLuckyNumber() throws Exception {
//        int luckyNumber = (int) (Math.random() * 100);
//        if (luckyNumber == 13) {
//            throw new Exception();
//        }
//        System.out.println("твое счастливое число: " + luckyNumber);
//    }


//  ЗАДАНИЕ: Сделай так, чтобы программа компилировалась, не используя try-catch.

//    public static void main(String[] args) throws Exception {
//        generateLuckyNumber();
//    }
//
//    static void generateLuckyNumber() throws Exception {
//        int luckyNumber = (int) (Math.random() * 100);
//        if (luckyNumber == 13) {
//            throw new Exception("не повезло");
//        }
//        System.out.println("твое счастливое число: " + luckyNumber);
//    }


//  ЗАДАНИЕ: В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
//    Перехваченные исключения оберни в RuntimeException и пробрось дальше.

//    public class FileUtils {
//
//        public static void readFile(String filePath) throws FileNotFoundException {
//            System.out.println("Читаем содержимое файла " + filePath);
//        }
//
//        public static void writeFile(String filePath) throws FileSystemException {
//            System.out.println("Записываем данные в файл " + filePath);
//        }
//    }
//
//    public class Solution {
//
//        public static void main(String[] args) {
//            copyFile("book.txt", "book_final_copy.txt");
//            copyFile("book_final_copy.txt", "book_last_copy.txt");
//        }
//
//        static void copyFile(String sourceFile, String destinationFile) {
//            try {
//                FileUtils.readFile(sourceFile);
//                FileUtils.writeFile(destinationFile);
//            } catch (FileNotFoundException | FileSystemException exception) {
//                throw new RuntimeException(exception);
//            }
//        }
//    }


//  ЗАДАНИЕ: В методе main перехвати RuntimeException.
//    Определи, какое исключение в нем сохранено.
//    Если это FileNotFoundException, выведи в консоли сообщение:
//    "Не удалось прочесть файл."
//    Если FileSystemException — "Не удалось записать в файл.".

//    public class FileManager {
//
//        private void readFile(String filePath) throws FileNotFoundException {
//            System.out.println("Читаем содержимое файла " + filePath);
//        }
//
//        private void writeFile(String filePath) throws FileSystemException {
//            System.out.println("Записываем данные в файл " + filePath);
//        }
//
//        public void copyFile(String sourceFile, String destinationFile) {
//            try {
//                readFile(sourceFile);
//                writeFile(destinationFile);
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (FileSystemException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//    public class Solution {
//
//        public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
//        public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";
//
//        public static FileManager fileManager = new FileManager();
//
//        public static void main(String[] args) {
//            try {
//                fileManager.copyFile("book.txt", "book_final_copy.txt");
//                fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
//            } catch (RuntimeException e) {
//                Throwable cause = e.getCause();
//
//                if (cause instanceof FileNotFoundException) {
//                    System.out.println(FAILED_TO_READ);
//                }
//
//                if (cause instanceof FileSystemException) {
//                    System.out.println(FAILED_TO_WRITE);
//                }
//            }
//        }
//    }


//  ЗАДАНИЕ: Объедини блоки catch с одинаковым кодом.

//    public static void main(String[] args) {
//        try {
//            System.out.println("Программа работает от забора");
//            Thread.sleep(1000);
//            System.out.println("до обеда");
//        } catch (NullPointerException | NumberFormatException e) {
//            System.out.println("Произошло исключение на букву N");
//        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
//            System.out.println("Произошло исключение на букву I");
//        } catch (ClassCastException e) {
//            System.out.println("Произошло исключение на букву C");
//        }
//    }


//  ЗАДАНИЕ: При запуске программа заканчивается исключением.
//    Но из текста исключения в консоли неясно, где оно возникло.
//
//    В этой задаче тебе нужно:
//    обернуть в try-catch код методов addIce, addVodka, addJuice и addOrange;
//    в блоках catch вызвать метод printBugMethodName и передать в него stack trace.

//    Если сделаешь все правильно, при запуске программы на экран выведутся имена методов,
//    в которых возникает исключение.

//    public static void main(String[] args) {
//        Map<String, Integer> screwdriverIngredients = makeScrewdriver();
//        String screwdriver = screwdriverIngredients.keySet().stream()
//                .map(key -> key + "=" + screwdriverIngredients.get(key))
//                .collect(Collectors.joining(", ", "{", "}"));
//        System.out.println(screwdriver);
//    }
//
//    static Map<String, Integer> makeScrewdriver() {
//        Map<String, Integer> ingredients = new TreeMap<>();
//        addIce(ingredients);
//        addVodka(ingredients);
//        addJuice(ingredients);
//        addOrange(ingredients);
//        return ingredients;
//    }
//
//    static void addIce(Map<String, Integer> ingredients) {
//        try {
//            ingredients.put("ice cubes", 7);
//        } catch (Exception e){
//            printBugMethodName(Thread.currentThread().getStackTrace());
//        }
//    }
//
//    static void addVodka(Map<String, Integer> ingredients) {
//        try {
//            ingredients.put("vodka", 50);
//        } catch (Exception e){
//            printBugMethodName(Thread.currentThread().getStackTrace());
//        }
//    }
//
//    static void addJuice(Map<String, Integer> ingredients) {
//        try {
//            ingredients.put(null, 100);
//        } catch (Exception e){
//            printBugMethodName(Thread.currentThread().getStackTrace());
//        }
//    }
//
//    static void addOrange(Map<String, Integer> ingredients) {
//        try {
//            ingredients.put("orange slice", 1);
//        } catch (Exception e){
//            printBugMethodName(Thread.currentThread().getStackTrace());
//        }
//    }
//
//    public static void printBugMethodName(StackTraceElement[] stackTraceElements) {
//        StackTraceElement stackTraceElement = stackTraceElements[1];
//        System.out.println(stackTraceElement.getMethodName());
//    }


//  ЗАДАНИЕ: Метод printStackTrace принимает в качестве параметра массив stackTrace.
//    Нужно вывести информацию о каждом элементе массива в формате:
//    "Метод <имя метода> вызван из строки <номер строки> класса <имя класса> в файле <имя файла>."
//    Информацию о каждом элементе выводи с новой строки.
//
//    Пример:
//    Метод addJuice вызван из строки 24 класса com.javarush.task.pro.task14.task1414.Solution
//    в файле Solution.java.

//    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";
//
//    public static void main(String[] args) {
//        makeScrewdriver();
//    }
//
//    public static void printStackTrace(StackTraceElement[] stackTrace) {
//        for (var method : stackTrace) {
//            String methodName = method.getMethodName();
//            int lineNumber = method.getLineNumber();
//            String className = method.getClassName();
//            String fileName = method.getFileName();
//            System.out.printf(OUTPUT_FORMAT, methodName, lineNumber, className, fileName);
//        }
//    }
//
//    static void makeScrewdriver() {
//        addJuice();
//    }
//
//    static void addJuice() {
//        addVodka();
//    }
//
//    static void addVodka() {
//        printStackTrace(Thread.currentThread().getStackTrace());
//    }


//  ЗАДАНИЕ: В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе списка.
//    Все элементы хранятся в приватном списке storage.
//    Твоя задача реализовать все объявленные методы класса MyStack.
//    Где:
//    Метод push(String) добавляет элемент в начало списка storage.
//    Метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка.
//    Метод peek() возвращает первый элемент списка storage.
//    Метод empty() проверяет, не пустой ли список storage.
//    Метод search(String) ищет элемент в списке storage и возвращает его индекс.
//    Если элемента нет в списке — возвращает -1

//    public class MyStack {
//
//        private final List<String> storage = new LinkedList<>();
//
//        public void push(String s) { // Метод push(String) добавляет элемент в начало списка storage.
//            storage.addFirst(s);
//        }
//
//        public String pop() { // Метод pop() возвращает первый элемент списка storage, а потом удаляет его из этого списка.
//            String firstElement = storage.getFirst();
//            storage.removeFirst();
//            return firstElement;
//        }
//
//        public String peek() { // Метод peek() возвращает первый элемент списка storage.
//            return storage.getFirst();
//        }
//
//        public boolean empty() { // Метод empty() проверяет, не пустой ли список storage.
//            return storage.isEmpty();
//        }
//
//        public int search(String s) { // Метод search(String) ищет элемент в списке storage и возвращает его индекс.
//            return storage.indexOf(s);
//        }
//    }


//  ЗАДАНИЕ: В методе main перехвати исключение и выведи его стектрейс.

//    public static void main(String[] args) {
//        try {
//            dangerousMethod();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    static void dangerousMethod() throws Exception {
//        throw new Exception("Mu-ha-ha!");
//    }


/////////////////////////////////////ПОТОКИ ВВОДА-ВЫВОДА//////////////////////////////////////////////////////////


//  ЗАДАНИЕ: Программа считывает с консоли строку и выводит ее на экран в нижнем регистре.
//    Не меняя функциональности программы, перепиши код с использованием try-with-resources.
//    Вынеси в круглые скобки создание объектов с внешними ресурсами.
//    Не забудь удалить ненужные вызовы метода close().

//    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//
//            String line = reader.readLine();
//            System.out.println(line.toLowerCase());
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }


//  ЗАДАНИЕ: Программа считывает с консоли строку и выводит ее на экран в верхнем регистре.
//    Но оказывается, она не будет работать на старых версиях Java (ниже 7й версии).
//    Не меняя функциональности программы, перепиши блок try-with-resources на обычный try-catch.
//    Не забудь о вызове метода close() для объектов с внешними ресурсами.

//    public static void main(String[] args) {
//
//        Scanner scanner = null;
//
//        try {
//            scanner = new Scanner(System.in);
//            String line = scanner.nextLine();
//            System.out.println(line.toUpperCase());
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        } finally {
//            if (scanner != null){
//                scanner.close();
//            }
//        }
//    }


//  ЗАДАНИЕ: Программа считывает с консоли путь к файлу, читает строки из файла и выводит их на экран.
//    Перепиши код программы с использованием try-with-resources:
//    вынеси в круглые скобки создание объектов с внешними ресурсами.
//    Не забудь удалить ненужный блок finally и вызовы метода close().

//    public static void main(String[] args) throws IOException {

////        Scanner scanner = null;
////        BufferedReader bufferedReader = null;
////        try {
////            scanner = new Scanner(System.in);
////            String fileName = scanner.nextLine();
////            bufferedReader = Files.newBufferedReader(Path.of(fileName));
////            String line;
////            while ((line = bufferedReader.readLine()) != null) {
////                System.out.println(line);
////            }
////        } catch (IOException e) {
////            System.out.println("Something went wrong : " + e);
////        } finally {
////            if (scanner != null) {
////                scanner.close();
////            }
////            if (bufferedReader != null) {
////                bufferedReader.close();
////            }
////        }
//
//        try (Scanner scanner = new Scanner(System.in) ; BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine())) ) {
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }


//  ЗАДАНИЕ: Напиши программу, которая считывает с консоли путь к файлу1 и путь к файлу2.
//    Далее все байты из файла1 записывает в файл2, но при этом меняет их местами по такому принципу:
//    первый со вторым, третий с четвертым, и т.д.
//    Если последний байт в файле1 нечетный, то пишем его в файл2 как есть.
//    Для чтения и записи файлов используй методы newInputStream и newOutputStream класса Files.

//    public static void main(String[] args) throws IOException {
//
//        try (Scanner scanner = new Scanner(System.in);
//            InputStream input = Files.newInputStream(Paths.get(scanner.nextLine()));
//            OutputStream output = Files.newOutputStream(Path.of(scanner.nextLine())))
//        {
//
//            for (int i = 0, j = 1; input.available() > 0; i++, j++) {
//
//                int byte1 = input.read();
//                int byte2 = input.read();
//
//                if (byte2 != -1) {
//                    output.write(byte2);
//                }
//
//                output.write(byte1);
//            }
//        }
//    }


//  ЗАДАНИЕ: Есть программа, которая считывает из консоли путь к файлу1 и
//    путь к файлу2 и копирует содержимое файла1 в файл2.
//    Но она не работает корректно. Найди и исправь ошибки в коде, чтобы программа заработала как нужно.

//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in);
//            var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
//            var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
//        ) {
//            int size = 1024;
//            byte[] buffer = new byte[size];
//            while (inputStream.available() > 0) {
//                int read = inputStream.read(buffer);
//                outputStream.write(buffer, 0, read);
//            }
//        } catch (Exception e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }


//  ЗАДАНИЕ: Напиши программу, которая считывает из консоли имя текстового файла,
//    далее читает символы из этого файла (используй метод readAllLines(Path) класса Files) и
//    выводит на экран все, за исключением точки, запятой и пробела.

//    public static void main(String[] args) {
//
//        try {
//
//            Scanner scan = new Scanner(System.in);
//            List<String> lines = Files.readAllLines(Paths.get(scan.nextLine()));
//
//            for (String line : lines){
//
//                for (int i = 0; i < line.length(); i++) {
//
//                    char symbol = line.charAt(i);
//
//                    if ((symbol != '.') && (symbol != ',') && (symbol != ' ')){
//                                System.out.print(String.valueOf(symbol));
//                    }
//
//                }
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }



//  ЗАДАНИЕ: Напиши программу, которая считывает из консоли имя текстового файла, далее читает строки из
//    этого файла (используй метод readAllLines(Path) класса Files) и выводит их на экран через одну, начиная с первой.

//    public static void main(String[] args) throws IOException {
//
//        Scanner scanner = new Scanner(System.in);
//        List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));
//
//        for (int i = 0; i < lines.size(); i += 2) {
//            System.out.println(lines.get(i));
//        }
//
//        scanner.close();
//    }



//  ЗАДАНИЕ: Программа считывает из консоли строку и выводит ее на экран, чередуя регистр символов:
//  первый символ — в нижнем регистре, второй — в верхнем, третий — в нижнем, и т.д.
//    Не меняя функциональности программы, перепиши код с использованием BufferedReader для чтения из консоли.

//    public static void main(String[] args) {
//
//        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
//
//            String line = buffer.readLine();
//            char[] chars = line.toCharArray();
//
//            for (int i = 0; i < chars.length; i++) {
//                if (i % 2 == 1) {
//                    System.out.print(String.valueOf(chars[i]).toUpperCase());
//                } else {
//                    System.out.print(String.valueOf(chars[i]).toLowerCase());
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }



//  ЗАДАНИЕ: Программа считывает из консоли строку и выводит список букв, из которых состоит введенная строка.
//    Не меняя функциональности программы, перепиши код с использованием Scanner для чтения из консоли.

//    public static void main(String[] args) {
//        try (Scanner scanner = new Scanner(System.in)) {
//
//            String line = scanner.nextLine();
//            char[] chars = line.toCharArray();
//            Set<Character> characters = new HashSet<>();
//
//            for (char aChar : chars) {
//                if (Character.isAlphabetic(aChar)) {
//                    characters.add(Character.toLowerCase(aChar));
//                }
//            }
//            System.out.println(characters);
//        }
//    }



//  ЗАДАНИЕ: У Амиго появилась задача: записать байты в файл.
//    Он написал программу, которая считывает из консоли путь к файлу и записывает в этот файл
//    последовательность байтов, полученную из аргумента метода main(String[]).
//    Но в процессе написания программы он допустил ошибку.
//    Как ты уже знаешь, BufferedWriter "не работает" с байтами:
//    для записи байтов в файл нужно использовать метод write(Path, byte[]) класса Files.
//    Path можно получить используя статический метод Path.of(), в который передать путь к файлу,
//    считанный из консоли. Выглядит это так - Path.of(scanner.nextLine()). Помоги Амиго исправить программу.

//    public static void main(String[] args) throws IOException {
//        byte[] bytes = args[0].getBytes();
//
//        try (InputStream stream = System.in;
//            Scanner scanner = new Scanner(stream)) {
//
//            Files.write(Path.of(scanner.nextLine()), bytes);
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }



//  ЗАДАНИЕ: Есть программа, которая считывает из консоли путь к файлу и записывает в этот файл
//    последовательность символов, полученную из аргумента метода main(String[]).
//    Твоя задача — исправить ошибку, чтобы массив символов можно было записать в файл.
//    Для записи символов в файл нужно использовать объект BufferedWriter,
//    полученный в результате вызова метода newBufferedWriter(Path) класса Files.

//    public static void main(String[] args) {
//
//        char[] chars = args[0].toCharArray();
//
//        try (InputStream stream = System.in;
//             Scanner scanner = new Scanner(stream);
//             BufferedWriter writer = Files.newBufferedWriter((Path.of(scanner.nextLine())))
//             ) {
//            writer.write(chars);
//        } catch (IOException e) {
//            System.out.println("Something went wrong : " + e);
//        }
//    }



//  ЗАДАНИЕ: В этой задаче необходимо развернуть вывод в обратном порядке с помощью PrintStream.
//    Метод printSomething(String) выводит в поле stream переданную строку.
//    Необходимо развернуть вывод в обратном порядке с помощью PrintStream.
//    В методе main(String[] args) считывается строка с клавиатуры и передается в метод printSomething(String), который записывает полученную строку в поток stream.
//    Твоя задача — в методе main(String[]) развернуть переданную строку с помощью поля outputStream
//    (то есть, outputStream должен хранить в себе перевернутую строку) и вывести в консоли.
//
//    Пример:
//    Входные данные:
//    it's a text for testing
//    Вывод:
//    gnitset rof txet a s'ti

//    Метод printSomething(String) не изменяй.

//    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//    public static PrintStream stream = new PrintStream(outputStream);
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        printSomething(scanner.nextLine());
//        String result =  outputStream.toString();
//
//        result = new StringBuilder(result).reverse().toString();
//        outputStream.reset();
//        stream.print(result);
//        System.out.println(outputStream);
//
//    }
//
//    public static void printSomething(String str) {
//        stream.print(str);
//    }



//  ЗАДАНИЕ: Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
//    после чего в консоли выводится диск (корень для Unix-like), на котором находится этот файл (или папка).
//    Для решения задачи используй Path и его методы.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        Path path = Path.of(str);
//        System.out.println(path.getRoot());
//    }


//  ЗАДАНИЕ: Напиши программу, которая будет считывать с клавиатуры два пути и выводить
//    в консоль относительный путь между первым и вторым путями, если он существует.
//    В противном случае выводить ничего не нужно.

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//
//        Path path1 = Path.of(str1);
//        Path path2 = Path.of(str2);
//
//        try {
//            Path path = path2.relativize(path1);
//            System.out.println(path);
//        } catch (Exception e){
//
//        }
//
//        scanner.close();
//    }



//  ЗАДАНИЕ: Напиши код, который будет считывать с клавиатуры путь и выводить его в консоли,
//    при этом если путь не абсолютный, то перед выводом его нужно преобразовать к таковому.

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//
//        Path path = Path.of(str);
//
//        if (!path.isAbsolute()){
//            path = path.toAbsolutePath();
//        }
//
//        System.out.println(path);
//    }



//  ЗАДАНИЕ: Напиши программу, которая будет считывать с клавиатуры строки, и если
//    данная строка — это путь к существующему файлу, выводить в консоли "<введенная строка> - это файл".
//    Если путь к существующей директории, выводить в консоли "<введенная строка> - это директория".
//    Если строка не является путем к файлу или директории, то выходим из программы.
//    Треугольные скобки и кавычки выводить не нужно.
//    Для проверки файлов и директорий используй методы isRegularFile() и isDirectory() класса Files.
//
//    Пример вывода:
//    C:\javarush\text.txt - это файл
//    C:\javarush\ - это директория

//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) {
//
//        String str;
//        Path path;
//
//        try (Scanner keyboard = new Scanner(System.in);) {
//
//            do {
//                    str = keyboard.nextLine();
//                    path = Path.of(str);
//
//                    if (Files.isRegularFile(path)) {
//                        System.out.println(path + THIS_IS_FILE);
//                    }
//                    if (Files.isDirectory(path)) {
//                        System.out.println(path + THIS_IS_DIR);
//                    }
//
//            } while (Files.isDirectory(path) || Files.isRegularFile(path));
//        }
//    }



//  ЗАДАНИЕ: Нужно написать программу, которая будет считывать с клавиатуры два пути к файлу.
//
//    1. Если файла по первому пути не существует, его нужно создать.
//    2. Если же файл по первому пути существует, нужно переместить этот файл по второму пути,
//    но только в том случае, если по второму пути файла нет.
//    3.  Если же он есть, нужно просто удалить файл по первому пути.
//
//    Используй соответствующие методы класса Files: createFile(), move(), delete(), exists()/notExists().

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path filePath = Path.of(scanner.nextLine());
//        Path fileNewPath = Path.of(scanner.nextLine());
//
//        if (Files.notExists(filePath)) {
//            Files.createFile(filePath);
//        }
//
//        if (Files.exists(filePath) && Files.notExists(fileNewPath)) {
//            Files.move(filePath, fileNewPath);
//        }
//
//        if (Files.exists(filePath) && Files.exists(fileNewPath)) {
//            Files.delete(filePath);
//        }
//    }



//  ЗАДАНИЕ: Напиши программу, которая будет считывать с клавиатуры путь к директории, получать список файлов
//    и директорий в заданной директории и выводить в консоли информацию о них в виде:
//        "<путь к файлу> - это файл", если это файл,
//        "<путь к директории> - это директория", если это директория.
//    Треугольные скобки и кавычки выводить не нужно.
//    Используй соответствующие методы класса Files:
//    newDirectoryStream(Path), isRegularFile(Path) и isDirectory(Path).
//
//    Ввод:
//    C:\javarush\
//
//    Вывод:
//    C:\javarush\test.txt - это файл
//    C:\javarush\tasks - это директория
//    ...

//    private static final String THIS_IS_FILE = " - это файл";
//    private static final String THIS_IS_DIR = " - это директория";
//
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path directory = Path.of(scanner.nextLine());
//        DirectoryStream<Path> paths = Files.newDirectoryStream(directory);
//
//        for (Path path : paths) {
//            if (Files.isRegularFile(path)) {
//                System.out.println(path + THIS_IS_FILE);
//            }
//            if (Files.isDirectory(path)) {
//                System.out.println(path + THIS_IS_DIR);
//            }
//        }
//    }



//  ЗАДАНИЕ: Напиши программу, которая будет считывать с клавиатуры пути к двум директориям
//    и копировать файлы из одной директории в другую (только файлы, директории игнорируй).
//    Используй соответствующие методы класса Files:
//    newDirectoryStream(), isRegularFile() или isDirectory(), copy().

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path sourceDirectory = Path.of(scanner.nextLine());
//        Path targetDirectory = Path.of(scanner.nextLine());
//
//        DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory);
//
//        for (Path path : paths) {
//            if (Files.isRegularFile(path)) {
//                Files.copy(path, targetDirectory.resolve(path.getFileName()));
//            }
//        }
//    }



//  ЗАДАНИЕ: Напиши программу, которая будет считывать с клавиатуры пути к двум директориям
//    и перемещать файлы из одной директории в другую (только файлы, директории игнорируй).
//    Используй соответствующие методы класса Files:
//    newDirectoryStream(), isRegularFile() или isDirectory(), move().

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        Path sourceDirectory = Path.of(scanner.nextLine());
//        Path targetDirectory = Path.of(scanner.nextLine());
//        DirectoryStream<Path> paths = Files.newDirectoryStream(sourceDirectory);
//
//        for (Path path : paths) {
//            if (Files.isRegularFile(path)) {
//                Files.move(path, targetDirectory.resolve(path.getFileName()));
//            }
//        }
//    }



//  ЗАДАНИЕ: Напиши код, который будет считывать с клавиатуры ссылку на файл в интернете,
//    скачивать его и сохранять во временный файл.
//    Используй методы createTempFile(null, null) и write(Path, byte[]) класса Files,
//    а также метод openStream() класса URL.

//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//
//        URL url = new URL(line);
//        InputStream input = url.openStream();
//
//        byte[] buffer = input.readAllBytes();
//
//        Path pathTemp = Files.createTempFile(null, null);
//
//        Files.write(pathTemp, buffer);
//    }



//  ЗАДАНИЕ: Твоя задача — обратиться к публичному API в интернете и получить данные.
//    Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
//    получать данные и выводить их на экран.
//
//    Подсказки:
//
//    Используй метод openStream() класса URL.
//    Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр:
//    https://javarush.com/api/1.0/rest/projects

//    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
//        InputStream input = url.openStream();
//
//        byte[] buffer = input.readAllBytes();
//        String str = new String(buffer);
//
//        System.out.println(str);
//    }



//  ЗАДАНИЕ: Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
//    Напиши программу, которая будет обращаться по ссылке к публичному API в интернете,
//    отправляя туда данные, получать ответные данные и выводить их на экран.
//
//    Подсказки:
//
//    Используй метод openConnection() класса URL.
//    Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
//    Если не знаешь, какой API использовать, бери http://httpbin.org/post.

//    public static void main(String[] args) throws IOException {
//        URL url = new URL("http://httpbin.org/post");
//
//        URLConnection connection = url.openConnection();
//        connection.setDoOutput(true);
//
//        OutputStream output = connection.getOutputStream();
//        PrintStream sender = new PrintStream(output);
//
//        sender.println("Привет");
//        sender.println("1234");
//
//
//        InputStream input = connection.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
//
//        while (reader.ready()){
//            System.out.println(reader.readLine());
//        }
//
//    }



/////////////////////////////////////РАБОТА С ДАТОЙ И ВРЕМЕНЕМ////////////////////////////////////////////



//  ЗАДАНИЕ: Проинициализируй переменную birthDate объектом Date с датой своего рождения.
//    Реализуй метод getDayOfWeek(Date date), чтобы он возвращал русское название дня недели аргумента date.

//    static Date birthDate = new Date(93, 6, 8);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//    }
//
//    static String getDayOfWeek(Date date) {
//        return switch (date.getDay()) {
//            case 0 -> "Воскресенье";
//            case 1 -> "Понедельник";
//            case 2 -> "Вторник";
//            case 3 -> "Среда";
//            case 4 -> "Четверг";
//            case 5 -> "Пятница";
//            case 6 -> "Суббота";
//            default -> throw new IllegalStateException("Unexpected value: " + date.getDay());
//        };
//    }



//  ЗАДАНИЕ: Метод fixDate принимает в качестве параметра список дат.
//    Некоторые из них содержат две типичные ошибки:
//    неправильно сохраняются (и, следовательно, выводятся в консоли) год и месяц.
//    То есть, неправильная дата содержит всегда две ошибки (год и месяц),
//    которые тебе нужно исправить в методе fixDate, учитывая эти условия:
//    1. Если дата больше текущей, в ней нужно исправить эти две ошибки (год и месяц)
//    с помощью методов setYear, setMonth.
//    Год задается с 1900, а месяцы нумеруются с нуля.
//    2. Если дата меньше текущей, в ней ничего исправлять не нужно.

//    Пример даты с ошибками:
//    Должно быть 25 декабря 2015 года, но на самом деле это другая дата.
//    Можно посмотреть вывод в консоль для этой даты - new Date(2015, 12, 25, 20, 40).

//    public static void main(String[] args) {
//        List<Date> dateList = new ArrayList<>();
//        dateList.add(new Date(2015, 12, 25, 20, 40));
//        dateList.add(new Date("July 20, 1969"));
//        dateList.add(new Date(1989, 11, 9));
//        dateList.add(new Date("January 1, 2000"));
//
//        System.out.println("before fixes:");
//        dateList.forEach(System.out::println);
//
//        fixDate(dateList);
//
//        System.out.println("after fixes:");
//        dateList.forEach(System.out::println);
//    }
//
//    static void fixDate(List<Date> brokenDates) {
//
//        for (Date date : brokenDates) {
//            Date nowDate = new Date();
//            if (date.after(nowDate)) {
//                int year = date.getYear() - 1900;
//                int month = date.getMonth() - 1;
//                date.setYear(year);
//                date.setMonth(month);
//            }
//        }
//    }



//  ЗАДАНИЕ: Исправь ошибку, чтобы программа вывела "2010-01-06".
//    Инициализацию переменной date не меняй.

//    public static void main(String[] args) {
//        Date date = new Date("6 January 2010");
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(formatter.format(date));
//    }



//  ЗАДАНИЕ: Проинициализируй переменную birthDate объектом GregorianCalendar с датой своего рождения.
//    Реализуй метод getDayOfWeek(Calendar calendar), чтобы он возвращал русское название дня недели аргумента calendar.
//    Помни, что в григорианском календаре неделя начинается с воскресенья.

//    static Calendar birthDate = new GregorianCalendar(1993, Calendar.JUNE, 8);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//    }
//
//    static String getDayOfWeek(Calendar calendar) {
//
//        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("ru"));
//
////        int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
////        return switch (dayWeek) {
////            case Calendar.SUNDAY -> "воскресенье";
////            case Calendar.MONDAY -> "понедельник";
////            case Calendar.TUESDAY -> "вторник";
////            case Calendar.WEDNESDAY -> "среда";
////            case Calendar.THURSDAY -> "четверг";
////            case Calendar.FRIDAY -> "пятница";
////            default -> "суббота";
////        };
//    }




//  ЗАДАНИЕ: В классе Solution константа INVENTION_DAY содержит дату изобретения нового популярного
//    гаджета — карманного телепорта.
//
//    Реализуй метод isTeleportInvented, который в качестве параметра принимает дату и сравнивает ее с INVENTION_DAY.
//    Если переданная дата следует после даты изобретения, нужно вывести надпись:
//    "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!" — и вернуть true.
//    Если переданная дата предшествует дате изобретения, вывести:
//    "Извините, телепорт еще не изобрели, приходите через 10 лет." — и вернуть false.
//
//    В методе main в цикле вызови isTeleportInvented и передай currentDay в качестве параметра.
//    Если метод возвращает false, прибавь к currentDay 10 лет, иначе — выйди из цикла.

//    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
//    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";
//
//    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);
//
//    public static void main(String[] args) {
//        Calendar currentDay = Calendar.getInstance();
//
//        while (!isTeleportInvented(currentDay)) {
//            int newYear = currentDay.get(Calendar.YEAR) + 10;
//            currentDay.set(Calendar.YEAR, newYear);
//        }
//    }
//
//    static boolean isTeleportInvented(Calendar currentDay) {
//
//        if (currentDay.before(INVENTION_DAY)) {
//            System.out.println(NOT_INVENTED);
//            return false;
//        } else {
//            System.out.println(INVENTED);
//            return true;
//        }
//    }



//  ЗАДАНИЕ: Цикл while должен был завершиться за 31 итерацию, но почему-то зациклился. Найди и исправь ошибку.

//    public static void main(String[] args) {
//
//        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
//        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);
//
//        System.out.print("Старт");
//
//        while (start.before(end)) {
////            start.roll(Calendar.DATE, 1);
//            start.add(Calendar.DATE, 1);
//            System.out.print(".");
//        }
//
//        System.out.print("Финиш");
//    }



//  ЗАДАНИЕ: В классе Solution реализуй 4 метода:
//    метод nowExample должен вернуть текущую дату;
//    остальные методы должны вернуть дату 12 сентября 2020 года, но разными способами.
//
//    public static void main(String[] args) {
//        System.out.println(nowExample());
//        System.out.println(ofExample());
//        System.out.println(ofYearDayExample());
//        System.out.println(ofEpochDayExample());
//    }
//
//    static LocalDate nowExample() {
//
//        return LocalDate.now();
//    }
//
//    static LocalDate ofExample() {
//
//        return LocalDate.of(2020, Month.SEPTEMBER, 12);
//    }
//
//    static LocalDate ofYearDayExample() {
//
//        return LocalDate.ofYearDay(2020, 256);
//    }
//
//    static LocalDate ofEpochDayExample() {
//
//        return LocalDate.ofEpochDay(18517);
//    }



//  ЗАДАНИЕ: Реализуй метод getDayOfWeek(LocalDate date), чтобы он возвращал русское название дня недели аргумента date.
//    Воспользуйся методами getDayOfWeek и getDisplayName.
//
//    Пример параметров метода getDisplayName, чтобы получить русское название дня недели:
//    getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"))

//    static LocalDate birthDate = LocalDate.of(2020, 3, 12);
//
//    public static void main(String[] args) {
//        System.out.println(getDayOfWeek(birthDate));
//    }
//
//    static String getDayOfWeek(LocalDate date) {
//        String dayWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//        return dayWeek;
//    }



//  ЗАДАНИЕ: Инициализируй шесть статических переменных:
//
//    в timeMax запиши максимально возможное время;
//    в timeMin запиши минимально возможное время;
//    в time1 запиши время 14 часов ровно;
//    в time2 запиши время 7 часов 8 секунд;
//    в time3 запиши время 0 часов 45 минут 61 наносекунда;
//    в time4 запиши время 14 часов 45 секунд 1001 наносекунда.

//    В методе main() создай объект LocalTime,
//    используя часы из time1 (time1.getHour()),
//    минуты из time2, секунды из time3,
//    наносекунды из time4.
//    Выведи его в консоль.

//    static LocalTime timeMax = LocalTime.MAX;;
//    static LocalTime timeMin = LocalTime.MIN;;
//    static LocalTime time1 = LocalTime.of(14, 0);
//    static LocalTime time2 = LocalTime.of(7, 0, 8);
//    static LocalTime time3 = LocalTime.of(0, 45, 0, 61);
//    static LocalTime time4 = LocalTime.of(14, 0, 45, 1001);;
//
//    public static void main(String[] args) {
//        LocalTime time = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
//        System.out.println(time);
//    }



//  ЗАДАНИЕ: Цикл while в методе main должен отработать ровно четыре раза, чтобы на экран вывелись 4 строки.
//    Изменения можно вносить только в метод amazingMethod.

//    public static void main(String[] args) throws InterruptedException {
//        LocalTime localTime = LocalTime.MIDNIGHT;
//        LocalTime next = amazingMethod(localTime);
//        while (next.isAfter(localTime)) {
//            System.out.println(next);
//            next = amazingMethod(next);
//            Thread.sleep(500);
//        }
//    }
//
//    static LocalTime amazingMethod(LocalTime base) {
//            return base.plusMinutes(288);
//    }



//  ЗАДАНИЕ: Реализуй метод isWeekend. Он должен определять, относится ли параметр dateTime к выходным.
//    Считаем выходными промежуток между 22:00 пятницы (включительно) и 23:00 воскресенья (не включительно).

//    private static final int FRIDAY = 5;
//    private static final int SATURDAY = 6;
//    private static final int SUNDAY = 7;
//    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
//    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;
//
//    public static void main(String[] args) {
//        List<LocalDateTime> dateTimeList = new ArrayList<>();
//        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
//        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));
//
//        for (LocalDateTime dateTime : dateTimeList) {
//            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
//        }
//
//    }
//
//    public static boolean isWeekend(LocalDateTime dateTime) {
//        int numDayOfWeek = dateTime.getDayOfWeek().getValue();
//        int hour = dateTime.getHour();
//
//        if ((numDayOfWeek == 5 && hour >= 22) || (numDayOfWeek == 6) || (numDayOfWeek == 7 && hour < 23)) {
//            return true;
//        } else {
//            return false;
//        }
//    }



//  ЗАДАНИЕ: В классе Solution реализуй три метода:
//
//    в методе getMaxFromMilliseconds верни максимальный Instant,
//    который можно получить с помощью метода ofEpochMilli(long milliseconds);
//    в методе getMaxFromSeconds верни максимальный Instant,
//    который можно получить с помощью метода ofEpochSecond(long seconds);
//    в методе getMaxFromSecondsAndNanos верни максимальный Instant,
//    который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

//    public static void main(String[] args) {
//        System.out.println(getMaxFromMilliseconds());
//        System.out.println(getMaxFromSeconds());
//        System.out.println(getMaxFromSecondsAndNanos());
//    }
//
//    static Instant getMaxFromMilliseconds() {
//        return Instant.ofEpochMilli(Long.MAX_VALUE);
//    }
//
//    static Instant getMaxFromSeconds() {
//        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
//    }
//
//    static Instant getMaxFromSecondsAndNanos() {
//        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
//    }





//        public static void main(String[] args) {
//            Instant instant = Instant.ofEpochSecond(10);
//            System.out.println(instant);
//            System.out.println(plusMinutes(instant, 2));
//            System.out.println(plusHours(instant, 2));
//            System.out.println(plusDays(instant, 2));
//            System.out.println(minusMinutes(instant, 2));
//            System.out.println(minusHours(instant, 2));
//            System.out.println(minusDays(instant, 2));
//        }

//        static public Instant plusMinutes(Instant instant, long minutes) {
//            return instant.plusSeconds(minutes * 60);
//        }
//
//        static public Instant plusHours(Instant instant, long hours) {
//            return instant.plusSeconds(hours * 60 * 60);
//        }
//
//        static public Instant plusDays(Instant instant, long days) {
//            return instant.plusSeconds(days * 60 * 60 * 24);
//        }
//
//        static public Instant minusMinutes(Instant instant, long minutes) {
//            return instant.minusSeconds(minutes * 60);
//        }
//
//        static public Instant minusHours(Instant instant, long hours) {
//            return instant.minusSeconds(hours * 60 * 60);
//        }
//
//        static public Instant minusDays(Instant instant, long days) {
//            return instant.minusSeconds(days * 60 * 60 * 24);
//        }



////////////////////////////////////////////////ЛЯМБДА ФУНКЦИИ////////////////////////////////////////////////////////



//  ЗАДАНИЕ: Перед тобой программа, которая сортирует список чисел по возрастанию.
//    Метод sortNumbers(ArrayList<Integer>) принимает список, элементы которого необходимо отсортировать.
//    Для сортировки используется метод Collections.sort(ArrayList<Integer>, Comparator<Integer>),
//    параметрами которого являются список чисел и компаратор.
//
//    Твоя задача — переписать реализацию метода sortNumbers(ArrayList<Integer>),
//    чтобы вместо использования внутреннего анонимного класса Comparator<Integer> использовалось лямбда-выражение.

//        public static void main(String[] args) {
//            var numbers = new ArrayList<Integer>();
//
//            Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);
//
//            sortNumbers(numbers);
//
//            for (Integer number : numbers) {
//                System.out.println(number);
//            }
//        }
//
//        public static void sortNumbers(ArrayList<Integer> numbers) {
//
////            Comparator<Integer> comparator = new Comparator<Integer>() { // Полный вид
////                @Override
////                public int compare(Integer i1, Integer i2) {
////                    return i1 - i2;
////                }
////            };

//            Collections.sort(numbers, (i1, i2) -> i1 - i2); // Сокращенный вид
//        }






//    public static void main(String[] args) {
//        var numbers = new ArrayList<Integer>();
//        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
//
//        print(numbers);
//    }
//
//    public static void print(ArrayList<Integer> numbers) {
////        for (int i = 0; i < numbers.size(); i++) {
////            System.out.println(numbers.get(i));
////        }
//
////        numbers.forEach(num -> System.out.println(num));
//
//        numbers.forEach(System.out::println);
//    }





//    public static void main(String[] args) {
//        var strings = new ArrayList<String>();
//        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");
//
//        print(strings);
//    }
//
//    public static void print(ArrayList<String> strings) {
////        strings.forEach(string -> System.out.println(string));
//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
//    }




//    public static void main(String[] args) {
//        var strings = new ArrayList<String>();
//        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");
//
//        print(strings);
//    }
//
//    public static void print(ArrayList<String> strings) {
//        strings.forEach(System.out::println);
//    }




//    public static void main(String[] args) {
//        var numbers = new ArrayList<Integer>();
//        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);
//
//        print(numbers);
//    }
//
//    public static void print(ArrayList<Integer> numbers) {
//        numbers.forEach(num -> System.out.println(num));
//    }





//    public static void main(String[] args) {
//        var strings = new ArrayList<String>();
//        Collections.addAll(strings, "Ты", "ж", "программист");
//
//        var integers = new ArrayList<Integer>();
//        Collections.addAll(integers, 1000, 2000, 3000);
//
//
//        String[] stringArray = toStringArray(strings);
//        for (String string : stringArray) {
//            System.out.println(string);
//        }
//
//        Integer[] integerArray = toIntegerArray(integers);
//        for (Integer integer : integerArray) {
//            System.out.println(integer);
//        }
//    }
//
//    public static String[] toStringArray(ArrayList<String> strings) {
//        return strings.toArray(String[]::new);
//    }
//
//    public static Integer[] toIntegerArray(ArrayList<Integer> integers) {
//        return integers.toArray(Integer[]::new);
//    }















}
















