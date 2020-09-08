

public class Checker {
    
    public boolean isDayOfWeek(String string){
        String days = "(mon|tue|wed|thu|fri|sat|sun)";
        return string.matches(days);
    }
    
    public boolean allVowels(String string){
        String regex = "(a|e|i|o|u)*";
        return string.matches(regex);
    }
    
    public boolean timeOfDay(String string){
        String regex = "([0-1][0-9]|[2][0-3])"
                + ":[0-5][0-9]"
                + ":[0-5][0-9]";
        return string.matches(regex);
    }
}
