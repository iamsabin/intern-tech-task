import org.junit.Test;

import static junit.framework.TestCase.*;

public class ShoppingCartManagerTest {
    ShoppingCart shoppingCart;
    Item item;
    ShoppingCartManager shoppingCartManager;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart(1, 2);
        item = new Item(1, "jersey", 11.22);
        shoppingCartManager = new ShoppingCartManager();
    }

    @BeforeEach
    public void setUpMethod() {
        shoppingCart.getProducts().clear();
    }

    @Test
    public void testAddProduct() {
        shoppingCartManager.addProduct(shoppingCart, item);

        int size = shoppingCartManager.getProducts();

        assertEquals(size, 1);
    }



}