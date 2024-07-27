import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //------------------------------------------------------ Main Menu --------------------------------------------------//
        // Display the welcome message and menu options
        System.out.println("=======================================================");
        System.out.println("   Welcome to The Global Currency Strength Analyzer");
        System.out.println("=======================================================");
        System.out.println("Choose an option to get started:");
        System.out.println("1. Convert Foreign Currency to USD");
        System.out.println("2. Check Currency Strength On Global Spectrum");
        System.out.print("Your choice: ");

        // Create a scanner object to capture user input
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        // Handle user choice using if-else statements
        if (option == 1) {
            convertCurrencyToUSD();  // Call method to handle currency conversion
        } else if (option == 2) {
            checkCurrencyStrength();  // Call method to check currency strength
        } else {
            // Notify the user if the entered option is invalid
            System.out.println("Invalid option selected. Please try again.");
        }
    }

    //------------------------------------------- convertCurrencyToUSD() ----------------------------------------------//
    private static void convertCurrencyToUSD() {
        // Create an instance of CurrencyDataProvider to get currency data
        CurrencyDataProvider currencyDataProvider = new CurrencyDataProvider();
        Map<String, Double> currencyData = currencyDataProvider.getCurrencyData();

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the currency abbreviation (e.g., EUR, JPY): ");
        String currency = scanner.next().toUpperCase();  // Convert to uppercase for consistency
        System.out.print("Enter the amount in your currency: ");
        double amount = scanner.nextDouble();

        // Retrieve the exchange rate for the entered currency
        Double rate = currencyData.get(currency);
        if (rate != null) {
            // Calculate and display the amount in USD
            double result = amount / rate;
            System.out.printf("The current exchange rate is: %.2f %s/USD%n", rate, currency);
            System.out.printf("Your amount in USD is: $%.2f%n", result);
        } else {
            // Inform the user if the currency rate is not available
            System.out.println("Currency rate not available. Please check the abbreviation and try again.");
        }
    }

    //------------------------------------------- checkCurrencyStrength() ----------------------------------------------//
    private static void checkCurrencyStrength() {
        // Create an instance of CurrencyDataProvider to get currency data
        CurrencyDataProvider currencyDataProvider = new CurrencyDataProvider();
        Map<String, Double> currencyData = currencyDataProvider.getCurrencyData();
        CurrencyStrength currencyStrength = new CurrencyStrength(currencyData);

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the currency abbreviation (e.g., EUR, JPY): ");
        String currency = scanner.next().toUpperCase();  // Convert to uppercase for consistency

        // Find and display the currency strength
        int index = currencyStrength.getCurrencyIndexByAbbreviation(currency);
        if (index != -1) {
            System.out.println("Currency " + currency + " found at index: " + index);
            currencyStrength.displayCurrencySpectrum(index); // Display the spectrum
        } else {
            System.out.println("Currency " + currency + " not found.");
        }
    }

    private static void compareTwoCurrencies(){
        //Access data from CurrencyDataProvider file
        CurrencyDataProvider currencyDataProvider = new CurrencyDataProvider();
        Map<String, Double> currencyData = currencyDataProvider.getCurrencyData();

        Scanner scanner = new Scanner(System.in);

        //Prompt users and get input for two currencies
        System.out.println("Please enter the first currency: ");
        String firstCurrency = scanner.next().toUpperCase();
        Double currencyOne = currencyData.get(firstCurrency);
        System.out.println("Please enter the second currency: ");
        String secondCurrency = scanner.next().toUpperCase();
        Double currencyTwo = currencyData.get(secondCurrency);

        System.out.println("First currrency (" + firstCurrency + "): rate" + currencyOne);
        System.out.println("Second currrency (" + secondCurrency + "): rate" + currencyTwo);
        if(currencyOne > currencyTwo){
            System.out.println("Currency " + firstCurrency + " is stronger than currency " + secondCurrency);
        }else{
            System.out.println("Currency " + firstCurrency + " is weaker than currency " + secondCurrency);
        }

    }
}
