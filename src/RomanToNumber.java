import java.util.LinkedHashMap;

public class RomanToNumber {

    // Map Romans simbol - > Number hashmap?
    //example L > 50
    //example LIX > 59
    public static LinkedHashMap<Character, Integer> roman = new LinkedHashMap();

    static{
        roman.put('C',100);
        roman.put('L',50);
        roman.put('X',10);
        roman.put('V',5);
        roman.put('I',1);
    }

    public static int romanToNumber(String symbol){
        int number = 0;

        for(int i = 0; i < symbol.length(); i++){

            number += roman.get(symbol.charAt(i));

        }

        return number;
    };


    public static void main(String[] args) {
        int exRoman = romanToNumber("LIX");

        System.out.println(exRoman);

    }
    //how to handle compose numbers 9 IX
    //Method romantoNumber return int
    //Loop for read the number

    //Main method for the user to interact
    //Text like what is happening
    //Scanner nextline / What if ts a number? exceptions
}
