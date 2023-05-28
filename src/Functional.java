import java.util.List;
import java.util.stream.Collectors;

public class Functional {
    //Ex. => doubling -
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(x -> x*2).collect(Collectors.toList());
    }
    //Ex. => doubling -
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(num -> num*num).collect(Collectors.toList());
    }


}
