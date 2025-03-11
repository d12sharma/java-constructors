class Product {
    private String productName;
    private double price;       
    private static  int totalProducts = 0; 

    
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }

    
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        
        Product p1 = new Product("Bag", 1200);
        Product p2 = new Product("Earphones", 8000);

        
        p1.displayProductDetails();
        p2.displayProductDetails();

        
        Product.displayTotalProducts();
    }
}

/*
Output
Product Name: Bag, Price: 1200.0
Product Name: Earphones, Price: 8000.0
Total Products: 2

*/