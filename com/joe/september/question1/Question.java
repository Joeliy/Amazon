package com.joe.september.question1;

import java.util.Arrays;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(combination(1, 2));
		System.out.println(maxAccumulative(arr));
	}
	
	public static int maxAccumulative(int[] arr){
		int length=arr.length;
		int[] tmp = new int[length];
		System.arraycopy(arr, 0, tmp, 0, length);
		Arrays.sort(tmp);
		
		int result =0;
		int i=0;
		while(i<length/2){
			result+=(tmp[2*i]+tmp[2*i+1])*combination(i, length-1);
			i++;
		}
		if(length%2==1)
			result+=tmp[length-1]*combination((length-1)/2,length-1);
		
		return result;
	}
	
	public static int combination(int m,int n){
		if(m==0)
			return 1;
		
		int a=1,b=1;
		for(int i=0;i<m;i++){
			a*=(n-i);
		}
		
		for(int i=1;i<=m;i++){
			b*=i;
		}
		
		return a/b;
	}
}
