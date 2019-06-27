package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class ApplicationTest {
	private WebDriver driver;

	  @Test          
            public void testPetClinic() {    
        //Change the URL based on the location where Tomcat is installed
//        driver.get("http://petclinic2-env.n9yks5g8us.us-east-1.elasticbeanstalk.com/");    
//              String title = driver.getTitle();      
//        Assert.assertTrue(title.contains("a Spring Frameworkk"));   
            }    
            @BeforeTest 
            public void beforeTest() {    
//              File file = new  File("D:\\herramientas\\geckodriver\\geckodriver.exe");  
//         System.setProperty("webdriver.gecko.driver", 
//         file.getAbsolutePath());        
//              driver = new FirefoxDriver();    
            }      
            @AfterTest 
            public void afterTest() {  
//        driver.quit();        
            }      
}
