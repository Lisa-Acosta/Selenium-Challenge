import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class EjercicioChallenge {
    @Test
    public void primerTest(){
        //INICIAR PROPERTIES PARA MAC/LINUX
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //INICIAR PROPERTIES PARA WINDOWS
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //INICIAR GOOGLE CHROME (driver)
        WebDriver driver = new ChromeDriver();

        //NAVEGAR A www.netflix.com
        driver.get("https://netflix.com");

        //MAXIMIZAR LA PANTALLA
        driver.manage().window().maximize();

        //IMPRIMIR TITULO
        System.out.println(driver.getTitle());

        //IMPRIMIR URL
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void titulosTest(){
        //INICIAR PROPERTIES
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //INICIAR GOOGLE CHROME (driver)
        WebDriver driver = new ChromeDriver();

        //NAVEGAR A www.netflix.com
        driver.get("https://netflix.com");

        //OBTENER ELEMENTOS h1
        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));

        //MOSTRAR TODOS LOS h1
        System.out.println("Lista de h1s:");
        for (WebElement h1 :listaH1){
            System.out.println(h1.getText());
    }
        //OBTENER ELEMENTOS h2
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));

        //MOSTRAR TODOS LOS h2
        System.out.println("Lista de h2s:");
        for (WebElement h2 :listaH2){
            System.out.println(h2.getText());
}
}
    @Test
    public void docusignTest() throws InterruptedException {
        //INICIAR PROPERTIES
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //INICIAR GOOGLE CHROME (driver)
        WebDriver driver = new ChromeDriver();

        //NAVEGAR A www.docusign.com
        driver.get("https://docusign.com");
        //
        Thread.sleep(3000);
        //CLICK EN "Aceptar Cookies"
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        //CLICK EN "Free Trial"
        driver.findElement(By.linkText("Try for Free")).click();

        //IMPRIMIR TITULO
        System.out.println(driver.getTitle());

        //IMPRIMIR LA URL
        System.out.println(driver.getCurrentUrl());

        //COMPLETAR CAMPO "First Name" con "Jhon"
        driver.findElement(By.name("first_name")).sendKeys("Jhon");

        //COMPLETAR CAMPO "Last Name" con "Smith"
        driver.findElement(By.name("last_name")).sendKeys("Smith");

        //COMPLETAR CAMPO "Email" con "test@test.com
        driver.findElement(By.name("email")).sendKeys("test@test.com");

        //COMPLETAR CAMPO "Phone" con "123123"
        driver.findElement(By.name("phone")).sendKeys("123123");

        //COMPLETAR CAMPO "Job Title" con "Qa Automation"
        driver.findElement(By.name("title")).sendKeys("Qa Automation");

        //VALIDAR TITULO
        Assert.assertEquals(driver.getTitle(),"DocuSign Free Trial");
    }
    @Test
    public void navegarSpotify() throws InterruptedException{
        //INICIAR PROPERTIES
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //INICIAR GOOGLE CHROME (driver)
        WebDriver driver = new ChromeDriver();

        //NAVEGAR A www.spotify.com
        driver.get("https://spotify.com/ar/");
        //driver.navigate().to("https://www.spotify.com/ar/signup");

        //CLICK EN "Regístrate"
        //data-ga-action="sign-up" con el texto "Regístrate"
        driver.findElement(By.linkText("Regístrate")).click();

        //CLICK EN "Registrarte"
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        //OBTENER TODOS LOS ERRORES
        List<WebElement> listaErrores = driver.findElements(By.className("cjsKtl"));

        //MOSTRAR TODOS LOS ERRORES
        for (WebElement errorMsg : listaErrores) {
            System.out.println(errorMsg.getText());
        }
    }

}