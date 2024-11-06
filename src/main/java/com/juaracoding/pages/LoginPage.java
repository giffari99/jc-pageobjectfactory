package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h6[contains(@class, 'topbar-header-breadcrumb')]")
    private WebElement TxtDashboard;

    @FindBy(xpath = "//p[contains(@class, 'oxd-alert-content-text')]")
    private WebElement txtInvalid;

    @FindBy(xpath = "//img[@alt='company-branding']")
    private WebElement imgCompanyBranding;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
    private WebElement btnListRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAdd;

    public void loginUser(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public String getTxtDashboard(){
        return TxtDashboard.getText();
    }


    public void listRecruitment(){
        btnListRecruitment.click();
        btnAdd.click();
    }

    public String getTxtInvalid(){
        return txtInvalid.getText();
    }

    public boolean getImtCompanyBranding(){
        return imgCompanyBranding.isDisplayed();
    }

}
