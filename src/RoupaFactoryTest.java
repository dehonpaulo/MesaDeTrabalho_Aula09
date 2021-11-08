import model.Roupa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoupaFactoryTest {
    RoupaFactory factory;
    Roupa calca1;
    Roupa calca2;
    Roupa calca3;
    Roupa calca4;
    Roupa calca5;
    Roupa camisa1;
    Roupa camisa2;

    @BeforeEach
    void inicializar() {
        factory = new RoupaFactory();

        calca1 = factory.buscarRoupa("XS", "Calca", true, false);
        calca2 = factory.buscarRoupa("S", "Calca", false, true);
        calca3 = factory.buscarRoupa("M", "Calca", true, true);
        calca4 = factory.buscarRoupa("M", "Calca", false, false);
        calca5 = factory.buscarRoupa("XS", "Calca", true, true);
        camisa1 = factory.buscarRoupa("S", "Camisa", true, true);
        camisa2 = factory.buscarRoupa("M", "Camisa", true, false);
    }

    @Test
    void buscarRoupaTest() {
        Assertions.assertEquals("Camisa", factory.buscarRoupa("XS", "Camisa", false, false).getTipo());
    }

    @Test
    void tamanhoDaFabricaTest() {
        Assertions.assertEquals(2, factory.getTamanhoDaFabrica());
    }
}
