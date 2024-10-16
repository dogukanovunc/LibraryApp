
public class Main {
    public static void  main (String[] args){

        Book book1 =new Book(1,"Araba Sevdası","Recaizade Mahmut",365);
        Book book2 =new Book(2,"Suç Ve Ceza","Dostoyevski",305);
        Person person1 = new Person(1,"Emin Yelden",24);
        Person person2 = new Person(2,"Doğukan Övünç",24);

    Book[] books ={book1,book2};
    Person[] persons ={person1};


    BookManager bookManager = new BookManager();
    bookManager.bookTaken(book1,person2);


    }
}
