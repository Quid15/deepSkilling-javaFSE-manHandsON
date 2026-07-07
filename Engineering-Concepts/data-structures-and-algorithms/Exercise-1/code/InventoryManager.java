package code;

import java.util.HashMap;

public class InventoryManager<P extends InventoryManager.Identifiable>{

    public static interface Identifiable {
        String getProductId();
    }

    private final HashMap<String, P> inventory = new HashMap<>();

    public void addProduct(P p){
        inventory.put(p.getProductId(), p);
    }

    public void updateProduct(P p){
        inventory.put(p.getProductId(), p);
    }

    public void deleteProduct(String productId){
        inventory.remove(productId);
    }

    public HashMap<String, P> getInventory() {
        return inventory;
    }
}
