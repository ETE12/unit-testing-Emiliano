import org.junit.Test;
import static org.junit.Assert.assertEquals;
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
    public void testCadenasIguales() {
        String input = "aaaa\naaaA\n";
        String expectedOutput = "0";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrimeraMenor() {
        String input = "abs\nAbz\n";
        String expectedOutput = "-1";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testPrimeraMayor() {
        String input = "abcdefg\nAbCdEfF\n";
        String expectedOutput = "1";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
