package code;

public class InventoryAdder {
    public static void main(String[] args) {
        InventoryManager<Product> myInventory = new InventoryManager<>();

        Product apple = new Product("P001", "Apple", 50, 0.99);
        Product laptop = new Product("P002", "Dell XPS", 5, 1200.00);

        myInventory.addProduct(apple);
        myInventory.addProduct(laptop);

        System.out.println("Products successfully added to the inventory!");
        System.out.println("First product: " + apple.getProductName());
    }
}
