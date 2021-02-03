import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySetterTest {
    @Test
    void setArrayZeroToOnes() {
        ArrayZeroToOnes testObject = new ArrayZeroToOnes();  // Test Code
        int [] testArray = {0,1,0,8,0};      // Test Code
        int [] expectedArray = {1,1,1,8,1};
        int [] actualArray = testObject.setMethod(testArray);
        Assertions.assertArrayEquals(expectedArray,actualArray);
    }

    @Test
    void setCheckArrayLenght()
    {
        ArrayZeroToOnes testObject = new ArrayZeroToOnes();  // Test Code
        int [] testArray  = {0,1,0,8,0};      // Test Code
        //  int [] expectedArray = {1,1,1,8,1,8,8,8,8,8,8,8};
        int expectedLength = 5;
        int actualArrayLenth = testObject.calculateLength(testArray);
        Assertions.assertArrayEquals(expectedLength,actualArrayLenth);
    }
}
