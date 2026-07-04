public class Product {
    private final String productId, productName;
    private final int quantity;
    private final double price;

    public Product(String productId, String productName, int quantity, double price){
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }
}
