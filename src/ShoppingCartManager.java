import java.util.ArrayList;
import java.util.List;

public class ShoppingCartManager {

    public void addProduct(ShoppingCart shoppingCart, Item item) {
        shoppingCart.getItemList().add(item);
    }


}
