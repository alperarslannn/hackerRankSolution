import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class plusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<>(Arrays.asList(-4,3,-9,0,4,1));

        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        countPlusMinus(arr);
    }

    public static void countPlusMinus(List<Integer> arr){
        Integer counterSize = arr.size();

        Map<String, Integer> counter = new HashMap<>();
        counter.put("Positive",0);
        counter.put("Negative",0);
        counter.put("Zero",0);

        for (Integer number:arr){
            if(number == 0){
                counter.put("Zero", counter.get("Zero")+1);
            }
            else if(number > 0){
                counter.put("Positive", counter.get("Positive")+1);
            } else {
                counter.put("Negative", counter.get("Negative")+1);
            }
        }

        findTheRatios(counter, counterSize);
    }

    private static void findTheRatios(Map<String, Integer> counter, Integer counterSize) {
        List<Double> ratioList = counter.values().stream().mapToDouble(i -> {
            return ((double)i / counterSize);
        }).boxed().collect(Collectors.toList());

        printResult(ratioList);
    }

    private static void printResult(List<Double> ratioList) {
        DecimalFormat dec = new DecimalFormat("#0.00000");

        ratioList.forEach(i -> {
            System.out.println(dec.format(i));
        });
    }


}
