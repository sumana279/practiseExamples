import java.util.HashSet;
import java.util.Set;

/**
 * Created by svishnu on 6/21/16.
 */
public class Solution {
    public static Set<Character> vowels() {
        Set<Character> vowels = new HashSet<>();
        for (Character character: "AEIOUaeiou".toCharArray()) {
            vowels.add(character);
        }
        return vowels;
    }
    public String reverseVowels(String s){

        char temp = 0;
        int pos1 = 0, pos2 = 0;
        char[] toChar = s.toCharArray();
        for (int i = 0; i < toChar.length; i++) {
            if (vowels().contains(toChar[i])) {
                if (temp == 0 || temp == toChar[i]) {
                    pos1 = i;
                    temp = toChar[i];
                } else if((temp != Character.toUpperCase(toChar[i]) && temp != Character.toLowerCase(toChar[i]))) {
                    pos2 = i;
                    toChar[pos1] = toChar[i];
                    toChar[pos2] = temp;
                }
            }


        }

        return new String(toChar);

    }
    }

