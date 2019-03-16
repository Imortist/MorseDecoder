import org.junit.Test;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    private static void test(final String expected, final String input) {
        assertEquals("For input \"" + input + '"', expected, MorseCodeDecoder.findChildren(input));
    }

    @Test
    public void basicTests() {
        test("AaBb", "abBA");
        test("AaaaaaZzzz", "AaaaaZazzz");
        test("AaBbbCcc", "CbcBcbaA");
        test("FfUuuuXx", "xXfuUuuF");
        test("", "");
    }

}