package work.oscarramos.ejercicios;

import java.util.ArrayList;
import java.util.List;

/*

HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 40)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer, , the number of students.
Each line  of the  subsequent lines contains a single integer, .

Constraints

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33

 */
public class RedondeoCalificaciones {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> resultado = new ArrayList<>();
        for (int grade : grades) {
            int multiplo5 = grade;
            while (multiplo5 % 5 != 0) {
                multiplo5++;
            }
            if (multiplo5 - grade < 3 && multiplo5>=40) {
                resultado.add(multiplo5);
            } else {
                resultado.add(grade);
            }
        }
        return resultado;
    }
}
