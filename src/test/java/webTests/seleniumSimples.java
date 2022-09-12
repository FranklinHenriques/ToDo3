    // Pacote
package webTests;

    // Bibliotecas

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.testng.annotations.Test;

    import java.util.concurrent.TimeUnit;

    import static org.testng.Assert.*;

    // Classe
public class seleniumSimples {

    //Atributos
WebDriver driver;
    // Metodos e Funções

        @Test
        public void ConsultarCarros(){
    // Inicio
System.setProperty("webdriver.chrome.driver", "drivers/chrome/104/chromedriver.exe"); // Aponta para aonde esta o driver
driver = new ChromeDriver(); //Instancia o objeto driver como um controlador do Chrome
            driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

    // Realizar o Teste
            //Abrir site informado
driver.get("https://www.webmotors.com.br/");
            // Realizar Logon
        // 1 Inserir Usúario


     driver.findElement(By.id("searchBar")).sendKeys("Jeep");
        // 2 Inserir Senha
           driver.findElement(By.id("mat-input-1")).click();
            driver.findElement(By.id("mat-input-1")).sendKeys("Senha@123");

        // 3 Clicar em Entrar
            driver.findElement(By.cssSelector("button[type=submit]")).click();

           // WebDriverWait wait = new WebDriverWait(driver, 20);
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button.mat-menu-trigger"))));
//assertTrue(driver.findElement(By.cssSelector("button.mat-menu-trigger")).isDisplayed()); // Validar campos

            //button[class="mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base"]

// Encerrar o Objeto do Selenium... o chrome
    driver.quit();

        }


        public void Logon(){
            // Inicio
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/104/chromedriver.exe"); // Aponta para aonde esta o driver
            driver = new ChromeDriver(); //Instancia o objeto driver como um controlador do Chrome
            driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

            // Realizar o Teste
            //Abrir site informado
            driver.get("https://hml-autenticacao.bancomaster.com.br/login?api=API_PLATAFORMA_VENDAS&idCliente=TthHpc4Vo1qsXTRfKkNiacyQzOoRA56uJi4SctilNjVVdthGqeYxe6qVJKqmmyqK&url=https:%2F%2Fhml-plataforma-vendas.bancomaster.com.br%2Flogin");
            // Realizar Logon
            // 1 Inserir Usúario


            driver.findElement(By.id("mat-input-0")).sendKeys("doliveira");
            // 2 Inserir Senha
            driver.findElement(By.id("mat-input-1")).click();
            driver.findElement(By.id("mat-input-1")).sendKeys("Senha@123");

            // 3 Clicar em Entrar
            driver.findElement(By.cssSelector("button[type=submit]")).click();

            // WebDriverWait wait = new WebDriverWait(driver, 20);
            //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("button.mat-menu-trigger"))));
//assertTrue(driver.findElement(By.cssSelector("button.mat-menu-trigger")).isDisplayed()); // Validar campos

            //button[class="mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base"]

// Encerrar o Objeto do Selenium... o chrome
            driver.quit();

        }

}
