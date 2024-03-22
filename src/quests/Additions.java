package quests;
// 외부 입력
import java.util.Scanner;

public class Additions {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        System.out.println(intFirst + intSecond);
        scanner.close();
    }
}