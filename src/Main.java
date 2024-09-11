import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import  java.util.Arrays;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) throws Exception {

//        1. Функция для нахождения максимума
////        Напишите функцию, которая принимает два числа и возвращает максимальное из них. Если числа равны, выбрасывайте исключение с сообщением об ошибке.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(getMax(a, b));


//        2. Калькулятор деления
//        Создайте функцию для деления двух чисел. Если делитель равен нулю, выбрасывайте ArithmeticException с сообщением о недопустимости деления на ноль.
//
//        Scanner in = new Scanner(System.in);
//        double a = in.nextInt();
//        double b = in.nextInt();
//        System.out.println(division(a, b));


//        3. Конвертер строк в числа
//        Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(stringConvert(str));



//        4. Проверка возраста
//        Создайте функцию, которая принимает возраст и выбрасывает IllegalArgumentException, если возраст меньше нуля или больше 150.

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println("Возраст - " + age(a));
//
//        5. Нахождение корня
//        Реализуйте функцию, которая находит корень из числа. Если число отрицательное, выбрасывайте IllegalArgumentException.
//        Scanner in = new Scanner(System.in);
//        double a = in.nextDouble();
//        System.out.println(findSqrt(a));
//
//        6. Факториал
//        Напишите функцию, которая вычисляет факториал числа. Если число отрицательное, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println(factorial(a));
//
//        7. Проверка массива на нули
//        Создайте функцию, которая проверяет массив на наличие нулей. Если в массиве есть нули, выбрасывайте исключение.
//        //int[] arr = {2, 56, -3, 90};
//        int[] arr1 = {4, 81, 0, 7};
//        //System.out.println(checkArray(arr));
//        System.out.println(checkArray(arr1));

//
//        8. Калькулятор возведения в степень
//        Реализуйте функцию, которая возводит число в степень. Если степень отрицательная, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt(); // Число
//        int b = in.nextInt(); // Степень
//        System.out.println(getPow(a, b));


//
//        9. Обрезка строки
//        Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        int a = in.nextInt();
//        System.out.println(cutString(str, a));
//
//
//
//        10. Поиск элемента в массиве
//        Напишите функцию, которая ищет элемент в массиве. Если элемент не найден, выбрасывайте исключение с сообщением об ошибке.
//        Scanner in = new Scanner(System.in);
//        int[] arr = {2, 7, 3, 8};
//        int a = in.nextInt();
//        System.out.println(checkElem(arr, a));
//
//        11. Конвертация в двоичную систему
//        Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println(convToBinary(a));

//
//        12. Проверка делимости
//        Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(checkDel(a, b));

//
//        13. Чтение элемента списка
//        Напишите функцию, которая возвращает элемент списка по индексу. Если индекс выходит за пределы списка, выбрасывайте IndexOutOfBoundsException.
//        Scanner in = new Scanner(System.in);
//        int[] arr = {2, 7, 3, 8};
//        int a = in.nextInt();
//        System.out.println(getEl(arr, a));


//
//        14. Парольная проверка
//        Создайте функцию для проверки сложности пароля. Если пароль содержит менее 8 символов, выбрасывайте исключение WeakPasswordException.
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(checkPass(str));


//
//        15. Проверка даты
//        Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        System.out.println(checkDate(str));

//
//        16. Конкатенация строк
//        Реализуйте функцию, которая объединяет две строки. Если одна из строк равна null, выбрасывайте NullPointerException.
//        Scanner in = new Scanner(System.in);
//        String str1 = "gfhf";
//        String str2 = null;
//        System.out.println(strUnion(str1, str2));

//
//        17. Остаток от деления
//        Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println(checkDelOst(a, b));

//
//        18. Квадратный корень
//        Реализуйте функцию, которая находит квадратный корень числа. Если число отрицательное, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        double a = in.nextDouble();
//        System.out.println(getSqrt(a));

//
//        19. Конвертер температуры
//        Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.
//        Scanner in = new Scanner(System.in);
//        double temp = in.nextDouble();
//        System.out.println(convertTemp(temp));


//
//        20. Проверка строки на пустоту
//        Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.
//        String str1 = "ghjk";
//        //String str2 = null;
//        String str3 = "";
//        System.out.println(strNullOrEmpty(str1));
//        //System.out.println(strNullOrEmpty(str2));
//        System.out.println(strNullOrEmpty(str3));

    }

    // Функции для задач


    //    1. Функция для нахождения максимума
    static int getMax(int num1, int num2) throws Exception {
        if (num1 == num2) {
            throw new Exception("Максимального значения не существует. Числа равны.");
        }

        return Math.max(num1, num2);
    }

    //     2.Функция для деления двух чисел.
    static double division(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new ArithmeticException("Делитель не может равняться нулю.");
        }
        return num1 / num2;
    }

    //    3. Функция, которая принимает строку и пытается конвертировать её в целое число.
    static int stringConvert(String str1) {
        try {
            return Integer.parseInt(str1);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    //    4. Создайте функцию, которая принимает возраст.
    static String age(int age1) {
        if (0 > age1 | age1 > 150) {
            throw new IllegalArgumentException();
        }
        return Integer.toString(age1);
    }

    //5. Реализуйте функцию, которая находит корень из числа.
    static double findSqrt(double n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(n);
    }

    //    6.Напишите функцию, которая вычисляет факториал числа.
    static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    //7. Создайте функцию, которая проверяет массив на наличие нулей.
    static String checkArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) throw new IllegalArgumentException("В массиве содержится нуль.");
        }
//        return Arrays.toString(arr);
        return Arrays.toString(arr);
    }

    //    8. Реализуйте функцию, которая возводит число в степень.
    static double getPow(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException();
        }
        return Math.pow(a, b);
    }

    //    9. Напишите функцию, которая принимает строку и число символов.
    static String cutString(String str, int n) {
        if (n > str.length()) throw new IllegalArgumentException("Число символов больше длины строки.");
        return str.substring(0, n);
    }

    //    10. Напишите функцию, которая ищет элемент в массиве.
    static boolean checkElem(int[] arr, int elem) {
        for (int id : arr) {
            if (elem == id) {
                return true;
            }
        }
        throw new NullPointerException("Элемент не найден.");

    }

    //    11. Создайте функцию, которая конвертирует целое число в двоичную строку.
    static String convToBinary(int n) {
        if (n < 0) throw new IllegalArgumentException("Заданное число не может быть отрицательным.");
        return Integer.toBinaryString(n);

    }

    //    12. Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе.
    static int checkDel(int a, int b) {
        if (b == 0) throw new ArithmeticException("Деление на 0 невозможно.");
        return a / b;

    }

    //    13. Напишите функцию, которая возвращает элемент списка по индексу.
    static int getEl(int[] arr, int a) {
        if (a > arr.length - 1) throw new IndexOutOfBoundsException();

        return arr[a];
    }


    //    14. Создайте функцию для проверки сложности пароля.
    public static class WeakPasswordException extends RuntimeException {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public static Boolean checkPass(String str) {
        if (str.length() < 8) throw new WeakPasswordException("Пароль содержит менее 8 символов");
        return true;
    }
    //    15. Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy".
    public static boolean checkDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException ex) {
            throw ex;
        }
    }
    //    16. Реализуйте функцию, которая объединяет две строки.
    public static String strUnion(String str1, String str2){
        if (str1 == null | str2 == null) throw new NullPointerException("Строка равна null.");
        return  str1+str2;
    }
    //    17. Создайте функцию, которая возвращает остаток от деления двух чисел.
    static int checkDelOst(int a, int b) {
        if (b == 0) throw new ArithmeticException("Деление на 0 невозможно.");
        return a % b;

    }
    //    18. Реализуйте функцию, которая находит квадратный корень числа.
    static double getSqrt(double n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        return Math.sqrt(n);
    }
    //    19. Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт.
    public static double convertTemp(double temp){
        if(temp< -273.15) throw new InputMismatchException("Значение меньше абсолютного нуля.");
        return temp*1.8+32;
    }
    //    20. Создайте функцию, которая проверяет, является ли строка пустой или null.
    public static boolean strNullOrEmpty(String str1) {
        if (str1 == "" | str1 == null) throw new NullPointerException("Строка пустая или равна null.");
        return true;
    }

}
