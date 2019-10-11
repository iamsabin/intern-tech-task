import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int cartId;
    private int userId;
    private List<Product> productList;

    public ShoppingCart(int cartId, int userId) {
        this.cartId = cartId;
        this.userId = userId;
        this.productList = new ArrayList<>();
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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
