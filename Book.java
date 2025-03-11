public class Book {
    String title;
    String author;
    double price;
    int availability;

    
    Book(){
        this.title = "Wings Of Fire";
        this.author = "APJ Abdul Kalam";
        this.price = 1000.00;
        this.availability = 3;
    }

    
    Book(String title,String author, double price, int availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    Book(Book other){
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability :"+availability);
    }

    public static void main(String[] args) {
        Book obj1 = new Book();
        obj1.display();
        System.out.println();
        Book obj2 = new Book("The Blue Umbrella","Ruskin Bond",150.0, 4);
        obj2.display();
        System.out.println();
        Book obj3 = new Book(obj2);
        obj3.display();
    }
}
