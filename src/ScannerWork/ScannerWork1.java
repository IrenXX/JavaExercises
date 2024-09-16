package ScannerWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerWork1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("VVedite 2 chisla:");
////        int i = in.nextInt();
////        int y = in.nextInt();
////        System.out.println("CHASTNOE CHISEL: "+ i/y);
//        System.out.println("*************");
//        System.out.println("Napishite paru slov");
//        String str = in.nextLine();
//        System.out.println(str);

        Scanner scanner = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner = new Scanner(new FileReader(new File("test100.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word.toLowerCase());
            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Have a problem");
        }
        scanner.close();
    }

}
