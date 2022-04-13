import java.util.*;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(4,4,1,3));

        birthdayCakeCandles(candles);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer longestCandle = 0;
        Integer sum = 0;

        for (Integer candle:candles){

            if(longestCandle < candle){
                sum = 1;
                longestCandle = candle;
            }
            else if(longestCandle.equals(candle)){
                sum++;
            }

        }
        return sum;
    }

}
