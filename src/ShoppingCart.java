import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int cartId;
    private int userId;
    private List<Item> itemList;

    public ShoppingCart(int cartId, int userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.itemList = new ArrayList<>();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }


}
