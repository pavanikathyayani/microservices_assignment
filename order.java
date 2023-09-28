@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<?> createOrder(@RequestBody Order order) {
        // Implement logic to create an order
        orderService.createOrder(order);
        return ResponseEntity.ok("Order created successfully");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> listOrdersByUser(@PathVariable Long userId) {
        List<Order> orders = orderService.listOrdersByUser(userId);
        return ResponseEntity.ok(orders);
    }
}
