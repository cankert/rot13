public class rot13TestDrive {
    public static void main(String[] args){

        String wordToEncrypt = "fuchs";

        StringBuilder result = rot13.encrypt(wordToEncrypt);
        System.out.println(result);
    }
}
