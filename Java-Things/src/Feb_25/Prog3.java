package Feb_25;

/*
Write a program called RemoveDups. Create an array which accepts an array of Strings only.
Creates a new array in which all duplicate Strings in the original input array have been
removed. You should not use any APIs like HashSet, TreeSet etc., Write your own logic.
Also, your result should not contain null values.
For example, if the input array is
["horse", "dog", "cat", "horse", dog"]
then the output would be the following array:
        ["horse","dog","cat"]

 */
public class Prog3 {
    // Method to remove duplicates from an array
    // Method to remove duplicates from an array
    public   String[] removeDuplicates(String[] inputArray) {
        // Validate the input array
        if (inputArray == null || inputArray.length == 0) {
            return new String[0]; // Return an empty array for invalid input
        }

        // Track the count of unique values
        int uniqueCount = 0;

        // Iterate through the input array to count unique values
        for (int i = 0; i < inputArray.length; i++) {
            String currentValue = inputArray[i];
            if (currentValue != null) {
                uniqueCount++;
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (currentValue.equals(inputArray[j])) {
                        inputArray[j] = null; // Mark duplicates as null
                    }
                }
            }
        }

        // Create a new array to store unique values with an accurate size
        String[] resultArray = new String[uniqueCount];
        int resultIndex = 0;

        // Build the result array with unique values
        for (String value : inputArray) {
            if (value != null) {
                resultArray[resultIndex++] = value;
            }
        }
        return resultArray;
    }
}
