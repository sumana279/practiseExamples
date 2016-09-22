import java.util.Set;

/**
 * Created by svishnu on 6/19/16.
 */
public class ReverseVowels {




    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArray = s.toCharArray();
        Vowels v = new Vowels();
        Set<Character> vowels = v.vowels();
        while (true) {
            System.out.println(s.charAt(j)+ " value0 is for "+ i + " j as " + j);
            while (j > i && !vowels.contains(s.charAt(j))) j--;
            System.out.println(s.charAt(j)+ " value is for charAt(j) "+ i + " j as " + j);
            while (i < j && !vowels.contains(s.charAt(i))) i++;
            System.out.println(s.charAt(i)+ " value2 is for charAt(i)"+ i + " j as " + j);

            if (i >= j) break;
            System.out.println("i " + i + " j"+ j);
            char temp = charArray[j];
            System.out.println("temp "+ temp);
            charArray[j--] = charArray[i];
            charArray[i++] = temp;
        }
        return new String(charArray);
    }
}
