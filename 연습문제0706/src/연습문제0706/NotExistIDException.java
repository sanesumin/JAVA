package 연습문제0706;

public class NotExistIDException extends Exception{
	public NotExistIDException() {}	
	public NotExistIDException(String message) {
		super(message);
	}
}
