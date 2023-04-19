import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
    //Ex. => mapBully -
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    //Ex. => mapShare -
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        return map;
    }

    //Ex. => mapAB -
    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    //Ex. => topping1 -
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.putIfAbsent("bread", "butter");
        return map;
    }

    //Ex. => topping1 -
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }

        return map;
    }

    //Ex. => mapAB2 -
    public Map<String, String> mapAB2(Map<String, String> map) {
    return  map;
    }

    //Ex. => topping1 -
    //Ex. => topping1 -
    //Ex. => topping1 -
    //Ex. => topping1 -
    public static void main(String[] args) {


    }
}
