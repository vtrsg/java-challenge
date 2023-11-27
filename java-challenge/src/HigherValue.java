public class HigherValue {
    public static int findTheLargestValue(int[] array) {
        if (array != null && array.length > 0) {
            int higherValue = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > higherValue) {
                    higherValue = array[i];
                }
            }

            return higherValue;
        } else {
            throw new IllegalArgumentException("Invalid array");
        }
    }  
}
