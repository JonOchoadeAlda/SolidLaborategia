package isp;

public class SMSSender {
	public static void sendSMS(ISms sms, String message) {
		System.out.println(sms.getTelephone() + ": " + message);

	}
}
