public class Practice {

    public static void main(String[] args) {
        int currentSession = 0;
        int maxSession = 0;

        int[] steps = {1, 2, 3, 5, 2, 1, 5, 6, 3, 2, 1, 4, 4, 3,2,1};
        for (int i : steps) {
            if (i >= 3) {
                currentSession++;
            } else {
                if (currentSession > 0) {
                    maxSession += currentSession;
                    currentSession = 0;
                }
            }
        }
        if (currentSession > 0) {
            maxSession += currentSession;
        }
        System.out.println(maxSession);
    }
}
