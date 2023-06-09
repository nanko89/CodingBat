import java.util.List;
import java.util.stream.Collectors;

public class Functional {
    //Ex. => doubling -
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x * 2).collect(Collectors.toList());
    }

    //Ex. => square -
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(num -> num * num).collect(Collectors.toList());
    }

    //Ex. => addStar -
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }

    //Ex. => copies3 -
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s.repeat(3)).collect(Collectors.toList());
    }

    //Ex. => moreY -
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }

    //Ex. => math1 -
    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(num -> (num + 1)*10).collect(Collectors.toList());
    }

    //Ex. => rightDigit -
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(num -> num % 10).collect(Collectors.toList());
    }

    //Ex. => lower -
    public List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    //Ex. => noX -
    public List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
    }

}
