package main.java.com.joba.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.ResponseCache;
import org.springframework.http.ResponseEntity;
import com.joba.backend.entity.User;
import com.joba.backend.util.JasyptEncryptorUtil;
import main.java.com.joba.backend.util.exception.LoginExceptionHandler;

@RestController
public class LoginController extends LoginExceptionHandler {

    @Autowired
    private JasyptEncryptorUtil jasyptEncryptorUtil;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> Login(@RequestBody LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();

        String encryptedUsername = encryptorUtil.encrypt(username);
        String encryptedPassword = encryptorUtil.encrypt(password);

        //store the encrypted password and username in a database
        
        try {
            User user = userRepository.findByEncryptedUsernameAndPassword(encryptedUsername, encryptedPassword);

            if (user != null){
                Long userId = user.getUserId();
                return ResponseEntity.ok("Login success");
            }else{
                return ResponseEntity.badRequest().body("Invalid credentials");
            }
        } catch (Exception e){
            return handleException(e);
        }
    }
}
