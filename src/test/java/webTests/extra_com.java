package webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class extra_com {
    // Classe


    //Atributos
    WebDriver driver;
    // Metodos e Funções

    @BeforeTest
    public void Iniciar() {
        // Aponta para onde está o driver do chrome
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/104/chromedriver.exe"); // Aponta para aonde esta o driver
        driver = new ChromeDriver(); //Instancia o objeto driver como um controlador do Chrome
        driver.manage().window().maximize(); // Maximizar a janela
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }
    @AfterTest
    public void finalizar (){
        driver.quit();

    }

            @Test
            public void ConsultarAuto() throws InterruptedException {
        // Realizar o Teste
        //Abrir site informado
         driver.get("https://extra.com.br/");

        driver.findElement(By.id("strBusca")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("strBusca")).sendKeys("Celular");
            }
}
