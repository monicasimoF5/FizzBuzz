import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {

    @Test
    @DisplayName("Test si el número es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_thenReturnFizz(){
        //Given "dado"
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = fizzbuzz.checkNumber(9);
        //Then "entonces"
        assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz(){
        //Given "dado"
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = fizzbuzz.checkNumber(10);
        //Then "entonces"
        assertEquals("Buzz",result);
    }

    @Test
    @DisplayName("Test si el número es divisible por 3 y por 5")
    void test_whenTheNumberIsDivisibleByThreeAndFive_thenReturnFizzBuzz(){
        //Given "dado"
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = fizzbuzz.checkNumber(15);
        //Then "entonces"
        assertEquals("FizzBuzz",result);
    }

    @Test
    @DisplayName("Test si el número no es divisible ni por 3 ni por 5")
    void test_whenTheNumberNotIsDivisibleByThreeOrFive_thenReturnNumber(){
        //Given "dado"
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When "cuando"
        String result = fizzbuzz.checkNumber(14);
        //Then "entonces"
        assertEquals("14", result);
    }



}
