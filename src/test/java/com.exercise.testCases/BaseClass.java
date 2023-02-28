package com.exercise.testCases;

import com.exercise.pageObjects.RegistrationPage;
import com.exercise.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;


public class BaseClass {
    protected RegistrationPage registrationPage;
    public WebDriver driver;
    ReadConfig readConfig=new ReadConfig();


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(readConfig.getBaseUrl());
        driver.manage().window().maximize();
        Map<String, Object> pf = new HashMap<String, Object>();
        pf.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions p = new ChromeOptions();
        p.setExperimentalOption("prefs", pf);
        registrationPage=new RegistrationPage(driver);
        //readConfig=new ReadConfig();
    }
    @AfterClass
    public void teaDown() throws InterruptedException {
//        Thread.sleep(6000);
//        driver.quit();
    }

}
