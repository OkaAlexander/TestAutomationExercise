package com.exercise.pageObjects;

import Pages.AbstratePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends AbstratePage {
    public ProductPage(WebDriver driver){
        super(driver);
    }
    private final By productList=By.cssSelector(".features_items");
    private final By viewProduct=By.cssSelector("a[href='/product_details/1']");
    private final By productName=By.cssSelector("div[class='product-information'] h2");
    private final By productCat=By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(3)");
    private final By productBrand=By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(8)");
    protected final By productAvailability=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]");




    public String getProductPageTitle(){return driver.getTitle();
    }
    public boolean getProductList(){return driver.findElement(productList).isDisplayed();
    }
    public void clickViewProduct(){driver.findElement(viewProduct).click();
    }
    public void getProductDetailsPageTitle(){ String tile=driver.getTitle();
        System.out.println(tile);
    }


}
