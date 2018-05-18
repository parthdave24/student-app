package com.springboot.student.other;

import java.util.ArrayList;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arrayOfZeroesAndOne = {0,1,1,0,1,0,1,0,1,1,1,1,1};
		ArrayList<Integer> expectedSortedArray = new ArrayList<>();
		int i=0;
		for(i=0;i<arrayOfZeroesAndOne.length;i++)
		{
			if(arrayOfZeroesAndOne[i]==0)
				expectedSortedArray.add(0,0);
			else
				expectedSortedArray.add(expectedSortedArray.size(),1);
		}
		System.out.println("Sorted Array is: " + expectedSortedArray);
	}

}
