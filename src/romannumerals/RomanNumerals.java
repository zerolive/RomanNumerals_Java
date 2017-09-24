
package romannumerals;

public class RomanNumerals {
    
    String I = "I";
    String IV = "IV";
    String V = "V";
    Integer number;
    String translation = "";

    public RomanNumerals(Integer number) {
        this.number = number;
    }
    
    public String translate() {
        while (canBeTranslated()) {
            translating(this.I, 0, 4, 1);
            translating(this.IV, 3, 5, 4);
            translating(this.V, 4, 10, 5);
        }
        
        return this.translation;
    }
    
    private Boolean canBeTranslated() {
        return this.number > 0;
    }
    
    private void translating(String translation, Integer minimum, Integer maximum, Integer rest) {
        if (isFit(minimum, maximum)) {
            add(translation);
            prepareNumber(rest);          
        }        
    }
    
    private Boolean isFit(Integer minimum, Integer maximum) {
        return (this.number > minimum && this.number < maximum);
    }
    
    private void add(String translation) {
        this.translation += translation;
    }
    
    private void prepareNumber(Integer rest) {
        this.number -= rest;
    }
    
}
