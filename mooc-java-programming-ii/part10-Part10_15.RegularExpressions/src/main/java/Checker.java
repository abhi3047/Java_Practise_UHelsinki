

public class Checker {

    public boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }

    public boolean allVowels(String string){
        if(string.matches("(a|e|i|o|u)+")){
            return true;

        }
        return false;
    }

    public boolean timeOfDay(String string){
        if(string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            String array1[]= string.split(":");
            if((Integer.valueOf(array1[0]) <= 23) && (Integer.valueOf(array1[1]) <= 59) &&
                    (Integer.valueOf(array1[2]) <= 59)){
                return true;
            }

        }
        return false;
    }

}
