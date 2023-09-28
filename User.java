
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/update-profile")
    public ResponseEntity<?> updateProfile(@RequestBody User user) {
        // Implement logic to update user profile
        userService.updateProfile(user);
        return ResponseEntity.ok("Profile updated successfully");
    }

    @PostMapping("/update-password")
    public ResponseEntity<?> updatePassword(@RequestBody ChangePasswordRequest request) {
        // Implement logic to update user password
        userService.updatePassword(request);
        return ResponseEntity.ok("Password updated successfully");
    }

    @PostMapping("/update-addresses")
    public ResponseEntity<?> updateDeliveryAddresses(@RequestBody List<Address> addresses) {
        // Implement logic to update user delivery addresses
        userService.updateDeliveryAddresses(addresses);
        return ResponseEntity.ok("Addresses updated successfully");
    }
}
