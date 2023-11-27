import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Call date format
        printDateFormatter("01/05/2018");
        printDateFormatter("01 05 2018");
        printDateFormatter("01052018");
        printDateFormatter("2018 05 01");

        // Call name concat 
        String[] nameArray = {"CARLOS ", " EDUARDO", "DA", " COSTA", "XAVIER"};
        printConcatenedString(nameArray);
        
        // Call higher value
        int[] numbersArray = {334, 568, 123, 796, 225};
        printLargestValueInArray(numbersArray);

        scanner.close();
    }

    private static void printDateFormatter(String date) {
        String result = DateFormatter.dateFormat(date);

        if (result != null) {
            System.out.println("Formatted date: " + result);
        } else {
            System.out.println("Invalid date format");
        }
    }

    private static void printConcatenedString(String[] namesArray) {
        String concatenatedResult = ConcatenateString.concatenateNames(namesArray);

        System.out.println("Concatenated name: " + concatenatedResult);
    }

    
    public static void printLargestValueInArray(int[] numbersArray) {
        int higherValue = HigherValue.findTheLargestValue(numbersArray);;
        System.out.println("The largest value in the array is: " + higherValue);
    }


    
}