package parameterizedTests_PracticeExercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTests {

//  Vowel Count Test

    @ParameterizedTest
    @CsvSource({"4,RishAbh nOhwaL","0,MYTH","10,aeiouAEIOU","5,you okay bruh"})
    void givenInputStringThenReturnVowelCount(String s1, String input){
        int count = Integer.parseInt(s1);
        assertEquals(count,StringManipulation.vowelCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroVowelCount(String input){
        assertEquals(0,StringManipulation.vowelCount(input));
    }

//    Character Count Tests

    @ParameterizedTest
    @CsvSource({"10,water is dry", "9,no It is not", "0,     ", "6,yeehaw"})
    void givenInputStringThenReturnCharacterCount(String s1, String input){
        int count = Integer.parseInt(s1);
        assertEquals(count,StringManipulation.characterCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroCharacterCount(String input){
        assertEquals(0,StringManipulation.characterCount(input));
    }
}