public class Main {
    public static void main(String[] args){

    }

    //Given an array of ints, return true if 6 appears as either the first or last element in the array.
    // The array will be length 1 or more.
    //firstLast6([1, 2, 6]) → true
    //firstLast6([6, 1, 2, 3]) → true
    //firstLast6([13, 6, 1, 2, 3]) → false
    public boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }

    //Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
    //makePi() → [3, 1, 4]
    public int[] makePi() {
        int[] makePi = {3,1,4};
        return makePi;
    }

    //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a
    // followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements
    // available between the 2 arrays.
    // make2([4, 5], [1, 2, 3]) → [4, 5]
    //make2([4], [1, 2, 3]) → [4, 1]
    //make2([], [1, 2]) → [1, 2]
    public int[] make2(int[] a, int[] b) {
        if(a.length>=2)
            return new int[] {a[0],a[1]};
        else if(a.length==1)
            return new int[] {a[0],b[0]};
        else
            return new int[] {b[0],b[1]};

    }
}