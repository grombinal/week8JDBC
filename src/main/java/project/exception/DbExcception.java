package project.exception;

@SuppressWarnings("serial")
public class DbExcception extends RuntimeException {

	public DbExcception() {
		// TODO Auto-generated constructor stub
	}

	public DbExcception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DbExcception(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DbExcception(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DbExcception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
