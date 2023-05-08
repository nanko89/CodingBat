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
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    //Ex. => catDog -
    public static boolean catDog(String str) {
        boolean isExist = true;
        while (str.contains("cat") && str.contains("dog")) {
            str = str.replaceFirst("cat", "");
            str = str.replaceFirst("dog", "");
        }
        if (str.contains("cat") || str.contains("dog")) {
            isExist = false;
        }
        return isExist;
    }


    //Ex. => countCode -
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    //Ex. => endOther -
    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    //Ex. => xyzThere -
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                if ((i == 0) || (i > 0 && str.charAt(i - 1) != '.')) {
                    return true;
                }
            }
        }
        return false;
    }

    //Ex. => bobThere -
    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }

        }
        return false;
    }

    //Ex. => xyBalance -
    public boolean xyBalance(String str) {
        int lastXIndex = str.lastIndexOf('x');
        int lastYIndex = str.lastIndexOf('y');

        if (lastYIndex == -1 && lastXIndex == -1) {
            return true;
        } else if (lastYIndex > 0 && lastXIndex == -1) {
            return true;
        } else if (lastYIndex > lastXIndex) {
            return true;
        }

        return false;
    }

    //Ex. => mixString -
    public static String mixString(String a, String b) {
        StringBuilder str = new StringBuilder();
        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length(); i++) {
                str.append(a.charAt(i)).append(b.charAt(i));
            }
            str.append(a.substring(b.length()));
        } else {
            for (int i = 0; i < a.length(); i++) {
                str.append(a.charAt(i)).append(b.charAt(i));
            }
            str.append(b.substring(a.length()));
        }
        return str.toString();
    }

    //Ex. => repeatEnd -
    public static String repeatEnd(String str, int n) {
        String cutStr = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += cutStr;
        }
        return result;
//        return str.substring(str.length() - n).repeat(n);
    }

    //Ex. => repeatEnd -
    public static String repeatFront(String str, int n) {
        String result = "";
        if (n >= 0 && n <= str.length()) {
            for (int i = n; i > 0; i--) {
                result += str.substring(0, i);
            }
        }
        return result;
    }

    //Ex. => repeatSeparator -
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count > 0) {
            for (int i = 0; i < count - 1; i++) {
                result += word + sep;
            }
            result += word;
        }
        return result;
    }

    //Ex. => prefixAgain -
    public static boolean prefixAgain(String str, int n) {
        if (n >= 0 && n < str.length()) {
            String prefix = str.substring(0, n);
            String searchingStr = str.substring(n);
            return searchingStr.contains(prefix);
        }
        return false;
    }

    //Ex. => xyzMiddle -
    public static boolean xyzMiddle(String str) {
        int left = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z') {
                int right = str.length() - 1 - (i + 2);
                if (left == right + 1 || left == right || left == right - 1) {
                    return true;
                }
            }
            left++;
        }
        return false;
    }

    //Ex. => getSandwich -
    public String getSandwich(String str) {
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        if (firstIndex != lastIndex) {
            return str.substring(firstIndex + 5, lastIndex);
        }
        return "";
    }

    //Ex. => sameStarChar -
    public static boolean sameStarChar(String str) {
        boolean isValid = false;

        if (str.length() == 0 || !str.contains("*")) {
            return true;
        }

        if (str.contains("*")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    if (i > 0 && i < str.length() - 1) {
                        if (str.charAt(i - 1) == str.charAt(i + 1)) {
                            isValid = true;
                        } else {
                            isValid = false;
                        }
                    }else if(str.length() == 1 || str.equals("**")){
                        isValid = true;
                    }
                }
            }
        }
        return isValid;
    }


    public static void main(String[] args) {
        System.out.println(sameStarChar("*xa*a*"));
    }


}