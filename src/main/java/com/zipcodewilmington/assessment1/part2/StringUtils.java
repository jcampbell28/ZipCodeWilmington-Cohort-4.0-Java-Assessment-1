package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array
     * of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String [] arr = sentence.split(" ");
        return arr;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the
     * first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String [] first = sentence.split(" ", 2);
        return first[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the
     * first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String s = StringUtils.getFirstWord(sentence);
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        return s1.reverse().toString();

        }



    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the
     * first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the
     * first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String str = StringUtils.reverseFirstWord(sentence);
        Character firstChar = str.charAt(0);
        String firstCharacter = firstChar.toString().toUpperCase();

        return firstCharacter + str.substring(1);

    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String sub1 = str.substring(0, index);
        String sub2 = str.substring(index+1, str.length());


        return sub1 + sub2;
    }

}
