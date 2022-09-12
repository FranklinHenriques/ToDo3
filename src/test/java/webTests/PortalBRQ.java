package webTests;
// Generated by Selenium IDE

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import utils.Evidencias;
import utils.Logs;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.*;

public class PortalBRQ {
    //Atributos
    private WebDriver driver;
    Evidencias evidencias;
    Logs logs;
    static String  dataHora = new SimpleDateFormat("yyyy-MM-dd HH-mm").format(Calendar.getInstance().getTime());
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeClass
    // Executa 1 vex apenas, no inicio da execução do sript
    public void antesDeTudo() throws IOException {
        logs = new Logs();
        logs.iniciarLogCSV(dataHora);
    }
    @BeforeMethod
    //Executa antes de cada @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/104/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximizar a janela
        driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
        evidencias = new Evidencias();
        logs = new Logs();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test(priority = 1)
    public void LogonPortal() throws InterruptedException, IOException {
        String casoDeTeste = "Batida de Ponto";
        logs.registrarCSV("2022-07-12 17-40", "Logon Portal","Iniciou o Teste");
        driver.get("https://portal.brq.com");

        driver.findElement(By.id("txtUsuario")).sendKeys("fhenriques");
        driver.findElement(By.id("txtSenha")).sendKeys("vf260616@");
        Thread.sleep(1000);
       evidencias.print(driver,dataHora,casoDeTeste,"Passo 1 - inserir dados");

        driver.findElement(By.id("btnEntrar")).click();
//Validar nome do Usuáio
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("idNomeUsuario"))));    // Validar campos
        assertTrue(driver.findElement(By.id("idNomeUsuario")).isDisplayed());
        evidencias.print(driver,dataHora,casoDeTeste,"Passo 2 - Logon com Sucesso");
//acessando Batidas Impares
driver.findElement(By.xpath("//body/div[4]/section[1]/div[16]" +
                                                "/div[2]/ul[1]/li[1]/span[3]/a[1]")).click();
//Editando Jornada
driver.findElement(By.xpath("//body/div[4]/section[1]/div[3]" +
        "/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/i[1]")).click();
driver.findElement(By.xpath("//body/div[4]/section[1]/div[3]" +
        "/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
Thread.sleep(3000);
// + Adicionar Hora
    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/section[1]/div[3]/section[1]" +
            "/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/span[2]")).click();
    driver.findElement(By.xpath("/html[1]/body[1]/div[4]/section[1]/div[3]/section[1]/div[1]/" +
            "div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/input[1]")).sendKeys("16:41");
        evidencias.print(driver,dataHora,casoDeTeste,"Passo 3 - Batida de Ponto");
    Thread.sleep(1000);






//driver.findElement(By.id("lnkWidgetBaterPonto")).click();
//driver.findElement(By.id("btnIncluirBatidaModalBaterPonto")).click();


    }
        //@Test(priority = 2)
       // public void BaterPonto() {
         //   driver.findElement(By.cssSelector("href[/EspelhoPonto]")).click();
            // driver.findElement(By.cssSelector("href[/EspelhoPonto]")).click();

}

