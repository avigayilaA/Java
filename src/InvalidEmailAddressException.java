public class InvalidEmailAddressException extends Exception {
    public InvalidEmailAddressException(String email) {
        super("The email " + email + " is invaid");
    }
}
