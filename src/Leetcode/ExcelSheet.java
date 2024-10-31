package Leetcode;

import java.util.Arrays;

public class ExcelSheet {
    public static void main(String[] args) {
        int columNumber = 28;
        NumberSheet[] values = NumberSheet.values();
//        Arrays.stream(values)
//                .filter(s -> s.getNumber() == columNumber)
//                .forEach(System.out::println);
        System.out.println(new Sheets().convertToTitle(columNumber));
    }
}

class Sheets {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber = (columnNumber) / 26;
        }
        return ans.reverse().toString();
    }
}

enum NumberSheet {
    A(1),
    B(2);

    private int number;

    NumberSheet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}