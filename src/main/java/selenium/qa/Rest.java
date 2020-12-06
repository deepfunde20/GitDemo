package selenium.qa;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Collections;

public class Rest {


	public static void main(String[] args) {
			swap(20, 40);
	}
	
	
	static void findNumber() {
		int a [] = {2,4,7,8,1,3,6,5};
		
		int Index = 0;
		int pivot = a.length;
		
		for (int i =0; i<a.length; i++) {
			
			if (a[i]<=a[a.length]) {
				swap(a[i],a[Index]);
				Index++;
			}
		}
		swap(a[Index],a[a.length]);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
<<<<<<< HEAD
=======
			
>>>>>>> myfirstbranch
		
		}
	}
	
	
	
	static void swap(int first , int second) {
		
		int temp = first;
		
		first = second;
		
		second = temp;
		
		System.out.println(first+ " this " + second);
	}
	
	
	
	
	void InterpolationSearch() {

		int uni [] = {2,4,6,8,10,12,14,16,18,20,22};
		
		int l=0;
		
		int h = uni.length-1;
		
		int x = 6;
		
	while (l<h) {
		
		int temp =  l + ((x - uni[l])* (h-l)/(uni[h]-uni[l])) ;
		
		System.out.println(temp);
		
		if (uni[temp]==x) {
			System.out.println("This is the index of the number " + temp);
			break;
		}
		
		else if (uni[temp]<x) {
			
			l=temp+1;
		}
		
		else {
			h=temp-1;
		}
		
	}
	}
	
	void BinarySearch() {
		 int l=0 , m ,h;
		 
		 
			
			int arr[]= {12,25,26,35,45,87,96,112,145};
			h=arr.length-1;
			
			m= (l+h)/2;
			
			
			int x = 145;
			
			while(l<=h) {
			if (arr[m]==x) {
				System.out.println("The index of the given item is " + m);
				break;
			}
			
			else if (arr[m]<x) {
				l=m+1;
				
			}
			
			
				else if (arr[m]>x) {
					h=m-1;
					
			}
			m=(l+h)/2;
			}
			
			if(l>h) {
				System.out.println("The item is not there");
			}
	}
	
	
	
	
	
	
	
	
	
	
	void linerSearch ()
	{
int arr[] = {20,12,45,78,65,78,22};
		
		int x = 22;
		
		int index = 0;
		
		boolean flag= false;
		
		for (int i=0;i<=arr.length-1; i++) {
			
			if(arr[i]==x) {
			
				flag = true;
				
				index=i;
				break;
			}
			
		}
		
		if(flag==true) {
			System.out.println("The index of the x is " +index);
		}
		else {
			System.out.println("The numvber do not exist :(");
		}
		
	}
}
