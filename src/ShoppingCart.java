import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int cartId;
    private int userId;
    private List<Product> products;

    public ShoppingCart(int cartId, int userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.products = new ArrayList<>();
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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
