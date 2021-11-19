package hu.test.lottery;

public class LotteryGenerator {

    // This field has to be used for random number generation.
    private final Random random = new RandomImpl();

    /**
     * Generates a collection of random numbers for lottery.
     * @param count the number of elements in the returned collection
     * @param from the lower boundary of the numbers inside the collection
     * @param to the upper boundary of the numbers inside the collection
     * @return a collection of lottery numbers
     * example: (5,1,90) can produce a collection with numbers: 1,5,20,45,90
     * example: (6,1,45) can product a collection with numbers: 3,8,20,22,40,43
     */
    public ? generateNumbers(int count, int from, int to) {
        // your solution goes here
    }
}
