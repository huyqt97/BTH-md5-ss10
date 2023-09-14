package ra.security.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class LoginException extends Exception{
    public LoginException(String message) {
        super(message);
    }
}
