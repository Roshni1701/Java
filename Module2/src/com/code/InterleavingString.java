package com.code;

import java.util.HashSet;
import java.util.Set;

// W.A.J.P to find all interleaving of given strings. The given strings are: WX YZ The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
public class InterleavingString {
	public static void main(String[] args) {
		String s1 = "WX";
		String s2 = "YZ";

		Set<String> result = new HashSet<>();
		interleave(s1, s2, "", result);

		for (String s : result) {
			System.out.println(s);
		}
	}

	public static void interleave(String s1, String s2, String res, Set<String> result) {
		if (s1.isEmpty() && s2.isEmpty()) {
			result.add(res);
			return;
		}
		if(!s1.isEmpty()) {
			interleave(s1.substring(1), s2, res + s1.charAt(0), result);
		}
		if(!s2.isEmpty()) {
			interleave(s1, s2.substring(1), res + s2.charAt(0), result);
		}
	}
}
