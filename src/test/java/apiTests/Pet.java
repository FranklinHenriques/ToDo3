package apiTests;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class Pet {
    // Given = Dado
    // When = Quando
    //Then = Então

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));

    }

    @Test
    public void incluirPet() throws IOException {

String jsonBody = lerJson("src/test/resources/data/pet.json");

given()

        .contentType("application/json")                  // Tipo de conteúdo
        .log().all()                                      // Registar tudo de envio
        .body(jsonBody)
.when()
        .post("https://petstore.swagger.io/v2/pet") // Comando + endpoint
.then()
        .log().all()                                     // Registrar tudo da volta
        .statusCode(200)                 // Valida Código do estado Nativo
      //  .body("code", is(200))                        // Valida Cógido do estado Json
        .body("id",is(2001))                 // Valida id do Animal
        .body("name",is("doggie"))           //Valida nome do animal
        .body("category.name", is("dog"))    // Valida categoria do animal
;


    }

}
