
import java.util.Scanner;

public class LoginProgram {

    public static void main(String[] args) {

        User user = new User("asiye", "passw@rd"); // Initialised  a User object

        Users usersAndPasswords = new Users(user);  // Initialised Users object with User object

        Scanner input = new Scanner(System.in);

        System.out.print("""
                Would you like to login or register ? Please choose an option
                1: Login
                2: Register
                Your choice :
                """);

        int option = input.nextInt();

        input.nextLine();

        String username;
        String password;

        switch (option) {
            case 1: {
                System.out.print("Please enter your username: ");

                username = input.nextLine();

                User currentUser = usersAndPasswords.findUser(username.toLowerCase());
                do {
                    password = input.next();
                    if (currentUser.getPassword().equals(password)) {
                        System.out.println("You successfully logged in !");
                        break;
                    }
                    System.out.println("You entered wrong password please re-enter.");


                } while (!(currentUser.getPassword().equals(password)));
            } // end case 1
            break;
            case 2: {
                System.out.print("Please enter  a username to register: ");
                username = input.nextLine();

                System.out.print("Please enter you password: ");
                password = input.nextLine();

                User newUser = new User(username, password);

                usersAndPasswords.registerUser(newUser); // adding new registered user to usersAndPasswords

                System.out.println("You successfully create you account  under the username of " + newUser.getUsername());
                System.out.println("Please now  enter your username: ");
                username = input.next();
                System.out.println("Please now enter your password: ");

                User currentUser = usersAndPasswords.findUser(username.toLowerCase());


                do {
                    password = input.next();
                    if (currentUser.getPassword().equals(password)) {
                        System.out.println("You successfully logged in !");
                        break;
                    }
                    System.out.println("You entered wrong password please re-enter.");


                } while (!(currentUser.getPassword().equals(password)));


            } // end case 2
            break;
        } // end switch

    }


}

