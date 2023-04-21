import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map2 {
    //Ex. => word0 -
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(strings).forEach(x -> map.put(x, 0));
        return map;
    }

    //Ex. => wordLen -
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Arrays
                .stream(strings)
                .forEach(x -> map.putIfAbsent(x, x.length()));
        return map;
    }

    //Ex. => pairs -
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        Arrays
                .stream(strings)
                .forEach(x -> map.put(x.substring(0,1), x.substring(x.length()-1)));
        return map;
    }

    //Ex. => wordCount -
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        Arrays
                .stream(strings)
                .forEach(x -> {
                    if (map.containsKey(x)){
                        map.put(x, map.get(x) + 1);
                    }
                    map.putIfAbsent(x, 1);
                });
        return map;
    }


    //Ex. => firstChar -
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        Arrays
                .stream(strings)
                .forEach(x -> {
                    String key = x.charAt(0) + "";
                    if (map.containsKey(key)){
                        map.put(key, map.get(key) + x);
                    }
                    map.putIfAbsent(key , x);
                });
        return map;
    }

    //Ex. => wordAppend -
    public static String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String,Integer> map =new HashMap<>();
        Arrays
                .stream(strings)
                .forEach(x -> {
                    if (map.containsKey(x)){
                        map.put(x, map.get(x) + 1);
                    }
                    map.putIfAbsent(x, 1);
                    if (map.get(x) % 2 == 0){
                        result.append(x);
                    }
                });

        return result.toString();
    }

    //Ex. => wordMultiple -
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String,Integer> map =new HashMap<>();
        Arrays
                .stream(strings)
                .forEach(x -> {
                    if (map.containsKey(x)){
                        map.put(x, map.get(x) + 1);
                    }
                    map.putIfAbsent(x , 1);
                });
        Map<String,Boolean> result  =new HashMap<>();
        map.forEach((k,v) -> {
            if (v >= 2){
                result.put(k, true);
            }else {
                result.put(k, false);
            }
        });
        return result;
    }

}
