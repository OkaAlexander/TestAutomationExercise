package com.exercise.utilities;



import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig(){
        File src=new File("./configuration/config.properties");
        try{
            FileInputStream _file=new FileInputStream(src);
            pro=new Properties();
            pro.load(_file);
        }catch(Exception e){System.out.println("sorry file not uploaded"+e.getMessage());}

    }
    public String getBaseUrl(){
        String baseUrl=pro.getProperty("baseUrl");
        return baseUrl;
    }
    public String getPageTitle(){
        String pageTitle=pro.getProperty("pageTitle");
        return pageTitle;
    }
    public String getName(){
        String name=pro.getProperty("name");
        return name;
    }
    public String getEmail(){
        String email=pro.getProperty("email");
        return email;
    }
    public String getBirthDay(){
        String birthDay=pro.getProperty("birthDay");
        return birthDay;
    }
    public String getBirthMonth(){
        String birthMonth=pro.getProperty("birthMonth");
        return birthMonth;
    }
    public String getBirthYear(){
        String birthYear=pro.getProperty("birthYear");
        return birthYear;
    }
    public String getPassword(){
        String password=pro.getProperty("password");
        return password;
    }
    public String getFirstName(){
        String firstName=pro.getProperty("firstName");
        return firstName;
    }
    public String getLastName(){
        String lastName=pro.getProperty("lastName");
        return lastName;
    }
    public String getCompany(){
        String companyName=pro.getProperty("company");
        return companyName;
    }
    public String getAddress1(){
        String address1=pro.getProperty("address1");
        return address1;
    }
    public String getAddress2(){
        String address2=pro.getProperty("address2");
        return address2;
    }
    public String getCountry(){
        String county=pro.getProperty("country");
        return county;
    }
    public String getState(){
        String state=pro.getProperty("state");
        return state;
    }
    public String getCity(){
        String city=pro.getProperty("city");
        return city;
    }
    public String getzipCode(){
        String zipCode=pro.getProperty("zipCode");
        return zipCode;
    }
    public String getPhoneNumber(){
        String pnoneNumber=pro.getProperty("phoneNumber");
        return pnoneNumber;
    }
    public String getInvalidEmail(){
        String invalidEmail=pro.getProperty("invalidEmail");
        return invalidEmail;
    }
    public String getInvalidPassword(){
        String invalidPassword= pro.getProperty("invalidPassword");
        return invalidPassword;

    }
    public String getLoginPageTitle(){
        String loginPageTile=pro.getProperty("loginPageTitle");
        return loginPageTile;
    }
    public String getNewName(){
        String newName=pro.getProperty("newName");
        return newName;
    }
    public String getSubject(){
        String subject=pro.getProperty("subject");
        return subject;
    }
    public String getMessage(){
        String message=pro.getProperty("message");
        return message;
    }

}
