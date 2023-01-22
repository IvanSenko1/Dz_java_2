import java.util.Scanner;

public class Task_2 {
	
	public static int occurrenceInString(String firstString, String secondString) {
		return firstString.indexOf(secondString);
	}

	
	public static String getUserInput(String request) {
		Scanner input = new Scanner(System.in);
		System.out.print(request);
		return input.nextLine();
	}

	
	public static void main(String[] args) {
		String firstString = getUserInput("\nВведите первую строку: ");
		String secondString = getUserInput("Введите вторую строку: ");

		int index = occurrenceInString(firstString, secondString);
		if (index != -1)
			System.out.println("\nИндекс вхождения строки \033[31m" + secondString + "\033[0m в строку \033[31m" + firstString + "\033[0m = "
					+ occurrenceInString(firstString, secondString));
		else
			System.out.println("\nСтрока \033[31m" + secondString + "\033[0m не найден в строке \033[31m" + firstString + "\033[0m ! ");
	}

}