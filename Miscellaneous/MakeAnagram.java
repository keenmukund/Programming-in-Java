import java.util.*;
import java.io.*;

public class MakeAnagram {
/* Given two strings S1 and S2 consisting of only lowercase characters whose anagrams are almost equal. 
  The task is to count the number of characters which needs to be edited(delete) to make S1 equal to S2.
 */
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first  string");
		String s1 = sc.next();
		System.out.println("Enter second string");
		String s2 = sc.next();
		
		MakeAnagram obj = new MakeAnagram();
		System.out.println(obj.countChars(s1, s2));
	}
	public int countChars(String s1, String s2) {
		 int[] arr = new int[26];
		 int sum = 0;
		 int len2 = s2.length();
		 int len1 = s1.length();

		 for (int i = 0; i < len1; i++){
		 arr[ s1.charAt(i) - 'a']++;
		 }

		 for (int j = 0; j < len2; j++){
		 arr[ s2.charAt(j) - 'a']--;
		 }

		 for (int v = 0; v <26; v++){
		 sum += Math.abs(arr[v]); 
		 }

		 return sum;
		
	}
}
