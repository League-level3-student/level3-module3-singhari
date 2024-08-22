package _03_Intro_To_Regular_Expressions;

import java.util.Arrays;

/*
 * Use String.replaceAll() to change the portion of the e-mail addresses after
 * the '@' to mail.com in the original message string below. For example,
 * johnDoe@newmail.com => johnDoe@mail.com
 * janeDoe@wwwmail.com => janeDoe@mail.com
 * 
 * You can assume:
 * 1. There are only word characters (\\w) after the '@' and there will always
 *    be at least 1.
 * 2. The string will always end in ".com" (\\.com)
 */

public class _01_RegularExpressionsIntro {
    /*
     * Code method below! 
     */
    String emailRemover(String message) {
//    	String fixedString= "";
//    	int wheretheAtat = 0; 
//    	char[] emailName = message.toCharArray();
//    	for(int i =0; i<emailName.length; i++) {
//    		if(emailName[i] == '@') {
//    			wheretheAtat = i;
//    		}
//    	}
//    	String trueEmailName = Arrays.copyOfRange(emailName, 0, wheretheAtat+1).toString();
//    	String fullEmail = trueEmailName+"mail.com";
//    	
//    	
//    	
//        return fixedString;
    	String regEx = "[@].+[.]";
    	String desiredEmail = "@mail.";
    	String output = "";
    	output = message.replaceAll(regEx, desiredEmail);
    	System.out.println(output);
    	
    	
    	return output;
    }
}
