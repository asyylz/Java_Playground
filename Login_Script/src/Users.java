public class Users {
    private User[] usersAndPasswords; // Arrays are fixed size

    public Users(User userData) {
        this.usersAndPasswords = new User[]{userData};
    }

    public void displayUsers() {
        for (User user : usersAndPasswords) {
            System.out.println("Username: " + user.getUsername() +
                    ", Password: " + user.getPassword());
        }
    } // end disPlayUsers


    public User findUser(String username) {
        for (int i = 0; i < usersAndPasswords.length; i++) {
            if (username.equals(usersAndPasswords[i].getUsername().toLowerCase())) {

                System.out.println("User  found, please enter your password : ");

                return usersAndPasswords[i];
            }
        }
        System.out.println("User not found ");
        return new User("", "");
    } // end  findUser


    public void registerUser(User userData) { // copying existing users to new array
        User[] newUsersArray = new User[usersAndPasswords.length + 1];

        for (int i = 0; i < usersAndPasswords.length; i++) {
            newUsersArray[i] = usersAndPasswords[i];

        }

        newUsersArray[usersAndPasswords.length] = userData; // adding new user to array

        usersAndPasswords = newUsersArray;
    } // end register

}
