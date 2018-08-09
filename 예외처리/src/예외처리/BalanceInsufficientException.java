package 예외처리;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException () {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
