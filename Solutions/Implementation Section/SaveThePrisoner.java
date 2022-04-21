public class SaveThePrisoner {
    public static void main(String[] args) {
        //saveThePrisoner(501401893, 600120690, 431484078);
        saveThePrisoner(174512033, 711706897, 68977959);
        saveThePrisoner(5, 2, 1);
    }

    public static int saveThePrisoner(int n, int m, int s) {

        Integer prisonerCount = n;
        Integer candyCount = m;
        Integer startingSeat = s;

        Integer movementAmount = candyCount + startingSeat - 1;

        Integer lastPrisoner  = (movementAmount % prisonerCount) == 0 ? prisonerCount : (movementAmount % prisonerCount);

        return lastPrisoner;

    }
}
