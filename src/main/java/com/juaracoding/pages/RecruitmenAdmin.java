package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RecruitmenAdmin {

    private WebDriver driver;

    public RecruitmenAdmin(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")
    private WebElement menuAdmin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
    private WebElement btnAdd;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div")
    private WebElement btnSelect;


    public void setMenuAdmin(){
        menuAdmin.click();
    }

    public void addAdmin(){
        btnAdd.click();
        Utils.delay(2);
        btnSelect.click();

        Select select = new Select(btnSelect);
        //---------------------------------------------
        select.selectByIndex(1);
        Utils.delay(2);
        select.selectByValue("admin"); // attribute value

    }
}
