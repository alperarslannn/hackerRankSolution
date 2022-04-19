import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CircularArrayRotation {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>(Arrays.asList(3,4,5,6,7,8));
        //.,8,3
        int k = 40;
        List<Integer> queries = new LinkedList<>(Arrays.asList(1,2));

        circularArrayRotation(a,k,queries);
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        List<Integer> resultList = new ArrayList<>();

        for (Integer indexToReturn:queries){
            resultList.add(a.get((((indexToReturn-k) % a.size())+a.size()) % a.size()));
        }

        return resultList;
    }
}
