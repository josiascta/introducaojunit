package testeunitario.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExemploServiceTest {
    
    @Test
    void testeSomarValorVerificarSeIgualENaoIgual(){

        //configurar
        ExemploService exemploService = new ExemploService();
        int resultadoEsperado = 6;

        //executar
        int resultadoReal = exemploService.somaValores(2, 4);

        //verificar
        Assertions.assertEquals(resultadoEsperado, resultadoReal, "2 + 4 deve ser 6");
        
    }
}
