package NewTasks;

import java.util.Arrays;

//Дан массив чисел, состоящий из N элементов. Эти числа обозначают температуру в конкретный день.
// Для каждого дня нужно найти количество суток до наступления более тёплого дня.
public class WeatherWarm {
    public static void main(String[] args) {
        int[] weatherTemp = new int[]{17, 16, 19, 15, 13, 18, 20};
        int dayLength = weatherTemp.length;
        int[] answerDays = new int[dayLength];

        for (int i = 0; i < dayLength; i++) {
            for (int j = i + 1; j < dayLength; j++) {
                if (weatherTemp[i] < weatherTemp[j]) {
                    answerDays[i] = j - i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answerDays));
    }
}
