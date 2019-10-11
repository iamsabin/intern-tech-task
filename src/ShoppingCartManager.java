import java.util.List;

public class ShoppingCartManager {

    public void addProduct(ShoppingCart shoppingCart, Product product) {
        shoppingCart.getProducts().add(product);
    }

    public void removeProduct(ShoppingCart shoppingCart, Product product) {
        Product myProduct = searchProduct(shoppingCart, product);

        if (myProduct != null) {
            shoppingCart.getProducts().remove(myProduct);
        }
    }

    public Product searchProduct(ShoppingCart shoppingCart, Product product) {
        List<Product> productList = shoppingCart.getProducts();

        for (Product myProduct : productList) {
            if (myProduct.getId() == product.getId()) {
                return myProduct;
            }

        }

        return null;

    }
}
