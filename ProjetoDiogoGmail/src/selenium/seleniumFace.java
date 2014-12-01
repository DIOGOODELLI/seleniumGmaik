
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumFace {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.facebook.com.br/");

        WebElement campoDeTexto = driver.findElement(By.id("email"));
        campoDeTexto.sendKeys("joaoarmandopinto01@gmail.com");
        
        WebElement campoDeTexto2 = driver.findElement(By.id("pass"));
        campoDeTexto2.sendKeys("armandopinto");
         
        driver.findElement(By.id("u_0_l")).click();    
        
        Thread.sleep(10000);
        
        //Publica no face após 10000 milesegundos
        WebElement campoTexto4 = driver.findElement(By.id("u_0_w"));
        campoTexto4.sendKeys("Teste de publicação facebook;");
        campoTexto4.submit();
        
    }
    
}
