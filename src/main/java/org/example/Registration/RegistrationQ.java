package org.example.Registration;

public class RegistrationQ {

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Email must be Yahoo.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Username must be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null &&
                password.length() > 6 &&
                !password.contains(userName)) {

            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. Password must be longer than 6 characters and cannot contain username.");
        }
    }

    public void displayInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {

        RegistrationQ user = new RegistrationQ();

        user.setEmail("tamana@yahoo.com");
        user.setUserName("tamana123");
        user.setPassword("securepass123");

        System.out.println();

        user.displayInfo();
    }
}