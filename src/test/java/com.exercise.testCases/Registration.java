package com.exercise.testCases;

import com.exercise.pageObjects.RegistrationPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BaseClass {
    @Test(priority = 1)
    public void lunchBrowser(){
        Assert.assertTrue(registrationPage.getPageTitile(readConfig.getPageTitle()));
        registrationPage.signUp();
    }
    @Test(priority = 2)
    public void RegisterAccount(){
        registrationPage.getNewUserHeading();
        registrationPage.enterName(readConfig.getName());
        registrationPage.enterEmail(readConfig.getEmail());
        registrationPage.submit();
        Assert.assertTrue(registrationPage.getExistName(readConfig.getName()));
        Assert.assertTrue(registrationPage.getExistEmail(readConfig.getEmail()));
        registrationPage.enterDay(readConfig.getBirthDay());
        registrationPage.selectTitle();
        registrationPage.enterMonth(readConfig.getBirthMonth());
        registrationPage.enterYear(readConfig.getBirthYear());
        registrationPage.enterPassword(readConfig.getPassword());
        registrationPage.selectNewsLetters();
        registrationPage.selectSpecialOffers();
        registrationPage.enterFirstName(readConfig.getFirstName());
        registrationPage.enterLastname(readConfig.getLastName());
        registrationPage.enterCompanyName(readConfig.getCompany());
        registrationPage.enterAddress1(readConfig.getAddress1());
        registrationPage.enterAddress2(readConfig.getAddress2());
        registrationPage.selectCountry(readConfig.getCountry());
        registrationPage.enterState(readConfig.getState());
        registrationPage.enterCity(readConfig.getCity());
        registrationPage.enterZip(readConfig.getzipCode());
        registrationPage.enterPhoneNumber(readConfig.getPhoneNumber());
        registrationPage.clickCreateAccount();
        Assert.assertTrue(registrationPage.accountCreated());
        registrationPage.clickContinue();
        registrationPage.getAlert();
        registrationPage.getLoginAsUser();
    }
    @Test(priority = 3,dependsOnMethods = "lunchBrowser")
    public void login(){
        Assert.assertTrue(registrationPage.loginHeading());
        registrationPage.enterLoginEmail(readConfig.getEmail());
        registrationPage.enterLoginPassword(readConfig.getPassword());
        registrationPage.login();
        registrationPage.getLoginAsUser();
        registrationPage.deleteUserAccount();
        Assert.assertTrue(registrationPage.accountCreated(),"Account Deleted!");

    }
    @Test(priority = 4,dependsOnMethods = "lunchBrowser")
    public void invalidUserDetails(){
        registrationPage.enterLoginEmail(readConfig.getInvalidEmail());
        registrationPage.enterLoginPassword(readConfig.getInvalidPassword());
        registrationPage.login();
        Assert.assertTrue(registrationPage.invalidUserNameOrPass(),"Your email or password is incorrect!");

    }
    @Test(priority = 5,dependsOnMethods ="lunchBrowser" )
    public void validUserLogin(){
        registrationPage.enterLoginEmail(readConfig.getEmail());
        registrationPage.enterLoginPassword(readConfig.getPassword());
        registrationPage.login();
        registrationPage.getLoginAsUser();
        registrationPage.logOut();
        Assert.assertTrue(registrationPage.getLoginPageTitle(readConfig.getLoginPageTitle()),"Automation Exercise - Signup / Login");

    }
    @Test(priority = 6,dependsOnMethods = "lunchBrowser")
    public void registerWithExistEmail(){
        registrationPage.getNewUserHeading();
        registrationPage.enterName(readConfig.getNewName());
        registrationPage.enterEmail(readConfig.getEmail());
        registrationPage.submit();
        Assert.assertTrue(registrationPage.getExistMail(),"Email Address already exist!");

    }

}
