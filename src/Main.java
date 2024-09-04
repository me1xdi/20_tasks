import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Задача 1: Четное или нечетное число
        Условие:
        Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.*/
        Scanner scan =   new Scanner(System.in);
        int a = scan.nextInt();
        if (a%2==0)
            System.out.printf("Число %d является четным.", a);
        else
            System.out.printf("Число %d является нечетным.", a);

        /*Задача 2: Минимальное из трех чисел
        Условие:
        Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        System.out.println("Минимальное число: " + Math.min(Math.min(a, b), c));

        /*Задача 3: Таблица умножения
        Условие:
        Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).*/
//        for(int i=1; i<=10; i++){
//            System.out.println(5*i);
//        }

        /*Задача 4: Сумма чисел от 1 до N
        Условие:
        Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sum = 0;
//        for (int j = 1; j<=n; j++){
//            sum += j;
//        }
//        System.out.println(sum);

        /*Задача 5: Число Фибоначчи
        Условие:
        Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.*/
//        Scanner scan = new Scanner(System.in);
//        int n =scan.nextInt();
//        int x0 = 0; // 1ое число последовательности
//        int x1 = 1; // 2ое число последовательности
//        int x; // последующее число последовательности
//        System.out.print(x0 + " " + x1 + " ");
//        for (int j = 3; j <=n; j++){
//            x= x0+x1;
//            System.out.print(x + " ");
//            x0 = x1;
//            x1 = x;
//        }

        /*Задача 6: Проверка простого числа
        Условие:
        Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for (int j = 2; j<n; j++){
//            if (n%j==0) {
//                System.out.printf("Число %d не является простым.", n);
//                break;
//            }
//
//            else {
//                System.out.printf("Число %d является простым.", n);
//                break;
//            }
//
//        }

        /*Задача 7: Обратный порядок чисел
        Условие:
        Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for (int j = n; j>0; j--) System.out.println(j);

        /*Задача 8: Сумма четных чисел
        Условие:
        Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int sum = 0;
//        for (int j = a; j<=b; j++) {
//            if (j%2==0) sum +=j;
//
//        }
//        System.out.print(sum);

        /*Задача 9: Реверс строки
        Условие:
        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.*/
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        char[] arr = str.toCharArray();
//        for (int j = arr.length-1; j>=0; j--) System.out.print(arr[j] );


        /*Задача 10: Количество цифр в числе
        Условие:
        Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int result = 0;
//        if (n==0) System.out.print("1");
//        else {
//            while (n > 0) {
//
//                result += 1;
//                n = n / 10;
//            }
//            System.out.print(result);
//        }


        /*Задача 11: Факториал числа
        Условие:
        Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int result = 1;
//        for (int i = n; i>1; i--) {
//            result *=i;
//        }
//        System.out.print(result);

        /*Задача 12: Сумма цифр числа
        Условие:
        Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.*/
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int sum = 0;
//
//        while (n>0) {
//            sum += n%10;
//            n = n / 10;
//        }
//        System.out.print(sum);

        /*Задача 13: Палиндром
        Условие:
        Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).*/
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        char[] arr = str.toCharArray();
//        String result  = "";
//        for (int j = arr.length-1; j>=0; j--) {
//            result += arr[j];
//        }
//        if (result.equalsIgnoreCase(str)) System.out.print("Данная строка является палиндромом.");
//        else System.out.print("Данная строка не является палиндромом.");

        /*Задача 14: Найти максимальное число в массиве
        Условие:
        Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int[] arr = new int[a];
//        for (int i = 0; i<arr.length; i++) {
//            arr[i] = scan.nextInt();
//        }
//        int max = arr[0];
//        for (int i = 0; i<arr.length; i++) {
//            if (arr[i]>=max) max = arr[i];
//        }
//        System.out.println(max);

        /*Задача 15: Сумма всех элементов массива
        Условие:
        Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int[] arr = new int[a];
//        int sum = 0;
//        for (int i = 0; i<arr.length; i++) {
//            arr[i] = scan.nextInt();
//            sum += arr[i];
//        }
//        System.out.println(sum);

        /*Задача 16: Количество положительных и отрицательных чисел
        Условие:
        Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int[] arr = new int[a];
//        int positive = 0;
//        int negative = 0;
//        for (int i = 0; i<arr.length; i++) {
//            arr[i] = scan.nextInt();
//            if (arr[i]> 0) positive += 1;
//            else if (arr[i]< 0) negative += 1;
//        }
//        System.out.printf("Количество положительных чисел: %d. Количество отрицательных чисел: %d. \n", positive, negative);


        /*Задача 17: Простые числа в диапазоне
        Условие:
        Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        for (int i = a; i <= b; i++) {
//            for (int j = 2; j <= i; j++) {
//                if (j < i  & i % j == 0) {
//                    break;
//                }
//                if (i % j == 0) {
//                    System.out.printf("Число %d является простым. \n", i);
//                }
//            }
//        }

        /*Задача 18: Подсчет гласных и согласных в строке
        Условие:
        Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.*/
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine().toLowerCase();
//        String glas = "аиуыёоеэюя";
//        int gl = 0;
//        int sogl = 0;
//
//        for (char x : str.toCharArray()){
//            if (x == ' ') continue;
//            if (glas.indexOf(x) == -1) sogl++;
//            else gl++;
//        }
//        System.out.printf("Количество гласных: %d. Количество согласных: %d.", gl, sogl);

        /*Задача 19: Перестановка слов в строке
        Условие:
        Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.*/
//        Scanner scan = new Scanner(System.in);
//        String[] str = scan.nextLine().split(" ");
//        for (int i = str.length-1; i >= 0 ; i--) {
//            System.out.print(str[i] + " ");
//        }
        /*Задача 20: Число Армстронга
        Условие:
        Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).*/
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = a;
//        int c = a;
//        int count = 0;
//        int sum = 0;
//        while (b>0) {
//            count++;
//            b /= 10;
//
//        }
//        while (c>0){
//            sum += Math.pow(c%10, count);
//            c /= 10;
//
//        }
//        if (sum == a) System.out.printf("Число %d является числом Армстронга.", a);
//        else System.out.printf("Число %d не является числом Армстронга.", a);

    }
}
