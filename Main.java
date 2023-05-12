
public class Main{
    

public static Character firstNonRepeated(String string) {
    if (string.isEmpty()) { //Check for an emptey input string
        return (null);
    }
    String s = string.toLowerCase();//Change input string to all lower case letters
    for (int char1 = 0; char1 < s.length(); char1++) {
        if(char1>=s.length()){  //jump out of loop
            break;
        }
        boolean repeat = false;//boolean statment if the character has been repeated
        for (int char2 = 0; char2 < s.length(); char2++) {
            if (char2 != char1 && s.charAt(char1) == s.charAt(char2)) {
                repeat = true;
                break;
            }
        }
        if (!repeat) {//the first character that is not repeated is in the variable repeat
            return s.charAt(char1);
        }
    }
    return null;
}


public static void main(String[] args) {
    System.out.println("The first non repeated letter is:" + firstNonRepeated("hello"));
    System.out.println("The first non repeated letter is:" + firstNonRepeated("helHlo"));
    System.out.println("The first non repeated letter is:" + firstNonRepeated("aabcc")); 
    System.out.println("The first non repeated letter is:" + firstNonRepeated("aabbcc")); 
}

}