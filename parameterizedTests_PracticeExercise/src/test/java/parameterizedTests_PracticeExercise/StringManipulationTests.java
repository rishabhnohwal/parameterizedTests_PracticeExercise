package parameterizedTests_PracticeExercise;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTests {

//  Vowel Count Test

    @ParameterizedTest
    @CsvSource({"4,gear bear","0,gym","10,aeiouAEIOU","3,vowel words"})
    void givenInputStringThenReturnVowelCount(int count, String input){
        assertEquals(count,StringManipulation.vowelCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroVowelCount(String input){
        assertEquals(0,StringManipulation.vowelCount(input));
    }

//    Character Count Tests

    @ParameterizedTest
    @CsvSource({"13,welcome to java", "5,hello", "0,     ", "11,string input"})
    void givenInputStringThenReturnCharacterCount(int count, String input){
        assertEquals(count,StringManipulation.characterCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroCharacterCount(String input){
        assertEquals(0,StringManipulation.characterCount(input));
    }
}