package com.demo.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 5, 6, 8 };

		int[] nums2 = { 1, 2, 3, 5, 6, 8 };

		int[] nums3 = { 4, 2, 6, 8, 10, 18 };

		int index = Arrays.binarySearch(nums1, 5);
		
		System.out.println("Element found  at "+index);
		
		System.out.println(Arrays.equals(nums1, nums2));
		
		System.out.println(Arrays.equals(nums1, nums3));
		
		Arrays.sort(nums3);
		
		System.out.println(Arrays.toString(nums3));
		
		int [] nums4=Arrays.copyOf(nums3, nums3.length+2);
		
		System.out.println(Arrays.toString(nums4));
		
		
		Integer[] nums5= {1,3,5,6,8,9};
		
		Arrays.sort(nums5,new MyArraySorter());
		
		System.out.println(Arrays.toString(nums5));
		
		
		System.out.println(Arrays.compare(nums1, nums2));
		
		System.out.println(Arrays.compare(nums1, nums3));
		
		int[] nums6 = { 1, 2, 3, 5, 6, 8 };
		
	Arrays.fill(nums6, 10);
	
	System.out.println(Arrays.toString(nums6));
	}
	
}

class MyArraySorter implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	
}