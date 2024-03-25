package quests;
import java.util.Scanner;

public class Forsifs {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();

        for (int count = 0 ; count <= input_number ; count = count + 1)
            if (count == 0 ){
                System.out.println("4의 배수 아님");
            }else if (count % 4 == 0) {
                System.out.println("4의 배수 맞음");
            } else if (count % 4 != 0){
                System.out.println("4의 배수 아님");
            }
        System.out.println("Hello Main !");
    }
}
