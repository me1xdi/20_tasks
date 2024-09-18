import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;
import java.util.Scanner;

public class Main {
//    1. Класс "Человек"
//    Создайте класс Person с полями name, age, gender. Реализуйте методы для вывода информации о человеке и увеличения его возраста. Добавьте метод для изменения имени.
    static class Person{
         String name;
         int age;
         String gender;
        public Person(String name, int age, String gender){
            this.name =name;
            this.age = age;
            this.gender = gender;
        }
        public void displayInfo(){
            System.out.printf("Имя: %s\nВозраст: %d\nГендер: %s.", name, age, gender);
        }
        public void ageIncrease(){
            age++;
        }
        public void changeName(String newName){
            name = newName;
        }
    }

//2. Наследование: Класс "Работник" и "Менеджер"
//    Создайте класс Worker, который наследуется от класса Person, и добавьте поле salary. Создайте класс Manager, который наследует от Worker и добавляет поле для подчиненных сотрудников.
    static class Worker extends Person{
        int salary;
        public Worker(String name, int age, String gender, int salary){
            super(name, age, gender);
            this.salary = salary;

        }

    }
    static class Manager extends Worker{
        String employee;
        public Manager(String name, int age, String gender, int salary, String employee) {
            super(name, age, gender, salary);
            this.employee = employee;
        }
    }

//            3. Полиморфизм: Животные
//    Создайте интерфейс Animal с методом makeSound(). Реализуйте классы Dog, Cat, и Cow, которые реализуют этот интерфейс. Продемонстрируйте полиморфизм на примере массива животных.
//    interface Animal{
//        void makeSound();
//
//    }
//    static class Dog implements Animal{
//        public void makeSound(){
//            System.out.println("Гав");
//        };
//
//    }
//    static class Cat implements Animal{
//        public void makeSound(){
//            System.out.println("Мяу");
//        };
//
//    }
//    static class Cow implements Animal{
//        public void makeSound(){
//            System.out.println("Муу");
//        };
//
//    }

//            4. Абстрактный класс "Транспорт"
//    Создайте абстрактный класс Transport с абстрактным методом move(). Реализуйте классы Car и Bike, которые наследуются от Transport и реализуют метод move().
    abstract static class Transport{
        abstract void move();
    }
    static class Car extends Transport{
        void move(){
            System.out.println("Ехала");
        };
    }
    static class Bike extends Transport{
        void move() {
            System.out.println("Не ехала");
        };
    }

//            5. Класс "Книга" и "Библиотека"
//    Создайте класс Book с полями title, author, и year. Создайте класс Library, который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.
    static class Book{
        private String title;
        private String author;
        private int year;
        public Book(String title, String author, int year){
            this.title = title;
            this.author = author;
            this.year = year;
        }
    }
    static class Library{
        private static ArrayList<Book> books;
        public Library(ArrayList<Book> books){
            this.books = books;
        }
        static void addBooks(Book newBook){
            books.add(newBook);
        }
        static void authorSearch(String author){
            for(Book book : books){
                if(book.author.equals(author)) System.out.println("В списке содержатся книги"+ author);
            }
        }
        static void  yearSearch(int year){
            for (Book book : books){
                if(book.year==year) System.out.printf("В списке содержатся %d год издания книиги.", year);
            }
        }
    }

//            6. Инкапсуляция: Банк
//    Создайте класс BankAccount с полями accountNumber, balance, и методами для пополнения и снятия средств. Обеспечьте инкапсуляцию для безопасности данных счета.
    static class BankAccount{
        private int accountNumber;
        private static double balance;
        public BankAccount(int accountNumber, double balance){
            this.accountNumber=accountNumber;
            this.balance=0.0;
        }
        static void popolnenie(double popoln){
            balance += popoln;
        }
        static void snatie(double snat){
            if (snat<=balance) balance -= snat;
            else System.out.println("Не достаточно средств.");
        }
        static double getBalance(){
            return balance;
        }
    }

//            7. Счетчик объектов
//    Создайте класс Counter, который хранит количество созданных объектов данного класса. Реализуйте статическое поле для учета количества объектов и метод для его увеличения при каждом создании объекта.
    static class Counter{
        private static int n=0;
        public Counter(){
            n++;
        }
        public static int getObject(){
            return n;
        }
    }

//            8. Площадь фигур
//    Создайте абстрактный класс Shape с абстрактным методом getArea(). Реализуйте классы Circle и Rectangle, которые наследуют от Shape и вычисляют площадь круга и прямоугольника соответственно.
//    static abstract class Shape{
//        abstract double getArea();
//
//    }
//    static abstract class Circle extends Shape{
//        private double rad;
//        public Circle(double rad){
//            this.rad=rad;
//        }
//        double circleArea(){
//            return Math.PI* rad*rad;
//        }
//    }
//    static abstract class Rectangle extends Shape{
//        private double height;
//        private double width;
//        public Rectangle(double height, double width){
//            this.height=height;
//            this.width=width;
//        }
//        double rectangleArea(){
//            return width*height;
//        }
//    }

//9. Наследование: Животные и их движения
//    Создайте класс Animal с методом move(). Реализуйте классы Fish, Bird и Dog, которые наследуют Animal и переопределяют метод move() (рыба плавает, птица летает, собака бегает).
    static class Animal{
        void move(){
            System.out.println("Двигается");
        };
    }
    static class Fish extends Animal{
        void move(){
            System.out.println("Рыба плавает");
        }
    }
    static class Bird extends Animal{
        void move(){
            System.out.println("Птица летает");
        }
    }
    static class Dog extends Animal{
        void move(){
            System.out.println("Собака бегает");
        }
    }

//            10. Работа с коллекциями: Университет
//    Создайте класс Student с полями name, group, grade. Создайте класс University, который содержит список студентов и методы для добавления студентов, сортировки по имени и фильтрации по успеваемости.
    class Student{
        private String name;
        private int group;
        private int grade;
        public Student(String name, int group, int grade){
            this.name=name;
            this.group=group;
            this.grade=grade;
        }
        public String getStudent(){
            return name;
        }

    }
    class University{
        private ArrayList<Student> students;
        public University(ArrayList<Student> students){
            this.students=students;

        }
        public void addStudent(Student student){
            students.add(student);
        }
        public void sortByName(){
            Collections.sort(students, Comparator.comparing(Student::getStudent));
        }
        public void filterByGrade(double minGr){
            for(Student student: students){
                if(student.grade>=minGr){
                    System.out.println(student.name);
                }
            }
        }

    }

//11. Класс "Магазин"
//    Реализуйте класс Product с полями name, price, и quantity. Создайте класс Store, который содержит список продуктов и методы для добавления, удаления и поиска товаров по имени.
//    class Product{
//        private String name;
//        private double price;
//        private int quantity;
//        public Product(String name, double price, int quantity){
//            this.name=name;
//            this.price=price;
//            this.quantity=quantity;
//        }
//        public String getName(){
//            return name;
//        }
//    }
//    class Store{
//        private  ArrayList<Product> products;
//        public Store(ArrayList<Product> products){
//            this.products=products;
//        }
//        void addProduct(Product product){
//            products.add(product);
//        }
//        void removeProduct(Product product){
//            products.remove(product);
//        }
//        Product searchName(String name){
//            for (Product product:products){
//                if (product.name.equals(name)){
//                    return product;
//                }
//
//            }
//            return null;
//        }
//    }

//12. Интерфейс "Платежная система"
//    Создайте интерфейс PaymentSystem с методами pay() и refund(). Реализуйте классы CreditCard и PayPal, которые реализуют этот интерфейс.
    interface PaymentSystem{
        void pay();
        void refund();
    }
    class CreditCard implements PaymentSystem{
        public void pay(){
            System.out.println("Оплата по CreditCard");
        }
        public void refund(){
            System.out.println("Возврат по CreditCard");
        }

    }
    class PayPal implements PaymentSystem{
        public void pay(){
            System.out.println("Оплата через PayPal");
        }
        public void refund(){
            System.out.println("Возврат по PayPal");
        }

    }

//            13. Генерация уникальных идентификаторов
//    Создайте класс UniqueID, который генерирует уникальные идентификаторы для объектов каждого созданного класса. Реализуйте этот функционал через статическое поле и метод.
    class UniqueID{
        private  String id;
        private static int n = 0;
        public UniqueID(){
            this.id = UUID.randomUUID().toString();
            n++;
        }
        public String getId(){
            return id;
        }
        public  static  int n(){
            return n;
        }
    }

//            14. Класс "Точка" и "Прямоугольник"
//    Создайте класс Point с координатами x и y. Реализуйте класс Rectangle, который содержит две точки (левая верхняя и правая нижняя). Реализуйте метод для вычисления площади прямоугольника.
    class Point{
        private double x;
        private double y;
        public Point(double x, double y){
            this.x=x;
            this.y=y;
        }
    }
    class Rectangle{
        private Point topLeft;
        private Point rightBottom;
        public Rectangle(Point topLeft, Point rightBottom){
            this.topLeft=topLeft;
            this.rightBottom=rightBottom;
        }
        public double areaRect() {
            return (topLeft.x - rightBottom.x) * (rightBottom.y - topLeft.y);
        }
    }

//            15. Комплексные числа
//    Создайте класс ComplexNumber с полями для действительной и мнимой частей. Реализуйте методы для сложения, вычитания, умножения и деления комплексных чисел.
    class ComplexNumber{
        private double actual;
        private double mnim;
        public ComplexNumber(double actual, double mnim){
            this.actual=actual;
            this.mnim=mnim;
        }
        public ComplexNumber plus(ComplexNumber x){
            return new ComplexNumber(this.actual+ x.actual, this.mnim+ x.mnim);
        }
        public ComplexNumber minus(ComplexNumber x){
            return new ComplexNumber(this.actual- x.actual, this.mnim- x.mnim);
        }
        public ComplexNumber multipl(ComplexNumber x){
            return new ComplexNumber(this.actual* x.actual - this.mnim*x.mnim, this.actual* x.mnim +this.mnim*x.actual);
        }
        public ComplexNumber division(ComplexNumber x){
            double denomin = x.actual * x.actual + x.mnim * x.mnim;
            return new ComplexNumber((this.actual * x.actual + this.mnim * x.mnim) / denomin,
                    (this.mnim * x.actual - this.actual * x.mnim) / denomin);
        }

    }

//            16. Перегрузка операторов: Матрица
//    Создайте класс Matrix, представляющий двумерную матрицу. Реализуйте методы для сложения и умножения матриц. Продемонстрируйте перегрузку методов.
        public class Matrix {
            private int[][] matrix;

            public Matrix(int rows, int cols) {
                matrix = new int[rows][cols];
            }

            public void setValue(int row, int col, int value) {
                matrix[row][col] = value;
            }

            public int getValue(int row, int col) {
                return matrix[row][col];
            }

            public int getRows() {
                return matrix.length;
            }

            public int getCols() {
                return matrix[0].length;
            }

            public Matrix add(Matrix other) {
                if (this.getRows() != other.getRows() || this.getCols() != other.getCols()) {
                    throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
                }
                Matrix result = new Matrix(this.getRows(), this.getCols());
                for (int i = 0; i < this.getRows(); i++) {
                    for (int j = 0; j < this.getCols(); j++) {
                        result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
                    }
                }
                return result;
            }

            public Matrix add(int scalar) {
                Matrix result = new Matrix(this.getRows(), this.getCols());
                for (int i = 0; i < this.getRows(); i++) {
                    for (int j = 0; j < this.getCols(); j++) {
                        result.setValue(i, j, this.getValue(i, j) + scalar);
                    }
                }
                return result;
            }

            public Matrix multiply(Matrix other) {
                if (this.getCols() != other.getRows()) {
                    throw new IllegalArgumentException("Number of columns of the first matrix must equal number of rows of the second matrix.");
                }
                Matrix result = new Matrix(this.getRows(), other.getCols());
                for (int i = 0; i < this.getRows(); i++) {
                    for (int j = 0; j < other.getCols(); j++) {
                        for (int k = 0; k < this.getCols(); k++) {
                            result.setValue(i, j, result.getValue(i, j) + this.getValue(i, k) * other.getValue(k, j));
                        }
                    }
                }
                return result;
            }

            public Matrix multiply(int scalar) {
                Matrix result = new Matrix(this.getRows(), this.getCols());
                for (int i = 0; i < this.getRows(); i++) {
                    for (int j = 0; j < this.getCols(); j++) {
                        result.setValue(i, j, this.getValue(i, j) * scalar);
                    }
                }
                return result;
            }

            public void display() {
                for (int[] row : matrix) {
                    for (int value : row) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }

        }
//
//17. Создание игры с использованием ООП
//    Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
//    public class Player {
//        private String name;
//        private int health;
//        private Weapon weapon;
//
//        public Player(String name, int health, Weapon weapon) {
//            this.name = name;
//            this.health = health;
//            this.weapon = weapon;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getHealth() {
//            return health;
//        }
//
//        public void attack(Enemy enemy) {
//            System.out.println(name + " атакует " + enemy.getName() + " с " + weapon.getName() + " с " + weapon.getDamage() + " уроном!");
//            enemy.takeDamage(weapon.getDamage());
//        }
//
//        public void takeDamage(int damage) {
//            health -= damage;
//            if (health < 0) health = 0;
//        }
//    }
//    public class Weapon {
//            private String name;
//            private int damage;
//
//            public Weapon(String name, int damage) {
//                this.name = name;
//                this.damage = damage;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public int getDamage() {
//                return damage;
//            }
//        }
//    public class Enemy {
//        private String name;
//        private int health;
//        private int attack;
//
//        public Enemy(String name, int health, int power) {
//            this.name = name;
//            this.health = health;
//            this.attack = power;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getHealth() {
//            return health;
//        }
//
//        public void takeDamage(int damage) {
//            health -= damage;
//            if (health < 0) health = 0;
//        }
//
//        public void attack(Player player) {
//            System.out.println(name + " атакует " + player.getName() + " с " + attack + " уроном.");
//            player.takeDamage(attack);
//        }
//    }

//
//18. Автоматизированная система заказов
//    Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
    class Order{
        private ArrayList<Product> products = new ArrayList<>();

        public Order(ArrayList<Product> products){
            this.products = products;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }

        public void getProductsList(){
            for(Product product: products) System.out.println(product.getName());
        }

        public double totalPrice() {
            double total = 0;
            for (Product product : products) total += product.getPrice();
            return total;
        }
    }

        class Customer{
            private String name;

            public Customer(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public Order MakeOrder(ArrayList<Product> order){
                return new Order(order);
            }
        }

        class Product{
            private String name;
            private double price;

            public Product(String name, double price) {
                this.name = name;
                this.price = price;
            }

            public double getPrice() {
                return price;
            }

            public String getName(){
                return name;
            }
        }

//            19. Наследование: Электроника
//    Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
    class Device{
        private String brand;
        public Device(String brand){
            this.brand=brand;
        }
        void turnOn(){
            System.out.println(brand + "включен!");
        }
        void turnOff(){
            System.out.println(brand + "выключен!");
        }
        public String getBrand(){
            return brand;
        }
    }
    class Smartphone extends Device{

        public Smartphone(String brand) {
            super(brand);
        }
        void takePhoto(){
            System.out.println("Улыбнитесь на камеру!");
        }
    }
    class Laptop extends Device{

        public Laptop(String brand) {
            super(brand);
        }
        void openMSWord(){
            System.out.println("Откройте проект!");
        }
    }

//            20. Игра "Крестики-нолики"
//    Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
    public class Player {
        private String name;
        private char symbol;

        public Player(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
        }

        public String getName() {
            return name;
        }

        public char getSymbol() {
            return symbol;
        }
    }

    public class Game {
        private char[][] board;
        private final int size = 3;
        private Player player1;
        private Player player2;
        private Player currentPlayer;

        public Game(Player player1, Player player2) {
            this.board = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    board[i][j] = ' ';
                }
            }
            this.player1 = player1;
            this.player2 = player2;
            this.currentPlayer = player1;
        }

        public void play() {
            Scanner scan = new Scanner(System.in);
            while (true) {
                printBoard();
                System.out.println(currentPlayer.getName() + "совершает ход. Введите номер строки и столбца: ");
                int row = scan.nextInt() - 1;
                int col = scan.nextInt() - 1;

                if (makeMove(row, col)) {
                    if (checkWin(currentPlayer.getSymbol())) {
                        printBoard();
                        System.out.println(currentPlayer.getName() + " победил!");
                        break;
                    }
                    if (isFull()) {
                        printBoard();
                        System.out.println("Поздравляю! У вас ничья!");
                        break;
                    }
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                } else {
                    System.out.println("Неверный ход. Попробуйте снова.");
                }
            }
            scan.close();
        }

        private boolean makeMove(int row, int col) {
            if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == ' ') {
                board[row][col] = currentPlayer.getSymbol();
                return true;
            }
            return false;
        }

        private void printBoard() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(board[i][j]);
                    if (j < size - 1) System.out.print("|");
                }
                System.out.println();
                if (i < size - 1) System.out.println("-----");
            }
        }

        private boolean checkWin(char playerSymbol) {
            for (int i = 0; i < size; i++) {
                if ((board[i][0] == playerSymbol && board[i][1] == playerSymbol && board[i][2] == playerSymbol) ||
                        (board[0][i] == playerSymbol && board[1][i] == playerSymbol && board[2][i] == playerSymbol)) {
                    return true;
                }
            }
            return (board[0][0] == playerSymbol && board[1][1] == playerSymbol && board[2][2] == playerSymbol) ||
                    (board[0][2] == playerSymbol && board[1][1] == playerSymbol && board[2][0] == playerSymbol);
        }

        private boolean isFull() {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        //Задача 2.
//        Animal[] animals = {new Dog(), new Cat(), new Cow()};
//        for (Animal animal : animals){
//            animal.makeSound();
//        }

    }
}