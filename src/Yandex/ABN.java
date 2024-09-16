package Yandex;

import java.io.*;

//
public class ABN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer A = Integer.parseInt(reader.readLine());
        Integer B = Integer.parseInt(reader.readLine());
        Integer N = Integer.parseInt(reader.readLine());
        int x = A/N+A%N, y = B/N+B%N;
        if (x > y) {
            writer.write("OK\n");
        } else {
            writer.write("NO\n");
        }
        reader.close();
        writer.close();
    }

}
