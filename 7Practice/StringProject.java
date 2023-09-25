public class StringProject {
    private String myString;
    public StringProject (String str) {
        myString = str;
    }
    public String toString() {
        return myString;
    }
    public void reverseCase() {
        String reversed = myString;
        System.out.print("String with reversed characters: ");
        for(int i = 0; i < myString.length(); i++){
            char check = myString.charAt(i);
            if(Character.isUpperCase(check)){
                char checkL = Character.toLowerCase(check);
                System.out.print(checkL);
            } else {
                char checkU = Character.toUpperCase(check);
                reversed.replace(reversed.charAt(i), checkU);
                System.out.print(checkU);
            }
        }
        System.out.print("\n");
    }
    public int characterCount(char character){
        int center = character;
        int numOf = 0;
        String str = myString;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == center){
                numOf++;
            }
        }
        return numOf;
    }
    public void reverseString(){
        String str = myString;
        System.out.print("String reversed: ");
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.print("\n");
    }
    public String eachWordOnALine(){
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            if(Character.isWhitespace(myString.charAt(i)) == false){
                str += myString.charAt(i);
            }
            if(Character.isWhitespace(myString.charAt(i))){
                str += "\n";
            }
        }
        return str;
    }
    public String wordCount(){
        String str = myString;
        int temp = 0;
        for(int i = 0; i < myString.length(); i++){
            if(Character.isWhitespace(myString.charAt(i)) || myString.charAt(i) == '.' && i == myString.length() - 1){
                temp++;
            }
        }
        str = Integer.toString(temp);
        return str;
    }
    public String characterCount(){
        String str = myString;
        int temp = 0;
        for(int i = 0; i < myString.length(); i++){
            if(Character.isWhitespace(myString.charAt(i)) == false){
                temp++;
            }
        }
        str = Integer.toString(temp);
        return str;
    }
    public String avgWordLength(){
        String str = myString;
        int numOfWords = Integer.parseInt(wordCount());
        int[] wordList = new int[numOfWords];
        int temp = 0;
        int placement = 0;
        double avg = 0;
        for(int i = 0; i < myString.length(); i++){
            if(Character.isWhitespace(myString.charAt(i)) == false){
                temp++;
            }
            if(Character.isWhitespace(myString.charAt(i)) || myString.charAt(i) == '.' && i == myString.length() - 1){
                wordList[placement] = temp;
                placement ++;
                temp = 0;
            }
        }
        for(int i = 0; i < numOfWords; i++){
            avg += wordList[i];
        }
        str = Double.toString((double)avg / numOfWords);
        return str;
    }
    public String vowelCount(){
        char check;
        boolean isVowel = false;
        int vowels = 0;
        for(int i = 0; i < myString.length(); i++){
            check = myString.charAt(i);
            switch(check){
                case 'a':
                    isVowel = true;
                    break;
                case 'e':
                    isVowel = true;
                    break;
                case 'i':
                    isVowel = true;
                    break;
                case 'o':
                    isVowel = true;
                    break;
                case 'u':
                    isVowel = true;
                    break;
                default:
                    isVowel = false;
                    break;
            }
            if(isVowel){
                vowels++;
            }
        }
        return Integer.toString(vowels);
    }
    public String substrCount(char check){
        int count = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == check){
                count ++;
            }
        }
        return Integer.toString(count);
    }
    public boolean isPalindrome(){
        String check = myString;
        boolean well = false;
        String fitted = "";
        for(int i = 0; i < check.length(); i++){
            if(Character.isLetter(check.charAt(i))){
                fitted += Character.toUpperCase(myString.charAt(i));
            }
        }
        for(int i = 0; i < fitted.length(); i++){
            if(fitted.charAt(i) == fitted.charAt((fitted.length() - i) - 1)){
                well = true;
            } else {
                well = false;
                break;
            }
        }
        return well;
    }
}