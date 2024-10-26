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
    public void testCaso1() {
        String input = "4\n4 1 2 10\n";
        String expectedOutput = "12 5";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCaso2() {
        String input = "7\n1 2 3 4 5 6 7\n";
        String expectedOutput = "16 12";
        String actualOutput = ejecutarMainConEntrada(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
