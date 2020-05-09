package com.company;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

    	 WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.calogi.com";
        String expectedTitle = "Airfreight Specialists | Calogi";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
      /*   * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
       */  
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }
}
