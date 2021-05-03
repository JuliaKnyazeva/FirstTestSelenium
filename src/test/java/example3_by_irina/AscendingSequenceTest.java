package example3_by_irina;

import example_by_irina.AscendingSequence;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayHappyPath () {
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }


}
