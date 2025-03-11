public class BookOne {
    String title;
    String author;
    int price;

    //Default 
    BookOne(){
        this.title = "Mathematics";
        this.author = "RD Sharma";
        this.price = 1000;
    }

    //Parametrized
    BookOne(String title,String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        BookOne obj1 = new BookOne();
        obj1.display();
        System.out.println();
        BookOne obj2 = new BookOne("The Blue Umbrella","Ruskin Bond",150);
        obj2.display();
    }
}
