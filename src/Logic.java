import java.util.ArrayList;
import java.util.Collections;

public class Logic {
    //Ex. => pairs -
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
        }
        return false;
    }

    //Ex. => dateFashion -
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    //Ex. => dateFashion -
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    //Ex. => caughtSpeeding -
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }

    }

    //Ex. => sortaSum -
    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    //Ex. => alarmClock -
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 6 || day == 0) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 6 || day == 0) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    //Ex. => love6 -
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
    }

    //Ex. => in1To10 -
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    //Ex. => specialEleven -
    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    //Ex. => more20 -
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    //Ex. => old35 -
    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return true;
        } else if (n % 3 != 0 && n % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Ex. => less20 -
    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;

    }

    //Ex. => nearTen -
    public boolean nearTen(int num) {
        return num % 10 == 8 || num % 10 == 9 || num % 10 == 1 || num % 10 == 2 || num % 10 == 0;
    }

    //Ex. => teenSum -
    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        }
        return a + b;
    }

    //Ex. => answerCell -
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else {
            if (!isMorning) {
                return true;
            } else {
                return isMom;
            }
        }
    }

    //Ex. => teaParty -
    public int teaParty(int tea, int candy) {
    if (tea < 5 || candy < 5){
        return 0;
    }else {
        if (tea * 2 <= candy || candy *2 <= tea ){
            return 2;
        }else {
            return 1;
        }
    }
    }

    //Ex. => fizzString -
    public String fizzString(String str) {
    if (str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b'){
        return "FizzBuzz";
    }else if (str.charAt(0) == 'f'){
        return "Fizz";
    }else if (str.charAt(str.length()-1) == 'b'){
        return "Buzz";
    }else {
        return str;
    }
    }

    //Ex. => fizzString2 -
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        }else if (n % 3 == 0){
            return "Fizz!";
        }else if (n % 5 == 0){
            return "Buzz!";
        }else {
            return n + "!";
        }
    }

    //Ex. => twoAsOne -
    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a){
            return true;
        }
        return false;
    }

    //Ex. => inOrder -
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk){
            if (c > b){
                return true;
            }else {
                return false;
            }
        }else {
            if (b > a && c > b){
                return true;
            }else {
                return false;
            }
        }
    }

    //Ex. => inOrderEqual -
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
            return equalOk && a<= b && b <= c || !equalOk && a < b && b < c;
    }

    //Ex. => lastDigit -
    public boolean lastDigit(int a, int b, int c) {
            return a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10;
    }


    //Ex. => lessBy10 -
    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(b-c) >= 10 || Math.abs(a-c) >= 10;
    }

    //Ex. => withoutDoubles -
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2){
            return die1 + die2 + 1;
        }else {
            return die1 + die2;
        }

    }

    //Ex. => maxMod5 -
    public int maxMod5(int a, int b) {
        if (a == b){
            return  0;
        }
        if (a % 5 == b % 5){
            return Math.min(a,b);
        }

        return Math.max(a, b);
    }

    //Ex. => redTicket -
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2){
            return 10;
        }else if (a == b && b == c){
            return 5;
        }else if (a != b && c != a){
            return 1;
        }else {
            return 0;
        }
    }

    //Ex. => greenTicket -
    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && a!=c){
            return 0;
        }else if (a == b && c == a){
            return 20;
        }else{
            return 10;
        }
    }

    //Ex. => blueTicket -
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10){
            return 10;
        }else if (a + b == b + c + 10 || a + b == a + c + 10){
            return 5;
        }else {
            return 0;
        }
    }

    //Ex. => shareDigit -
    public boolean shareDigit(int a, int b) {
        return a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b % 10 || a / 10 == b /10;
    }

    //Ex. => dateFashion -
    public int sumLimit(int a, int b) {
        String sum = String.valueOf(a + b);
        if (sum.length() > String.valueOf(a).length() ){
            return a;
        }else {
            return a+b;
        }
    }
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;
        Integer i3 = -128;
        Integer i4 = -128;
        System.out.println((i1 == i2) + ", " + (i3 == i4));
    }
}


