import java.util.List;
import java.util.Map;

/**
 * Represents currency strength by storing and displaying sorted currency values.
 */
public class CurrencyStrength {
    private Double[] currencyValues;
    private Map<String, Double> currencyData;
    private List<Map.Entry<String, Double>> sortedCurrencyData;

    //------------------------------------------------------- Constructor ------------------------------------------------//
    /**
     * Constructs a CurrencyStrength object and initializes the currencyValues array
     * with sorted currency values.
     *
     * @param currencyData The map containing currency abbreviations and their corresponding values.
     */
    public CurrencyStrength(Map<String, Double> currencyData) {
        this.currencyData = currencyData;
        CurrencyDataProvider provider = new CurrencyDataProvider();
        sortedCurrencyData = provider.getSortedCurrencyData();
        int size = sortedCurrencyData.size();
        currencyValues = new Double[size];

        // Populate the array with values from the sorted data
        for (int i = 0; i < size; i++) {
            currencyValues[i] = sortedCurrencyData.get(i).getValue();
        }
    }

    //------------------------------------------- findCurrencyIndex() ----------------------------------------------//
    /**
     * Finds the index of a currency based on its value using binary search.
     *
     * @param targetValue The value to search for.
     * @return The index of the target value in the sorted array, or -1 if not found.
     */
    public int findCurrencyIndex(Double targetValue) {
        if (targetValue == null) {
            throw new IllegalArgumentException("Target value cannot be null.");
        }

        int left = 0;
        int right = currencyValues.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Double midValue = currencyValues[mid];

            if (midValue.equals(targetValue)) {
                return mid; // Target value found at index mid
            } else if (midValue < targetValue) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target value not found
    }

    //------------------------------------------- getCurrencyIndexByAbbreviation() --------------------------------------//
    /**
     * Retrieves the index of a currency based on its abbreviation.
     *
     * @param currency The currency abbreviation to search for.
     * @return The index of the currency in the sorted array, or -1 if not found.
     */
    public int getCurrencyIndexByAbbreviation(String currency) {
        Double value = currencyData.get(currency);
        if (value != null) {
            return findCurrencyIndex(value);
        }
        return -1; // Currency not found
    }

    //------------------------------------------- displayCurrencySpectrum() -------------------------------------------//
    /**
     * Displays the currency spectrum with the target value highlighted.
     *
     * @param targetIndex The index of the target value to highlight.
     */
    public void displayCurrencySpectrum(int targetIndex) {
        if (targetIndex < 0 || targetIndex >= currencyValues.length) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Currency Spectrum:");
        System.out.println("Index -> Currency Abbreviation -> Currency Value");

        for (int i = 0; i < currencyValues.length; i++) {
            Map.Entry<String, Double> entry = sortedCurrencyData.get(i);
            String currency = entry.getKey();
            Double value = entry.getValue();

            if (i == targetIndex) {
                System.out.printf("[%3d] %s %6.2f <- Target%n", i, currency, value);
            } else {
                System.out.printf("[%3d] %s %6.2f%n", i, currency, value);
            }
        }

        System.out.println("\nLegends:");
        System.out.println("Strongest: " + sortedCurrencyData.get(0).getKey() + " " + currencyValues[0]);
        System.out.println("Weakest: " + sortedCurrencyData.get(currencyValues.length - 1).getKey() + " " + currencyValues[currencyValues.length - 1]);
    }

    //------------------------------------------------------- Main -------------------------------------------------------//
    /**
     * Main method to test the functionality of the CurrencyStrength class.
     * Creates an instance of CurrencyStrength, displays sorted values,
     * demonstrates the binary search, and shows the currency spectrum.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        CurrencyDataProvider provider = new CurrencyDataProvider();
        Map<String, Double> currencyData = provider.getCurrencyData();
        CurrencyStrength cs = new CurrencyStrength(currencyData);

        // Example usage of binary search
        Double targetValue = 3.5; // Example value to search for
        int index = cs.findCurrencyIndex(targetValue);
        if (index != -1) {
            System.out.println("Value " + targetValue + " found at index: " + index);
            cs.displayCurrencySpectrum(index); // Display the spectrum
        } else {
            System.out.println("Value " + targetValue + " not found.");
        }
    }
}
