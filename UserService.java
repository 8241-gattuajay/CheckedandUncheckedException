import java.util.HashSet;
import java.util.Set;

public class UserService {
    private Set<String> users;
    public UserService() {
        users = new HashSet<>();
    }
    public void registerUser(String username) throws UserAlreadyExistsException{
        if(users.contains(username)){
            throw new UserAlreadyExistsException("User already exists");
        }
        else{
            users.add(username);
            System.out.println("User "+username+" registered successfully");
        }
    }

    public void checkUserExistence(String username) throws UserNotFoundException{
        if(users.contains(username)){
            System.out.println("user exists");
        }
        else {
            throw new UserNotFoundException("User not found");
        }
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.registerUser("ajay");
            userService.registerUser("kishore");
            userService.registerUser("ajay");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error registering user : "+e.getMessage());
        }
        try {
            userService.checkUserExistence("ajay");
            userService.checkUserExistence("bot");
        } catch (UserNotFoundException e) {
            System.out.println("Error checking user existence : "+e.getMessage());
        }
    }
}
