import java.util.Scanner;


public class Task_3 {
	public static String invertedLine(String str) {
		if (str.length() == 0) {
			return str;
		}
		return invertedLine(str.substring(1)) + str.charAt(0);
	}

	
	public static String getUserInput(String request) {
		Scanner input = new Scanner(System.in);
		System.out.print(request);
		return input.nextLine();
	}

	
	public static void main(String[] str) {
		String line = getUserInput("\nВведите строку: ");
		if (line.length() > 0)
			System.out.println("\nПеревернутая строка \033[31m" + line + "\033[0m имеет следующий вид \033[31m" + invertedLine(line) + "\033[0m");
		else
			System.out.println("\n\033[31mПустая строка\033[0m");
	}
}