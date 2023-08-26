package exception;

import java.io.IOException;

public class ParametrosInvalidosException extends IOException{

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
