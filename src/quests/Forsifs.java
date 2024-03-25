package quests;

import java.util.Scanner;

public class Forsifs {
    public static void main(String[] args) { // static 과 main은 한 쌍으로 이루어진다.(규칙)
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int count = 0; count <= input_number; count = count + 1) {
            int result = (int) Math.pow(2, count);
            if (result % 4 == 0) {
                System.out.println(result);
            } else if (result % 4 != 0) {
                System.out.println(result);
            }
        }
        System.out.println("Hello Main !");
    }
}

// 1
// 2
// 4
// 8
// 16
// 32
// 64
// 128
// 256
// 512
// 1024
// 2048
// 4096
// 8192
// 16384
// 32768
// 65536
// 131072
// 262144
// 524288
// 1048576
// 2097152
// 4194304
// 8388608
// 16777216
// 33554432
// 67108864
// 134217728
// 268435456
// 536870912
// 1073741824
// 2147483647
// 이후 2147483647 반복됨...