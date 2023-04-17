import java.util.Arrays;
import java.util.Objects;

public class Array1 {
    public static int[] makePi() {
        return new int[]{3,1,4};
    }

    public static int sum3(int[] nums) {
    return Arrays.stream(nums).sum();
    }

    public static int[] rotateLeft3(int[] nums) {
    int first = nums[0];
    nums[0] =nums[1];
    nums[1] = nums[2];
    nums[2] = first;
    int third = nums[2];
    return nums;
    }

    public static int[] maxEnd3(int[] nums) {
        int[] newArray = new int[3];
        int num;
        if (nums[0] > nums[nums.length - 1]){
            num = nums[0];
        }else if(nums[0] < nums[nums.length -1]){
            num = nums[nums.length -1];
        }else {
            num = nums[0];
        }

        for (int i = 0; i < 3; i++ ){
            newArray[i] = num;
        }
        return newArray;
    }

    public static int sum2(int[] nums) {
    int maxSum = 0;
    if (nums.length <= 2){
        return Arrays.stream(nums).sum();
    }else {
        return nums[0] + nums[1];
    }
    }

    public static int[] middleWay(int[] a, int[] b) {
    return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
    return new int[]
            {nums[0], nums[nums.length-1]};
    }

    public boolean has23(int[] nums) {
        return Arrays.stream(nums).anyMatch(x -> x == 2 || x == 3);
    }

    public int[] makeLast(int[] nums) {
    int[] result = new int[nums.length*2];
        for (int i = 0; i < result.length -1 ; i++) {
            result[i] = 0;
        }
        result[result.length - 1] = nums[nums.length -1];
        return result;
    }

    public boolean double23(int[] nums) {
return nums.length == 2  && ((nums[0] == 2 && nums[1] == 2 )|| (nums[0] == 3 && nums[1] == 3));
    }

//    public int[] fix23(int[] nums) {
//
//    }



    public static void main(String[] args) {

    }



}
class MyClass {
}