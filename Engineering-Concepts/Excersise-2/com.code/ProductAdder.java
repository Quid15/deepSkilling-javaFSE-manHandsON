import java.util.Arrays;

public class ProductAdder {
    public static void main(String[] args) {
        
       
        Product p1 = new Product("105", "Wireless Mouse", "Accessories");
        Product p2 = new Product("102", "Mechanical Keyboard", "Accessories");
        Product p3 = new Product("108", "Gaming Monitor", "Electronics");
        Product p4 = new Product("101", "USB-C Cable", "Accessories");
        
     
        Product[] products = {p1, p2, p3, p4};
        
        // --- LINEAR SEARCH ---
        System.out.println("--- Linear Search Test ---");
        Product foundLinear = SearchUtil.linearSearch(products, "108");
        if (foundLinear != null) {
            System.out.println("Found: " + foundLinear);
        } else {
            System.out.println("Product not found.");
        }

        // --- BINARY SEARCH ---
        System.out.println("\n--- Binary Search Test ---");
        
        
        Arrays.sort(products); 
        
        Product foundBinary = SearchUtil.binarySearch(products, "102");
        if (foundBinary != null) {
            System.out.println("Found: " + foundBinary);
        } else {
            System.out.println("Product not found.");
        }
    }
}