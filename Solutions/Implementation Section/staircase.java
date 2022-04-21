public class staircase {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i > 0; i--){
            for (int j = 0; j< i-1 ;j++){
                System.out.print(" ");
            }

            for (int a = 0; a < n-i+1; a++){
                System.out.print("#");
            }

            if(i == 1){
                break;
            }
            System.out.println();
        }
    }
}
