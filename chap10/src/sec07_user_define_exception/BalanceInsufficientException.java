package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception {
	BalanceInsufficientException(){}
	BalanceInsufficientException(String message){
		super(message);
	}
}
