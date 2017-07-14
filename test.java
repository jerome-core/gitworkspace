package cn.itsource.crm.web.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		BigDecimal original = new BigDecimal("56");
		String s2 = "2048";
		BigDecimal result = new BigDecimal(0);
		List<String> middleResult = new ArrayList<>();
		for (int i = s2.length()-1,j = 0; i >=0; i--,j++) {
			int currentNum = Integer.valueOf(s2.charAt(i) + "");
			BigDecimal midResult = original.multiply(new BigDecimal(currentNum));
			middleResult.add(midResult.toString());
			midResult = midResult.multiply(new BigDecimal(10).pow(j));
			result = result.add(midResult);
		}
		int length = result.toString().length();
		String blankStr = " ";
		for (int i = 0; i < length; i++) {
			blankStr += " ";
		}
		System.out.println(blankStr.substring(0, length - original.toString().length()) + original.toString());
		System.out.println(blankStr.substring(0,length - s2.length()) +s2);
		System.out.println("----------");
		for (int i = 0; i < middleResult.size(); i++) {
			String str = middleResult.get(i);
			System.out.println(blankStr.substring(0, length-str.length()-i) + str +blankStr.substring(0));
		}
		System.out.println(result);
		System.out.println("fuck");
		
	}
}
