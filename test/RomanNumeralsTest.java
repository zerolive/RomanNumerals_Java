
import romannumerals.RomanNumerals;
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralsTest {
    
    public RomanNumeralsTest() {
    }

    @Test
    public void translatesTheNumberOneToI() {
        Integer number = 1;
        RomanNumerals romanNumerals = new RomanNumerals(number);
        
        String translation = romanNumerals.translate();
        
        assertEquals("I", translation);
    }
    
    @Test
    public void translatesTheNumberTwoToII() {
        Integer number = 2;
        RomanNumerals romanNumerals = new RomanNumerals(number);
        
        String translation = romanNumerals.translate();
        
        assertEquals("II", translation);
    }
    
    @Test
    public void translatesTheNumberFourToIV() {
        Integer number = 4;
        RomanNumerals romanNumerals = new RomanNumerals(number);
        
        String translation = romanNumerals.translate();
        
        assertEquals("IV", translation);
    }
    
    @Test
    public void translatesTheNumberFiveToV() {
        Integer number = 5;
        RomanNumerals romanNumerals = new RomanNumerals(number);
        
        String translation = romanNumerals.translate();
        
        assertEquals("V", translation);
    }
    
    @Test
    public void translatesTheNumberSevenToVII() {
        Integer number = 7;
        RomanNumerals romanNumerals = new RomanNumerals(number);
        
        String translation = romanNumerals.translate();
        
        assertEquals("VII", translation);
    }
}
