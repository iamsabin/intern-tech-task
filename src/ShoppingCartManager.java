import java.util.List;

public class ShoppingCartManager {

    public void addProduct(ShoppingCart shoppingCart, Product product) {
        shoppingCart.getProductList().add(product);
    }

    public void addProducts(ShoppingCart shoppingCart, List<Product> products) {
        shoppingCart.getProductList().addAll(products);
    }

    public void removeProduct(ShoppingCart shoppingCart, Product product) {
        Product myProduct = searchProduct(shoppingCart, product);

        if (myProduct != null) {
            shoppingCart.getProductList().remove(myProduct);
        }
    }

    public Product searchProduct(ShoppingCart shoppingCart, Product product) {
        List<Product> productList = shoppingCart.getProductList();

        for (Product myProduct : productList) {
            if (myProduct.getId() == product.getId()) {
                return myProduct;
            }

        }

        return null;

    }

    public List<Product> getProducts(ShoppingCart shoppingCart) {
        return shoppingCart.getProductList();
    }
}
