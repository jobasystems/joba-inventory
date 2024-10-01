package main.java.com.joba.backend.util.exception;

public class LoginExceptionHandler {
    public ResponseEntity<String> handleException(Exception e){
        return ResponseEntity.badRequest().body("Error occurred during login: " + e.getMessage());
    }
}
