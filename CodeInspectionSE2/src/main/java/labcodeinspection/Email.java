package labcodeinspection;


public class Email { // NOPMD 
	private String m_firstName; // NOPMD 
	private String m_lastName; // NOPMD 
	private String password = null; // NOPMD 
	private String department; // NOPMD 
	private int defaultpasswordLength = 8; // NOPMD 
	private String email; // NOPMD 

	public Email(String firstName, String lastName) { // NOPMD 
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	public void showInfo() { // NOPMD 
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName); // NOPMD 
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password); // NOPMD 
	}

	public void setDeparment(int depChoice) { // NOPMD 
		switch (depChoice) { // NOPMD 
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) { // NOPMD
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*"; // NOPMD 
		char[] password = new char[length]; // NOPMD 
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length()); // NOPMD 
			password[i] = set.charAt(rand); // NOPMD 
		}
		return new String(password);
	}

	public void generateEmail() { // NOPMD by Karen on 6/25/20 9:19 AM
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase() + "@" + this.department // NOPMD 
				+ ".espol.edu.ec";
	}
}
