package parameterizedTests_PracticeExercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTests {

//    add Sum test

    @ParameterizedTest
    @CsvSource({"3,4,7","0,0,0","8,-4,4","-6,-4,-10","0,27,27","-1,0,-1",})
    void givenIntegersThenCheckSum(String s1, String s2, String res){
        int a= Integer.parseInt(s1);
        int b= Integer.parseInt(s2);
        int sum= Integer.parseInt(res);
        assertEquals(sum,Calculate.addSum(a,b));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,8,-20,102})
    void givenEvenIntegerThenReturnTrue(int ints){
        assertTrue(Calculate.isEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,-3,9,7,-21,63})
    void givenOddIntegersThenReturnFalse(int ints){
        assertFalse(Calculate.isEven(ints));
    }
}