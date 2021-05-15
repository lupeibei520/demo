package testcase;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author lupeibei
 * @date 2021/5/15 11:45 下午
 */
public class ceshirenTest {
    public static  WebDriver driver;
//    初始化webdriver
    WebDriver webDriver;
    @BeforeAll
    public  static void initData(){
        driver=new ChromeDriver();
    }
    @Test
    public void login(){
        driver.get("https://ceshiren.com/");
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
    }
}
