package work.oscarramos.ejercicios;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static work.oscarramos.ejercicios.RedondeoCalificaciones.gradingStudents;

class RedondeoCalificacionesTest {

    @ParameterizedTest
    @MethodSource
    void gradingStudentsTest(List<Integer> numeros, List<Integer> resultados) {
        assertEquals(resultados,gradingStudents(numeros));
    }

    private static Object[][] gradingStudentsTest() {
        return new Object[][]{
                {new ArrayList<>(Arrays.asList(73, 67, 38, 33)), new ArrayList<>(Arrays.asList(75, 67, 40, 33))},
                {new ArrayList<>(Arrays.asList(85, 95, 21, 0, 18, 100, 18, 62, 30, 61, 55, 0, 45, 2, 29, 55, 61, 40, 14, 4, 29, 100, 37, 23, 46, 9, 80, 62, 20, 40, 51, 100, 60, 47, 4, 86, 61, 70, 17, 45, 6, 1, 95, 95)),
                 new ArrayList<>(Arrays.asList(85, 95, 21, 0, 18, 100, 18, 62, 30, 61, 55, 0, 45, 2, 29, 55, 61, 40, 14, 4, 29, 100, 37, 23, 46, 9, 80, 62, 20, 40, 51, 100, 60, 47, 4, 86, 61, 70, 17, 45, 6, 1, 95, 95))}
        };
    }





}