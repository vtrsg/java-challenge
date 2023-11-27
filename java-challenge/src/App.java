import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printDateFormatter("01/05/2018");
        printDateFormatter("01 05 2018");
        printDateFormatter("01052018");
        printDateFormatter("2018 05 01");
        
        scanner.close();
    }

    private static void printDateFormatter(String data) {
        String result = DateFormatter.dateFormat(data);

        if (result != null) {
            System.out.println("Formatted date: " + result);
        } else {
            System.out.println("Invalid date format");
        }
    }
}