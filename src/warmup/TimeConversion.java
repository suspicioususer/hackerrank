package warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		String[] timeArray = time.split("\\:");
		boolean afterNoon = timeArray[2].charAt(2) == 'P' ? true : false;
		timeArray[2] = timeArray[2].substring(0, 2);
		int hours, minutes, seconds;
		hours = Integer.parseInt(timeArray[0]);
		hours %= 24;
		minutes = Integer.parseInt(timeArray[1]);
		minutes %= 60;
		seconds = Integer.parseInt(timeArray[2]);
		seconds %= 60;

		if (afterNoon) {
			if (hours >= 1 && hours <= 12) {
				if (hours < 12) {
					hours += 12;
					System.out.print(hours + ":");
				} else {
					System.out.print("12" + ":");
				}
			}
			if (minutes >= 0 && minutes <= 59) {
				if (minutes < 10) {
					System.out.print("0" + minutes + ":");
				} else {
					System.out.print(minutes + ":");
				}
			}
			if (seconds >= 0 && seconds <= 59) {
				if (seconds < 10) {
					System.out.print("0" + seconds);
				} else {
					System.out.print(seconds);
				}
			}
		} else {
			if (hours >= 1 && hours <= 12) {
				if (hours < 10) {
					System.out.print("0" + hours + ":");
				} else if (hours >= 10 && hours < 12) {
					System.out.print(hours + ":");
				} else {
					System.out.print("00" + ":");
				}
			}
			if (minutes >= 0 && minutes <= 59) {
				if (minutes < 10) {
					System.out.print("0" + minutes + ":");
				} else {
					System.out.print(minutes + ":");
				}
			}
			if (seconds >= 0 && seconds <= 59) {
				if (seconds < 10) {
					System.out.print("0" + seconds);
				} else {
					System.out.print(seconds);
				}
			}
		}
		scanner.close();
	}
}
