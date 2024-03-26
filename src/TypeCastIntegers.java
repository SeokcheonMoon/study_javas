import java.util.Scanner;

public class TypeCastIntegers {
    public static void main(String[] args) { // static 과 main은 한 쌍으로 이루어진다.(규칙)
        Scanner scanner = new Scanner(System.in);

        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();
        
        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);

        System.out.println(intFirst + intSecond);
                
        scanner.close();
    }
}

