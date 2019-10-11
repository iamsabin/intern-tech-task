public class Main {
    public static void main(String[] args) {
        ShoppingCartManager shoppingCartManager = new ShoppingCartManager();

        ShoppingCart shoppingCart = new ShoppingCart(1, 2);

        Product product = new Product(1, "jersey", 11.22);

        shoppingCartManager.addProduct(shoppingCart, product);

        shoppingCartManager.removeProduct(shoppingCart, product);
    }
}
