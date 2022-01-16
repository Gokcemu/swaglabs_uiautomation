package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    public WebDriver webDriver;
    private By pageTitle = By.xpath("//span[@id='header_container']");
    String menuItem_Format = ".//li[contains(@class, 'burger-button') and text() = '%s']";

    public WebDriver Page(WebDriver webDriver){
      return webDriver;
    }

    public String getPageTitle(){
        return webDriver.findElement(pageTitle).getText();
    }

}
