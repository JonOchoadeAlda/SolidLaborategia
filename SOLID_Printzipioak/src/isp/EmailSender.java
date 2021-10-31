package isp;

public class EmailSender {
	public static void sendEmail(IEmail e, String message) {
		System.out.println(e.getEmail() + ": " + message);
	}
}
