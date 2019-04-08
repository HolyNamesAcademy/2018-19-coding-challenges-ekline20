package challenges;

public class NumberOne {

    /**
     * Given an array of integers, return the indices of the two numbers that they add up to the specified target.
     * <p>
     * You may assume that each input will have exactly one solution, and you may not use the same element twice.
     * <p>
     * Example:
     * Given numbers = [2, 7, 11, 15], target = 9,
     * <p>
     * Because numbers[0] + numbers[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param numbers the array of integers to choose from
     * @param target  the value the two integers need to sum to
     * @return an array with two values in it, the indices from the array numbers for the two numbers that sum to target
     */
    public int[] findTwoValuesThatSumToTarget(int[] numbers, int target) {
        // Delete the line below and implement the method!
        int[] values = new int[2];
        int firstValue = 0;
        for (int i = firstValue+1 ; i < numbers.length; i++) {
            if (numbers[firstValue] + numbers[i] == target) {
                values[0] = firstValue;
                values[1] = i;
            }
            firstValue++;
        }
        return values;
    }
}

