package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmenAdmin;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmenAdminTest {

    WebDriver driver;
    RecruitmenAdmin recruitmenAdmin;
    LoginPage loginPage;


    @BeforeClass
    public void setUp(){
        DriverSingleton.getInstance("firefox");
        driver = DriverSingleton.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage();
        recruitmenAdmin = new RecruitmenAdmin();
    }

    @AfterClass
    public void finish(){
        Utils.delay(5);
        DriverSingleton.closeObjectInstance();
    }


    @Test
    public void testAddAdmin(){
        loginPage.loginUser("Admin","admin123");
        //Step Action
        recruitmenAdmin.setMenuAdmin();
        recruitmenAdmin.addAdmin();
        //
    }

}
