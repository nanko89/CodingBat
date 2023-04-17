public class String1 {

    public static void main(String[] args) {
        System.out.println(withoutX2("xxHi"));

    }
//Ex. => seeColor -
//          Given a string, if the string begins with "red" or "blue" return that color string,
//          otherwise return the empty string.

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

//    Ex. => frontAgain
//              Given a string, return true if the first 2 chars in the string
//              also appear at the end of the string, such as with "edited".

    public static boolean frontAgain(String str) {
        if (str.length() == 2) {
            return true;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

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

    public static String extraFront(String str) {

        if (str.length() <= 2) {
            return str + str + str;
        }

        String repeat = str.substring(0, 2);
        return repeat + repeat + repeat;
    }

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

    public static String startWord(String str, String word) {
        if (str.substring(1).startsWith(word.substring(1)) && str.length() >= word.length()) {
            return str.substring(0, word.length());
        }
        return "";
    }

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

    public static String withoutX2(String str) {
        String result = str;
        if (str.charAt(0) == 'x') {
            result = str.substring(1);
            if (result.length() > 1) {
                if (result.charAt(0) == 'x') {
                    result = result.substring(1);
                }
            }else if( result.equals("") || result.equals("x") ){
                result="";
            }
            return result;
        }

        if (str.charAt(1) == 'x'){
            if (str.length() >= 3) {
                result = str.charAt(0) + str.substring(2);
            }else {
                result = str.substring(0,1);
            }
        }
        return result;
    }
}
