import java.util.*;

public class AppleAndOrange {

    public static void main(String[] args) {
        countApplesAndOranges(7,10,4,12,
                new ArrayList<>(Arrays.asList(2,3,-4)),
                new ArrayList<>(Arrays.asList(3,-2,4)));
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        Map<String, Integer> orangeAppleCount = new HashMap<>();
        orangeAppleCount.put("Apple", countFruit(apples,a,s,t));
        orangeAppleCount.put("Orange", countFruit(oranges,b,s,t));

        orangeAppleCount.values().forEach(System.out::println);

    }

    public static Integer countFruit(List<Integer> fruitList, Integer treePosition,
                                  Integer leftEndOfTheHouse, Integer rightEndOfTheHouse){

        Integer numberOfFruitsInRange = 0;

        for (int i = 0; i < fruitList.size(); i++){
            Integer fruitPosition = fruitList.get(i) + treePosition;

            if( (fruitPosition >= leftEndOfTheHouse ) && ( fruitPosition <= rightEndOfTheHouse) ){
                numberOfFruitsInRange++;
            }
        }

        return numberOfFruitsInRange;
    }

}
