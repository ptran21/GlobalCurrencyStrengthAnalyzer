import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyDataProvider {
    public Map<String, Double> getCurrencyData() {
        //Create and populate the Hashmap
        Map<String, Double> currencyData = new HashMap<>();
        currencyData.put("KWD", 0.31);
        currencyData.put("BHD", 0.38);
        currencyData.put("OMR", 0.39);
        currencyData.put("JOD", 0.71);
        currencyData.put("GIP", 0.79);
        currencyData.put("SHP", 0.79);
        currencyData.put("GBP", 0.79);
        currencyData.put("KYD", 0.82);
        currencyData.put("CHF", 0.88);
        currencyData.put("EUR", 0.91);
        currencyData.put("USD", 1.00);
        currencyData.put("BSD", 1.00);
        currencyData.put("BMD", 1.00);
        currencyData.put("PAB", 1.00);
        currencyData.put("BND", 1.35);
        currencyData.put("SGD", 1.35);
        currencyData.put("CAD", 1.35);
        currencyData.put("AUD", 1.53);
        currencyData.put("NZD", 1.67);
        currencyData.put("AZN", 1.70);
        currencyData.put("BAM", 1.79);
        currencyData.put("BGN", 1.79);
        currencyData.put("AWG", 1.79);
        currencyData.put("ANG", 1.79);
        currencyData.put("BBD", 2.00);
        currencyData.put("BZD", 2.00);
        currencyData.put("FJD", 2.28);
        currencyData.put("TOP", 2.31);
        currencyData.put("GEL", 2.64);
        currencyData.put("XCD", 2.70);
        currencyData.put("WST", 2.74);
        currencyData.put("TND", 3.09);
        currencyData.put("BYN", 3.17);
        currencyData.put("TMT", 3.50);
        currencyData.put("PGK", 3.58);
        currencyData.put("QAR", 3.65);
        currencyData.put("AED", 3.67);
        currencyData.put("PEN", 3.69);
        currencyData.put("SAR", 3.75);
        currencyData.put("ILS", 3.78);
        currencyData.put("PLN", 4.08);
        currencyData.put("RON", 4.51);
        currencyData.put("MYR", 4.64);
        currencyData.put("LYD", 4.84);
        currencyData.put("BRL", 4.86);
        currencyData.put("TTD", 6.76);
        currencyData.put("DKK", 6.81);
        currencyData.put("BOB", 6.85);
        currencyData.put("CNY", 7.28);
        currencyData.put("HKD", 7.85);
        currencyData.put("GTQ", 7.85);
        currencyData.put("MOP", 8.08);
        currencyData.put("SBD", 8.16);
        currencyData.put("MAD", 10.08);
        currencyData.put("NOK", 10.54);
        currencyData.put("SEK", 10.80);
        currencyData.put("TJS", 10.94);
        currencyData.put("GHS", 11.35);
        currencyData.put("SCR", 13.13);
        currencyData.put("BWP", 13.41);
        currencyData.put("ERN", 15.00);
        currencyData.put("MVR", 15.00);
        currencyData.put("MXN", 16.74);
        currencyData.put("MDL", 17.74);
        currencyData.put("SZL", 18.47);
        currencyData.put("LSL", 18.47);
        currencyData.put("NAD", 18.47);
        currencyData.put("ZAR", 18.47);
        currencyData.put("ZMW", 20.07);
        currencyData.put("STN", 20.60);
        currencyData.put("SLE", 21.80);
        currencyData.put("CZK", 22.03);
        currencyData.put("CUP", 24.00);
        currencyData.put("HNL", 24.47);
        currencyData.put("TRY", 26.71);
        currencyData.put("EGP", 30.92);
        currencyData.put("VES", 32.44);
        currencyData.put("THB", 34.94);
        currencyData.put("NIO", 36.19);
        currencyData.put("UAH", 37.00);
        currencyData.put("UYU", 37.57);
        currencyData.put("MRU", 37.71);
        currencyData.put("SRD", 38.37);
        currencyData.put("MUR", 45.35);
        currencyData.put("ETB", 55.03);
        currencyData.put("MKD", 56.10);
        currencyData.put("DOP", 56.41);
        currencyData.put("PHP", 56.73);
        currencyData.put("GMD", 60.82);
        currencyData.put("MZN", 63.25);
        currencyData.put("BTN", 82.73);
        currencyData.put("INR", 82.73);
        currencyData.put("AFN", 84.04);
        currencyData.put("KGS", 87.50);
        currencyData.put("RUB", 95.94);
        currencyData.put("ALL", 97.32);
        currencyData.put("CVE", 100.77);
        currencyData.put("RSD", 107.07);
        currencyData.put("BDT", 108.50);
        currencyData.put("XPF", 109.06);
        currencyData.put("KPW", 110.00);
        currencyData.put("VUV", 118.06);
        currencyData.put("ISK", 130.15);
        currencyData.put("NPR", 132.24);
        currencyData.put("DZD", 135.77);
        currencyData.put("HTG", 135.82);
        currencyData.put("KES", 145.23);
        currencyData.put("JPY", 145.57);
        currencyData.put("JMD", 153.43);
        currencyData.put("DJF", 177.00);
        currencyData.put("LRD", 184.99);
        currencyData.put("GYD", 208.50);
        currencyData.put("PKR", 303.95);
        currencyData.put("LKR", 320.34);
        currencyData.put("HUF", 346.24);
        currencyData.put("ARS", 349.95);
        currencyData.put("AMD", 383.61);
        currencyData.put("KMF", 449.61);
        currencyData.put("KZT", 461.85);
        currencyData.put("YER", 516.95);
        currencyData.put("CRC", 538.60);
        currencyData.put("XOF", 599.49);
        currencyData.put("XAF", 599.49);
        currencyData.put("SDG", 608.00);
        currencyData.put("NGN", 771.60);
        currencyData.put("AOA", 824.90);
        currencyData.put("CLP", 855.00);
        currencyData.put("SSP", 1007.29);
        currencyData.put("MWK", 1095.32);
        currencyData.put("RWF", 1179.52);
        currencyData.put("IQD", 1310.00);
        currencyData.put("KRW", 1323.26);
        currencyData.put("MMK", 2100.00);
        currencyData.put("CDF", 2421.49);
        currencyData.put("TZS", 2493.14);
        currencyData.put("BIF", 2814.00);
        currencyData.put("MNT", 3465.64);
        currencyData.put("UGX", 3717.00);
        currencyData.put("COP", 4082.00);
        currencyData.put("KHR", 4138.00);
        currencyData.put("MGA", 4465.92);
        currencyData.put("ZWL", 4570.34);
        currencyData.put("PYG", 7275.00);
        currencyData.put("GNF", 8497.01);
        currencyData.put("SYP", 8500.00);
        currencyData.put("UZS", 12060.00);
        currencyData.put("IDR", 15236.00);
        currencyData.put("LAK", 19686.00);
        currencyData.put("VND", 24129.00);
        currencyData.put("SOS", 24300.00);
        currencyData.put("LBP", 85500.00);
        currencyData.put("IRR", 371992.00);
        return currencyData;
    }

    /**
     * Retrieves and returns currency data sorted by value in ascending order.
     *
     * @return A list of map entries with currency codes and values, sorted by value in ascending order.
     */
    public List<Map.Entry<String, Double>> getSortedCurrencyData() {
        Map<String, Double> currencyData = getCurrencyData(); // Fetch currency data
        List<Map.Entry<String, Double>> sortedEntries = new ArrayList<>(currencyData.entrySet()); // Convert map to list
        sortedEntries.sort(Map.Entry.comparingByValue()); // Sort entries by value
        return sortedEntries; // Return sortedlist
    }

    // Main method for testing
    public static void main(String[] args) {
        CurrencyDataProvider provider = new CurrencyDataProvider();
        List<Map.Entry<String, Double>> sortedEntries = provider.getSortedCurrencyData(); // Get sorted data

        // Print sorted data
        System.out.println("Sorted Currency Data:");
        for (Map.Entry<String, Double> entry : sortedEntries) {
            System.out.println(entry.getValue()); // Print only values
        }
    }
}

