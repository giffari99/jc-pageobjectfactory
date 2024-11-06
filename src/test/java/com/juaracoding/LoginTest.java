package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPages;
    private RecruitmentPage recruitmentPage;

    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPages = new LoginPage();

    }
    @AfterClass
    public void finish(){
        Utils.delay(2);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testValidLogin(){
        loginPages.loginUser("Admin", "admin123");
        Assert.assertEquals(loginPages.getTxtDashboard(),"Dashboard");
    }


    //negative Test
    @Test
    public void testInvalidLogin(){
        loginPages.loginUser("Invalid","Invalid123");
        Assert.assertEquals(loginPages.getTxtInvalid(),"Invalid credentials");
        Utils.delay(3);
    }

    @Test
    public void testImgCompanyBranding(){
        Utils.delay(5);
        Assert.assertTrue(loginPages.getImtCompanyBranding());
    }



}
