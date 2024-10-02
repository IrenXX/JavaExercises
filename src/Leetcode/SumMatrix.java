package Leetcode;/*
Дана квадратная матрица. Найти сумму элементов на ее диагонали.
Пример:
Input:
matrix =
[[1,2,3],
[4,5,6],
[7,8,9]]

Output: 15
*/

public class SumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int count = 0;
        int k = 0;
        OUTER:
        for (int[] i : matrix) {
            for (int j = k; j < i.length; j++) {
                count += i[j];
                k++;
                continue OUTER;
            }
        }
        System.out.println(count);
    }
}
