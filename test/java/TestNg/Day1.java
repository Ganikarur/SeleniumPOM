package TestNg;


import org.testng.annotations.Test;

public class Day1 {
    @Test(priority = 1)
    void openn() {
        System.out.println("Open the application");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("Login to application");
    }

    @Test(priority = 3)
    void logout() {
        System.out.println("Logout from application");
    }
}
