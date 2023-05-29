public class Logic2 {
    //Ex. => makeBricks -
    public static boolean makeBricks(int small, int big, int goal) {
        int sum = 0;
        while (goal <= sum || big > 0) {
            if (big > 0 && goal >= sum + 5) {
                big--;
                sum = sum + 5;
            } else {
                break;
            }
        }

        while (goal <= sum || small > 0) {
            if (small > 0 && goal >= sum + 1) {
                small--;
                sum = sum + 1;
            } else {
                break;
            }
        }
        return goal == sum;
    }

    //Ex. => loneSum -
    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a == b || b== c || a== c){
            if (a==b && c != a){
                return c;
            }else if(b == c && a != b){
                return a;
            }else if (a == c && a != b){
                return b;
            }else {
                return 0;
            }
        }else {
            return a+ b+ c;
        }
    }


    public static void main(String[] args) {
//        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
    }
}
