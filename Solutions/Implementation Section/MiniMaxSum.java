import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279));
        miniMaxSum(integerList);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long maxValue = Long.MIN_VALUE;
        long minValue = Long.MAX_VALUE;
        long sum = 0;

        for (int i=0; i<arr.size(); i++){
            sum += arr.get(i);

            if(arr.get(i) > maxValue){
                maxValue = arr.get(i);
            }
            if(arr.get(i) < minValue){
                minValue = arr.get(i);
            }

        }

        System.out.println((sum - maxValue )+ " " + (sum - minValue));

    }

}
