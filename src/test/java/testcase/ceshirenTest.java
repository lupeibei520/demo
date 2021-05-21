package testcase;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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
        //若一个页面没有加载完成再规定的时间中没有打开，则抛出异常
        driver.manage().timeouts().implicitlyWait(5, TimeUnit .SECONDS );
    }
    @Test
    //备注
    public void login(){
        driver.get("https://ceshiren.com/");
        driver.findElement(By.xpath("//span[contains(text(),'登录')]")).click();
        driver.findElement(By.id("login-account-name")).clear();
        driver.findElement(By.id("login-account-name")).sendKeys("18516648948");
        driver.findElement(By.id("login-account-password")).clear();
        driver.findElement(By.id("login-account-password")).sendKeys("test1234");

        driver.findElement(By.id("login-button")).click();
    }
}
