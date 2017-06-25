
public class NotEligibleToVoteException extends Exception {
	int age;

	// here we are making a constructor
	public NotEligibleToVoteException(int age) {

		this.age = age;
	}

	public String toString() {
		return "Your age is " + age + " You must be 18+";
	}

}
