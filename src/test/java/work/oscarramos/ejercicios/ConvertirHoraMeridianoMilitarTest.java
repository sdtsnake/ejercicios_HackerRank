package work.oscarramos.ejercicios;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static work.oscarramos.ejercicios.ConvertirHoraMeridianoMilitar.*;

import java.text.ParseException;
import java.util.stream.Stream;

class ConvertirHoraMeridianoMilitarTest {

    @ParameterizedTest
    @MethodSource
    void convertirForma1Test(String hora,String resultado) {

        assertEquals(resultado,convertirForma1(hora));

    }

    private static Stream<Arguments> convertirForma1Test() {
        return Stream.of(
                Arguments.of("12:45:01AM","00:45:01"),
                Arguments.of("12:30:45PM", "12:30:45"),
                Arguments.of("02:50:02PM","14:50:02"),
                Arguments.of("10:52:01AM","10:52:01")
        );
    }

    @ParameterizedTest
    @MethodSource
    void convertirUsandoFormatosTest(String hora, String resultado) throws ParseException {

        assertEquals(resultado, convertirUsandoFormatos(hora));

    }

    private static Stream<Arguments> convertirUsandoFormatosTest() {
        return Stream.of(
                Arguments.of("12:45:01AM","00:45:01"),
                Arguments.of("12:30:45PM", "12:30:45"),
                Arguments.of("02:50:02PM","14:50:02"),
                Arguments.of("10:52:01AM","10:52:01")
        );
    }

    @ParameterizedTest
    @MethodSource
    void convertirUsandoExpresionesRegularesTest(String hora, String resultado) {

        assertEquals(resultado, convertirUsandoExpresionesRegulares(hora));

    }

    private static Stream<Arguments> convertirUsandoExpresionesRegularesTest() {
        return Stream.of(
                Arguments.of("12:45:01AM","00:45:01"),
                Arguments.of("12:30:45PM", "12:30:45"),
                Arguments.of("02:50:02PM","14:50:02"),
                Arguments.of("10:52:01AM","10:52:01")
        );
    }

}