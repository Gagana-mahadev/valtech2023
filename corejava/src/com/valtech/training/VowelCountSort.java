package com.valtech.training;

public class VowelCountSort {

	public static String[] breakintowords(String sentence) {

		 String[] words = sentence.split(" ");

		 return words;

		

	}

 

	public static int countVowels(String word) {

		  int vowelCount = 0;

		  for (int i = 0; i < word.length(); i++) {

		    char c = word.charAt(i);

		    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

		      vowelCount++;

		    }

		  }

		  return vowelCount;

		}

	

	public static String sort(String sentence) {

		String[] words= breakintowords(sentence);

		int[] vowelCount = new int[words.length];

		int len = words.length;

	    for (int i = 0; i < len; i++) {

	      vowelCount[i] = countVowels(words[i]);

	    }

	    for (int i = 0; i < words.length - 1; i++) {

	        int minIndex = i; // assume the ith element is the minimum

	        for (int j = i + 1; j < words.length; j++) {

	          if (vowelCount[j] < vowelCount[minIndex]) {

	            minIndex = j; // update the minimum index if a smaller element is found

	          }

	        }

	        // swap the elements in both arrays at the ith and minIndex positions

	        int temp = vowelCount[i];

	        vowelCount[i] = vowelCount[minIndex];

	        vowelCount[minIndex] = temp;

	        

	        String tempWord = words[i];

	        words[i] = words[minIndex];

	        words[minIndex] = tempWord;

	      }

	      // join the sorted words array into a new sentence with spaces

	      String sortedSentence = String.join(" ", words);

	      // return the sorted sentence as the output

	      return sortedSentence;

	    }

	  

	

	

		

	    

	

public static void main(String[] args) {

	String sentence ="hello how are you";

	 System.out.println(sort(sentence));

}	

}

 