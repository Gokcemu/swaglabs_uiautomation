package pages;

import org.openqa.selenium.WebDriver;

public class Page {

    public WebDriver webDriver;

    public WebDriver Page(WebDriver webDriver){

      return webDriver;
    }

    String menuItem_Format = ".//li[contains(@class, 'menu-item') and text() = '%s']";

}
