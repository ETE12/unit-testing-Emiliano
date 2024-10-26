import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculatorTest {

    private String ejecutarMainConEntrada(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Calculator.main(new String[0]);

        return out.toString().trim(); 
    }

    @Test
    public void testTraduccionCorrecta() {
        String input = "code\nedoc\n";
        String expectedOutput = "YES";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTraduccionIncorrecta() {
        String input = "abb\naba\n";
        String expectedOutput = "NO";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testTraduccionIncorrectaMismaPalabra() {
        String input = "code\ncode\n";
        String expectedOutput = "NO";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }
}

