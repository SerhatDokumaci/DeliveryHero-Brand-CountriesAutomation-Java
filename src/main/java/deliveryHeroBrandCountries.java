import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class deliveryHeroBrandCountries extends basePage{

    By filter_all = By.cssSelector("[id='regions'] > .pb-4:nth-of-type(1) a");
    By filter_americas= By.cssSelector("[id='regions'] > .pb-4:nth-of-type(2) a");
    By filter_asia = By.cssSelector("[id='regions'] > .pb-4:nth-of-type(3) a");
    By filter_europe = By.cssSelector("[id='regions'] > .pb-4:nth-of-type(4) a");
    By filter_me_na = By.cssSelector("[id='regions'] > .pb-4:nth-of-type(5) a");

    By filter_Foodora = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(1) a");
    By filter_talabat = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(2) a");
    By filter_DameJidlocz = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(3) a");
    By filter_efoodgr = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(4) a");
    By filter_foodpanda = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(5) a");
    By filter_Hungerstation = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(6) a");
    By filter_mjam = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(7) a");
    By filter_PedidosYa = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(8) a");
    By filter_Yemeksepeti= By.cssSelector("[id='brands'] > .duration-300:nth-of-type(9) a");
    By filter_foody = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(10) a");
    By filter_InstaShop = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(11) a");
    By filter_BaedalMinjok = By.cssSelector("[id='brands'] > .duration-300:nth-of-type(12) a");

    By About_Us = By.cssSelector(".justify-center a");
//    By platform_slider_next = By.cssSelector("[data-glide-el='controls'] .swiper-button-next");
//    By platform_slider_prev = By.cssSelector("[data-glide-el='controls'] .swiper-button-prev");
//
//    By map_na = By.cssSelector("[id='region-selector'] [data-region='americas']:nth-of-type(1)");
//    By map_asia = By.cssSelector("[id='region-selector'] [data-region='asia']");
//    By map_eu = By.cssSelector("[id='region-selector'] [data-region='europe']");
//    By map_me_an = By.cssSelector("[id='region-selector'] [data-region='middle-east-and-north-africa']");
//
//    By america_close = By.cssSelector("[id='display-regions'] > [data-region='americas'] > button > svg");
//    By america_BaedalMinjok = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(1)");
//    By america_InstaShop = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(2)");
//    By america_foody = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(3)");
//    By america_YemekSepeti = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(4)");
//    By america_PedidosYa = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(5)");
//    By america_mjam = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(6)");
//    By america_HungerStation = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(7)");
//    By america_efoodgr = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(8)");
//    By america_DameJidlocz = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(9)");
//    By america_talabat = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(10)");
//    By america_foodora = By.cssSelector("[data-region='americas'] .grid >li:nth-of-type(11)");
//
//    By asia_close = By.cssSelector("[id='display-regions'] > [data-region='asia'] > button > svg");
//    By asia_BaedalMinjok = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(1)");
//    By asia_InstaShop = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(2)");
//    By asia_foody = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(3)");
//    By asia_YemekSepeti = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(4)");
//    By asia_PedidosYa = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(5)");
//    By asia_mjam = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(6)");
//    By asia_HungerStation = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(7)");
//    By asia_foodpanda = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(8)");
//    By asia_efoodgr = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(9)");
//    By asia_DameJidlocz = By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(10)");
//    By asia_talabat= By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(11)");
//    By asia_foodora= By.cssSelector("[data-region='asia'] .grid >li:nth-of-type(12)");
//
//    By europe_close = By.cssSelector("[id='display-regions'] > [data-region='europe'] > button > svg");
//    By europe_BaedalMinjok = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(1)");
//    By europe_InstaShop = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(2)");
//    By europe_foody = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(3)");
//    By europe_YemekSepeti = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(4)");
//    By europe_PedidosYa = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(5)");
//    By europe_mjam = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(6)");
//    By europe_HungerStation = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(7)");
//    By europe_foodpanda = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(8)");
//    By europe_efoodgr = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(9)");
//    By europe_DameJidlocz = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(10)");
//    By europe_talabat= By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(11)");
//    By europe_foodora= By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(12)");
//
//    By me_na_close = By.cssSelector("[id='display-regions'] > [data-region='europe'] > button > svg");
//    By me_na_BaedalMinjok = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(1)");
//    By me_na_InstaShop = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(2)");
//    By me_na_foody = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(3)");
//    By me_na_YemekSepeti = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(4)");
//    By me_na_PedidosYa = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(5)");
//    By me_na_mjam = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(6)");
//    By me_na_HungerStation = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(7)");
//    By me_na_efoodgr = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(8)");
//    By me_na_DameJidlocz = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(9)");
//    By me_na_talabat = By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(10)");
//    By me_na_foodora= By.cssSelector("[data-region='europe'] .grid >li:nth-of-type(11)");

    By newsroom_morenews = By.cssSelector(".bg-red.section--text.text-white > a");

    By career_joinus = By.cssSelector("[class='button--regular-red mt-8'] a");
//    By career_allow_cookie = By.cssSelector("[data-ph-at-id='cookie-close-link']");

//    By career_left_box_slider_next = By.cssSelector(".swiper-pagination .swiper-button-next");
//    By career_left_box_slider_prev = By.cssSelector(".swiper-pagination .swiper-button-prev");


    public deliveryHeroBrandCountries(WebDriver driver) {
        super(driver);
    }

    public void continent_filter_all(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_all));
        driver.findElement(filter_all).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='brands'] li")));
    }
    public void continent_filter_americas(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_americas));
        driver.findElement(filter_americas).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='brands'] [data-region='region-americas ']")));
    }
    public void continent_filter_asia(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_asia));
        driver.findElement(filter_asia).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='brands'] [data-region='region-asia ']")));
    }
    public void continent_filter_europe(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_europe));
        driver.findElement(filter_europe).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='brands'] [data-region='region-europe ']")));
    }
    public void continent_filter_me_na(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_me_na));
        driver.findElement(filter_me_na).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[id='brands'] [data-region='region-middle-east-and-north-africa ']")));
    }


    public void continent_filter_Foodora(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_Foodora));
        driver.findElement(filter_Foodora).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/foodora/"));
        driver.navigate().back();
    }
    public void continent_filter_talabat(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_talabat));
        driver.findElement(filter_talabat).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/talabat/"));
        driver.navigate().back();
    }
    public void continent_filter_DameJidlocz(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_DameJidlocz));
        driver.findElement(filter_DameJidlocz).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/damejidlo-cz/"));
        driver.navigate().back();
    }
    public void continent_filter_efoodgr(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_efoodgr));
        driver.findElement(filter_efoodgr).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/e-food-gr/"));
        driver.navigate().back();
    }
    public void continent_filter_foodpanda(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_foodpanda));
        driver.findElement(filter_foodpanda).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/foodpanda/"));
        driver.navigate().back();
    }
    public void continent_filter_Hungerstation(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_Hungerstation));
        driver.findElement(filter_Hungerstation).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/hungerstation/"));
        driver.navigate().back();
    }
    public void continent_filter_mjam(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_mjam));
        driver.findElement(filter_mjam).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/mjam/"));
        driver.navigate().back();
    }
    public void continent_filter_PedidosYa(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_PedidosYa));
        driver.findElement(filter_PedidosYa).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/pedidosya/"));
        driver.navigate().back();
    }
    public void continent_filter_Yemeksepeti(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_Yemeksepeti));
        driver.findElement(filter_Yemeksepeti).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/yemeksepeti/"));
        driver.navigate().back();
    }
    public void continent_filter_foody(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_foody));
        driver.findElement(filter_foody).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/foody/"));
        driver.navigate().back();
    }
    public void continent_filter_InstaShop(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_InstaShop));
        driver.findElement(filter_InstaShop).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/instashop/"));
        driver.navigate().back();
    }
    public void continent_filter_BaedalMinjok(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(filter_BaedalMinjok));
        driver.findElement(filter_BaedalMinjok).click();
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands/baedal-minjok/"));
        driver.navigate().back();
    }
    public void about_us(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(About_Us));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(About_Us));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(About_Us)));
        //driver.findElement(About_Us).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(About_Us));  // JS Executer click worked but normal click not worked here.
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/about/"));
    }

    public void more_news(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(newsroom_morenews));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(newsroom_morenews));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(newsroom_morenews)));
        //driver.findElement(newsroom_morenews).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(newsroom_morenews));
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/newsroom/"));
    }

    public void join_us() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(career_joinus));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(career_joinus));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(career_joinus)));
        //driver.findElement(career_joinus).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(career_joinus));
        //wait.until(ExpectedConditions.urlContains("https://careers.deliveryhero.com/global/en"));
        Thread.sleep(1000); // Normally we should never use sleep but page has some bugs. Somehow it cannot detect page url.
    }

    public void verify_homepage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(career_joinus));
        wait.until(ExpectedConditions.urlToBe("https://www.deliveryhero.com/brands-countries/"));
    }
}
