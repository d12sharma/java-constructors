class BookSecond {
    public String ISBN;
    protected String title;
    private String author;

    public BookSecond(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
	public static void main(String[] args) {
        EBook ebook = new EBook("123456789", "Java Programming", "Dhruv", "PDF");
        ebook.display();
    }
}

class EBook extends BookSecond {
    private String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("Format: " + format);
    }
}


