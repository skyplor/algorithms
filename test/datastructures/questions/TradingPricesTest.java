package datastructures.questions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import datastructures.questions.TradingPrices;

public class TradingPricesTest {
    private int[] numbers = new int[]{200, 100, 400, 500, 300, 50, 100, 400};
    private final static int SIZE = 480;
    private final static int MAX = 300;

//    @Before
//    public void setUp() throws Exception {
//	numbers = new int[SIZE];
//	Random generator = new Random();
//	for (int i = 0; i < numbers.length; i++) {
//	    numbers[i] = generator.nextInt(MAX);
//	}
//    }

    @Test
    public void testComputeProfit() {
	TradingPrices trade = new TradingPrices();
	assertEquals(400, trade.computeProfit(numbers));
    }
}
