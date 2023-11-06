public class FirstLesson {
    public static void main(String[] args) {

        //\n -перенос на след строку вместо sout
        //pvsm + enter(tab) = public static void main(String[] args)
        //sout + enter(tab) =  System.out.println("Hello world!");
        //System.out.print(); - выводит значение просто в строку
        //ctrl + / коментеирует все выделенное
        //ctrl + d дублировать выделенное
        //% - записывает остаток 10 % = 1
        // / - деление
        //== - проверка равенства значений  5 == 5
        // != - проверка что не равно чему то 5 != 4
        // ! - инверсия   просто превращает в противоположенное значение только к будеан значениям !false == true
        // && - двойной амперсот лочическое И  (5 > 4 && 6 > 5 )
        // || - логическое ИЛИ

        // ctrl + alt + l - сделать табуляцию

        //alt + insert ->>

        //alt + Enter - при красной лапочке ваызов действий

        //extends - для наследования

        //int a ; - объявление переменной
        // int b = 1; - инициализация переменной
        //break; - прирывает работу чего либо
        // continue - пропустить

        //f8 -при дебаге переход на следуйщий строку
        //f9- переход к след точке остановки

        //Массивы
        //for (int i = 0; i < array.length; i++) {  //length - будем получать длинну нашего массива
        //Scanner scanner = new Scanner(System.in); // сканер позволяет считывать входной поток данных
        //int a = scanner.nextInt(); // nextInt - позволяет запросить ввод значения с клавиатуры так как nextInt ( принимает только инты значение можно менять)
        //Random random = new Random(); // создает генирацию рандомных символов ( рандом тип данных)
        //int a = random.nextInt(50); //указываем правую граниу длинны массива создая рандомну длинну
        //  array[i] = -50 + random.nextInt(50); //для создания отрицательных чисел в массиве
        //array[i] = random.nextInt(50); // позволяет создавать в каждый индекс рандомное число до 50
        // for (int j = array.length -1; -   array.length -1 индек последнего числа массива это его длинна и -1
        // fori - сразу цикл заполняет

        // 6 урок -МЕТОДЫ

        //void - результат метода не используется дальше. что метод не возвращает ничего
        // int или boolean - результат метода будет где то использоваться

        // Методы
        //ctr + p - появятся подсказки если кусор стоит с скобках метода тип данных и название переменной

        // можно передовать как значение так и медот ( значение меняется на a and w)
        //  calculateMultiplication(5, 17);

        // int a = 5;
        //  double w= 17d;
        //  calculateMultiplication(a, w);

        // ctr + insert - создание конструктора
        //пкм -> generate

        //Калькулятор
        //тип_данных название переменной = new конструктор_класса
        //Phone iphone = new Phone("Iphone Pro 1234", 1, true); //Phone тип данных
        //System.out.println(iphone.expirationDate); //обращение к функциональности объекта
        //iphone.printIfo();// та функциональность которую мы описали

        // НАСЛЕДОВАНИЕ 7 урок ПРИВАТНОСТЬ
        //extends - позволяет наследовать класс ( описывается позле названия класса )

        //alt = insert -> override methods

        // 8 урок Полимарфизм Абстракция
        //implements названия Интерфейся  ( можно вызывать огромное моножество, обязательно его надо будет описать )
        //default void printHelloWorld() { } можно создать метод

        //создание обстракного класса public abstract class Human { }
        //Абстракные калссы используются как и наследование extends

        //final  - указывает на то что в дальнейшем структура данных будет не изменяемой. Относится как к классам , ипеременным , методам
        //если к переменной то оно больше не изменно . Используется для защиты данных.
        //к методу - появляется запрет на переопределние данного метода
        //к класу - от этого класса не может быть наследника

        //static - принадлежность к класу а не к методу

        // public static final int qwe= 15; - полная констата , писать лучше в интерфейсах. Если описать в интерфейсе пользоваться можно везде

        //сравнение
        // hasNextInt
        // hasNextDouble
        // метод equals сравнивает 1 со вторым

        //Сравнение строк
//    String value1 = "Hello World";
//    String value2 = "Hello World2";
//        System.out.println(value1.equals(value2));


//    String value1 = "               Hello World              ";
//    String value2 = "Hello World2";
//        System.out.println("Посимвольное сравнение 2 строк - " + value1.equals(value2));
//        System.out.println("Получение длиенны вашей строки - " + value2.length());
//        System.out.println("Получение массив байтов" + value1.getBytes());
//        System.out.println("Получение массив байтов" + Arrays.toString(value1.getBytes()));
//        System.out.println("Получение индекса элемента по символу - " + value2.indexOf("e"));
//        System.out.println("Получение индекса элемента числу символа - " + value2.indexOf(111));
//        System.out.println("Преведение значения переменной к верхнему регистру (все буквы будут большими) - " + value1.toUpperCase());
//        System.out.println("Преведение значения переменной к нижнемк регистру - " + value1.toLowerCase());
//        System.out.println("Позволяет удалить лишних пробелы в началале и конце cтроки - " + value1.trim());
//        System.out.println("Метод который заменяет переданный символ - " + value1.replace('o', 'n'));
//        System.out.println("Разбиение стронки на массив по символу - " + Arrays.toString(value2.split(" ")));
//        System.out.println("Посимвольно сравнение без учета регистра - " + value2.equalsIgnoreCase("hello world2"));
//        System.out.println("Получения значения о наличии подстроки(подстрока вырезка из строки) в строке - " + value2.contains("Wor"));
//        System.out.println("Получение целочисленного результата сравнения - " + value2.compareTo(value1));
//        System.out.println("Учитывыт пробелы и пустые строки  " + value2.isBlank());
//        System.out.println("Метод который не учитывает пробелы (пустые строки) - " + value2.isEmpty());
//    //System.out.println("Вырезает подстроку из опеределенной строки " + value1.substring(123));


//        public class Database<T, R /*RVE, extends Human */> {   // дженерик
//            //    private int id;
////    private String id;
//            private  T id;
//            private String name;
//            private R age;
//
//            public Database(T id, String name, R age) {
//                this.id = id;
//                this.name = name;
//                this.age = age;
//            }
//
//            public T getId() {
//                return id;
//            }
//
//            public R getAge() {
//                return age;
//            }
//
//            public <Q> void printSomething(Q value) {
//                System.out.println(value);
//            }
//
//    //        StringBuffer - потоко безопасный
////        StringBuilder - не потоко безопасный объект
//    StringBuilder stringBuilder = new StringBuilder("Hello world");
////        stringBuilder.append("qwe");
//        stringBuilder.append("qwe").append("ewq");
//        System.out.println(stringBuilder);
    }
}
