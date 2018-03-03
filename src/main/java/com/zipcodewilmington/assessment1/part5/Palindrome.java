package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
            int count = 0;
            for (int i = 0; i < input.length(); i++){
                for(int n = i+1; n <= input.length(); n++){
                    StringBuilder sb = new StringBuilder(input.substring(i, n));
                    // get substring of i and i+1 and then reverse it to see if its a palindrome
                    // if so, add to the count
                    if(sb.toString().equalsIgnoreCase(sb.reverse().toString())){
                        count++;
                    }
                }
            }
            return count;
        }
    }

