package com.company;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Main {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

    	 WebDriver driver = new ChromeDriver();
    	

        String baseUrl = "https://www.calogi.com";
        String expectedTitle = "Airfreight Specialists | Calogi";
        String actualTitle = "";

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/head/title")));


        // launch chrome and direct it to the Base URL

        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
      /*   * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
       */  
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close chrome
        driver.close();

    }
}
