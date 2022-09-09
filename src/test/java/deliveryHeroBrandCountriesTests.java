import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deliveryHeroBrandCountriesTests extends baseTest {

    deliveryHeroBrandCountries deliveryHeroBrandCountries;

    @Test
    @Order(1)
    public void TC001() {
        deliveryHeroBrandCountries = new deliveryHeroBrandCountries(driver);
        deliveryHeroBrandCountries.verify_homepage();
        deliveryHeroBrandCountries.continent_filter_americas();
        deliveryHeroBrandCountries.continent_filter_asia();
        deliveryHeroBrandCountries.continent_filter_europe();
        deliveryHeroBrandCountries.continent_filter_me_na();
        deliveryHeroBrandCountries.continent_filter_all();
    }

    @Test
    @Order(2)
    public void TC002() {
        deliveryHeroBrandCountries = new deliveryHeroBrandCountries(driver);
        deliveryHeroBrandCountries.verify_homepage();
        deliveryHeroBrandCountries.continent_filter_Foodora();
        deliveryHeroBrandCountries.continent_filter_talabat();
        deliveryHeroBrandCountries.continent_filter_DameJidlocz();
        deliveryHeroBrandCountries.continent_filter_efoodgr();
        deliveryHeroBrandCountries.continent_filter_foodpanda();
        deliveryHeroBrandCountries.continent_filter_Hungerstation();
        deliveryHeroBrandCountries.continent_filter_mjam();
        deliveryHeroBrandCountries.continent_filter_PedidosYa();
        deliveryHeroBrandCountries.continent_filter_Yemeksepeti();
        deliveryHeroBrandCountries.continent_filter_foody();
        deliveryHeroBrandCountries.continent_filter_InstaShop();
        deliveryHeroBrandCountries.continent_filter_BaedalMinjok();
    }

    @Test
    @Order(3)
    public void TC004() {
        deliveryHeroBrandCountries = new deliveryHeroBrandCountries(driver);
        deliveryHeroBrandCountries.verify_homepage();
        deliveryHeroBrandCountries.about_us();
    }

    @Test
    @Order(4)
    public void TC006() {
        deliveryHeroBrandCountries = new deliveryHeroBrandCountries(driver);
        deliveryHeroBrandCountries.verify_homepage();
        deliveryHeroBrandCountries.more_news();
    }

    @Test
    @Order(5)
    public void TC007() throws InterruptedException {
        deliveryHeroBrandCountries = new deliveryHeroBrandCountries(driver);
        deliveryHeroBrandCountries.verify_homepage();
        deliveryHeroBrandCountries.join_us();
    }
}
