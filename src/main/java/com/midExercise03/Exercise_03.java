package com.midExercise03;

import java.util.Scanner;

public class Exercise_03 {

	public static int getNumberOfMonth(int month, int year) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear(year) ? 29 : 28;
		default:
			return -1;
		}
	}

	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	public static void main(String[] args) {

//		Viết chương trình nhập vào một số nguyên dương (n >= 0), kiểm tra số đó có là một tháng trong năm không. Nếu có thì in ra tháng đó có bao nhiêu ngày.
		Scanner sc = new Scanner(System.in);
		int year = 2021;
		System.out.println("Input month: ");
		int n = sc.nextInt();
		if (getNumberOfMonth(n, year) != -1) {
			System.out.printf("Month %d has %d days", n, getNumberOfMonth(n, year));
		} else {
			System.out.printf("Month %d không phải là 1 tháng trong năm", n, getNumberOfMonth(n, year));
		}

	}
}
