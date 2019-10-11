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

    @Test
    public void testRemoveProduct() {
        shoppingCartManager.addProduct(shoppingCart, item);

        int size = shoppingCartManager.getProducts();

        assertEquals(size, 1);
    }

    @Test
    public void testAddMoreThanOneProduct() {
        shoppingCartManager.addProduct(shoppingCart, item);
        Item item2 = new Item(2, "jersey", 11.22);

        List<Item> itemList = new ArrayList<>();

        itemList.add(item);
        itemList.add(item2);

        shoppingCartManager.addProducts(shoppingCart, itemList);

        int size = shoppingCartManager.getProducts();


        assertEquals(size, 2);

    }

}