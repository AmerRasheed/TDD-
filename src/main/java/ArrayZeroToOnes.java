public class ArrayZeroToOnes {

    public int[] setMethod(int[] testArray) {
        for( int i=0;i<testArray.length;i++)
         {
            if (testArray[i]==0)
                testArray[i]=1;
        }
        return testArray;
    }

    public int calculateLength(int[] testArray) {
         int total=0;
        for(int i=0;i<testArray.length;i++)
            total++;
        return total;
    }

    //public int calculateLength() {    }
}
