package com.exercise.pageObjects;

import Pages.AbstratePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage extends AbstratePage {
    public TestCasePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    private final By btnTestCase=By.cssSelector("div[class='item active'] a[class='test_cases_list'] button[type='button']");


    public void clickBtnTestCase(){driver.findElement(btnTestCase).click();
    }
    public String getTestPageTitle(){ return driver.getTitle();

    }
}
