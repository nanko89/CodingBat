import java.util.ArrayList;
import java.util.Collections;

public class Logic {
    //Ex. => pairs -
    public boolean cigarParty(int cigars, boolean isWeekend) {
       if (isWeekend){
           if (cigars >= 40){
               return true;
           }
       }else {
           if (cigars >= 40 && cigars <=60){
               return true;
           }
       }
       return false;
    }

    //Ex. => dateFashion -
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2){
            return 0;
        }else if (you >= 8 || date >= 8){
            return 2;
        }else {
            return 1;
        }
    }
    //Ex. => dateFashion -
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer){
            return temp >= 60 && temp <= 100;
        }else {
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

    //Ex. => dateFashion -
    //Ex. => dateFashion -
    //Ex. => dateFashion -
    //Ex. => dateFashion -
    //Ex. => dateFashion -
    //Ex. => dateFashion -
    //Ex. => dateFashion -


}


