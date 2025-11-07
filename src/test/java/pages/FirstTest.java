package pages;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest {
    //Если число кратно 3, возвращать 'T'
    //Если число кратно 5, возвращать 'W'
    //Если число кратно и 3, и 5, возвращать 'S'
    //Иначе возвращать "FAIL"

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "S";
        } else if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "W";
        } else return "FAIL";
    }

    @Test
    public void lettertest(){
        String actualResult = trialCode(9);
        assertEquals(actualResult, "T");
    }

    @Test
    public void letterSectest(){
        String actualResult = trialCode(10);
        assertEquals(actualResult, "W");
    }

    @Test
    public void letterThritest(){
        String actualResult = trialCode(15);
        assertEquals(actualResult, "S");
    }

    @Test
    public void letterTritest(){
        String actualResult = trialCode(1);
        assertEquals(actualResult, "FAIL");
    }
}