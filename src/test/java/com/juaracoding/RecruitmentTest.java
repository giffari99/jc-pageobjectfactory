package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentTest {

   WebDriver driver;
   LoginPage loginPages;
   RecruitmentPage recruitmentPage;


    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPages = new LoginPage();
        recruitmentPage = new RecruitmentPage();
    }
    @AfterClass
    public void finish(){
        Utils.delay(5);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testAddCandidate(){
        loginPages.loginUser("Admin", "admin123");
        // step action
        recruitmentPage.setMenuRecruitment();
        recruitmentPage.addCandidate();
        // step validation : assert add candidate
        Assert.assertEquals(recruitmentPage.getTxtJuaraCoding(),"Application Stage");

    }



}
