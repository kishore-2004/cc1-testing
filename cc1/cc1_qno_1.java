package cc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1_qno_1 {
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(1000);
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        Thread.sleep(1000);
        if (cartCount.equals("1")) {

        }
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        Thread.sleep(1000);
        String product = "Sauce Labs Backpack";
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText().equals(product));
        Thread.sleep(1000);
        {
        }
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Your Information")) {
        }
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("kishore");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("kk");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("623526");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(1000);
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Overview")) {
        }
        System.out.println("NAME OF THE PRODUCT : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        Thread.sleep(1000);
        System.out.println("PRICE OF THE PRODUCT : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        Thread.sleep(1000);
        if(driver.getTitle().equals("Swag Labs")) {
        	System.out.println("TITLE IS MATCHED");
        }
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
        	System.out.println("URL IS MATCHED");
        }
    } 
}