package stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyStepdefs {


    private WebDriver driver;

    @Given("Navigate to basket page")
    public void navigateToBasketPage() {
        driver = new ChromeDriver();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
        driver.findElement(By.id("dp")).click();

    }

    @Given("I have entered date of birth {string}")
    public void iHaveEnteredDateOfBirth(String date) {
        driver.findElement(By.id("dp")).sendKeys(date);

    }

    @Given("Fyller i förnamn {string}")
    public void fyllerIFörnamn(String name) {
        driver.findElement(By.id("member_firstname")).sendKeys(name);

    }

    @Given("Fyller i efternamn {string}")
    public void fyllerIEfternamn(String name) {
        driver.findElement(By.id("member_lastname")).sendKeys(name);

    }

    @Given("Fyller i email {string}")
    public void fyllerIEmail(String emailAdress) {
        driver.findElement(By.id("member_emailaddress")).sendKeys(emailAdress);

    }

    @Given("Upprepar email {string}")
    public void uppreparEmail(String confirmEmail) {
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(confirmEmail);

    }

    @Given("Fyller i lösenord {string}")
    public void fyllerILösenord(String password) {
        driver.findElement(By.id("signupunlicenced_password")).sendKeys(password);

    }

    @Given("Upprepar lösenord {string}")
    public void uppreparLösenord(String confirmPassword) {
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys(confirmPassword);

    }

    @Given("Klickar i TaC")
    public void klickarITaC() {
        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();

    }

    @Given("Klickar i over {int}")
    public void klickarIOver(int arg0) {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();

    }

    @Given("Klickar i code of ethics")
    public void klickarICodeOfEthics() {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();

    }

    @When("Klicka på registreringsknappen")
    public void klickaPåRegistreringsknappen() {
        driver.findElement(By.name("join")).click();

    }

    @Then("Verifiera {string} på sidan")
    public void verifieraPåSidan(String text) {
        String actual = driver.findElement(By.cssSelector(".bold:nth-child(2)")).getText();
        assertThat(actual, is(text));
        driver.close();
    }

    @Then("Verifiera errormeddelande {string} på sidan")
    public void verifieraErrormeddelandePåSidan(String text) {
        String actual = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[5]/div[2]/div/span/span")).getText();
        assertThat(actual, is(text));
        driver.close();
    }

    @Then("Verifiera felmeddelande {string} på sidan")
    public void verifieraFelmeddelandePåSidan(String text) {
        WebElement actualElement = driver.findElement(By.xpath("*[@id=\"signup_form\"]/div[6]/div[2]/div/span/span"));
        assertThat(actualElement, is(text));
        driver.close();
    }


    @Then("Verifiera rödtext {string} på sidan")
    public void verifieraRödtextPåSidan(String text) {
        WebElement actualElement = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/div[11]/div/div[2]/div[1]/span/span"));
        assertThat(actualElement, is(text));
        driver.close();
    }
}
