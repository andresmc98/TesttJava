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
            //actual value
            int current = roman.get(symbol.charAt(i));

            if ( i + 1 < symbol.length()){
                //check next value
                int next = roman.get(symbol.charAt(i+1));
                if(current >= next){
                    //add
                    number += current;
                }else{
                    //substract
                    number -= current;
                }
            }else{
                //add the next one
                number += current;
            }
        }
        return number;
    };


    public static void main(String[] args) {
        int exRoman = romanToNumber("CCCIX");

        System.out.println(exRoman);

    }
    //how to handle compose numbers 9 IX
    //Method romantoNumber return int
    //Loop for read the number

    //Main method for the user to interact
    //Text like what is happening
    //Scanner nextline / What if ts a number? exceptions
}
