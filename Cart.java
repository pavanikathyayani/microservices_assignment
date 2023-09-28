@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<?> addToCart(@RequestBody CartItem cartItem) {
        // Implement logic to add items to the user's cart
        cartService.addToCart(cartItem);
        return ResponseEntity.ok("Item added to the cart");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<CartItem>> loadCartItems(@PathVariable Long userId) {
        List<CartItem> cartItems = cartService.loadCartItems(userId);
        return ResponseEntity.ok(cartItems);
    }

    @PostMapping("/order")
    public ResponseEntity<?> placeOrder(@RequestBody OrderRequest orderRequest) {
        // Implement logic to place an order and clear the user's cart
        cartService.placeOrder(orderRequest);
        return ResponseEntity.ok("Order placed successfully");
    }
}
