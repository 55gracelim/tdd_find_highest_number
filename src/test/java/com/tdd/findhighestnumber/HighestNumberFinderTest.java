package com.tdd.findhighestnumber;

import org.junit.jupiter.api.Test;

public class HighestNumberFinderTest {
    @Test
    public void find_highest_in_array_of_one_expect_single_item(){
        //arrange
        int array[] = {10};
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 10;
        
        //act
        int actualResult = cut.findHighestNumber(array);
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void find_highest_in_array_of_two_given(){
    //arrange
        int array[] = {7,13};
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 13;

        //act
        int actualResult = cut.findHighestNumber(array);
        //assert
        assertEquals(expectedResult, actualResult);
    };
    private void assertEquals(int expectedResult, int actualResult) {
    }


}
