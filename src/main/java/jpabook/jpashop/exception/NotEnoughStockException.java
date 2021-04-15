package jpabook.jpashop.exception;

/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-04-15 Time: 오후 5:33
 */
public class NotEnoughStockException extends RuntimeException{

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }

}
