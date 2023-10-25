package com.valtech.training;

import java.util.Comparator;

public class StringSorting {
	
	public static void main(String[] args) {
		String s= "Hello how are you";
		StringSorting ss= new StringSorting();
		System.out.println(ss.breakString(s));
		//System.out.println(ss.sort(words));
	}



	public String[] breakString(String s) {
	  String[] words = s.split(" ");
	  for(String word: words) {
		  int vowelCount = countVowels(word);
		  System.out.println("Word: "+word+ " Vowel count: " +vowelCount);
	}
	  return words;
	  
	  
	}
	
	public  int countVowels(String word) {
		int count =0;
		word = word.toLowerCase();
		 for (int i = 0; i < word.length(); i++) {
			 char ch = word.charAt(i);
			 if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u') {
				 count++;
			 }
		 }
			return count;
		}
	
	
	}
