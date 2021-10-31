package isp;

public class Main {

	public static void main(String[] args) {
		GmailAccount g = new GmailAccount();
		g.setEmail("jonemail@gmail.com");
		g.setName("JON");
		EmailSender.sendEmail(g, "mezua");
	}

}
