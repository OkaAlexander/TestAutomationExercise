package com.exercise.pageObjects;

import Pages.AbstratePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage extends AbstratePage {
    public RegistrationPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    private final By btnSignUp=By.cssSelector("a[href='/login']");
    private final By newUserSignUpHeading=By.cssSelector("div[class='signup-form'] h2");
    private final By userName=By.cssSelector("input[name='name']");
    private final By emailAddress=By.cssSelector("input[data-qa='signup-email']");
    private final By submit=By.cssSelector("button[data-qa='signup-button']");
    private final By existName=By.cssSelector("#name");
    private final By existEmail=By.cssSelector("#email");
    private final By title=By.cssSelector("#id_gender1");
    private final By cmbSelectNews=By.cssSelector("#newsletter");
    private final By password=By.cssSelector("#password");
    private final By day=By.cssSelector("#days");
    private final By month=By.cssSelector("#months");
    private final By year=By.cssSelector("#years");
    private final By receivedSpecial=By.cssSelector("#optin");
    private final By firstName=By.cssSelector("#first_name");
    private final By lastName=By.cssSelector("#last_name");
    private final By company=By.cssSelector("#company");
    private final By address1=By.cssSelector("#address1");
    private final By address2=By.cssSelector("#address2");
    private final By country=By.cssSelector("#country");
    private final By state=By.cssSelector("#state");
    private final By city=By.cssSelector("#city");
    private final By zipCode=By.cssSelector("#zipcode");
    private final By phoneNumber=By.cssSelector("#mobile_number");
    private final By clickCreateAccount=By.cssSelector("button[data-qa='create-account']");
    private final By accountCreated=By.cssSelector("h2[class='title text-center'] b");
    private final By btnContinue=By.cssSelector(".btn.btn-primary");
    private final By loginAsUser=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
    private final By loginHeading=By.cssSelector("div[class='login-form'] h2");
    private final By loginMail=By.cssSelector("input[data-qa='login-email']");
    private final By loginPassword=By.cssSelector("input[data-qa='login-password']");
    private final By loginSubmit=By.cssSelector("button[data-qa='login-button']");
    private final By deleteAccount=By.cssSelector("a[href='/delete_account']");
    private final By invalidUserNameOrPassword=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private final By logOut=By.cssSelector("a[href='/logout']");
    private final By existMailError=By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > p:nth-child(5)");
    public boolean getPageTitile(String title) {

        return driver.getTitle().equals(title);
    }
    public void signUp(){driver.findElement(btnSignUp).click();}
    public boolean getNewUserHeading(){ return driver.findElement(newUserSignUpHeading).isDisplayed();
    }
    public void enterName(String name){driver.findElement(userName).sendKeys(name);
    }
    public void enterEmail(String email){driver.findElement(emailAddress).sendKeys(email);
    }
    public void selectTitle(){driver.findElement(title).click();}
    public void submit(){driver.findElement(submit).click();
    }
    public void getAlert(){
        try {
            Alert alert=driver.switchTo().alert();
            alert.accept();
        }catch (NoAlertPresentException ne){
            System.out.println("No pop up window");
        }

//            if(wait.until(ExpectedConditions.alertIsPresent())==null){
//                System.out.println("alert never display");
//
//            }else {driver.switchTo().alert().dismiss();}
    }
    public boolean getExistName(String _existName){
        return driver.findElement(existName).getAttribute("value").equals(_existName);
    }
    public boolean  getExistEmail(String _existEmail){

        return driver.findElement(existEmail).getAttribute("value").equals(_existEmail);
    }
    public void enterDay(String _day){
        Select select=new Select(driver.findElement(day));
        select.selectByVisibleText(_day);
    }
    public void enterMonth(String _month){
        Select select=new Select(driver.findElement(month));
        select.selectByVisibleText(_month);
    }
    public void enterYear(String _year){
        Select select=new Select(driver.findElement(year));
        select.selectByVisibleText(_year);
    }
    public void enterPassword(String _password){driver.findElement(password).sendKeys(_password);
    }
    public void selectNewsLetters(){driver.findElement(cmbSelectNews).click();
    }
    public void selectSpecialOffers(){driver.findElement(receivedSpecial).click();
    }
    public void enterFirstName(String fName){driver.findElement(firstName).sendKeys(fName);
    }
    public void enterLastname(String lName){driver.findElement(lastName).sendKeys(lName);
    }
    public void enterCompanyName(String companyName){driver.findElement(company).sendKeys(companyName);
    }
    public void enterAddress1(String _address1){driver.findElement(address1).sendKeys(_address1);
    }
    public void enterAddress2(String _address2){driver.findElement(address2).sendKeys(_address2);
    }
    public  void selectCountry(String _country){
        Select select=new Select(driver.findElement(country));
        select.selectByVisibleText(_country);
    }
    public void enterState(String _state){driver.findElement(state).sendKeys(_state);
    }
    public void enterCity(String _city){driver.findElement(city).sendKeys(_city);
    }
    public void enterZip(String _zipCode){driver.findElement(zipCode).sendKeys(_zipCode);
    }
    public void enterPhoneNumber(String _phoneNumber){driver.findElement(phoneNumber).sendKeys(_phoneNumber);
    }
    public void clickCreateAccount(){driver.findElement(clickCreateAccount).click();
    }
    public boolean accountCreated(){return driver.findElement(accountCreated).isDisplayed();
    }
    public void clickContinue(){driver.findElement(btnContinue).click();
    }
//   public boolean getLoginAsUser(String _logger){
//       return driver.findElement(loginAsUser).getAttribute("value").equals(_logger);
//    }
    public String getLoginAsUser(){
        return driver.findElement(loginAsUser).getText();
    }
    public boolean loginHeading(){return driver.findElement(loginHeading).isDisplayed();
    }
    public void enterLoginEmail(String _email){driver.findElement(loginMail).sendKeys(_email);
    }
    public void enterLoginPassword(String _password){driver.findElement(loginPassword).sendKeys(_password);
    }
    public void login(){driver.findElement(loginSubmit).click();
    }
    public void deleteUserAccount(){driver.findElement(deleteAccount).click();
    }
    public boolean invalidUserNameOrPass(){return driver.findElement(invalidUserNameOrPassword).isDisplayed();
    }
    public void logOut(){driver.findElement(logOut).click();
    }
    public void navigateBackToLoginPage(){ driver.navigate().back();
    }
    public boolean getLoginPageTitle(String _loginTitle){return driver.getTitle().equals(_loginTitle);
    }
    public boolean getExistMail(){return driver.findElement(existMailError).isDisplayed();}

}
