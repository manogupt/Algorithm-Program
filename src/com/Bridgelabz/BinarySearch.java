package com.Bridgelabz;

import java.util.Arrays;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
	    String[] words = {"Arun", "Pankaj", "Chetak", "Rush", "Maya" };
	    Arrays.sort(words);
	    System.out.println(Arrays.toString(words));

	    int index, left=0;

	    int right = words.length-1;
	    while (true)
	    {
	        int mid = (left+right) / 2;
	        if (words[mid].compareTo("Arun") == 0){
	            System.out.println("Index of your word Arun is : "+mid);
	            break;
	        }else if (words[mid].compareTo("Arun") > 0){
	            System.out.println("Index of your word Arun is : " + (mid-1));
	            break;
	        }
	        else{
	            System.out.println("Index of your word Arun is : "+(mid+1));
	            break;
	        }
	    }
     }
}