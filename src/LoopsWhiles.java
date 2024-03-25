// https://www.w3schools.com/java/java_while_loop.asp
public class LoopsWhiles {
    public static void main(String[] args){     // static 과 main은 한 쌍으로 이루어진다.(규칙)
        // 기본 구문
        // while (condition) {
            
        // }
        int count = 0;
        while (count < 10) {
            count = count + 1;
            System.out.println("종료 상황 만들기 count : " + count);    
        }
        System.out.println("Hello Main !");

                
        count = 0;
        boolean whileFlag = true ;
    
        while (whileFlag) {
            count = count + 1;
            System.out.println("break 같이 count : " + count);    
            if (count >= 10);
                break;
        
        }
        System.out.println("Hello Main !");
    }
}
