public class String2 {
    //Ex. => doubleChar -
    public String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString += str.charAt(i) + str.charAt(i);
        }
        return newString;
    }

    //Ex. => countHi -
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count ++;
            }
        }
        return count;
    }

    //Ex. => catDog -
    public static boolean catDog(String str) {
        boolean isExist = true;
        while (str.contains("cat") && str.contains("dog")){
           str =  str.replaceFirst("cat","" );
           str = str.replaceFirst("dog", "");
        }
        if (str.contains("cat") || str.contains("dog")){
            isExist = false;
        }
       return isExist;
    }


    //Ex. => countCode -
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                count ++;
            }
        }
        return count;
    }

    //Ex. => endOther -
    public boolean endOther(String a, String b) {

    }

    public static void main(String[] args) {
        System.out.println(countCode("aaacozebbbcode"));
    }



}
