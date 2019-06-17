package rocks.zipcode.assessment2.collections;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {

    private Map<String, Integer> month = new TreeMap<>();

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        month.put(monthName, monthNumber);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return String.valueOf(month.get(monthNumber));
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for(Map.Entry<String,Integer> entry : month.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (Objects.equals(monthName, entry.getValue())) {
                return Integer.parseInt(entry.getKey());
            }
        } return -1;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return month.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return month.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        month.put(monthName, monthNumber);

    }
}
