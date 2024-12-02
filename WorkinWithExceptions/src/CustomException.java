class InvalidAgeException extends Exception{
    // Constructor that accept a message
    public InvalidAgeException(String message){
        super(message);
    }
}

class MainProgram {
    public static void main(String[] args) {
        try {
            checkAge(16);
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}