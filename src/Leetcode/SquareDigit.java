package Leetcode;

import java.util.Arrays;

/*
 * Вывести квадрат каждой цифры в числе (например: 34 --> 916)
 */

public class SquareDigit {

//    public int squareDigits(int n) {
    public void squareDigits(int n) {
        String[] num = String.valueOf(n).split("");

        //первый вариант
//        String sum = Arrays.stream(num).map(x -> Integer.parseInt(x) * Integer.parseInt(x))
//                .map(String::valueOf)
//                .collect(Collectors.joining(""));
//        return Integer.parseInt(sum);

        //второй вариант
         Arrays.stream(num)
                .map(x -> Integer.parseInt(x) * Integer.parseInt(x))
                .forEach(System.out::print);
    }
}

class Test4 {
    public static void main(String[] args) {
        SquareDigit sQ = new SquareDigit();
        sQ.squareDigits(245);
//        System.out.println(sQ.squareDigits(245));
    }
}