package org.example.Registration;



// 2nd way of this code with getter method
public class Registration2 {

    private String email;
    private String userName;
    private String password;

    // SET EMAIL
    public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Must be Yahoo.");
        }
    }

    // SET USERNAME
    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Must be longer than 6 characters.");
        }
    }

    // SET PASSWORD
    public void setPassword(String password) {
        if (password != null &&
                password.length() > 6 &&
                userName != null &&
                !password.contains(userName)) {

            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. Must be >6 and not contain username.");
        }
    }

    // GETTERS (READ DATA)

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    // BONUS: hide password for security
    public String getPassword() {
        return "******";
    }

    // MAIN METHOD (TEST)
    public static void main(String[] args) {

        Registration2 user = new Registration2();

        user.setEmail("tamana@yahoo.com");
        user.setUserName("tamana123");
        user.setPassword("securepass123");

        System.out.println();
        System.out.println("User Info:");

        System.out.println("Email: " + user.getEmail());
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
    }
}