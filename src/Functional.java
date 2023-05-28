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
}
