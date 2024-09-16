package PrintFWork;

public class PrintFWork {
    public static void main(String[] args) {
        System.out.printf("%03d \t %-12s \t %,.1f ", 1, "Zaur", (10000*0.15));
        String newStr = String.format("\n%03d \t %-12s \t %,.1f ", 1, "Zaur", (10000*0.15));
        System.out.println(newStr);
    }
}
