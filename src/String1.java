public class String1 {

    public static void main(String[] args) {
    }

    //Ex. => helloName -
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //Ex. => makeAbba -
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //Ex. => makeTags -
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    //Ex. => extraEnd -
    public String extraEnd(String str) {
        String lastChars = str.substring(str.length() - 2, str.length());
        return lastChars + lastChars + lastChars;

    }

    //Ex. => seeColor -
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }


    //Ex. => makeOutWord -
    public String makeOutWord(String out, String word) {
        String result = out.substring(0, 2) + word + out.substring(2, 4);
        return result;
    }

    //Ex. => firstTwo -
    public String firstTwo(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 2);
    }


    //Ex. => firstHalf -
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }


    //Ex. => withoutEnd -
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }


    //Ex. => comboString -
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        return a + b + a;
    }


    //Ex. => nonStart -
    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    //Ex. => left2 -
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }


    //Ex. => right2 -
    public String right2(String str) {
        if (str.length() < 3) {

            return str;
        }
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }


    //Ex. => theEnd -
    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }
        return str.substring(str.length() - 1, str.length());
    }


    //Ex. => withouEnd2 -
    public String withouEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    // Ex. => middleTwo
    public String middleTwo(String str) {
        if(str.length() < 3){
            return str;
        }
        int length = str.length() / 2 ;
        return str.substring( length - 1, length +1);
    }

    // Ex. => endsLy
    public boolean endsLy(String str) {
        if(str.length() <2){
            return false;
        }

        if(str.substring(str.length() -2 , str.length()).equals("ly")){
            return true;
        }
        return false;
    }

    // Ex. => nTwice
    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length() - n, str.length());

    }

    // Ex. => twoChar
    public String twoChar(String str, int index) {
        if(str.length()-2 < index || index < 0){
            return str.substring(0,2);
        }
        return str.substring(index, index +2);
    }

    // Ex. => middleThree
    public String middleThree(String str) {
        if(str.length() < 4){
            return str;
        }

        int center = str.length()/2;
        return str.substring(center -1, center +2);
    }

    // Ex. => hasBad
    public boolean hasBad(String str) {
        if(str.length() >= 3){
            if(str.substring(0, 3).equals("bad")){
                return true;
            }
            if(str.length() > 3 && str.substring(1,4).equals("bad")){
                return true;
            }
        }
        return false;
    }

    // Ex. => atFirst
    public String atFirst(String str) {
        if(str.length() == 1 ){
            return str + "@";
        }else if(str.length() == 0){
            return "@@";
        }else{
            return str.substring(0,2);
        }
    }

    // Ex. => lastChars
    public String lastChars(String a, String b) {
        String newString ="";
        if(a.length() == 0){
            newString = "@";
        }else{
            newString = a.substring(0, 1);
        }
        if(b.length() == 0 ){
            newString += "@";
        }else {
            newString += b.substring(b.length()- 1);
        }
        return newString;
    }

    // Ex. => conCat
    public String conCat(String a, String b) {

        if(a.length() > 0 && b.length() > 0 && a.charAt(a.length() -1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a + b;
    }

    // Ex. => lastTwo
    public String lastTwo(String str) {
        if(str.length() <2){
            return str;
        }
        char lastChar = str.charAt(str.length() -1);
        char previousChar  =str.charAt(str.length() -2);
        return str.substring(0, str.length()-2) + lastChar + previousChar;
    }

    // Ex. => frontAgain
    public static boolean frontAgain(String str) {
        if (str.length() == 2) {
            return true;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

    // Ex. => minCat
    public static String minCat(String a, String b) {
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                return a.substring(a.length() - b.length()) + b;
            } else {
                return a + b.substring(b.length() - a.length());
            }
        }
        return a + b;
    }

    // Ex. => extraFront
    public static String extraFront(String str) {

        if (str.length() <= 2) {
            return str + str + str;
        }

        String repeat = str.substring(0, 2);
        return repeat + repeat + repeat;
    }

    // Ex. => deFront
    public static String deFront(String str) {
        String result = "";
        if (str.charAt(0) == 'a') {
            result += "a";
        }
        if (str.charAt(1) == 'b') {
            result += 'b';
        }

        return result + str.substring(2);
    }

    // Ex. => startWord
    public static String startWord(String str, String word) {
        if (str.substring(1).startsWith(word.substring(1)) && str.length() >= word.length()) {
            return str.substring(0, word.length());
        }
        return "";
    }

    // Ex. => withoutX
    public static String withoutX(String str) {
        if (str.length() > 0 && (str.charAt(0) == 'x' || str.charAt(str.length() - 1) == 'x')) {
            if (str.length() > 2) {
                String result = "";
                if (str.charAt(0) == 'x') {
                    result = str.substring(1);
                    if (str.charAt(str.length() - 1) == 'x') {
                        result = result.substring(0, result.length() - 1);
                    }
                    return result;
                }
                if (str.charAt(str.length() - 1) == 'x') {
                    result += str.substring(0, str.length() - 1);
                }
                return result;

            } else {
                return
                        str.replace("x", "");
            }
        } else {
            return str;
        }
    }

    // Ex. => withoutX2
    public static String withoutX2(String str) {
        String result = str;
        if (str.charAt(0) == 'x') {
            result = str.substring(1);
            if (result.length() > 1) {
                if (result.charAt(0) == 'x') {
                    result = result.substring(1);
                }
            } else if (result.equals("") || result.equals("x")) {
                result = "";
            }
            return result;
        }

        if (str.charAt(1) == 'x') {
            if (str.length() >= 3) {
                result = str.charAt(0) + str.substring(2);
            } else {
                result = str.substring(0, 1);
            }
        }
        return result;
    }
}
