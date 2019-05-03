package stringbig;

import java.util.*;

class StringBig {

    public static String LongestWord(String sen) {
        String string = sen;
        String[] arr = string.split("[^A-Za-z0-9]");
        String maxLength = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() > maxLength.length()) {
                maxLength = arr[j];

            }
        }
        sen = maxLength;
        return sen;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));

        // TODO code application logic here
    }
}
