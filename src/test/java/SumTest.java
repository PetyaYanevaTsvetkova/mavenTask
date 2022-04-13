
import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    @Test
    public void testAddTwoNumbers() {
        // Given
        Sum sum = new Sum();

        // When
        int sumNumbers = sum.addTwoNumbers(5, 37);

        // Then
        Assert.assertEquals(42, sumNumbers);

        Assert.assertEquals(-1, sum.addTwoNumbers(1, -2));
        Assert.assertEquals(-1, sum.addTwoNumbers(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }


    @Test(expected = NullPointerException.class)
    public void throwNPE() {

        //Arrange
        Sum exception = new Sum();

        //Act
        exception.iThrowNPE();

        //Assert npe should be thrown
    }
}