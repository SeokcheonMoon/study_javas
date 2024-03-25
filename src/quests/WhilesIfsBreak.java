package quests;
import java.util.Scanner;
public class WhilesIfsBreak {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        Scanner scanner = new Scanner(System.in);
        

        boolean whileFlag = true ;
    
        while (whileFlag) {
            int input_number = scanner.nextInt();
            if (input_number >= 90) {
                System.out.println("A");
            } else if (input_number >= 80) {
                System.out.println("B");
            } else if (input_number >= 70) {
                System.out.println("C");
            } else if (input_number == -1) {
                break;
            } else {
                System.out.println("F");
            } 
        }

        

        System.out.println("Hello Main !");
    }
}
