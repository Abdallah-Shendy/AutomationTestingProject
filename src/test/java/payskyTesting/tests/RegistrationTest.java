package payskyTesting.tests;

import paysky.pages.RegistrationPage;

public class RegistrationTest {
    final RegistrationPage registration = new RegistrationPage();

    @org.testng.annotations.Test(priority = 1)
    public void RegisterWithValidUser() {
        registration.RegisterWithValidUser();
    }
}