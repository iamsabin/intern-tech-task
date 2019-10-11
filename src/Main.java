public class Main {
    public static void main(String[] args) {
        ShoppingCartManager shoppingCartManager = new ShoppingCartManager();

        ShoppingCart shoppingCart = new ShoppingCart(1, 2);

        Item item = new Item(1, "jersey", 11.22);

        shoppingCartManager.addProduct(shoppingCart, item);

        shoppingCartManager.removeProduct(shoppingCart, item);
    }
}
