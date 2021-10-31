package isp;

public class GmailAccount implements IEmail {
	String name, emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String e) {
		emailAddress = e;

	}

	public String getEmail() {
		return emailAddress;
	}

}
