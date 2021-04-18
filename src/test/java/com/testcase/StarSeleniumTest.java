package com.testcase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author lupeibei
 * @date 2021/4/18 4:42 下午
 */
public class StarSeleniumTest {
    @Test
    public void starSelenium(){
        System.setProperty("webdriver.chrome.whitelistedIps", "/usr/local/sbin/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.baidu.com/");
//        driver.close();
        driver.get("https://home.testing-studio.com/");
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
    }
}
