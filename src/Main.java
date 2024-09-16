import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

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
    class Product{
        private String name;
        private double price;
        private int quantity;
        public Product(String name, double price, int quantity){
            this.name=name;
            this.price=price;
            this.quantity=quantity;
        }
        public String getName(){
            return name;
        }
    }
    class Store{
        private  ArrayList<Product> products;
        public Store(ArrayList<Product> products){
            this.products=products;
        }
        void addProduct(Product product){
            products.add(product);
        }
        void removeProduct(Product product){
            products.remove(product);
        }
        Product searchName(String name){
            for (Product product:products){
                if (product.name.equals(name)){
                    return product;
                }

            }
            return null;
        }
    }

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
    class Matrix{
        private int[][] matrix;
        public int[][] getMatrix(){
            return matrix;
        }
        public Matrix(int rows, int col){
            matrix = new int[rows][col];

        }
    }
//
//17. Создание игры с использованием ООП
//    Реализуйте классы для небольшой текстовой игры, такие как Player, Enemy, Weapon, с полями и методами, описывающими их поведение.
//
//18. Автоматизированная система заказов
//    Создайте классы Order, Customer, и Product. Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа и просматривать историю заказов.
//
//            19. Наследование: Электроника
//    Создайте класс Device с полем brand и методами turnOn() и turnOff(). Реализуйте классы Smartphone и Laptop, которые наследуют от Device и добавляют уникальные методы, например, takePhoto() для смартфона.
//
//            20. Игра "Крестики-нолики"
//    Разработайте классы для игры "Крестики-нолики". Создайте класс Game, который управляет логикой игры, и классы Player, описывающие поведение игроков.
//

    public static void main(String[] args) {

        //Задача 2.
//        Animal[] animals = {new Dog(), new Cat(), new Cow()};
//        for (Animal animal : animals){
//            animal.makeSound();
//        }

    }
}