package com.sz.college.util;

import java.text.NumberFormat;
import java.util.Locale;

public class Xsdpp {
	/**
	 * @author：相似度转百分比
	 * @date : 2017年3月1日下午1:31:53
	 */
	public static String similarityResult(double resule) {
		return NumberFormat.getPercentInstance(new Locale("en ", "US "))
				.format(resule);
	}
	/**
	 * @author：计算相似度小数
	 * @date : 2017年3月1日下午1:31:30
	 */
	public static double SimilarDegree(String strA, String strB) {
		String newStrA = removeSign(strA);
		String newStrB = removeSign(strB);
		System.out.println("去干扰符号之后的a字符串--->"+newStrA);
		System.out.println("去干扰符号之后的b字符串--->"+newStrB);
		int temp = Math.max(newStrA.length(), newStrB.length());
		int temp2 = longestCommonSubstring(newStrA, newStrB).length();
		return temp2 * 1.0 / temp;
	}
	/**
	 * @author：移除字符串的干扰字符，保留有效字符
	 * @date : 2017年3月1日下午1:38:28
	 */
	private static String removeSign(String str) {
		StringBuffer sb = new StringBuffer();
		for (char item : str.toCharArray())
			if (charReg(item)) {
				sb.append(item);
			}
		return sb.toString();
	}
	/**
	 * @author：判断是否是有效字符
	 * @date : 2017年3月1日下午1:25:38
	 */
	private static boolean charReg(char charValue) {
		return (charValue >= 0x4E00 && charValue <= 0X9FA5)
				|| (charValue >= 'a' && charValue <= 'z')
				|| (charValue >= 'A' && charValue <= 'Z')
				|| (charValue >= '0' && charValue <= '9');
	}
	/**
	 * @author：获取两个字符串的相似字符
	 * @date : 2017年3月1日下午1:44:15
	 */
	private static String longestCommonSubstring(String strA, String strB) {
		char[] chars_strA = strA.toCharArray();
		char[] chars_strB = strB.toCharArray();
		int m = chars_strA.length;
		int n = chars_strB.length;
		int[][] matrix = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (chars_strA[i - 1] == chars_strB[j - 1])
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				else
					matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
			}
		}
		char[] result = new char[matrix[m][n]];
		int currentIndex = result.length - 1;
		while (matrix[m][n] != 0) {
			if (matrix[n] == matrix[n - 1])
				n--;
			else if (matrix[m][n] == matrix[m - 1][n])
				m--;
			else {
				result[currentIndex] = chars_strA[m - 1];
				currentIndex--;
				n--;
				m--;
			}
		}
		System.out.println("相同的字符--->"+new String(result));
		return new String(result);
	}
}
