package in.co.rays.Project_4.Exception;


/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred.
 * @author Kartikay Rai
 *
 */
public class DatabaseException extends Exception {

	public DatabaseException(String msg) {
		super(msg);
	}

}
