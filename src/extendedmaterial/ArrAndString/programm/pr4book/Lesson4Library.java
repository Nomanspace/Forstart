package extendedmaterial.ArrAndString.programm.pr4book;

public class Lesson4Library {
    public static void main(String[] args) {
        Book[] bookList = new Book[99];
        //99 объектов = 98 индексов
        //почему тут не объявили тип переменной, видимо создали на основе класса бук,но какого вида(мерности) тут массив?
        Book book1 = new Book();
        book1.bookName = "The Hobbit";
        book1.bookPrice = 999;
        book1.editionYear = 1937;
        //инициализировали объект

        addBook(bookList, book1);
        //проверка на идентичную книгу

        Book book2 = new Book();
        book2.bookName = "The Hobbit1";
        book2.bookPrice = 999;
        book2.editionYear = 1937;
        //инициализировали второй объект

        addBook(bookList, book2);
        //проверка на идентичную книгу

        printAllBookList(bookList);
        //метод выводящий в консоль все объекты массива буклист
    }

    public static boolean checkBook(Book[] bookList, Book book) {

        for (Book item : bookList) {
            //какой-то паттерн который проходит по массиву созданного на основе класса

            if (item != null && item.bookName.equals(book.bookName) && item.editionYear == book.editionYear) {
                //если объект не равен нулю(т.е. его позиция не пуста)и длина имен совпадает и год совпадает
                System.out.println("Данная книга уже есть в картотеке");
                return true;
            }
        }

        System.out.println("Данной книги нет в картотеке");
        return false;
    }

    public static void addBook(Book[] bookList, Book book) {

        if (!checkBook(bookList, book)) {
            //тут как-то работает тру и фолс из проверки на совпадение книг
            for (int i = 0; i < bookList.length; i++) {
                //проходим по длине массива
                if (bookList[i] == null) {
                    //проваливаемся сюда если текущий индекс указатель после проверки определил,что в текущей ячейке ничего не записано
                    bookList[i] = book;
                    //записываем по этому индексу текущий объект
                    System.out.println("Книга добавлена в картотеку");
                    break;
                    //если добавили,то останавливаем этот иф
                }
                if (i == bookList.length - 1) {
                    //на 98 индексе 99 объект, что бы проверить, что мы дошли до конца,мы зная, что у нас 99 объектов понимаем,что...
                    //можно ли как-то получить переменную с кол-ом индексов согласно заданному кол-во объектов.
                    System.out.println("Картотека переполнена");
                }
            }

        }

    }

    public static void printAllBookList(Book[] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n",
                        i + 1, bookList[i].bookName, bookList[i].editionYear, bookList[i].bookPrice);
                //перебираем длину массива и с помощью проверки на не пустой индекс,выводим этот индекс с форматированием Стринг
            }
        }
    }

}

class Book {

    public String bookName = "somename";
    public int bookPrice;
    public int editionYear;
//создали отдельный класс с объявлением переменных,что бы в будущем использовать конструктов класса для создания объектов
    //класса по умолчания т.е. вызывая дефолтный конструктор, который создается на основе объявленных переменных в классе
    //и этих переменных инициализированных в другом классе
}