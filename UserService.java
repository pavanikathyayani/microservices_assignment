@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Implement registration logic (e.g., password hashing)
        return userRepository.save(user);
    }

    public User loginUser(String username, String password) {
        // Implement login logic (e.g., password verification)
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new CustomException("Invalid username or password");
    }

    // Other user-related service methods (e.g., profile update, password change)
}
