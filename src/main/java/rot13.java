import java.util.ArrayList;
import java.util.Arrays;

public class rot13 {
    public static StringBuilder encrypt(String wordToEncrypt) {
        //char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> abc = new ArrayList<Character>();
        abc.addAll(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        // Convert Ö,Ü
        StringBuilder resultString = new StringBuilder();

        for(int i = 0; i < wordToEncrypt.length(); i++){
            char character = wordToEncrypt.charAt(i);
            int index = abc.indexOf(character);
            //System.out.print(index + " ");

            if(index+13 <= 25){
                index= index + 13;
            } else {
                index = index - 13;
            }
            String characterToAppend = abc.get(index).toString();
            resultString.append(characterToAppend);

        }
        return resultString;
    }
}
