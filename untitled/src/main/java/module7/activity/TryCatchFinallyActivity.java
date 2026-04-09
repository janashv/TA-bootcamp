package module7.activity;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        //call method
        TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
        obj.catchMeIfYouCan();
    }

    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            //wrong condition
            for (int i = 0; i <= 10; i++) {
                System.out.println("Value: " + arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            //error message
            System.out.println("Error!!! Arrays last index is out of bounds!");
        } finally {
            System.out.println("Final block executed");
        }
    }
    }