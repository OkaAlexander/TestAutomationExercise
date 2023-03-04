package com.exercise.pageObjects;

import Pages.AbstratePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstratePage {
    public ContactUsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    private final By txtContactUs=By.cssSelector("a[href='/contact_us']");
    private final By getIntouch=By.cssSelector("div[class='contact-form'] h2[class='title text-center']");
    private final By senderName=By.cssSelector("input[name='name']");
    private final By senderMail=By.cssSelector("input[name='email']");
    private final By subject=By.cssSelector("input[name='subject'");
    private final By message=By.cssSelector("#message");
    private final By upLaodFile=By.cssSelector("input[name='upload_file']");
    private final By submitMail=By.cssSelector("input[name='submit']");
    private final By submitSuccessMsg=By.cssSelector("div.status.alert.alert-success");
    private final By btnHome=By.cssSelector("a.btn.btn-success");



    public void clickContactUs(){driver.findElement(txtContactUs).click();
    }
    public boolean getGetInTouchHeading(){return driver.findElement(getIntouch).isDisplayed();
    }
    public void enterSenderName(String _senderName){driver.findElement(senderName).sendKeys(_senderName);
    }
    public void enterSenderMail(String _senderMail){driver.findElement(senderMail).sendKeys(_senderMail);
    }
    public void enterSubject(String _subject){driver.findElement(subject).sendKeys(_subject);
    }
    public void enterMessage(String _message){driver.findElement(message).sendKeys(_message);
    }
    public void uploadFile(){
        driver.findElement(upLaodFile).sendKeys("C:\\Users\\alexa\\OneDrive\\Desktop\\maameJooAdmin.pdf");
    }
    public void submitMessage(){driver.findElement(submitMail).click();
    }
    public void clickOkay(){
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    public boolean getSumitSuccessMsg(){return driver.findElement(submitSuccessMsg).isDisplayed();
    }
    public void getBtnHome(){driver.findElement(btnHome).click();
    }

}
