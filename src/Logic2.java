public class Logic2 {
    //Ex. => shareDigit -
    public static boolean makeBricks(int small, int big, int goal) {
     boolean makeBricks = false;

     int startBig = big;

     while (goal > 0){
         if (goal - 5 > 0 && startBig > 0){
             goal = goal -5;
             startBig--;
         }
         if (startBig == 0){
             if (goal<=small){
                 makeBricks =  true;
             }else {
                 makeBricks = false;
             }
         }
     }

     return true;
    }


    public static void main(String[] args) {

    }
}
