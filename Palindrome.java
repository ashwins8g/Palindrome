public class NumberPalindrome {

    public static boolean isPalindrome(int inputNumber) {

        String stringToInt = Integer.toString(Math.abs(inputNumber));

        StringBuilder reversedString = new StringBuilder(stringToInt);

        reversedString.reverse();

        if (stringToInt.equals(reversedString.toString())) {

            return true;
        }

        return false;
    
}

}