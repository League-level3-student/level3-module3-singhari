package _00_Intro_To_String_Methods;

import java.util.Base64;

/*
 * Visit the JavaDocs for the String class to view everything you can do with a String.
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html
 *
 * HINT:  Here are some String methods you might find useful 
 * contains
 * replace
 * trim
 * length
 * getBytes
 * endsWith
 * split 
 * indexOf
 * lastIndexOf
 * compareTo(IgnoreCase)
 * substring
 * toUpperCase/toLowerCase
 * valueOf
 *
 * Here are some Character methods you might find useful:
 * Character.toLowerCase(char c);
 * Character.toUpperCase(char c);
 * Character.isLetter(char c);
 * Character.isDigit(char c);
 * Character.getNumericValue(char c);
 */

public class _01_StringMethods {

    // Given Strings s1 and s2, return the longer String
    public static String longerString(String s1, String s2) {
    	
    	char[] s1Chars = s1.toCharArray();
    	char[] s2Chars = s2.toCharArray();
    	if(s1Chars.length > s2Chars.length) {
            return s1;
    	}
    	else if(s1Chars.length < s2Chars.length) {
    		return s2;
    	}
    	else {
    		return "equal";
    	}
    }

    // If String s contains the word "underscores", change all of the spaces
    // to underscores
    public static String formatSpaces(String s) {
        return s.replace('_', ' ');
    }

    // Return the name of the person whose LAST name would appear first if they
    // were in alphabetical order.
    // You cannot assume there are no extra spaces around the name, but you can
    // assume there is only one space between the first and last name
    public static String lineLeader(String s1, String s2, String s3) {
    
    	String p1 = s1.trim();
    	String p2 = s2.trim();
    	String p3 = s3.trim();
    	char lastLetter1 = p1.charAt(p1.length()-1);
    	char lastLetter2 = p2.charAt(p2.length()-1);
    	char lastLetter3 = p3.charAt(p3.length()-1);
    	int p1num = (lastLetter1);
    	int p2num = (lastLetter2);
    	int p3num = (lastLetter3);
    	String least = p2;
    	if(p1num < p2num && p2num < p3num) {
    		least = p1;
    	}
    	else if(p3num < p1num && p1num < p2num) {
    		least = p3;
    	}
    	else {
    		least = p2;
    	}
    	
        return least;
    }

    // Return the sum of all numerical digits in the String
    public static int numeralSum(String s) {
    	int sum =0; 
    	char[] Chars = s.toCharArray();
    	for(int i = 0; i < Chars.length; i++) {
    		if(Character.isDigit(Chars[i])) {
    			sum+=Integer.parseInt(Chars[i]+"");
    		}
    	}

        return sum;
    }

    // Return the number of times String substring appears in String s
    public static int substringCount(String s, String substring) {
        return 0;
    }

    // Call Utilities.encrypt at the bottom of this file to encrypt String s
    public static String encrypt(String s, char key) {
        return null;
    }

    // Call Utilities.decrypt at the bottom of this file to decrypt the
    // cyphertext (encrypted text)
    public static String decrypt(String s, char key) {
        return null;
    }

    // Return the number of words in String s that end with String substring
    // You can assume there are no punctuation marks between words
    public static int wordsEndsWithSubstring(String s, String substring) {
    	int numberOfWords =0;
        return numberOfWords;
    }

    // Given String s, return the number of characters between the first
    // occurrence of String substring and the final occurrence
    // You can assume that substring will appear at least twice
    public static int distance(String s, String substring) {
        return 0;
    }

    // Return true if String s is a palindrome
    // palindromes are words or phrases are read the same forward as backward.
    // HINT: ignore/remove all punctuation and spaces in the String
    public static boolean palindrome(String s) {
        return true;
    }
}

class Utilities {
    // This basic encryption scheme is called single-byte xor. It takes a
    // single byte and uses exclusive-or on every character in the String.
    public static String encrypt(byte[] plaintext, byte key) {
        for (int i = 0; i < plaintext.length; i++) {
            plaintext[i] = (byte) (plaintext[i] ^ key);
        }
        return Base64.getEncoder().encodeToString(plaintext);
    }

    public static String decrypt(String cyphertext, byte key) {
        byte[] b = Base64.getDecoder().decode(cyphertext);
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (b[i] ^ key);
        }
        return new String(b);
    }
}
