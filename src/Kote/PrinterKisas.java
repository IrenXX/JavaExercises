package Kote;

import java.util.List;

public class PrinterKisas {
    private static void printHeader() {
        System.out.println(String.format("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |", "--------------"));
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s |%n", "Name", "Age", "Breed", "Color"));
        System.out.println(String.format("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |", "--------------"));
    }

    private static void printKisa(Kisa kisa) {
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s |",
                kisa.getName(), kisa.getAge(), kisa.getBreed(), kisa.getColor()));
    }

    public static final void print(List<Kisa> kisas) {
        printHeader();
        kisas.forEach(PrinterKisas::printKisa);
        System.out.println();
    }
}
