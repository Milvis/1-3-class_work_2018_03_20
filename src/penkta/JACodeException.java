package penkta;


//susikuriam savo klaidos klase
//extends klase
//ir desiniu generate override methods pirmus keturis

public class JACodeException extends Exception{
    public JACodeException() {
        super();
    }

    public JACodeException(String message) {
        super(message);
    }

    public JACodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JACodeException(Throwable cause) {
        super(cause);
    }
}
