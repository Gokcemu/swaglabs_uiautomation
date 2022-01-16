package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage extends Page{

    private By filterItem       =  By.xpath("//select[@class='header_container']");
    private By filterAzOption   =  By.xpath("//option[@value='az']");
    private By filterZaOption   =  By.xpath("//option[@value='za']");
    private By filterLohiOption =  By.xpath("//option[@value='lohi']");
    private By filterHiloOption =  By.xpath("//option[@value='hilo']");
    private By shoppingCartLink =  By.xpath("//class[@id='shopping_cart_container']");
    private By addToCartButton  =  By.xpath("");


    public WebDriver webDriver;

    public InventoryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
