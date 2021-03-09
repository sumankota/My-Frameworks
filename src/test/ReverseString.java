package test;

import java.util.StringTokenizer;

public class ReverseString {
	public static void main(String l[]) {
		String reverseTxt = "Hi this is suman";
		System.out.print(reverseTxt);	
		StringTokenizer ss = new StringTokenizer(reverseTxt, " ");
		System.out.println(" ");	
		while(ss.hasMoreElements()) {
		//System.out.println("Sample::"+ss.nextToken());
		StringBuilder sb = new StringBuilder(ss.nextToken());
		System.out.print(sb.reverse()+" ");		
		}
	}

}
