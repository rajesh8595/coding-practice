import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenOdd {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(5,3,13,34,67,23,4,8);
        List<Integer>l2=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer>l3=l1.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(l2);
        System.out.println(l3);

    }
}
