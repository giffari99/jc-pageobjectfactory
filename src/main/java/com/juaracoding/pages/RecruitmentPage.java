package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    private WebElement btnAdd;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputSelectEmaill;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputDeleteEmaill;

    @FindBy(xpath = "//input[@placeholder=\"Type here\"][1]")
    private WebElement inputEmailll;

    @FindBy(xpath = "//input[@type=\"file\"]")
    private WebElement resume;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSavee;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtApplicationStage;

    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtJuaraCoding;




    //p[@class='oxd-text oxd-text--p']

    public void setMenuRecruitment(){
       List<WebElement> listMenu = driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
        System.out.println(listMenu.size());

        for(WebElement listMen : listMenu){
            System.out.println(listMen.getText());
        }
        menuRecruitment.click();
    }

    public void addCandidate(){
        btnAdd.click();
        Utils.delay(2);
        btnSave.click();
        Utils.delay(2);
        inputFirstName.sendKeys("Juara");
        Utils.delay(2);
        inputLastName.sendKeys("Coding");
        Utils.delay(2);
        inputEmail.sendKeys("Juaracodinggmail.com");
        Utils.delay(2);
        inputSelectEmaill.sendKeys(Keys.CONTROL + "A");
        Utils.delay(2);
        inputDeleteEmaill.sendKeys(Keys.DELETE);
        Utils.delay(2);
        inputEmailll.sendKeys("Juaracoding@gmail.com");
        Utils.delay(2);
        resume.sendKeys("C:\\Users\\giffari\\Documents\\RESUME.Docx");
        Utils.delay(2);
        btnSavee.click();
        Utils.delay(2);
    }


    public String getTxtJuaraCoding(){
        Utils.delay(5);
        return txtJuaraCoding.getText();
    }

    // for validasi add candidate






}
