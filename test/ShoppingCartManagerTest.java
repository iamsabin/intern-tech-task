import org.junit.Test;

import static junit.framework.TestCase.*;

public class ShoppingCartManagerTest {
    ShoppingCart shoppingCart;
    Product product;
    ShoppingCartManager shoppingCartManager;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart(1, 2);
        product = new Product(1, "jersey", 11.22);
        shoppingCartManager = new ShoppingCartManager();
    }

    @BeforeEach
    public void setUpMethod() {
        shoppingCart.getProducts().clear();
    }

    @Test
    public void testAddProduct() {
        shoppingCartManager.addProduct(shoppingCart, product);

        int size = shoppingCartManager.getProducts();

        assertEquals(size, 1);
    }

    @Test
    public void testRemoveProduct() {
        shoppingCartManager.addProduct(shoppingCart, product);
        shoppingCartManager.removeProduct(shoppingCart, product);

        int size = shoppingCartManager.getProducts();

        assertEquals(size, 0);
    }

    @Test
    public void testAddMoreThanOneProduct() {
        shoppingCartManager.addProduct(shoppingCart, product);
        Product product2 = new Product(2, "jersey", 11.22);

        List<Product> productList = new ArrayList<>();

        productList.add(product);
        productList.add(product2);

        shoppingCartManager.addProducts(shoppingCart, productList);

        int size = shoppingCartManager.getProducts();


        assertEquals(size, 2);

    }

}