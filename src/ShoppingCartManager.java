import java.util.ArrayList;
import java.util.List;

public class ShoppingCartManager {

    public void addProduct(ShoppingCart shoppingCart, Item item) {
        shoppingCart.getItemList().add(item);
    }

    public void addProducts(ShoppingCart shoppingCart, List<Item> items) {
        shoppingCart.getItemList().addAll(items);
    }

    public void removeProduct(ShoppingCart shoppingCart, Item item) {
        Item myItem = searchProduct(shoppingCart, item);

        if (myItem != null) {
            shoppingCart.getItemList().remove(myItem);
        }
    }

    public Item searchProduct(ShoppingCart shoppingCart, Item item) {
        List<Item> itemList = shoppingCart.getItemList();

        for (Item myItem: itemList) {
            if (myItem.getId() == item.getId()) {
                return myItem;
            }

        }

        return null;

    }

    public List<Item> getProducts(ShoppingCart shoppingCart) {
        return shoppingCart.getItemList();
    }
}
