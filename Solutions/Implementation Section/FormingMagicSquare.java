import sun.java2d.xr.MutableInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingMagicSquare {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<List<Integer>>();

        List<Integer> firstLine = new ArrayList<>(Arrays.asList(6,9,8));
        List<Integer> secondLine = new ArrayList<>(Arrays.asList(3,9,4));
        List<Integer> thirdLine = new ArrayList<>(Arrays.asList(9,4,4));

        matrix.add(firstLine);
        matrix.add(secondLine);
        matrix.add(thirdLine);

        formingMagicSquare(matrix);
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] matrix={{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                        {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};

        Integer minCost = Integer.MAX_VALUE;
        Integer cost = 0;

        for (int i =0; i<  matrix.length; i++){
            cost = calcDiff(s,matrix[i]);
            minCost = Math.min(cost,minCost);
        }

        return minCost;
    }

    private static Integer calcDiff(List<List<Integer>> s, int[][] ms) {
        Integer cost = 0;

        for (int i=0; i<s.size(); i++){
            for (int j=0; j<s.get(0).size(); j++){
                cost += Math.abs(s.get(i).get(j) - ms[i][j]);
            }
        }

        return cost;

    }

}
