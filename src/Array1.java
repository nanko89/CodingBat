import java.util.Arrays;

public class Array1 {

    //Ex. => firstLast6 -
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    //Ex. => sameFirstLast -
    public boolean sameFirstLast(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    //Ex. => makePi -
    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    //Ex. => sum3 -
    public static int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    //Ex. => rotateLeft3 -
    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = first;
        int third = nums[2];
        return nums;
    }

    //Ex. => maxEnd3 -
    public static int[] maxEnd3(int[] nums) {
        int[] newArray = new int[3];
        int num;
        if (nums[0] > nums[nums.length - 1]) {
            num = nums[0];
        } else if (nums[0] < nums[nums.length - 1]) {
            num = nums[nums.length - 1];
        } else {
            num = nums[0];
        }

        for (int i = 0; i < 3; i++) {
            newArray[i] = num;
        }
        return newArray;
    }

    //Ex. => sum2 -
    public static int sum2(int[] nums) {
        int maxSum = 0;
        if (nums.length <= 2) {
            return Arrays.stream(nums).sum();
        } else {
            return nums[0] + nums[1];
        }
    }

    //Ex. => middleWay -
    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    //Ex. => makeEnds -
    public int[] makeEnds(int[] nums) {
        return new int[]
                {nums[0], nums[nums.length - 1]};
    }

    //Ex. => has23 -
    public boolean has23(int[] nums) {
        return Arrays.stream(nums).anyMatch(x -> x == 2 || x == 3);
    }

    //Ex. => makeLast -
    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = 0;
        }
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    //Ex. => double23 -
    public boolean double23(int[] nums) {
        return nums.length == 2 && ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3));
    }

    //Ex. => fix23 -
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i + 1] == 3) {
                    nums[i + 1] = 0;
                }
            }
        }
        return nums;
    }

    //Ex. => start1 -
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (Arrays.stream(a).anyMatch(x -> x == 1)) {
            count++;
        }
        if (Arrays.stream(b).anyMatch(x -> x == 1)) {
            count++;
        }
        return count;
    }

    //Ex. => biggerTwo -
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();

        if (sumA >= sumB) {
            return a;
        }
        return b;
    }

    //Ex. => makeMiddle -
    public int[] makeMiddle(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int middleIndex = nums.length / 2;
        return new int[]{nums[middleIndex - 1], nums[middleIndex]};
    }

    //Ex. => plusTwo -
    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }

    //Ex. => swapEnds -
    public int[] swapEnds(int[] nums) {
        int first = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = first;
        return nums;
    }

    //Ex. => midThree -
    public int[] midThree(int[] nums) {
        if (nums.length <= 3) {
            return nums;
        }
        int middle = nums.length / 2;

        return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};

    }

    //Ex. => maxTriple -
    public int maxTriple(int[] nums) {
        int max = Integer.MIN_VALUE;
        int middle = nums.length / 2;

        if (nums[0] > max) {
            max = nums[0];
        }
        if (nums[middle] > max) {
            max = nums[middle];
        }
        if (nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }
        return max;
    }

    //Ex. => frontPiece -
    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }

    //Ex. => unlucky1 -
    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if (nums.length == 2) {
            return nums[0] == 1 && nums[1] == 3;
        } else {
            for (int i = 0; i < 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 3) {
                    return true;
                }
            }
            return nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
        }
    }

    //Ex. => make2 -
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length == 0){
            result[0] = b[0];
            result[1] = b[1];
        }
        if (a.length == 1){
            result[0] = a[0];
            result[1] = b[0];
        }
        if (a.length >= 2){
            result[0] = a[0];
            result[1] = a[1];
        }
        return result;
    }

    //Ex. => front11 -
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length > 0){
            return new int[]{b[0]};
        }else if(a.length >0 && b.length == 0){
            return new int[]{a[0]};
        }else if (a.length == 0 && b.length == 0 ){
            return new int[0];
        }else {
            return new int[]{a[0], b[0]};
        }

    }

    public static void main(String[] args) {

    }

}