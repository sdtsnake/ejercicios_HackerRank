package work.oscarramos.ejercicios;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static work.oscarramos.ejercicios.DeterminarManzanasNaranjasCasaSam.countApplesAndOranges;

class DeterminarManzanasNaranjasCasaSamTest {

    @ParameterizedTest
    @MethodSource
    void countApplesAndOrangesTest(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges,String resultado) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        countApplesAndOranges(s,t,a,b,apples,oranges);
        assertEquals(resultado,outContent.toString());

    }

    private static Object[][] countApplesAndOrangesTest() {
        return new Object[][]{
                {7,11,5,15,new ArrayList<>(Arrays.asList(-2,2,1)), new ArrayList<>(Arrays.asList(5,-6)),"1\r\n1\r\n"},
                {2,3,1,5,new ArrayList<>(Arrays.asList(-2)), new ArrayList<>(Arrays.asList(-1)),"0\r\n0\r\n"},
                {2,3,1,5,new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(-2)),"1\r\n1\r\n"}

        };
    }

}