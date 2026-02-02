class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidEmailException extends RuntimeException {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

class Validator {

    static void validate(String user, int age, String email)
            throws InvalidAgeException {

        if (age < 18)
            throw new InvalidAgeException("Age must be 18+");

        if (!email.contains("@"))
            throw new InvalidEmailException("Invalid Email");
    }
}

class P3{
    public static void main(String[] args) {

        try {
            Validator.validate("Anu", 17, "anu@gmail.com");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation Completed");
        }
    }
}