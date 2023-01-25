package in.co.rays.Project_4.Exception;


/**
 *ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * @author Kartikay Rai
 *
 */
public class ApplicationException extends Exception {

	public ApplicationException(String msg) {
		super(msg);
	}
}
